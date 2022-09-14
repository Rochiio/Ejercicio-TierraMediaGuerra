package models.interfaces

import models.enums.RazasBondadosas

/**
 * Interfaz para quiénes llevan la bondad
 */
interface Bondadoso {
    fun numberOfPersonaje(personaje: RazasBondadosas):Int
}