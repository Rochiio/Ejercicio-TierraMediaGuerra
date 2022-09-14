package models.interfaces

import models.enums.RazasMalvadas

interface Malvado {
    fun numberOfPersonaje(personaje: RazasMalvadas):Int
}