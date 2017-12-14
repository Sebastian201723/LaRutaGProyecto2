package unicauca.movil.peliculas.net

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import unicauca.movil.peliculas.models.Destino

/**
 * Created by Sebastian on 14/12/2017.
 */
interface DestinoApi{
    @GET("/sitios")
    fun all(): Call<List<Destino>>

    @GET("/sitios/{id}")
    fun getById(@Path("id") id:String):Call<Destino>

    @POST("/sitios")
    fun insert(@Body destino:Destino):Call<SimpleResponse>
    }
    data class SimpleResponse(val success:Boolean)