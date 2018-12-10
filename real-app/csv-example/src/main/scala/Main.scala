/*
* Daniel Bullock - sample csv reader "real world app"
* file sample.csv included in csv-example folder
* to run use the command:
* sbt
* and the command:
* run sample.csv
*/
import com.github.tototoshi.csv._
object Main extends App {
  if (args.length == 0) {
    println("Please enter the filename as a parameter")
  }
  val filename = args(0)
  val reader = CSVReader.open(filename)
  var lines = reader.all()
  lines.foreach {println}
  reader.close()
}