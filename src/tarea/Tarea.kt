package tarea

abstract class Tarea {
    abstract val descripcion: String
    abstract val fechaLimite: String
    abstract val prioridad: Number
    abstract val estado: String
}

interface Responsable{
    fun asignarResponable(responsable: String)
}

class TareaPersonal : Tarea(), Responsable {
    override val descripcion: String = "Tarea de Programacion Movil"
    override val fechaLimite: String = "18 de agosto"
    override val prioridad: Number = 5
    override val estado: String = "En proceso"

    private var responsable: String = ""

    override fun asignarResponable(responsable: String) {
        this.responsable = responsable
    }

    fun obtenerResponsable(): String{
        return responsable
    }
}
