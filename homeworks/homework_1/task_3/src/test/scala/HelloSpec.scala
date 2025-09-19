class HelloSpec extends munit.FunSuite {
  
  test("generate greetings") {

    val expectedMessages = List(
      "Hello Scala! This is Кривоплясов Евгений",
      "Hola Scala! This is Кривоплясов Евгений",
      "Guten tag Scala! This is Кривоплясов Евгений",
      "Hello Scala! This is йинегвЕ восялповирК",
      "Hola Scala! This is йинегвЕ восялповирК",
      "Guten tag Scala! This is йинегвЕ восялповирК",
    )
    
    val messages = Hello.generateMessages
    println(messages)

    assertEquals(messages, expectedMessages)
  }
}
