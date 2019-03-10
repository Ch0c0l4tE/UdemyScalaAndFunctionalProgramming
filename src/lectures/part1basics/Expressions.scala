package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION (Right-hand Side)
  println(x)

  println(2 + 3 * 4) // MATH EXPRESSION EXAMPLE
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=  ..... theses are all side effects
  println(aVariable)

  // Instructions vs Expressions

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // this is called if expression because it returns always a value not a condition
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  // EVERYTHING IN SCALA IS AN EXPRESSION

  val aWeirdValue = (aVariable = 3) // Unit  === Void -> means nothing live void ()
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning


  // Code blocks -> a code block is an expression, the value of a block is the value of the last expression inside the block
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye" // this is the value of the expression aCodeBlock
  }

  // 1. difference between "hello world" vs println("hello world")
  // hello world is a string literal
  // println is a side effect that returns unit
  // actual print hello world to the console.
  // 2. whats the value of

  val someValue = {
    2 < 3
  }
  // this hava a value boolean, true in this case

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  // 42 is the value of someothervalue because its the last expression evaluated
}
