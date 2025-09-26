import utest._

object Test extends TestSuite {

  val tests = Tests{
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }
    
    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
      assert(Exercises.sumOfDivBy3Or5(100, 1) == 0)
      assert(Exercises.sumOfDivBy3Or5(1, 1) == 0)
      assert(Exercises.sumOfDivBy3Or5(3, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(-5, 3) == -5)
    }

    'test_primeFactor - {
      assert(Exercises.primeFactor(5) == Seq(5))
      assert(Exercises.primeFactor(15) == Seq(3, 5))
      assert(Exercises.primeFactor(1) == Seq())
      assert(Exercises.primeFactor(727) == Seq(727))
      assert(Exercises.primeFactor(720) == Seq(2, 3, 5))
    }

    'test_sumScalars - {
      assert(Exercises.sumScalars(Exercises.Vector2D(0, 0), Exercises.Vector2D(0, 0), Exercises.Vector2D(0, 0), Exercises.Vector2D(0, 0)) == 0)
      assert(Exercises.sumScalars(Exercises.Vector2D(0, 1), Exercises.Vector2D(-2, 0), Exercises.Vector2D(0, 3), Exercises.Vector2D(-4, 0)) == 0)
      assert(Exercises.sumScalars(Exercises.Vector2D(1, 1), Exercises.Vector2D(2, 2), Exercises.Vector2D(0, 0), Exercises.Vector2D(0, 0)) == 4)
      assert(Exercises.sumScalars(Exercises.Vector2D(0, 0), Exercises.Vector2D(0, 0), Exercises.Vector2D(3, 3), Exercises.Vector2D(4, 4)) == 24)
      assert(Exercises.sumScalars(Exercises.Vector2D(2, 10), Exercises.Vector2D(2, 10), Exercises.Vector2D(1, 3), Exercises.Vector2D(1, 3)) == 114)
      assert(Exercises.sumScalars(Exercises.Vector2D(-5, 10), Exercises.Vector2D(1, 0.5), Exercises.Vector2D(12, 6), Exercises.Vector2D(1, 2)) == 24)
    }

    'test_sumCosines - {
    def approx(a: Double, b: Double, epsilon: Double = 1e-9): Boolean = 
    math.abs(a - b) < epsilon
      assert(approx(Exercises.sumCosines(Exercises.Vector2D(5, 5), Exercises.Vector2D(5, 5), Exercises.Vector2D(5, 5), Exercises.Vector2D(5, 5)), 2))
      assert(approx(Exercises.sumCosines(Exercises.Vector2D(0, 1), Exercises.Vector2D(0, 2), Exercises.Vector2D(3, 4), Exercises.Vector2D(12, 16)), 2))
      assert(approx(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(0, 1), Exercises.Vector2D(10, 0), Exercises.Vector2D(10, 0)), 1))
      assert(approx(Exercises.sumCosines(Exercises.Vector2D(1, 2), Exercises.Vector2D(1, 0), Exercises.Vector2D(-2, 4), Exercises.Vector2D(-10, 0)), 0.894427190999916))
    }
    'test_sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(Map()) == Seq())
      assert(Exercises.sortByHeavyweight(Map("ball1" -> (1, 1.0))) == Seq("ball1"))
      val testBalls1 = Map(
        "small_light" -> (1, 1.0),
        "medium_medium" -> (2, 2.0),
        "large_heavy" -> (3, 3.0)
      )
      assert(Exercises.sortByHeavyweight(testBalls1) == Seq("small_light", "medium_medium", "large_heavy"))
      
      val testBalls2 = Map(
        "low_density" -> (2, 1.0),
        "high_density" -> (2, 3.0)
      )
      assert(Exercises.sortByHeavyweight(testBalls2) == Seq("low_density", "high_density"))
      
      val testBalls3 = Map(
        "small" -> (1, 2.0),
        "large" -> (3, 2.0)
      )
      assert(Exercises.sortByHeavyweight(testBalls3) == Seq("small", "large"))
      
      val testBalls4 = Map(
        "heavy" -> (3, 3.0),
        "light" -> (1, 1.0)
      )
      assert(Exercises.sortByHeavyweight(testBalls4) == Seq("light", "heavy"))
    }
  }
}
