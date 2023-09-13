fun main(args: Array<String>) {
    var a =10
    var b = 2
    try {
        var c = a.div(b)
        println(c)
    }catch (e:Exception){
        e.printStackTrace()
    }finally {
    println("thoat ra.")
    }
    // throw thong bao loi ro rang tuong minh.
    if (a == 0 || b == 0)
        throw Exception("so 0 khong tinh duoc")
    
}