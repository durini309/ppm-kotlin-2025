package ejerciciosEnClase

fun parOImpar() {
    print("Ingrese un numero: ")
    val num = readLine()?.toInt() ?: 0
    val esPar = if (num % 2 == 0) {
        true
    } else {
        false
    }

    println("Es par: $esPar")
}

fun puntoCardinal(){
    print("Ingrese un punto cardinal: ")
    val punto = readLine() ?: "N"
    when (punto) {
        "N" -> println("El punto cardinal es Norte")
        "S" -> println("El punto cardinal es Sur")
        "E" -> println("El punto cardinal es Este")
        "O" -> println("El punto cardinal es Oeste")
        else -> println("nada que ver")
    }
}

fun main() {
    print("Ingrese un numero del 1 al 10:")
    val num1 = readLine()?.toInt() ?: 1
    if (num1 !in 1..10) {
        print("Numero 1 no en rango")
        return
    }
    print("Ingrese un numero del 11 al 20:")
    val num2 = readLine()?.toInt() ?: 11
    if (num2 !in 11..20) {
        print("Numero 2 no en rango")
        return
    }
    do {
        val numRandom = (1..40).random()
        val isInRange = numRandom in num1..num2
        println("El numero generado es: $numRandom y isInRange es $isInRange")
    } while (isInRange)

}