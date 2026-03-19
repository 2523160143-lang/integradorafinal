# 🎓 LabManager - Sistema Integral de Gestión de Laboratorios

¡Bienvenido al repositorio oficial de **LabManager**! 🚀

LabManager es un sistema moderno, eficiente y en tiempo real diseñado para universidades e instituciones educativas. Permite gestionar fácilmente el **inventario**, **préstamo** y **mantenimiento** de equipos de cómputo, optimizando el tiempo tanto de administradores como de alumnos y profesores.

---

## ✨ Características Principales

- 🔄 **Notificaciones en Tiempo Real (WebSockets):** Ni alumnos ni administradores tienen que recargar la página. Aprobaciones, rechazos y devoluciones se actualizan al instante usando `SockJS` y `STOMP`.
- 📱 **Generación y Escaneo de Código QR:** Agiliza la entrega de equipos mediante autenticación visual con QR. Escanea desde el panel administrativo usando la cámara de tu dispositivo.
- 👥 **Módulo Multi-Rol (Autenticación JWT):** Experiencias personalizadas y seguras para **Alumnos**, **Profesores** (Reservas Grupales) y **Administradores**.
- 🤖 **Asistente Virtual (LabBot):** Un chatbot de soporte interactivo integrado en el cliente para guiar a los usuarios en sus tareas.
- 📊 **Reportes Dinámicos (PDF / Excel):** Generación de gráficas de incidencias, inventario y solicitudes con un clic.
- 🌒 **Soporte Nativo Modo Oscuro:** Interfaz ergonómica que se adapta a las preferencias del sistema utilizando `TailwindCSS`.

---

## 🛠️ Stack Tecnológico

El proyecto utiliza una arquitectura estricta cliente-servidor nativa para la Nube.

### Backend (Servidor)
- **Java 17 / Spring Boot 3**
- **Spring Security (JWT)**
- **Spring Data JPA (Specifications)**
- **WebSocket (STOMP)**
- **PostgreSQL (Supabase en Producción, MySQL en Desarrollo)**
- **iTextPDF & Apache POI** (Generación de Reportes)

### Frontend (Cliente)
- **React 18 con TypeScript**
- **Vite** (Bundler optimizado)
- **TailwindCSS** (Estilos y Dark Mode)
- **Recharts** (Visualización de datos)
- **Axios & SockJS** (Middleware e interacción con la API)

---

## 📖 Documentación

Si deseas conocer más a fondo cómo desplegar o utilizar la plataforma, consulta nuestros manuales oficiales incluidos en la raíz de este proyecto:

👉 **[Manual de Usuario](./manual_de_usuario.md):** Guía paso a paso explicando cómo ser administrador, pedir laptops siendo estudiante, o rentar todo el laboratorio siendo profesor.

👉 **[Manual Técnico](./labmanager/manual_tecnico.md):** Documentación arquitectónica profunda para desarrolladores (Estructura de Spring, configuraciones de JWT, CORS y modelos de base de datos).

---

## 🚀 Instalación Local

Si clonas este repositorio para desarrollo:

1. **Clonar repositorio:**
   ```bash
   git clone https://github.com/supernova96/integradorafinal.git
   ```

2. **Levantar el Backend (Dentro de la carpeta `/labmanager`):**
   Asegúrate de configurar los parámetros `spring.datasource.url` en tu `application.properties` apuntando a tu base de datos local y ejecuta:
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Levantar el Frontend (Dentro de la carpeta `/labmanager-frontend`):**
   ```bash
   npm install
   npm run dev
   ```

---
*Desarrollado como proyecto integrador de universidad. Creado con ❤️ por el equipo de LabManager.*
