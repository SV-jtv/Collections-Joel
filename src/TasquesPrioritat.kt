import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val tasques: MutableMap<Int,String> = mutableMapOf()
    val ordre: MutableList<Int> = mutableListOf()

    repeat(scan.nextInt()) {
        val rep = scan.nextInt()
        val prioritari = scan.nextInt()-1
        scan.nextLine()
        repeat(rep) {
            val key = scan.nextInt()
            val value = scan.nextLine()
            tasques[key] = value
            ordre.add(key)
        }

        ordre.sort()
        for (i in ordre.indices) if (i == prioritari) {
            println(tasques.getValue(ordre[i]))
        }
        ordre.clear()
        tasques.clear()
    }
}