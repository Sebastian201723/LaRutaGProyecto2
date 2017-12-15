package unicauca.movil.peliculas.fragments

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_reservas_fragment.*
import kotlinx.android.synthetic.main.fragment_main.*
import unicauca.movil.peliculas.R
import unicauca.movil.peliculas.adapters.ReservaAdapter
import unicauca.movil.peliculas.util.Data

class ReservasFragment : Fragment() {
    val adaptador:ReservaAdapter = ReservaAdapter()
/**
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_reservas_fragment, container, false)
    }

    override fun onResume() {
        super.onResume()
        listreservas.adapter = adaptador
        listreservas.layoutManager = LinearLayoutManager(activity)
        adaptador.data = Data.reserva
    }
**/
}
