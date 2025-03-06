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
        val value = scan.nextLine()
        var count = 0
        for (i in diccionari){
            if (i.value == value) count++
            //if (diccionari.getValue(i.key) == null) println("0")
        }
        println(count)
        diccionari.clear()
    }
}