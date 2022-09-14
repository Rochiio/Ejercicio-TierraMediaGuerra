package models.interfaces

import models.enums.RazasMalvadas
/**
 * Interfaz para quiénes llevan la maldad
 */
interface Malvado {
    fun numberOfPersonaje(personaje: RazasMalvadas):Int
}