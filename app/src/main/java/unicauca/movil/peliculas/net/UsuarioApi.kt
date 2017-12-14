package unicauca.movil.peliculas.net

import retrofit2.Call
import retrofit2.http.GET
import unicauca.movil.peliculas.models.user

/**
 * Created by Sebastian on 14/12/2017.
 */
interface UsuarioApi{
    @GET("/users")
    fun all(): Call<List<user>>

}