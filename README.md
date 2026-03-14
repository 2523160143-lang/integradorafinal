# LabManager - Solana Smart Contract 🦀

¡Bienvenido al repositorio de **LabManager**! Este es un proyecto desarrollado de forma nativa en **Rust** utilizando el framework **Anchor** para la blockchain de Solana.

Este proyecto fue construido como requisito para la certificación de desarrollo en Solana, cumpliendo con todos los lineamientos técnicos exigidos:
- ✅ **Proyecto de temática libre** (Gestión de Inventario de Laptops).
- ✅ **Desarrollado 100% en Rust** con Anchor.
- ✅ **Implementación de CRUD completo + uso de cuentas PDA**.
- ✅ **Documentación y explicación de uso** (Este README).

---

## 📌 Descripción del Proyecto

**LabManager** es un contrato inteligente descentralizado (Smart Contract) que permite a las universidades o instituciones administrar el préstamo, devolución y mantenimiento de sus equipos de cómputo (Laptops). 

A través de este programa on-chain, un administrador puede dar de alta un "Laboratorio" con un límite de capacidad física, añadir equipos al inventario, prestarlos a estudiantes vinculando sus billeteras (Pubkeys), y mandarlos a mantenimiento técnico de manera inmutable y transparente en la blockchain.

### ⚙️ Estructuras de Datos Principales
- **Laboratorio (PDA):** Almacena el nombre, la capacidad máxima, la Public Key del administrador dueño (owner) y un vector de `Laptop`s asignadas al espacio.
- **Laptop (Struct Interno):** Contiene el modelo, memoria RAM, estado del equipo, contador histórico de usos y la Public Key del usuario que la tiene prestada (Option).
- **EstadoLaptop (Enum):** Máquina de estados (`Disponible`, `Prestado`, `EnMantenimiento`).

---

## 🛠 Arquitectura Técnica (CRUD + PDA)

El proyecto demuestra un dominio de las operaciones fundamentales (CRUD) en Solana mediante la manipulación de una **PDA (Program Derived Address)** vinculada al administrador.

### 1. Creación de PDA (Create)
El laboratorio se inicializa dinámicamente usando semillas (seeds): `[b"lab_v2", owner.key().as_ref()]`.
- **`crear_laboratorio`**: Instancia un nuevo laboratorio limitando su tamaño on-chain (máximo 50 equipos) para optimizar el pago de renta (InitSpace).

### 2. Altas (Create - Inventario)
- **`agregar_laptop`**: Permite al owner añadir un equipo nuevo. Valida que no se exceda la `capacidad_maxima` definida al crear la PDA.

### 3. Lectura (Read)
- **`ver_laptops`**: Lee e imprime en el log (Program Logs) el estado completo del vector de laptops en memoria on-chain.

### 4. Actualizaciones (Update - Lógica de Negocio)
- **`gestionar_prestamo`**: Localiza un equipo existente y muta su estado. Si está disponible, la marca como *Prestada* a una Pubkey y aumenta el contador de usos. Si estaba prestada, la retorna a estado *Disponible*.
- **`reportar_mantenimiento`**: Transición de seguridad. Manda equipos a un estado inutilizable por cuestiones técnicas.

### 5. Borrado (Delete)
- **`eliminar_laptop`**: Recorre el vector mutable, localiza el modelo exacto y lo elimina (remove) para liberar el espacio on-chain de forma definitiva.

---

## 🚀 Cómo interactuar con el contrato

Si deseas utilizar este código, se asume que tienes instalado el entorno para Solana (`solana-cli`, `Rust`, y `Anchor`).

1. **Clonar e iniciar el entorno:**
   Copia el archivo `lib.rs` dentro de la ruta `programs/tu_proyecto/src/` de un proyecto Anchor vacío.

2. **Compilar el programa:**
   ```bash
   anchor build
   ```
   *(Asegúrate de copiar el nuevo `program_id` que se genere en tu consola y pegarlo en la macro `declare_id!("TU_NUEVO_ID");` de `lib.rs`).*

3. **Pruebas Locales:**
   Levanta tu red de prueba local Validator:
   ```bash
   solana-test-validator
   ```

4. **Despliegue:**
   Manda el programa a la red de desarrolladores de solana (Devnet) o a tu Localhost:
   ```bash
   anchor deploy
   ```

5. **Interactuar mediante TypeScript (Tests):**
   Puedes invocar la instrucción inicializadora pagando la renta del espacio de la siguiente manera:
   ```typescript
   const [laboratorioPda] = PublicKey.findProgramAddressSync(
     [Buffer.from("lab_v2"), provider.wallet.publicKey.toBuffer()],
     program.programId
   );

   await program.methods.crearLaboratorio("Lab Computo A", 20)
     .accounts({
       owner: provider.wallet.publicKey,
       laboratorio: laboratorioPda,
       systemProgram: SystemProgram.programId,
     })
     .rpc();
   ```

---
*
