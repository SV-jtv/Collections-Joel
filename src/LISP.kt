import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val rep = scan.nextInt()
    scan.nextLine()
    repeat(rep) {
        val linia = scan.nextLine().toCharArray()
        var correcte = true
        var balance = 0
        for (char in linia) {
            when (char) {
                '(' -> balance++
                ')' -> {
                    if (balance == 0) correcte = false
                    balance--
                }
            }
        }
        if (balance != 0) correcte = false
        if (correcte) println("si") else println("no")
    }
}
