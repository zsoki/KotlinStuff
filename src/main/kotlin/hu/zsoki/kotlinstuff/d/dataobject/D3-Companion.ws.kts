package hu.zsoki.kotlinstuff.d.dataobject

class Foo {

    fun getSignificantValue(map: Map<String, String>): String {
        return map.getOrDefault(SIGNIFICANT_CONST, "Default")
    }

    companion object {
        const val SIGNIFICANT_CONST: String = "significant_key"
    }

}

// Can access similar to static members in Java
Foo.SIGNIFICANT_CONST

// The reality
// Foo.Companion.SIGNIFICANT_CONST

val input = mapOf(
    "insignificant_key" to "insignificant_value",
    "significant_key" to "very_important_value"
)
val fooInstance = Foo()
fooInstance.getSignificantValue(input)



// More advanced example
// Source: https://medium.com/techshots/hidden-powers-of-kotlin-companion-object-ee65bfd57620

open class ImageDownloaderExecutor {

    protected fun scheduleTask(url: String) {
        // sequentially downloads and save images
    }
}

class ImageDownloader {
    companion object: ImageDownloaderExecutor()

    fun downloadAndSaveImage(url: String) {
        scheduleTask(url)
    }
}

val downloader = ImageDownloader()
downloader.downloadAndSaveImage("url")

// Unresolved reference
// downloader.scheduleTask()