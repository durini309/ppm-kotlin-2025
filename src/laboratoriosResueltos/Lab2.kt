package laboratoriosResueltos

data class ItemData(
    val originalPos: Int,
    val originalValue: Any,
    val type: ElementType,
    val info: String
) {
    override fun toString(): String {
        return "'$originalValue' estaba en la posición $originalPos, es de tipo $type e info es $info"
    }
}

enum class ElementType {
    CADENA,
    ENTERO,
    BOOLEANO,
    DESCONOCIDO
}

fun processList(inputList: List<Any?>?): MutableList<ItemData>? {
    if (inputList == null) return null

    val result = mutableListOf<ItemData>()

    for ((index, value) in inputList.withIndex()) {
        if (value == null) {
            continue
        }

        val originalPos = index
        val originalValue = value
        var type: ElementType = ElementType.DESCONOCIDO
        var info = ""
        when (originalValue) {
            is Int -> {
                type = ElementType.ENTERO
                info = when {
                    originalValue % 10 == 0 -> "M10"
                    originalValue % 5 == 0 -> "M5"
                    originalValue % 2 == 0 -> "M2"
                    else -> "-"
                }
            }
            is String -> {
                type = ElementType.CADENA
                info = "L${originalValue.length}"
            }
            is Boolean -> {
                type = ElementType.BOOLEANO
                info = if (originalValue) "verdadero" else "falso"
            }
            else -> {
                type = ElementType.DESCONOCIDO
                info = "desconocido"
            }
        }

        result.add(ItemData(originalPos, originalValue, type, info))
    }

    return result
}
