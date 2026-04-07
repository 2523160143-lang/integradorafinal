# 📘 Manual de Usuario - LabManager V2.0

## 1. Introducción
Bienvenido a **LabManager**, el Sistema Integral de Control y Gestión de Laboratorios de Cómputo. Esta plataforma de nueva generación está diseñada para simplificar y automatizar el ciclo de vida de los préstamos de hardware institucional. A través de este manual, aprenderás a utilizar el 100% de las herramientas que el sistema ofrece, dependiendo del nivel de acceso de tu usuario.

## 2. Requisitos de Operación
Al ser un sistema basado en la nube (Cloud-Native), **no requieres instalar ninguna aplicación en tu computadora**. 
* **Navegador web compatible:** Google Chrome, Mozilla Firefox, Microsoft Edge o Apple Safari (versiones actualizadas).
* **Conexión a Internet:** Requerida para interactuar con la base de datos en tiempo real.
* **Cámara web / Dispositivo móvil (Opcional pero recomendado):** Requerido únicamente para los Administradores al momento de escanear Códigos QR.

---

## 3. Roles de Usuario y Accesos
LabManager divide sus funciones en tres perfiles estrictamente controlados:

1. **🧑‍🎓 ALUMNO:** Nivel básico. Permite buscar software, reservar 1 equipo de forma individual, reportar fallas de computadoras asignadas y mostrar un código QR de canje.
2. **👨‍🏫 PROFESOR:** Nivel intermedio. Incluye las facultades del alumno junto con la capacidad de realizar **Reservas Grupales** (lotes de equipos para toda una clase) y un visualizador tipo Calendario.
3. **👑 ADMINISTRADOR:** Nivel maestro. Gestiona todo el inventario de Laptops, aprueba/rechaza reservas, escanea códigos QR, aplica sanciones a cuentas, y extrae la telemetría en formatos PDF y Excel.

---

## 4. Primeros Pasos: Registro e Inicio de Sesión

### 4.1. Crear una Cuenta Nueva
1. Dirígete a la página principal del portal.
2. Selecciona **"Crear Cuenta"** en el formulario central.
3. Llenos los campos de **Matrícula/Número de Empleado**, **Nombre Completo**, **Correo Electrónico** y **Contraseña**.
4. Selecciona tu **Rol** (Alumno o Profesor). *Nota: Los administradores solo pueden ser creados por otro administrador desde el panel interno.*
5. Haz clic en el botón de registro. Si recibes un error, asegúrate de que tu matrícula no exista previamente.

### 4.2. Iniciar Sesión
1. Ingresa tu Matrícula y Contraseña en la pantalla de *Login*.
2. El sistema validará tu identidad y cifrará tu sesión. Si es correcta, serás redirigido a tu *Dashboard* (Panel de Control) correspondiente.
3. **Pérdida de Contraseña:** Existe un botón de "Olvidé mi contraseña" que enviará un enlace de recuperación seguro a tu correo electrónico institucional.

---

## 5. 🧑‍🎓 Funciones del Alumno (Student Dashboard)

El foco de esta vista es la agilidad para que pidas lo que necesitas sin fricciones.

### 5.1 Búsqueda y Reserva de Equipo
1. En la pestaña **Buscar Equipos**, navega por las tarjetas dinámicas del inventario.
2. Arriba tienes una **Barra Buscadora**. Puedes escribir "AutoCAD", "RAM 16GB" o "Dell" y el sistema filtrará instantáneamente los equipos disponibles.
3. Ubica el equipo deseado y da clic en **Reservar**.
4. Llena el breve formulario: Selecciona la **Clase/Materia** (directo del mapa curricular), la fecha y la duración.
5. Haz clic en **Confirmar**. Tu reserva pasará a estado `Pendiente` (Naranja).

### 5.2. Alertas Reales y Generación de QR (Aprobación)
El sistema LabManager es en tiempo real. **No necesitas presionar F5 ni recargar la página.**
* Cuando el encargado de sistemas apruebe tu solicitud desde su base de operaciones, en menos de un segundo tu pantalla se actualizará, sonará una campana y el estatus cambiará a `Aprobada` (Verde).
* En la pestaña lateral **Historial de Préstamos**, tu reserva activa mostrará ahora un botón especial llamado **Ver QR**.
* **El Canje:** Haz clic ahí para abrir la imagen de tu código QR único. Muéstraselo al encargado a través de tu celular a la hora de pedir tu equipo físico. Al escanearlo, tu estatus se pondrá `En Uso`.

### 5.3. Reporte de Incidentes
¿Tu máquina no prende o no sirve el ratón de la sala fija?
1. Dirígete a la pestaña de **Reportar Falla**.
2. Escribe qué sucedió.
3. Sube una foto **(Evidencia)** con tu cámara de la pantalla azul o tecla rota (Formato .JPG o .PNG).
4. El administrador recibirá tu alerta inmediatamente.

