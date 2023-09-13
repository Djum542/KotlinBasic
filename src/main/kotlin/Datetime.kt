import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
    var cal = Calendar.getInstance()
    println(cal)
    var nam = cal.get(Calendar.YEAR)
    var  thang = cal.get(Calendar.MONTH)
    var ngay = cal.get(Calendar.DAY_OF_MONTH)
    println("$nam/${thang+1}/$ngay")
    // xuat ngay thang nam
    var date = cal.time
    // xuat theo dih dang ngay thang nam
    var dinhdang = SimpleDateFormat("dd/mm/yyyy HH:MM:SS")

    println(dinhdang.format(date))
}