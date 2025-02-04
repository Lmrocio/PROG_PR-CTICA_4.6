class Cafetera(var ubicacion: String) {

    var capacidad: Int = 1000

    var cantidad: Int = 0

    constructor(ubicacion: String, capacidad: Int) : this(ubicacion) {
        this.capacidad = capacidad
        cantidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int) : this(ubicacion, capacidad) {
        this.cantidad = if (cantidad > capacidad) capacidad else cantidad
    }


    fun llenar(){
        cantidad = capacidad
    }

    fun servirTaza(taza: Taza){

        if(cantidad >= taza.capacidad){
            taza.llenar()

            cantidad -= taza.capacidad
        } else {
            taza.llenar(cantidad)
            llenar()
        }
    }

    fun vaciar(){
        cantidad = 0
    }

    fun agregarCafe(cafe: Int = 200){
        if(cantidad + cafe <= capacidad){
            cantidad += cafe
        } else {
            cantidad = capacidad
        }
    }

    override fun toString(): String{
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}

