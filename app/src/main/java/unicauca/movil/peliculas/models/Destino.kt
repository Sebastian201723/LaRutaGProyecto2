package unicauca.movil.peliculas.models

//In Kotlin, DTOs can be defined as immutable data classes
data class Destino(var nombre:String,
                   var fecha:String,
                   var visitantes:String,
                   var precio:String,
                   var imagen:String,
                   var sinopsis:String)