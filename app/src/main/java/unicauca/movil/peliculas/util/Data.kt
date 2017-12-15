package unicauca.movil.peliculas.util

import unicauca.movil.peliculas.models.Destino
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import unicauca.movil.peliculas.models.Reserva
import unicauca.movil.peliculas.models.user
import unicauca.movil.peliculas.net.AppClient
import unicauca.movil.peliculas.net.AppClient.destinoApi
object Data : Callback<List<user>> {


    var destino: MutableList<Destino> = mutableListOf(
            Destino("Hacienda cajibio", "210 min", "3",
                    "12000",
                    "https://i.ytimg.com/vi/w5DaQPVis5A/maxresdefault.jpg","Hacienda con 300 años de antiguedad, es un sitio localizado al norte Popayán con bellas vistas a la periferia del cauca, fué el hogar de muchos esclavos"),
            Destino("Observatorio Astronomico Sueño Paraiso", "210 min", "3",
                    "12000",
                    "https://static.wixstatic.com/media/f53e10_1411993f371c45dbaaf654e7f138d304.jpg/v1/fill/w_676,h_591,al_c,q_85/f53e10_1411993f371c45dbaaf654e7f138d304.webp","ef"),
            Destino("Mamá Lombriz", "210 min", "3",
                    "12000",
                    "http://frea.com.co/images/logo_mama_lombriz.jpg","Centro de recreación situado a las afueras de Popayán en el corregimiento de Cajete, endonde podrás pasar tiempo con tu familia y vivir una apasionante aventura con las enstrellas."),
            Destino("Canopy Ardilla", "210 min", "3",
                    "12000",
                    "http://www.tuciudadenred.com/data/foto/gr_1467916411_1004209900.jpg","Centro de deportes extremos en el que podrás encontrar todo tipo de actividades que podrán desafiar tu valentía. Entre ellas encontrarás juegos tales como el tiro por cuerda, sknorking y entre otros")
    )
    var reserva: MutableList<Reserva> = mutableListOf(
            Reserva("Hacienda cajibio", "210 min", "3",
                    "12000",
                    "https://i.ytimg.com/vi/w5DaQPVis5A/maxresdefault.jpg","Hacienda con 300 años de antiguedad, es un sitio localizado al norte Popayán con bellas vistas a la periferia del cauca, fué el hogar de muchos esclavos"),
            Reserva("Observatorio Astronomico Sueño Paraiso", "210 min", "3",
                    "12000",
                    "https://static.wixstatic.com/media/f53e10_1411993f371c45dbaaf654e7f138d304.jpg/v1/fill/w_676,h_591,al_c,q_85/f53e10_1411993f371c45dbaaf654e7f138d304.webp","ef"),
            Reserva("Mamá Lombriz", "210 min", "3",
                    "12000",
                    "http://frea.com.co/images/logo_mama_lombriz.jpg","Centro de recreación situado a las afueras de Popayán en el corregimiento de Cajete, endonde podrás pasar tiempo con tu familia y vivir una apasionante aventura con las enstrellas."),
            Reserva("Canopy Ardilla", "210 min", "3",
                    "12000",
                    "http://www.tuciudadenred.com/data/foto/gr_1467916411_1004209900.jpg","Centro de deportes extremos en el que podrás encontrar todo tipo de actividades que podrán desafiar tu valentía. Entre ellas encontrarás juegos tales como el tiro por cuerda, sknorking y entre otros")
    )
    var usuario:List<user> = emptyList()


    fun loadusers(){
        AppClient.usuarioApi.all().enqueue(this)
    }
    override fun onFailure(call: Call<List<user>>?, t: Throwable?) {

    }

    override fun onResponse(call: Call<List<user>>?, response: Response<List<user>>) {
        if(response.isSuccessful){
            usuario=response.body()!!
        }
    }
}
/*
object Data : Callback<List<Destino>> {
    var Destino: List<Destino> = emptyList()

    fun  Destino() = AppClient.destinoApi.all().enqueue(this)

    override fun onFailure(call: Call<List<Destino>>?, t: Throwable?) {
    }

    override fun onResponse(call: Call<List<Destino>>?, response: Response<List<Destino>>) {
        if(response.isSuccessful){
            Destino = response.body()!!
        }
    }
}
*/