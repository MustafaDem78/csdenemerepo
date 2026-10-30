package com.example

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

class Dizipal : MainAPI() { // All providers must be an instance of MainAPI
    override var mainUrl = "https://dizipal1592.com/" 
    override var name = "Dizipal"
    override val supportedTypes = setOf(TvType.Movie)

    override var lang = "tr"

    // Enable this when your provider has a main page
    override val hasMainPage = true

    // This function gets called when you search for something
    override suspend fun search(query: String): List<SearchResponse> {
        return listOf()
    }
}