---

## 6. 👨‍🏫 Funciones del Profesor (Professor Dashboard)

El profesor dispone de las mismas herramientas, potenciadas para manejar volumen.

### 6.1. Reservas Masivas (Grupales)
En la pestaña de reservar, verás una herramienta especial:
1. No necesitas reservar 25 máquinas una por una.
2. Simplemente escribe al sistema: *"Ocupo 20 equipos para la clase Formación Sociocultural I"*.
3. El sistema agrupará esas 20 computadoras bajo tu nombre y horario en una sola acción maestra (Reservación "Batch").

### 6.2. Vista Calendario Interactivo
1. Navega a **Mi Calendario**.
2. Verás una interfaz mensual al estilo Google Calendar.
3. Los bloques de colores (Azul, Verde, Rojo) te indican el estatus en el que están tus clases prácticas programadas en el futuro.
4. Puedes hacer clic en cada bloque de horario para ver los detalles.

---

## 7. 👑 Funciones del Administrador (Admin Dashboard)

El nivel más alto de LabManager, es una estación de telemetría completa.

### 7.1. Centro de Notificaciones en Tiempo Real (Campana)
* En la esquina superior derecha, verás un icono de campana.
* Estés en la pestaña que estés, si un alumno pide una máquina o se rompe algo, un mensaje volador (toast) aparecerá en tu esquina diciendo "Nueva solicitud de matrícula 123" y se sumará a los mensajes de la campana.

### 7.2. Aprobación Rápida "A un clic"
1. Pestaña: **Solicitudes Pendientes**.
2. Se te lista quién pide, cuándo y por qué.
3. Tienes un botoncito de ❌ (Rechazar) y uno de ✅ (Aprobar).
4. Al hacer clic, el efecto se va directo al usuario en tiempo real sin esperas.

### 7.3. Entregas Ultra Veloces con Escáner QR
¡No más buscar el nombre del alumno en libretas!
1. Pestaña: **Escanear Código QR**.
2. El navegador te pedirá permisos de cámara. (Funciona leyendo la WebCam de tu laptop, o la cámara trasera de un iPad/Celular si abres la web ahí).
3. Pide al alumno enseñar su pantalla de celular. El cuadro lector verde atrapará el código instantáneamente.
4. Un cuadro te confirmará que le estás entregando el equipo `DELL-004` al alumno `Gómez`. 

### 7.4. Módulo de Inventario y "Hoja de Vida"
1. Aquí controlas cuántas Laptops de verdad existen físicamente.
2. Puedes **[+ Agregar]** inventario, poner número de placa técnica, y hardware interno.
3. Tienes un botón exclusivo llamado **Historial**.
4. Al activarlo, verás **"La Hoja de Vida"** de la computadora. Es decir, saber exactamente todos los alumnos que la tocaron desde su compra, y la cronología exacta de las fallas de disco o teclado que ha tenido en todo su tiempo de vida útil.

### 7.5. Pestaña de Reportes Automáticos (Exportación de Datos Avanzada)
Aquí ocurre la magia gerencial para presentar al rector de la Universidad:
1. En **Reportes & BI**, verás gráficos en barras modernas y pasteles dibujados solitos.
2. Tienes dos botones milagrosos en lo alto de la pantalla: **"Descargar PDF"** y **"Descargar Excel"**.
3. Ambos exportan lo acontecido esta semana o el histórico sin que sepas fórmulas complejas. En la hoja de Excel tendrás celdas listas de `Kpis de uso`, `Reporte Cronológico` y `Software Top usado`, en varias hojas inferiores del libro Excel.

### 7.6. Control de Usuarios (Sanciones)
1. Pestaña: **Usuarios y Whitelist**.
2. Si un estudiante devuelve mal un equipo sistemáticamente, el sistema puede ponerlo como "Suspendido". A él no se le permitirá hacer peticiones futuras hasta que levantes la sanción con tu poder de Administrador.

---

## 8. Funciones Globales para Todos

### 8.1 LabBot: El Chatbot Integrado
Abajo a la derecha, en todo el sistema, siempre flota una carita `🤖`. Es el LabBot de Soporte.
* **Instrucciones Estáticas:** Te indica en formato chat donde hacer clic dependiendo de lo que busques. 
* ¡Prueba a escribirle la palabra `"roja"` si no sabes qué hacer! Él distinguirá tu rol.

### 8.2 Interfaz: Modo Oscuro / Dark Mode Nativo
Para proteger tus ojos en jornadas nocturnas o pasillos sin luz, en la parte alta verás un botón con forma de `Luna 🌙`. Al activarlo, todo el software entrará en *Modo Noche* ultra-ergonómico con colores grisáceos certificados para la lectura digital. ¡Pruébalo!
