fun main() {
    print("Ingresa un número para verificar si es primo: ")
    val numero = readLine()?.toIntOrNull()

    if (numero == null || numero <= 1) {
        println("NO ES UN NUMERO PRIMO.")
    } else {
        var esPrimo = true

        for (i in 2 until numero) {
            if (numero % i == 0) {
                esPrimo = false
                break
            }
        }

        if (esPrimo) {
            println("$numero SI ES UN NUMERO PRIMO.")
        } else {
            println("$numero NO ES UN NUMERO PRIMO.")
        }
    }
}
