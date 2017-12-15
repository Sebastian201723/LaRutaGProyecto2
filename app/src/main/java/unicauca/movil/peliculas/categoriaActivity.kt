package unicauca.movil.peliculas

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.startActivity
import unicauca.movil.peliculas.databinding.ActivityCategoriaBinding

class categoriaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityCategoriaBinding =  DataBindingUtil.setContentView(this,R.layout.activity_categoria)
        binding.handlerCategoria = this

        setContentView(R.layout.activity_categoria)
    }
    fun home(){
        startActivity<MainActivity>()
        finish()
    }
}
