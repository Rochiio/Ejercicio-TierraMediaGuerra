package models

import models.enums.RazasBondadosas

interface Bondadoso {
    fun numberOfPersonaje(personaje: RazasBondadosas):Int
}