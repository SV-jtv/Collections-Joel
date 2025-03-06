import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    repeat(scan.nextInt()) {
        val mapes = mutableMapOf<String, Int>()
        val vots = scan.nextInt()
        scan.nextLine()
        repeat(vots){
            val key = scan.nextLine()
            mapes[key] = mapes.getOrDefault(key,0)+1
        }
        var count = 0
        for (values in mapes.values) {
            if (values > count) count = values
        }
        for (mapa in mapes) {
            if (mapa.value == count) println(mapa.key)
        }
    }
}
