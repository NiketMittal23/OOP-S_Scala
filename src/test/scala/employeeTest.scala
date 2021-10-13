import Employee.Consultant
import org.scalatest.flatspec.AnyFlatSpec
class employeeTest extends AnyFlatSpec {

  "consultant" should "give" in {
    val test = Consultant("1","NIket","MIttal", 100000)
    println(assert(test!=2))
  }
}
