package unicauca.movil.peliculas.adapters

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import unicauca.movil.peliculas.R
import unicauca.movil.peliculas.databinding.TemplateDestinoBinding
import unicauca.movil.peliculas.models.Destino
import unicauca.movil.peliculas.util.inflate

//Usamos el callback para cada vez que le demos click en una tarjeta en activity
class DestinoAdapter(val callback:(pos:Int)->Unit) : RecyclerView.Adapter<DestinoViewHolder>() {

    var data: List<Destino> = emptyList()
        //Notificamos que data ha cambiado
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onBindViewHolder(holder: DestinoViewHolder, position: Int) {
        holder.binding.movie = data[position]
        //Cada view puede tener información por medio de un obj
        holder.binding.root.tag = position
        holder.binding.handler = this
    }
    //Le mando la pos del destino al momento de hacer click
    fun onMovieClick(pos:Int){
        callback(pos)
    }

    //TemplateViewHolder tendrá estructura del template_Destino
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinoViewHolder
            = DestinoViewHolder(parent.inflate(R.layout.template_destino))
    //Obtenemos número total de destinos
    override fun getItemCount(): Int = data.size

}

class DestinoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding: TemplateDestinoBinding = DataBindingUtil.bind(view)
}
