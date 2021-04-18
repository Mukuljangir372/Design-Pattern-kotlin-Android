package com.mu.jan.myapplication.structuralpattern

/**
 * In Adapter pattern, we connect two or more interfaces.
 *
 * RecyclerView adapter, Pager adapter, are the best examples
 * of adapter pattern.
 *
 */
interface MovieInterface{
    fun getMovies(): List<*>
}
class PopularMovies: MovieInterface{
    override fun getMovies(): List<*> {
        return listOf("Popular movies list")
    }
}
class TopRatedMovies: MovieInterface{
    override fun getMovies(): List<*> {
        return listOf("Top rated movies list")
    }
}
object ShowMovies{
    fun show(i: MovieInterface){
        //setAdapter
        i.getMovies()
    }
}
class Learn{
    private fun show(){
        ShowMovies.show(PopularMovies())
    }

}
