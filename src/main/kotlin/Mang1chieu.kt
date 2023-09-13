fun main(args: Array<String>) {
    // khai bao mang
    var m = IntArray(5)
    m = intArrayOf(2,4,5,7)
    for (i in m)
        // thay doi gia tri
    println(i)
    m[1] = 10
    for (j in m)
    println(j)
}