package de.syntax_institut.android_ta_travelapp.data

import android.content.Context
import de.syntax_institut.android_ta_travelapp.data.model.City

class Datasource(private val context: Context) {

    private val nrOfImages = 8 // anpassen, wenn Anzahl an Bildern geändert wurde
    private val numberOfTitles = 8 // anpassen, wenn Anzahl an Filmtiteln geändert wurde

    /**
     * Diese Funktion holt die Titel & Bilder aus der Quelldatei
     * und liefert eine Liste aus Filmen zurück
     */
    fun loadCities(): List<City> {
        // Die Liste an Filmen
        val movies = mutableListOf<City>()

        // Befülle die Liste
        for (index in 1..numberOfTitles) {

            // Hole den Titel und das Bild
            val title = getTitle(index)
            val image = getImage(index)

            // Füge ein Movie Objekt hinzu
            movies.add(
                City(title, image)
            )
        }
        return movies
    }

    /**
     * Diese Funktion liefert den Titel Nummer index aus der Quelle
     */
    private fun getTitle(index: Int): Int {
        return context.resources.getIdentifier(
            "cityTitle$index",
            "string",
            context.packageName
        )
    }

    private var iPrevious = 0
    /**
     * Diese Funktion liefert ein zufälliges Bild aus der Bilderquelle
     */
    private fun getImage(index: Int): Int {

        // Liefere das entsprechende Bild aus der Quelle
        return context.resources.getIdentifier(
            "city$index",
            "drawable",
            context.packageName
        )
    }
}