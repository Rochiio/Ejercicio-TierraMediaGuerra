package models

import models.enums.RazasBondadosas
import models.enums.RazasMalvadas

class Batalla(
    val bondadosos:EjercitoBondadoso = EjercitoBondadoso(),
    val malvados:EjercitoMalvado = EjercitoMalvado()
    ) {

    /**
     * Batalla
     * @param times Veces que se va a repetir las batallas
     */
    fun playBattle(times:Int){
        presentacion()

        repeat(times){
            val winner:String = fight()
            println(winner)
        }
    }

    private fun presentacion() {
        println(bondadosos.toString())
        println()
        println(malvados.toString())
    }


    private fun fight():String{
        val personajeBondadoso: RazasBondadosas = RazasBondadosas.values()[(0..4).random()]
        val numberPersonajeBondadoso:Int = (1..bondadosos.numberOfPersonaje(personajeBondadoso)).random()
        val personajeMalvado: RazasMalvadas = RazasMalvadas.values()[(0..4).random()]
        val numberPersonajeMalvado:Int = (1..malvados.numberOfPersonaje(personajeMalvado)).random()

        return when{
            ((personajeBondadoso.value*numberPersonajeBondadoso)>(personajeMalvado.value*numberPersonajeMalvado)) ->
                "$numberPersonajeBondadoso $personajeBondadoso gana contra $numberPersonajeMalvado $personajeMalvado"
            ((personajeBondadoso.value*numberPersonajeBondadoso)<(personajeMalvado.value*numberPersonajeMalvado)) ->
                "$numberPersonajeBondadoso $personajeBondadoso pierde contra $numberPersonajeMalvado $personajeMalvado"
            else -> "$numberPersonajeBondadoso $personajeBondadoso empata contra $numberPersonajeMalvado $personajeMalvado"
        }

    }


}