package ejerciciosResueltos

import kotlin.collections.forEach

data class Estudiante(
    val nombre: String,
    val carne: String,
    var nota1: Double,
    var nota2: Double,
    var nota3: Double
) {
    fun promedio() = (nota1 + nota2 + nota3) / 3
    fun promedioPerdido(): Boolean = promedio() <= 60
}

enum class EstadoEstudiante {
    APROBADO, REPROBADO
}

val estudiantes: List<Estudiante> by lazy {
    listOf(
        Estudiante("Juan", "1", 99.0, 98.0, 96.0),
        Estudiante("Miguel", "2", 50.0, 85.0, 70.0),
        Estudiante("Leo", "3", 61.0, 61.0, 60.0),
        Estudiante("Pablo", "4", 71.0, 99.0, 88.0),
        Estudiante("Samantha", "5", 50.0, 30.0, 65.0),
        Estudiante("Maria", "6", 90.0, 90.0, 88.0),
        Estudiante("Elena", "8", 71.0, 82.0, 93.0),
        Estudiante("Cristiano", "7", 77.0, 77.0, 77.0)
    )
}

fun imprimirPromedios() {
    println("=======Promedios de los estudiantes=======")
    estudiantes.forEach { estudiante ->
        println("${estudiante.nombre} - ${estudiante.promedio()}")
    }
}

fun imprimirMejorYPeorEstudiante() {
    println("=======Mejor y peor estudiante=======")
    val mejorEstudiante = estudiantes.maxBy { it.promedio() }
    val peorEstudiante = estudiantes.minBy { it.promedio() }
    println("El estudiante con el mejor promedio es ${mejorEstudiante.nombre}")
    println("El estudiante con el peor promedio es ${peorEstudiante.nombre}")
}

fun cantidadAprobadosYReprobados() {
    println("=======Cantidad de estudiantes aprobados y reprobados=======")
    val reprobados = estudiantes.count { it.promedioPerdido() }
    val aprobados = estudiantes.size - reprobados
    println("Cantidad de estudiantes aprobados: $aprobados")
    println("Cantidad de estudiantes reprobados: $reprobados")
}

fun filtrarEstudiantePorEstado(estado: EstadoEstudiante) {
    println("=======Estudiantes filtrados por $estado=======")
    val filtrados = if (estado == EstadoEstudiante.APROBADO) {
        estudiantes.filter { !it.promedioPerdido() }
    } else {
        estudiantes.filter { it.promedioPerdido() }
    }
    filtrados.forEach { println("${it.nombre} - ${it.promedio()}") }
}

fun actualizarNotas(carne: String, nota1: Double, nota2: Double, nota3: Double) {
    println("=======Actualización de notas=======")
    val estudiante = estudiantes.find { it.carne == carne }
    if (estudiante != null) {
        estudiante.also {
            it.nota1 = nota1
            it.nota2 = nota2
            it.nota3 = nota3
        }
    } else {
        println("Estudiante no encontrado")
    }
    println("Estudiante actualizado: $estudiante")
}

fun main(){
    imprimirPromedios()
    imprimirMejorYPeorEstudiante()
    cantidadAprobadosYReprobados()
    filtrarEstudiantePorEstado(EstadoEstudiante.APROBADO)
    filtrarEstudiantePorEstado(EstadoEstudiante.REPROBADO)
    actualizarNotas("5", 90.0, 90.0, 90.0)
    filtrarEstudiantePorEstado(EstadoEstudiante.APROBADO)
    filtrarEstudiantePorEstado(EstadoEstudiante.REPROBADO)
}