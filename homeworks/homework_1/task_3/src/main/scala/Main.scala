
object Main extends App {
  val name = "Алексей Черняев"
  val reversedName = name.reverse

  val greetings = List("Привет", "Hola", "Guten tag")

  def greet(target: String): Unit =
    greetings.foreach(g => println(s"$g, Скала! Это $target"))


  greet(name)
  greet(reversedName)
}
