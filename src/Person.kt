class Person(
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: String?
) {


    fun showProfile() {
        println("Name: $name")
        println("Age: $age")

        if (hobby != null) {
            println("likes to $hobby")
        }
        if (referrer != null ){
            println("refered by $referrer")
        }else {
            println("no referer")}

        println()
        println()
    }

}