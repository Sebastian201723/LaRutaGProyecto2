package unicauca.movil.peliculas.net

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import unicauca.movil.peliculas.models.user

/**
 * Created by Sebastian on 14/12/2017.
 */
interface UsuarioApi{
    @GET("users")
    fun all(): Call<List<user>>

    @GET ("users/{username}")
    fun getByUsername(@Path("username") username:String):Call<user>
}