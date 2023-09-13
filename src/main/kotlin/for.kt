fun main(args: Array<String>) {
    var tong = 0
    // for step
    for (i in 1 .. 9 step 2){
         tong = tong + i
        println(i)
        println(tong)
    }
    //for close range
    for (i in 1 .. 5){
        println(i)// 1,2,3,4,5
        println("2 * $i = ${2*i}")
    }
    // for half
    for (i in 2 until 9){
        println(i)//1,2,3,4,5,6,7,8
    }
    // for down
    for (i in 5 downTo 1){
        println(i)//5,4,3,2,1
    }
    // for in collection
    var das = arrayOf("1,anh2.pnf, hinh, game.exe")
    for (i in das){
        println(i)
    }
}