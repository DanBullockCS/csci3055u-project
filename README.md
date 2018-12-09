# Scala, a Functional AND Object-Orientated Language

- Daniel Bullock
- Daniel.Bullock@uoit.net

## About the language

> _Describe the language_
>
> - History: Funnel, a programming language based on functional nets was the language that led to Scala. Scala started it's design in 2001 and was released in 2003. Scala is a functional programming language and like Clojure, it is interoperable with java (meaning it is able to exchange and make use of information with java).
> - Some interesting features: Scala was designed to be both functional and object-oriented. It is a pure object-oriented language because every value in it is an object. It is a functional language because every function is a value. Functions in Scala can be nested and can operate on data using pattern matching. More functional concepts in Scala include Lambda functions, Closure and Immutable data.

## About the syntax

> _give some code snippet of the language_

*Let form*, Scala does not have a "let," but can show bindings with the following example program
In Scala
```Scala
// extends App quickly turns objects into executeable programs!
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
}
```

In clojure
```clojure
(let [x 10
      y 20]
  (+ x y))
```
A basic for loop in Scala
```Scala
// prints numbers 0 to 100
for(i <- 0 to 100)
    println(i)
```
## About the tools

> _Describe the compiler or interpreter needed_.

> Since Scala is interoperable with java, it runs just like java and using java. I used the terminal in Xubuntu (Linux) to run Scala by installing Scala via the deb file on (https://www.scala-lang.org/download/). You must have java jdk installed to run Scala programs so make sure that is also installed. Once you have those you can write a scala program like the one above and compile using `scalac FILENAME.scala` then run using `scala FILENAME`.
> There is also an open source build tool for Scala and Java called sbt. To install you can use the command `sbt new scala/hello-world.g8` and the project structure will look something like this:
```Scala
- hello-world
    - project
        - build.properties
    - src
        - main
            - scala (All of your scala code goes here)
                -Main.scala (Entry point of program)
    build.sbt (sbt's build definition file)
```
> Then to run just use the command `sbt` and type `run` and your program should run.

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

> Example showing the Array and List data structures that can hold different types of data (Strings and integers). Also the mkString function was used to print the array nicely.
```Scala
/
* Standard library functions used: Array, deep, mkString, and List
* Make an example array and use deep and mkString to pretty print it
* Make an example list and print it
*/
object standardLibExample extends App { 
  val example_array = Array(1, 2, "SKIP A FEW", 99, 100)
  val example_list = List(1, 2, "SKIP A FEW", 99, 100)
  println("Example Array = [" + example_array.deep.mkString(", ") + "]")
  println("Example List = " + example_list)
}
```

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

> One open source library is scala-csv by user tototoshi on github via the link (https://github.com/tototoshi/scala-csv).
> To use this library, add the following line into your build.sbt file:
`libraryDependencies += "com.github.tototoshi" %% "scala-csv" % "1.3.5"`
> Then add a sample.csv csv file filled with something like this:
```csv
a,b,c
d,e,f
```
> After that change your main to something like the following code and you can run using the sbt build tool.
```Scala
import com.github.tototoshi.csv._
object Main extends App {
  val reader = CSVReader.open("sample.csv")
  println(reader.all())
  reader.close()
}
```
> With the output being something like:
```Scala
List(List(a, b, c), List(d, e, f))
```

# Analysis of the language

> _Organize your report according to the project description
document_.

> 1. The style of programming supported by the language: functional vs procedural programming

> Scala supports functional programming just like clojure, but since it is interoperable with java it also supports object-oriented. Scala is a strong static type of programming language, but it can extend classes (inheritence) making it an object-oriented language.

> 2. The ability to perform meta-programming such as macros

> Scala developers plan on adding macros in the future, but until then we have Scalameta (https://scalameta.org/) which lets Scala programmers use meta-programming.

> 3. Symbol resolution and its support for closure

> Scala supports closure for example here is an anonymous function:
```Scala
var factor = 3
val multiplier = (i:Int) => i * factor
```
> i and factor are free variables in the function, but i is a formal parameter to the function. Therefore, it is bound to the new value each time the function is called. factor, however is a free variable still since it is declared elsewhere.

> 4. Scoping rules supported by the language: lexical vs dynamic scoping

> Scala supports two types of bindings Variable and Value, with the keywords Var and Val respectively, all functions in Scala are static and therefore are lexical.

> 5. Functional programming constructs either as part of the language or supported by the standard library of the runtime.

> Scala's functions are objects, just like in clojure you can use a function value as a function, here's some code for that:
```Scala
((x: Int, y: Int) => x+y)(400, 600)
```

> 6. Its type system: static vs dynamic types

> Scala has a static type system as opposed to clojure that has dynamic types in it. Scala's static types are much safer. Here is an example of a declaring a var in Scala:
```Scala
var number_of_students: Int = 0
number_of_students = 70
number_of_students = 70.5 // this is not an Int and will throw an error
```

> 7. Strengths and weaknesses of the language

> Strengths
> - Scala is pretty easy to pick up coming from a background in java. 
> - Decent support of IDE, can use IntelliJ IDEA for Scala
> - Scala is highly functional
> Weaknesses
> - Since Scala has object-oriented functionality you tend to think in that mindset rather than functionally.
> - Scala runs on the JVM which means it has no true tail-recursive optimization
