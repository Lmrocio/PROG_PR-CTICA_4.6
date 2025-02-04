class Taza(val color: Color = Color.BLANCO,
           var capacidad: Int = 50) {


    var cantidad: Int = 0
        set(value) {
            field = if (value > capacidad) capacidad else value
        }

    fun llenar(){
        cantidad = capacidad
    }

    fun llenar(nuevaCantidad: Int){

        cantidad = nuevaCantidad
    }

    override fun toString(): String {
        return "Taza(color = $color, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}

