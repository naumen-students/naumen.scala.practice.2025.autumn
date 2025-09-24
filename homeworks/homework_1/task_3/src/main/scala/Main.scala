object Main extends App {
  val fmt = "%s, Скала! Это %s\n"
  val greetings = Array("Привет", "Hola", "Guten tag")
  val name = "Константин"
  val names = Array(name, name.reverse)

  names.foreach(name => greetings.foreach(greeting => printf(fmt, greeting, name)))
}
