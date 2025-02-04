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
            taza.cantidad = taza.capacidad

            cantidad -= taza.capacidad
        } else {
            taza.cantidad = taza.capacidad
            llenar()
        }
    }

    fun vaciar(){
        cantidad = 0
    }

    fun agregarCafe(cafe: Int = 200){
        if(cantidad + cafe <= capacidad){
            cantidad += cafe
        } else { println("No se puede añadir más café de la capacidad máxima.")}
    }

    override fun toString(): String{
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}

