import java.util.*

fun main() {
    class Planeta(val nom: String, val distancia: Double, val tamany: Double) {}
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()

    repeat(casos) {
        val rep = scan.nextInt()
        val planetes = mutableListOf<Planeta>()
        scan.nextLine()

        repeat(rep) {
            val dades = scan.nextLine().split(" ")
            planetes.add(Planeta(dades[0], dades[1].toDouble(), dades[2].toDouble()))
        }

        planetes.sortBy { it.distancia }
        // Calculem mediana
        val mediana = planetes[rep / 2].distancia
        // Filtrem per la mediana de distància
        val planetesMediana = planetes.filter { it.distancia == mediana }

        if (planetesMediana.size == 1) {
            println(planetesMediana[0].nom)
        } else {
            val planetesMedianaOrdenada = planetesMediana.sortedBy { it.tamany }
            val medianaTamany = planetesMedianaOrdenada[planetesMedianaOrdenada.size / 2]
            println(medianaTamany.nom)
        }
    }
}