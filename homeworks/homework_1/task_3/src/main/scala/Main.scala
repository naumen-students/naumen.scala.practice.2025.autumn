object Main extends App{
  private val a = "Hello Scala! This is Maksim Zaitsev"
  println(a)

  private val separator = " This is "
  private val newHello = List("Hola", "Guten Tag")

  private def reverseStr(str: String, sep: String): String = {
    val parts = str.split(sep)
    parts(0) + sep + parts.last.reverse
  }

  newHello.foreach { x =>
    val newString = a.replace("Hello", x)
    println(newString)
    val newStringReverse = reverseStr(newString, separator)
    println(newStringReverse)
  }
}
