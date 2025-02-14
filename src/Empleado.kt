open class Empleado(nombre: String, edad: Int, salarioBase: Number , porcentajeImpuestos: Number = 10.0) : Persona(nombre,edad) {
    var salarioBase = salarioBase.toDouble()
    open var porcentajeImpuestos = porcentajeImpuestos.toDouble()


    fun calcularSalario(): Double = salarioBase - (salarioBase * (porcentajeImpuestos / 100))

    fun trabajar() = "$nombre está trabajando en la empresa."







    override fun toString(): String {
        return super.toString() + " salarioBase: ${"%.2f".format(salarioBase)}"
    }


}