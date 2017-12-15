package unicauca.movil.peliculas

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.startActivity
import unicauca.movil.peliculas.databinding.ActivityManualBinding

class ManualActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityManualBinding =  DataBindingUtil.setContentView(this,R.layout.activity_manual)
        binding.handlerManual = this
        setContentView(R.layout.activity_manual)
    }
    fun showCategorias(){
        startActivity<categoriaActivity>()
        finish()
    }
}
