object Main extends App {
  val name = "Borshov Kirill"
  val a = "Hello Scala! This is " + name
  println(a)
  val b = List("Hola", "Guten tag")

  def reverseName(s: String): String = s.reverse

  b.foreach { greet =>
    val newName = reverseName(name)
    val customGreeting = s"$greet, Scala! This is $newName"
    println(customGreeting)
  }
}