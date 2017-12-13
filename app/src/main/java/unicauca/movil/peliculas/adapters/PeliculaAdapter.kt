package unicauca.movil.peliculas.adapters

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import unicauca.movil.peliculas.R
import unicauca.movil.peliculas.databinding.TemplatePeliculaBinding
import unicauca.movil.peliculas.models.Pelicula
import unicauca.movil.peliculas.util.inflate

//Usamos el callback para cada vez que le demos click en una tarjeta en activity
class PeliculaAdapter(val callback:(pos:Int)->Unit) : RecyclerView.Adapter<PeliculaViewHolder>() {

    var data: List<Pelicula> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
        holder.binding.movie = data[position]
        //Cada view puede tener información por medio de un obj
        holder.binding.root.tag = position
        holder.binding.handler = this
    }
    //Le mando la pos del tag por medio del callback
    fun onMovieClick(pos:Int){
        callback(pos)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder
            = PeliculaViewHolder(parent.inflate(R.layout.template_pelicula))

    override fun getItemCount(): Int = data.size

}

class PeliculaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding: TemplatePeliculaBinding = DataBindingUtil.bind(view)
}
