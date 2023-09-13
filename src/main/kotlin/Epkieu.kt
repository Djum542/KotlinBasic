fun main(args: Array<String>) {
    var soA:Int = 35
    var soB:Long = soA.toLong()
    println(soA)
    println("$soB")
    println(soA::class.java.typeName)
    println(soB::class.java.typeName)
    // ep kieu hep
    var x:Short = 32767
    var y:Byte = x.toByte()
    println("$x")
    println("$y")
}