import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    repeat(scan.nextInt()) {
        val amistats = mutableMapOf<String, String>()
        val rep = scan.nextInt()
        scan.nextLine()

        repeat(rep - 1) {
            val (persona1, persona2) = scan.nextLine().split(" ")
            amistats[persona1] = persona2
            amistats[persona2] = persona1
        }

        val nom = scan.nextLine()
        println(amistats[nom] ?: "NO")
    }
}