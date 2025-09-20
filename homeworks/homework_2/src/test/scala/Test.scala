import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        "test_sumOfDivBy3Or5" - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(1, 5) == 3 + 5)
            assert(Exercises.sumOfDivBy3Or5(1, 6) == 3 + 5 + 6)
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 3 + 5 + 6 + 9 + 10)
            assert(Exercises.sumOfDivBy3Or5(-5, 5) == -3 + 0 + 3 + 5)
        }

        "test_primeFactor" - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(1) == Seq.empty)
            assert(Exercises.primeFactor(2) == Seq(2))
            assert(Exercises.primeFactor(13) == Seq(13))
            assert(Exercises.primeFactor(36) == Seq(2, 3))
            assert(Exercises.primeFactor(-5) == Seq.empty)
        }

        "test_vectos" - {
            val v1 = Exercises.Vector2D(1, 0)
            val v2 = Exercises.Vector2D(0, 1)
            val v3 = Exercises.Vector2D(1, 1)
            val v4 = Exercises.Vector2D(2, 2)

            "sumScal" - {
                assert(Exercises.sumScalars(v1, v2, v3, v4) == 0 + 4)
                assert(Exercises.sumScalars(v1, v1, v2, v2) == 1 + 1)
            }

            "sumCos" - {
                assert(Exercises.sumCosines(v1, v1, v2, v2) == 1 + 1)
                assert(Exercises.sumCosines(v1, v2, v3, v4).round == 0)
            }
        }

        "test_sortByHeavyweight" - {
            assert(Exercises.sortByHeavyweight(Exercises.balls) ==
              Seq("Tin", "Platinum", "Aluminum", "Sodium", "Nickel", "Titanium", "Lead", "Zirconium", "Chrome",
                  "Iron", "Silver", "Uranium", "Lithium", "Gold", "Tungsten", "Copper", "Cesium", "Calcium", "Cobalt",
                  "Potassium", "Plutonium", "Magnesium", "Graphite"))
        }
            assert(Exercises.sortByHeavyweight(Map.empty) == Seq.empty)
        }
    }
}
