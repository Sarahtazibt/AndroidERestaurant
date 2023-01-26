package fr.isen.tazibt.androiderestaurant.model

import java.io.Serializable
import java.io.StringReader

data class Object (
    var prices: String? = null,
    var nom: String? = null,
    var image: ArrayList<String>? = null

) : Serializable
