 package unicauca.movil.peliculas.adapters
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import unicauca.movil.peliculas.R
import unicauca.movil.peliculas.databinding.TemplateDestinoBinding
import unicauca.movil.peliculas.databinding.TemplateReservaBinding
import unicauca.movil.peliculas.models.Destino
import unicauca.movil.peliculas.models.Reserva
import unicauca.movil.peliculas.util.inflate

/**
 * Created by Sebastian on 15/12/2017.
 */

class ReservaAdapter:RecyclerView.Adapter<ReservaViewHolder>(){
    var data: List<Reserva> = emptyList()
        set(value){
            field = value
            notifyDataSetChanged()
        }
    override fun onBindViewHolder(holder: ReservaViewHolder, position: Int) {
        holder.binding.des = data[position]

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReservaViewHolder
    = ReservaViewHolder((parent.inflate(R.layout.template_reserva)) )

    override fun getItemCount(): Int = data.size
}

class ReservaViewHolder(view:View):RecyclerView.ViewHolder(view){
    val binding:TemplateReservaBinding = DataBindingUtil.bind(view)
}
