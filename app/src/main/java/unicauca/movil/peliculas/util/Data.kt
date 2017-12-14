package unicauca.movil.peliculas.util

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import unicauca.movil.peliculas.models.Destino
import unicauca.movil.peliculas.net.AppClient
import unicauca.movil.peliculas.net.AppClient.destinoApi

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
            /*
            Destino("Hacienda cajibio", "210 min", "3",
                    "12000",
                    "https://i.ytimg.com/vi/w5DaQPVis5A/maxresdefault.jpg","sdgsfg"),
            Destino("Observatorio Astronomico Sueño Paraiso", "210 min", "3",
                    "12000",
                    "https://static.wixstatic.com/media/f53e10_1411993f371c45dbaaf654e7f138d304.jpg/v1/fill/w_676,h_591,al_c,q_85/f53e10_1411993f371c45dbaaf654e7f138d304.webp","ef"),
            Destino("Mamá Lombriz", "210 min", "3",
                    "12000",
                    "http://frea.com.co/images/logo_mama_lombriz.jpg","sdg"),
            Destino("Canopy Ardilla", "210 min", "3",
                    "12000",
                    "http://www.tuciudadenred.com/data/foto/gr_1467916411_1004209900.jpg","sfg")

    )
     */

}
