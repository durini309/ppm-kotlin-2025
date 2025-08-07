package ejerciciosEnClase

// del 1 al 10
fun deNumeroALetras(num: Int): String {
    return when (num) {
        1 -> "Uno"
        2 -> "Dos"
        3 -> "Tres"
        4 -> "Cuatro"
        5 -> "Cinco"
        6 -> "Seis"
        7 -> "Siete"
        8 -> "Ocho"
        9 -> "Nueve"
        else -> "No aplica"
    }
}

fun Int.aLetras(): String {
    return when (this) {
        1 -> "Uno"
        2 -> "Dos"
        3 -> "Tres"
        4 -> "Cuatro"
        5 -> "Cinco"
        6 -> "Seis"
        7 -> "Siete"
        8 -> "Ocho"
        9 -> "Nueve"
        else -> "No aplica"
    }
}

fun String.aNumero(): String {
    when (this) {
        "Uno" -> return "1"
        "Dos" -> return "2"
        "Tres" -> return "3"
        "Cuatro" -> return "4"
        "Cinco" -> return "5"
        "Seis" -> return "6"
        "Siete" -> return "7"
        "Ocho" -> return "8"
        "Nueve" -> return "9"
        else -> return "No aplica"
    }
}

data class User(
    val id: Int,
    val name: String,
    val age: Int
) {
    override fun toString(): String {
        return "El usuario '$name' tiene $age años y su ID es $id"
    }
}

fun main() {
    val jc = User(
        id = 1,
        name = "Juan",
        age = 25
    )
    println(jc) // Antes: User(id=1, name=Juan, age=25)
}