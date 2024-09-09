class songCatalog(
    val title : String,
    val artist : String,
    val yearPublished : Int,
    val playCount : Int

) {
    fun print () {
        println("$title, preformed by $artist, was released in $yearPublished")
    }
    val isPopular : Boolean
        get() = playCount >= 1000








}