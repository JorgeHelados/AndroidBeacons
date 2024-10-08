# AndroidBeacons

Este es el repositorio del proyecto **AndroidBeacons**, una aplicación Android para interactuar con dispositivos Bluetooth Low Energy (BTLE) y enviar datos a un servidor remoto utilizando Retrofit.

## Estructura del proyecto

El código fuente está organizado de la siguiente manera:

```bash
├── app/ # Código fuente de la aplicación Android 
│ ├── java/com/example/appbeacons/ 
│ │ ├── Dato.java # Clase modelo para los datos enviados al servidor 
│ │ ├── SubidaDato.java # Clase para gestionar la subida de datos y conexión con el servidor 
│ │ └── MainActivity.java # Actividad principal que controla la interfaz de usuario 
│ ├── res/ │ │ ├── layout/ │ │ │ └── activity_main.xml # Diseño de la interfaz de usuario 
│ ├── AndroidManifest.xml # Configuración general de la aplicación Android 
├── .gitignore # Archivos y carpetas a ignorar por Git 
├── build.gradle # Configuración de compilación del proyecto 
├── README.md # Documento de introducción y guía (este archivo)
```

## Instalación y uso

Sigue los pasos a continuación para configurar y ejecutar el proyecto en tu entorno local utilizando **Android Studio**:

### 1. Clona el repositorio

```bash
git https://github.com/JorgeHelados/AndroidBeacons
cd AppBeacons
```

### 2. Instala las dependencias

1. Inicia Android Studio.

2. Selecciona File > Open y navega hasta la carpeta donde clonaste el repositorio.

3. Haz clic en OK para abrir el proyecto.

### 3.  Configura las dependencias

El proyecto utiliza Retrofit para manejar las peticiones HTTP. Asegúrate de que el archivo build.gradle incluye las siguientes dependencias:

```bash
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
```

### 4. Ejecuta la aplicación

1. Conecta un dispositivo Android o configura un emulador.
2. Haz clic en Run > Run 'app' en Android Studio.
3. La aplicación se ejecutará en el dispositivo conectado o en el emulador.

## Funcionalidades de la aplicación

* Buscar dispositivo BTLE: Busca un dispositivo específico por Bluetooth.
* Buscar dispositivos BTLE: Escanea todos los dispositivos BTLE cercanos.
* Detener búsqueda: Cancela el escaneo de dispositivos.
* Comprobar conexión: Verifica si el servidor está disponible.
* Subir datos: Envía datos al servidor utilizando un objeto Dato.

## Conexión con el servidor
Para enviar datos a un servidor, asegúrate de actualizar la URL base en el archivo *SubidaDato.java* con la dirección IP de tu servidor:

```bash
private static final String BASE_URL = "http://TU_IP:PUERTO/";
```
