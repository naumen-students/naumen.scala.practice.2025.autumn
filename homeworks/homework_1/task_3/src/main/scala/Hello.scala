object Hello extends App {
  lazy val name = "Кривоплясов Евгений";
  lazy val greetings = List("Hello", "Hola", "Guten tag");
  lazy val names = List(name, name.reverse);
  def generateMessages: List[String] = {
    for {
      currentName <- names
      greet <- greetings
    } yield s"$greet Scala! This is $currentName"
  }

  generateMessages.foreach(println);
}

