package Employee

class attendance {
  def attendance(emp: String, startTime: String, endTime: String): String = {
    println("Employee =" +emp+ "   Start Time =" +startTime+ "   EndTIme =" +endTime)
    emp
  }

  def attendance(emp: String): String ={
    val startTime = "9:45 AM"
    val endTime = "6:45 PM"
    println("Employee =" +emp+ "   Start Time =" +startTime+ "   EndTIme =" +endTime)
    emp
  }
}
//object attend{
//  def main(args: Array[String]): Unit ={
//    val c = new attendance()
//    c.attendance("cons","10", "7")
//    c.attendance("potc")
//  }
//}
