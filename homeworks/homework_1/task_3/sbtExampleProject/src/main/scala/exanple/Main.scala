package exanple

class Main

@main def run() =
  def printHelloString(x: List[String]): Unit = println(x(0) + " " + x(1) + "! " + x(2) + " " + x(3))

  var name = "Anna Rubkaleva"

  var greetingEng = List("Hello", "Scala", "This is", name)
  printHelloString(greetingEng)

  var greetingFr = List("Bonjour", "Scala", "Je m'appelle", name)
  printHelloString(greetingFr)

  var greetingEsp = List("Hola", "Scala", "Mi nombre es", name)
  printHelloString(greetingEsp)

  name = name.reverse

  greetingEng = greetingEng.updated(3, name)
  printHelloString(greetingEng)

  greetingFr = greetingFr.updated(3, name)
  printHelloString(greetingFr)

  greetingEsp = greetingEsp.updated(3, name)
  printHelloString(greetingEsp)


