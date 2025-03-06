import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    repeat(scan.nextInt()) {
        //Definim la cua (queue) com una LinkedList
        val cua : Queue<Int> = LinkedList<Int>()
        val nensCua = scan.nextInt()
        scan.nextLine()

        //Afegim elements a la cua
        repeat(nensCua) {
            cua.add(it+1)
        }

        val events = scan.nextLine().toCharArray()
        for (event in events) {
            if (event == 'S') cua.poll()
            if (event == 'N') {
                cua.add(cua.peek())
                cua.poll()
            }
            if (event == 'E') cua.add(cua.last()+1)
        }
        println(cua.peek())
    }
}
/*
fun aaa() {
    //Definim la cua (queue) com una LinkedList
    val cua : Queue<Int> = LinkedList<Int>()

    //Afegim elements a la cua
    cua.add(1)
    cua.add(2)
    cua.add(3)

    //Mostrem el contingut de la cua
    println("Contingut de la cua: ${cua.toString()}")

    //Treiem un element de la cua
    println("Treiem un element de la cua: ${cua.poll()}")
    println("Contingut de la cua: ${cua.toString()}")
    cua.add(4)
    cua.add(5)
    println("Contingut de la cua: ${cua.toString()}")

    //Recorrer la cua sense treure els elements
    println("Recorrem la cua sense treure els elements")
    for (i in cua) {
        println(i)
    }

    //Mirar el primer element, sense treure'l
    val front = cua.peek()
    println("El primer element de la cua és: $front")
    println("Contingut de la cua: ${cua.toString()}")

    //Treure tots els elements de la cua
    println("Treure tots els elements de la cua")
    while (!cua.isEmpty()) {
        cua.poll()
    }
    println("Contingut de la cua: ${cua.toString()}")

    //Està buida?
    println("Està buida?: ${cua.isEmpty()}")

}
*/