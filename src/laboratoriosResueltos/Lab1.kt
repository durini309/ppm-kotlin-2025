package laboratoriosResueltos

fun main() {
    val product1 = "proteina"
    val product2 = "caseina"
    val product3 = "esteroides"
    val product4 = "vitamina c"
    val product5 = "ashwagandha"

    var quantityProduct1 = 10
    var quantityProduct2 = 10
    var quantityProduct3 = 10
    var quantityProduct4 = 10
    var quantityProduct5 = 10

    var availableProduct1 = true
    var availableProduct2 = true
    var availableProduct3 = true
    var availableProduct4 = true
    var availableProduct5 = true

    fun showInventory() {
        println("1. $product1 - Cantidad: $quantityProduct1 - Disponible: $availableProduct1")
        println("2. $product2 - Cantidad: $quantityProduct2 - Disponible: $availableProduct2")
        println("3. $product3 - Cantidad: $quantityProduct3 - Disponible: $availableProduct3")
        println("4. $product4 - Cantidad: $quantityProduct4 - Disponible: $availableProduct4")
        println("5. $product5 - Cantidad: $quantityProduct5 - Disponible: $availableProduct5")
    }

    fun searchProduct(name: String) {
        when (name.lowercase().trim()) {
            product1 -> println("Producto encontrado: $product1 - Cantidad: $quantityProduct1 - Disponible: $availableProduct1")
            product2 -> println("Producto encontrado: $product2 - Cantidad: $quantityProduct2 - Disponible: $availableProduct2")
            product3 -> println("Producto encontrado: $product3 - Cantidad: $quantityProduct3 - Disponible: $availableProduct3")
            product4 -> println("Producto encontrado: $product4 - Cantidad: $quantityProduct4 - Disponible: $availableProduct4")
            product5 -> println("Producto encontrado: $product5 - Cantidad: $quantityProduct5 - Disponible: $availableProduct5")
            else -> println("Producto no disponible")
        }
    }

    fun updateQuantity(productNumber: Int, newQuantity: Int) {
        if (newQuantity < 0) {
            println("Cantidad debe ser mayor a 0")
            return
        }

        when (productNumber) {
            1 -> {
                quantityProduct1 = newQuantity
                availableProduct1 = quantityProduct1 > 0
                println("$product1 actualizado. Nueva cantidad: $quantityProduct1")
            }
            2 -> {
                quantityProduct2 = newQuantity
                availableProduct2 = quantityProduct2 > 0
                println("$product2 actualizado. Nueva cantidad: $quantityProduct2")
            }
            3 -> {
                quantityProduct3 = newQuantity
                availableProduct3 = quantityProduct3 > 0
                println("$product3 actualizado. Nueva cantidad: $quantityProduct3")
            }
            4 -> {
                quantityProduct4 = newQuantity
                availableProduct4 = quantityProduct4 > 0
                println("$product4 actualizado. Nueva cantidad: $quantityProduct4")
            }
            5 -> {
                quantityProduct5 = newQuantity
                availableProduct5 = quantityProduct5 > 0
                println("$product5 actualizado. Nueva cantidad: $quantityProduct5")
            }
            else -> println("Número de producto inválido")
        }
    }

    fun showStatistics() {
        val product1 = if (availableProduct1) 1 else 0
        val product2 = if (availableProduct2) 1 else 0
        val product3 = if (availableProduct3) 1 else 0
        val product4 = if (availableProduct4) 1 else 0
        val product5 = if (availableProduct5) 1 else 0
        val availableProducts =product1 + product2 + product3 + product4 + product5

        val totalUnits = quantityProduct1 + quantityProduct2 + quantityProduct3 +
                quantityProduct4 + quantityProduct5

        println("Productos disponibles: $availableProducts")
        println("Unidades totales: $totalUnits")
    }

    fun showMenu() {
        println()
        println("----------------------------------------")
        println("1. Mostrar inventario")
        println("2. Buscar producto")
        println("3. Actualizar cantidad de un producto")
        println("4. Mostrar estadísticas")
        println("5. Salir")
        print("Selecciona una opción: ")
    }

    // Main program loop
    while (true) {
        showMenu()

        when (readLine()?.trim()) {
            "1" -> showInventory()

            "2" -> {
                print("Ingresa nombre de producto: ")
                val name = readLine() ?: ""
                searchProduct(name)
            }

            "3" -> {
                println("Productos disponibles:")
                println("1. $product1")
                println("2. $product2")
                println("3. $product3")
                println("4. $product4")
                println("5. $product5")
                print("Selecciona número de producto a actualizar: ")

                val productNumber = readLine()?.toIntOrNull()
                if (productNumber != null && productNumber in 1..5) {
                    print("Ingresa nueva cantidad: ")
                    val newQuantity = readLine()?.toIntOrNull()
                    if (newQuantity != null) {
                        updateQuantity(productNumber, newQuantity)
                    } else {
                        println("Cantidad inválida")
                    }
                } else {
                    println("Número de producto inválido.")
                }
            }

            "4" -> showStatistics()

            "5" -> {
                println("Chau!")
                break
            }

            else -> println("Opción inválida. Ingresa una opción del 1 al 5")
        }
    }
}