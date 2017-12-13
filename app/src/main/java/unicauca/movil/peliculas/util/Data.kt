package unicauca.movil.peliculas.util

import unicauca.movil.peliculas.models.Pelicula

object Data {

    var Pelicula: MutableList<Pelicula> = mutableListOf(
            Pelicula("Hacienda cajibio", "210 min", "3",
                    "12000",
                    "https://i.ytimg.com/vi/w5DaQPVis5A/maxresdefault.jpg","sdgsfg"),
            Pelicula("Observatorio Astronomico Sueño Paraiso", "210 min", "3",
                    "12000",
                    "https://static.wixstatic.com/media/f53e10_1411993f371c45dbaaf654e7f138d304.jpg/v1/fill/w_676,h_591,al_c,q_85/f53e10_1411993f371c45dbaaf654e7f138d304.webp","ef"),
            Pelicula("Mamá Lombriz", "210 min", "3",
                    "12000",
                    "http://frea.com.co/images/logo_mama_lombriz.jpg","sdg"),
            Pelicula("Canopy Ardilla", "210 min", "3",
                    "12000",
                    "http://www.tuciudadenred.com/data/foto/gr_1467916411_1004209900.jpg","sfg")
    )

}
