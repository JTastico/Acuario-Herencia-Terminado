package acuario

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El tiburón es de color: ${tiburon.color}")
    tiburon.comer()
    println("El pez payaso es de color: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun main() {
    crearPeces()
}
