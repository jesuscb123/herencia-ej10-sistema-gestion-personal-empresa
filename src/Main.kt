fun main(){
    val persona = Persona("luis",26)
    val empleado = Empleado("Pepe",31,1200)
    val gerente = Gerente("Iván",19,2000.55,10,20.0)
    println(persona)
    println(empleado)
    println(gerente)
    empleado.calcularSalario()
    gerente.calcularSalario()
    persona.celebrarCumple()
    empleado.trabajar()
    gerente.administrar()

}