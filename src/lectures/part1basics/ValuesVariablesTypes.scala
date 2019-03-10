package lectures.part1basics

object ValuesVariablesTypes extends App {
  // VALS ARE IMMUTABLE
  // COMPILER can infer types
  val x = 42
  val y: Int = 42
  println(x)

  val aString: String = "Hello";
  // Semicolons is not necessary if we just give one expression for each line

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 4612
  val aLong: Long = 2311231231231231231L // L at the end
  val aFloat: Float = 1.0f // f at the end
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4
  aVariable = 5 // side effects


}
