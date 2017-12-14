package unicauca.movil.peliculas

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import unicauca.movil.peliculas.adapters.DestinoAdapter
import unicauca.movil.peliculas.fragments.MainFragment
import unicauca.movil.peliculas.models.Destino
import unicauca.movil.peliculas.net.AppClient

class MainActivity : AppCompatActivity(), DrawerLayout.DrawerListener, Callback<List<Destino>> {

    //private val adapter:DestinoAdapter = DestinoAdapter(this)

    val toggle: ActionBarDrawerToggle by lazy {
        ActionBarDrawerToggle(this, drawer,
                R.string.open_menu, R.string.close_menu)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        drawer.addDrawerListener(this)

        nav.setNavigationItemSelectedListener { setContent(it) }

        putFragment(R.id.container, MainFragment.instance())

    }

    private fun loadSitios(){
        AppClient.destinoApi.all().enqueue(this)
    }
    override fun onResponse(call: Call<List<Destino>>?, response: Response<List<Destino>>) {
        if(response.isSuccessful){
            toast("Sitio asegurado")
         //   adapter.data = response.body()!!
        }
    }

    override fun onFailure(call: Call<List<Destino>>?, t: Throwable?) {
        toast("Error al mostrar destinos")
    }

    fun putFragment(container: Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(container, fragment)
                .commit()
    }

    fun setContent(item: MenuItem?): Boolean {
        drawer.closeDrawers()
        when(item?.itemId){
            R.id.nav_home -> putFragment(R.id.container, MainFragment.instance())
            R.id.nav_logout ->{
                getSharedPreferences("preferences", Context.MODE_PRIVATE).edit()
                        .putBoolean("logged",false)
                        .apply()
                startActivity<LoginActivity>()
                finish()
            }
        }
        return true
    }

    //region Toggle
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDrawerStateChanged(newState: Int) {
        toggle.onDrawerStateChanged(newState)
    }

    override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
        toggle.onDrawerSlide(drawerView, slideOffset)
    }

    override fun onDrawerClosed(drawerView: View) {
        toggle.onDrawerClosed(drawerView)
    }

    override fun onDrawerOpened(drawerView: View) {
        toggle.onDrawerOpened(drawerView)
    }
    //endregion

}
