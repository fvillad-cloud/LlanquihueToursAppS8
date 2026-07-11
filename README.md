# Sistema Llanquihue Tours

## Descripción del Sistema
Este es un sistema de gestión interna para la empresa **Llanquihue Tours**. La aplicación proporciona una interfaz gráfica de usuario (GUI) desarrollada en Java Swing que permite registrar y administrar la información de diferentes tipos de usuarios (como administradores, guías turísticos y colaboradores externos), centralizando el control de los datos mediante un gestor de entidades y permitiendo la visualización de resúmenes de cada registro almacenado.

## Estructura del Proyecto (Clases e Interfaces)

El sistema está compuesto por los siguientes componentes organizados por paquetes:

### Paquete `model`
*   **`Persona`**: Clase base que almacena los datos personales comunes: Nombre, RUT y Teléfono.
*   **`Adminsitrador`**: Clase que hereda de `Persona` e implementa `Registrable`, agregando el campo específico de área.
*   **`GuiaTuristico`**: Clase que hereda de `Persona` e implementa `Registrable`, agregando la especialidad del guía.
*   **`ColaboradorExterno`**: Clase que hereda de `Persona` e implementa `Registrable`, agregando el tipo de servicio.
*   **`Vehiculo`**: Clase que implementa la interfaz `Registrable` para el manejo de información de transporte.
*   **`Registrable` (Interfaz)**: Define el contrato para las entidades que requieren generar un resumen de texto a través del método `mostrarResumen()`.

### Paquete `data`
*   **`GestorEntidades`**: Clase encargada de almacenar la lista de entidades y estructurar el formato de los resúmenes de datos.

### Paquete `ui`
*   **`Main`**: Clase principal del sistema que contiene la interfaz gráfica y la lógica para interactuar con los botones de agregar, mostrar, limpiar y salir.

## Instrucciones para Ejecutar el Programa

Sigua estos pasos para ejecutar la aplicación desde la clase principal:

1.  **Abrir el proyecto:** Importa el proyecto en tu IDE favorito (se recomienda **NetBeans**).
2.  **Localizar la clase principal:** Navega en el explorador de archivos del proyecto hasta el paquete `ui`.
3.  **Ejecutar:** 
    *   Haz clic derecho sobre el archivo `Main.java` dentro del paquete `ui`.
    *   Selecciona la opción **Run File**.
## Autor
* Francisco Villa Duran.
