package com.megix

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class ExtractorsPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerExtractorAPI(VCloud())
        registerExtractorAPI(GDFlix())
        registerExtractorAPI(GDFlix1())
        registerExtractorAPI(GDFlix2())
        registerExtractorAPI(HubCloud())
        registerExtractorAPI(HubCloudClub())
        registerExtractorAPI(fastdlserver())
        registerExtractorAPI(HubCloudlol())
    }
}
