import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    repeat(scan.nextInt()) {
        //Definim la pila (stack)
        val pila: Stack<Int> =  Stack<Int>()
        val items = scan.nextInt()

        //Afegim elements a la cua
        repeat(items) {
            pila.push(scan.nextInt())
        }

        val posicions = scan.nextInt()
        if (posicions == pila.size) println(pila.joinToString(" "))
        else{
            for (i in 0 until posicions){
                pila.add(0, pila.peek())
                pila.pop()
            }
            println(pila.joinToString(" "))
        }

    }
}
/*
fun aaa() {
    //Definim la pila (stack)
    val pila: Stack<Int> =  Stack<Int>()

    //Afegim elements a la pila
    pila.add(1)
    pila.push(2)
    pila.add(3)
    pila.push(2)
    pila.add(3)


    //Mostrem el contingut de la cua
    println("Contingut de la pila: ${pila.toString()}")

    //Treiem un element de la cua
    println("Treiem un element de la cua: ${pila.pop()}")
    println("Contingut de la cua: ${pila.toString()}")
    pila.add(4)
    pila.add(5)
    println("Contingut de la cua: ${pila.toString()}")

    //Recorrer la pila sense treure els elements
    println("Recorrem la cua sense treure els elements")
    for (i in pila) {
        println(i)
    }

    //Mirar el primer element, sense treure'l
    val front = pila.peek()
    println("El primer element de la cua és: $front")
    println("Contingut de la cua: ${pila.toString()}")

    //Treure tots els elements de la cua
    println("Treure tots els elements de la cua")
    while (!pila.isEmpty()) {
        pila.pop()
    }
    println("Contingut de la cua: ${pila.toString()}")

    //Està buida?
    println("Està buida?: ${pila.isEmpty()}")
}
 */