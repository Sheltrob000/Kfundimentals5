fun main() {

    val song = songCatalog("song", "artist", 1919, 1100)
    song.print()
    println(song.isPopular)




    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", "amanda")

    amanda.showProfile()
    atiqah.showProfile()
}