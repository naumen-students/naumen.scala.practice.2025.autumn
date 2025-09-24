object Test extends App {
  testDivBy3Or7()
  testSumOfDivBy3Or5()
  testPrimeFactor()
  testVectorOperations()
  testSortByHeavyweight()
  println("Все тесты пройдены! ✅")

  def testDivBy3Or7(): Unit = {
    import Exercises._
    assert(divBy3Or7(1, 3) == Seq(3), "test_divBy3Or7 failed")
    assert(divBy3Or7(5, 9) == Seq(6, 7, 9), "test_divBy3Or7 failed")
    println("✓ test_divBy3Or7")
  }

  def testSumOfDivBy3Or5(): Unit = {
    import Exercises._
    assert(sumOfDivBy3Or5(1, 10) == 33, "test_sumOfDivBy3Or5 failed")
    assert(sumOfDivBy3Or5(1, 3) == 3, "test_sumOfDivBy3Or5 failed")
    println("✓ test_sumOfDivBy3Or5")
  }

  def testPrimeFactor(): Unit = {
    import Exercises._
    assert(primeFactor(80) == Seq(2, 5), "test_primeFactor failed")
    assert(primeFactor(98) == Seq(2, 7), "test_primeFactor failed")
    println("✓ test_primeFactor")
  }

  def testVectorOperations(): Unit = {
    import Exercises._
    val vec1 = Vector2D(3, 4)
    val vec2 = Vector2D(1, 1)
    assert(math.abs(sumScalars(vec1, vec2, vec1, vec2) - 14.0) < 0.0001, "test_vectorOperations failed")
    println("✓ test_vectorOperations")
  }

  def testSortByHeavyweight(): Unit = {
    import Exercises._
    val testBalls = Map("A" -> (1, 1.0), "B" -> (1, 2.0))
    assert(sortByHeavyweight(testBalls) == Seq("A", "B"), "test_sortByHeavyweight failed")
    println("✓ test_sortByHeavyweight")
  }
}
