object Main extends App {
  val name = "Дмитрий Бабинцев"

  val originalGreeting = s"Привет, Скала! Это $name"

  println(originalGreeting)

  println(s"Hola, Скала! Это $name")

  val greetings = List("Hola", "Guten tag")

  def reverseName(str: String): String = str.reverse

  greetings.foreach { greeting =>
    val reversedName = reverseName(name)
    val modifiedGreeting = s"$greeting, Скала! Это $reversedName"
    println(modifiedGreeting)
  }
}