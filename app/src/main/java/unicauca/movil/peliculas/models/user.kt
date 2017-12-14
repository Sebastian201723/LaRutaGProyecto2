package unicauca.movil.peliculas.models

/**
 * Created by Sebastian on 14/12/2017.
 */
//In Kotlin, DTOs can be defined as immutable data classes
data class user(var nombre:String,
                   var  username:String,
                   var  password:String )