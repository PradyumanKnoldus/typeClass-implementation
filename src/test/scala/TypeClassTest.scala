import org.scalatest.flatspec.AnyFlatSpec
import TypeClass._

class TypeClassTest extends AnyFlatSpec {

  "The Show instance for Int" should "return the string representation of the integer" in {
    val intInput = 42
    val expectedOutput = "42"
    assert(intShow.show(intInput) == expectedOutput)
  }

  "The Show instance for Long" should "return the string representation of the long" in {
    val longInput = 1234567890123L
    val expectedOutput = "1234567890123"
    assert(longShow.show(longInput) == expectedOutput)
  }

  "The Show instance for Double" should "return the string representation of the double" in {
    val doubleInput = 3.14159
    val expectedOutput = "3.14159"
    assert(doubleShow.show(doubleInput) == expectedOutput)
  }

  "The Show instance for Position" should "return a string representation of the position" in {
    val positionInput = Position(1, 2)
    val expectedOutput = "Pos(x: 1, y: 2)"
    assert(positionShow.show(positionInput) == expectedOutput)
  }
}
