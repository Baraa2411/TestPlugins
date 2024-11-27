package com.abinis

import androidx.appcompat.app.AppCompatActivity
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse

class DramacoolProvider : MainAPI() { // all providers must be an intstance of MainAPI
    override var mainUrl = "https://asianc.co/" 
    override var name = "Dramacool"
    override val supportedTypes = setOf(
        TvType.Movie
        TvType.Drama
        TvType.Tvshows
    )

    
    // enable this when your provider has a main page
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val hasQuickSearch = true
    
    // this function gets called when you search for something
    override suspend fun search(query: String): List<SearchResponse> {
        return listOf<SearchResponse>()
    }
}
