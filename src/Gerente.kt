class Gerente(nombre: String,
              edad: Int,
              salarioBase: Number,
              porcentajeImpuestos: Number,
              val bonus: Double,
) : Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {
    override var porcentajeImpuestos: Double = 33.99

    fun administrar() = "$nombre está administrando la empresa."

    override fun toString(): String {
        return super.toString() + " Bonus: $bonus"
    }


}