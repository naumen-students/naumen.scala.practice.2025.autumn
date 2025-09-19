object Main {
  def main(args: Array[String]): Unit = {
    val engGreet = "Hello"
    val spaGreet = "Hola"
    val gerGreet = "Guten tag"
    val name = "Sergey Gusev"

    greetings(engGreet, name)
    greetings(spaGreet, name)
    greetings(gerGreet, name)
    greetings(engGreet, name.reverse)
    greetings(spaGreet, name.reverse)
    greetings(gerGreet, name.reverse)
  }

  private def greetings(greet: String, name: String): Unit = {
    println(s"$greet Scala! This is $name")
  }
}

