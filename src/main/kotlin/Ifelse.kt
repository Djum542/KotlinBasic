fun main(args: Array<String>) {
    var d:Float = 0.0f
    println("Moi thim nhap vao diem de lieu:")
    var diem = readLine()
    if (diem != null){
        d = diem.toFloat()
        if (d == 5f){
            println("Ban da do.")
        }else{
            println("ban da rot.")
        }
    }else{
        println("ban da rot.")
    }
}