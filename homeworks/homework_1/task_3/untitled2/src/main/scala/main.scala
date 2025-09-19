object Main extends App {
  val name = "Daniel Butakov"
  val messages = List("Привет, Скала! Это", "Hello, Scala! This is", "Hola, Scala! This is")

  messages.foreach(msg => println(s"$msg $name"))
  messages.foreach(msg => println(s"$msg ${name.reverse}"))
}