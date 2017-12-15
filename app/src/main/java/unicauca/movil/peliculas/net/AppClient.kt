package unicauca.movil.peliculas.net


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Sebastian on 14/12/2017.
 */
object AppClient{
    private val  retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("http://10.130.4.248:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    val destinoApi:DestinoApi = retrofit.create(DestinoApi::class.java)
    val usuarioApi:UsuarioApi = retrofit.create(UsuarioApi::class.java)
}
