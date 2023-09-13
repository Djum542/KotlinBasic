fun main() {
    for (i in 1 .. 7){
        for (j in 1 .. 7){
//            println("$i$j")
            if ((i == 1) && (j == 2 || j == 3 || i == 5 || j == 6)
                || (i == 2) && (j == 1 || j == 4 || j == 7)
                || (i == 3) && (j == 1 || j == 7)
                || (i == 4) && (j == 2 || j == 6)
                || (i == 5) && (j == 3 || j == 5)
                || (i == 6) && (j == 4))
                println("$i$j")
            println("\t")

        }
        println()
    }
}