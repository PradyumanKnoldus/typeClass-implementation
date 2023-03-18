object TypeClass extends App {

  // Type class definition
  trait Show[A] {
    def show(anyInput: A): String
  }

  // Type class instance for Int
  implicit val intShow: Show[Int] = new Show[Int] {
    def show(intInput: Int): String = intInput.toString
  }

  // Type class instance for Long
  implicit val longShow: Show[Long] = new Show[Long] {
    def show(longInput: Long): String = longInput.toString
  }

  // Type class instance for Double
  implicit val doubleShow: Show[Double] = new Show[Double] {
    def show(doubleInput: Double): String = doubleInput.toString
  }

  // Type class instance for Case Class (Position)
  case class Position(x: Int, y: Int)

  implicit val positionShow: Show[Position] = new Show[Position] {
    def show(input: Position): String = s"Pos(x: ${input.x}, y: ${input.y})"
  }

}
