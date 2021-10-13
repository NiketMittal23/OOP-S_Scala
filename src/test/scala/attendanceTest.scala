import Employee.attendance
import org.scalatest.flatspec.AnyFlatSpec
class attendanceTest extends AnyFlatSpec {
  "Attendance" should "give" in {
    val obj = new attendance
    val obj1 = obj.attendance("123", "9:45", "6:45")
    assert(obj1 == "123")
  }

}
