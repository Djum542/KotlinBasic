fun main(args: Array<String>) {
    var i = 0
    while (i<=5){
        println(i)
        i++
    }
    println("i da xong $i")
    do {
        i++
    }while (i<=5)
    println("$i")
    while (true){
        println(" ban co muon thoat khong")
        var s = readLine()
        if (s == "Y" || s == "y")
            break
    }
    println("Ban da thoat.")
}