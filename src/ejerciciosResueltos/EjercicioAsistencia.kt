package ejerciciosResueltos

fun main() {
    // Solicitar datos al usuario
    print("Ingrese su nombre: ")
    val name = readLine() ?: ""

    print("Ingrese su apellido: ")
    val lastName = readLine() ?: ""

    print("Ingrese su año de nacimiento (2 dígitos): ")
    val birthYear = readLine() ?: ""

    print("Ingrese su color favorito: ")
    val favoriteColor = readLine() ?: ""

    val username = generateUsername(name, lastName, birthYear, favoriteColor)

    println("\nTu nombre de usuario es: $username")
}

fun generateUsername(name: String, lastName: String, year: String, color: String): String {
    // Primeras 3 letras del nombre en minúsculas
    val namePart = if (name.length >= 3) {
        name.substring(0, 3).lowercase()
    } else {
        name.lowercase()
    }

    // Primeras 2 letras del apellido en minúsculas
    val lastNamePart = if (lastName.length >= 2) {
        lastName.substring(0, 2).lowercase()
    } else {
        lastName.lowercase()
    }

    // Año de nacimiento (2 dígitos)
    val yearPart = year

    // Primera letra del color favorito en mayúscula
    val colorPart = if (color.isNotEmpty()) {
        color.substring(0, 1).uppercase()
    } else {
        ""
    }

    // Combinar todas las partes
    return namePart + lastNamePart + yearPart + colorPart
}