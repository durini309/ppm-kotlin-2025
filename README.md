# Programación de Plataformas Móviles - Kotlin

Este proyecto contiene material educativo para la clase de **Programación de Plataformas Móviles**, específicamente enfocado en el aprendizaje del lenguaje Kotlin.

## Estructura del Proyecto

El proyecto está dividido en dos partes principales:

### 📚 KotlinBooks (`/kotlinbooks`)
Esta carpeta contiene [Kotlin Notebooks](https://kotlinlang.org/docs/kotlin-notebook-overview.html) interactivos donde aprenderás los conceptos fundamentales de Kotlin. Los notebooks combinan explicaciones teóricas con ejemplos prácticos que puedes ejecutar directamente.

### 💻 Ejercicios (`/src`)
Aquí encontrarás ejercicios específicos de Kotlin para practicar los conceptos aprendidos en los notebooks.

#### 📝 Ejercicios en Clase (`/src/ejerciciosEnClase`)
Esta carpeta contiene los ejercicios que se desarrollan durante las sesiones de clase en tiempo real. Son ejemplos prácticos que se ven y resuelven durante la mera clase.

#### 💯 Ejercicios Resueltos (`/src/ejerciciosResueltos`)
Aquí encontrarás ejercicios que se dejan como tarea y luego se resuelven en clase. Incluyen tanto el planteamiento como la solución completa para que puedas verificar tu comprensión.

#### 🧪 Laboratorios Resueltos (`/src/laboratoriosResueltos`)
Esta carpeta contiene la resolución de los 2 laboratorios que se han realizado durante el curso, con código completo y comentarios explicativos.

## Contenido de KotlinBooks

### 📝 Variables.ipynb
Introducción a las variables en Kotlin, cubriendo:
- Declaración de variables con `var` y `val`
- Tipos de datos básicos
- Inferencia de tipos
- Variables mutables vs inmutables
- Null safety

### 🔧 Funciones.ipynb
Todo sobre funciones en Kotlin:
- Función principal (`main`)
- Funciones sin retorno (void)
- Funciones con parámetros y valores de retorno
- Parámetros por defecto
- Funciones de expresión única
- Parámetros nombrados
- Funciones de orden superior

### 📄 Strings.ipynb
Manejo completo de strings:
- Impresión básica con `print()` y `println()`
- Lectura de entrada del usuario con `readln()`
- Interpolación de strings con `$` y `${}`
- Strings multilínea
- Funciones útiles (length, uppercase, contains, etc.)
- Dividir y unir strings
- Búsqueda y reemplazo de texto
- Comparación de strings

### 🔀 Condicionales.ipynb
Control de flujo con estructuras condicionales:
- Sentencias `if-else` básicas
- `if` como expresión para retornar valores
- Estructura `when` (reemplazo mejorado de `switch`)
- Uso de rangos en condicionales
- Verificación de tipos con `is`
- Condiciones múltiples y complejas

### 🔄 Ciclos.ipynb
Estructuras de repetición en Kotlin:
- Ciclos `for` con rangos
- Uso de `downTo` y `step`
- Iteración sobre colecciones
- Acceso a índices con `indices` y `withIndex()`
- Ciclos `while` y `do-while`
- Modificación de colecciones durante la iteración

### 📋 Listas.ipynb
Manejo de colecciones en Kotlin:
- Creación de listas mutables e inmutables
- Operaciones básicas (agregar, eliminar, buscar)
- Funciones de orden superior (map, filter, reduce)
- Iteración sobre listas
- Conversión entre tipos de colecciones

### 🔧 Lambdas.ipynb
Programación funcional con lambdas:
- Sintaxis de funciones lambda
- Funciones de orden superior
- Uso con colecciones (map, filter, forEach)
- Variables capturadas (closures)
- Funciones como parámetros y valores de retorno

### 🏗️ Clases.ipynb
Programación orientada a objetos en Kotlin:
- Declaración de clases
- Constructores primarios y secundarios
- Propiedades y métodos
- Visibilidad (public, private, protected)
- Herencia y polimorfismo
- Clases abstractas e interfaces

### 📊 DataClasses.ipynb
Clases especializadas para manejo de datos:
- Declaración de data classes
- Métodos generados automáticamente (equals, hashCode, toString)
- Función copy() para crear copias modificadas
- Destructuring declarations
- Casos de uso y mejores prácticas

### 🔧 OtrasClases.ipynb
Tipos especiales de clases en Kotlin:
- Enum classes
- Sealed classes
- Object declarations
- Companion objects
- Nested y inner classes
- Casos de uso específicos para cada tipo

## Cómo Probar el Código

### Opción 1: IntelliJ IDEA (Recomendado)
1. Descarga [IntelliJ IDEA](https://www.jetbrains.com/idea/)
2. **Estudiantes**: Pueden obtener la versión completa gratuitamente usando su correo universitario en [JetBrains Student License](https://www.jetbrains.com/student/)
3. Instala el plugin de Kotlin Notebook (viene incluido en versiones recientes)
4. Abre el proyecto y podrás ejecutar los notebooks directamente

### Opción 2: Kotlin Playground
- Visita [Kotlin Playground](https://play.kotlinlang.org/)
- **Nota**: Esta opción es **SOLO para probar código**, no soporta notebooks
- Copia y pega el código de los ejemplos para experimentar

### Opción 3: Visual Studio Code
1. Instala [VS Code](https://code.visualstudio.com/) o cualquier fork (como Cursor)
2. Instala los siguientes plugins:
   - **Kotlin Language** para soporte de sintaxis
   - **Jupyter** para soporte de notebooks
3. Podrás visualizar los notebooks, pero necesitarás configuración adicional para ejecutarlos

## Requisitos

- Java 8 o superior
- Kotlin 1.9.23 o superior (incluido con IntelliJ IDEA)

## Uso

1. Clona este repositorio
2. Abre la carpeta en tu IDE preferido
3. Navega a `/kotlinbooks` y abre cualquier notebook
4. Ejecuta las celdas secuencialmente para aprender interactivamente

## Contribuciones

Este es un proyecto educativo. Si encuentras errores o tienes sugerencias de mejora, no dudes en crear un issue o pull request.

---

**Universidad del Valle de Guatemala**  
Programación de Plataformas Móviles