import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val wins = mutableMapOf<String, Int>()
    var trobat = false

    while (!trobat) {
        val nom = scan.nextLine()
        if (nom != "xxx") {
            wins[nom] = wins.getOrDefault(nom, 0) + 1
            if (wins[nom] == 5) {
                println(nom)
                trobat = true
            }
        }else {
            println("NO")
            trobat = true
        }
    }
}
