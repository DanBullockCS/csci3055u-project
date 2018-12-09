/*
* Standard library functions used: deep and mkString
* Data structures used: Array and List
* Make an example array and use deep and mkString to pretty print it
* Make an example list and print it
*/
object standardLibExample extends App { 
  val example_array = Array(1, 2, "SKIP A FEW", 99, 100)
  val example_list = List(1, 2, "SKIP A FEW", 99, 100)
  println("Example Array = [" + example_array.deep.mkString(", ") + "]")
  println("Example List = " + example_list)
}