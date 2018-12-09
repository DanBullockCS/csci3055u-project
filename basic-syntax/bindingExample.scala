/*
* Daniel Bullock
* Basic syntax example
*/
object bindingExample extends App { 
  // define a value that cannot have an updated binding
  val some_value = 89
  // this will throw an error because reassignment to vals is not allowed
  // some_value = 90
  println("some_value = " + some_value)

  //var is a symbol that can have update bindings
  var some_variable = 89 
  some_variable = 90
  println("some_variable = " + some_variable)

  // a simple for loop that prints numbers 0 to 10
  for(i <- 0 to 10)
    println(i)
}