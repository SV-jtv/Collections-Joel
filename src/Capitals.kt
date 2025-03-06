import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val diccionari : MutableMap<String,String> = sortedMapOf()

    repeat(scan.nextInt()) {
        val rep = scan.nextInt()
        scan.nextLine()
        repeat(rep - 1) {
            val data = scan.nextLine().split("-")
            diccionari.put(data[0], data[1])
        }
        val key = scan.nextLine()
        val value = diccionari[key]
        if (value == null) println("NO HO SE")
        else println(value)
        diccionari.clear()
    }
}
