package Employee

sealed trait Employee
case class Consultant(empId: String, firstName: String, lastName: String, salary: Int) extends Employee
 {
   private val prefix: String = "CONS"
   println(prefix)
   println("EmpID =" + empId + "   FirstName =" + firstName + "   LastName =" + lastName + "   salary =" +salary)
 }
case class Manager(empId: String, firstName: String, lastName: String, salary: Int) extends Employee
{
  private val prefix: String = "MANA"
  println(prefix)
  println("EmpID =" + empId + "   FirstName =" + firstName + "   LastName =" + lastName + "   salary =" +salary)
}
case class SrManager(empId: String, firstName: String, lastName: String, salary: Int) extends Employee
{
  private val prefix: String = "SRMA"
  println(prefix)
  println("EmpID =" + empId + "   FirstName =" + firstName + "   LastName =" + lastName + "   salary =" +salary)
}
case class President(empId: String, firstName: String, lastName: String, salary: Int) extends Employee
{
  private val prefix: String = "POTC"
  println(prefix)
  println("EmpID =" + empId + "   FirstName =" + firstName + "   LastName =" + lastName + "   salary =" +salary)
}


//object Main {
//  def main(args: Array[String]): Unit = {
//    val a = Consultant(12,"Niket" , "Mittal" , 1000000)
//    val b = President(1,"ABCD","xyz",100000)
//  }
//}