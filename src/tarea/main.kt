package tarea

fun crearTarea(){
    val newTarea = TareaPersonal()
    newTarea.asignarResponable("Jamil Turpo")
    println("La tarea: ${newTarea.descripcion}, sera realizara por ${newTarea.obtenerResponsable()}")
    newTarea.obtenerResponsable()
}

fun main(){
    crearTarea()
}