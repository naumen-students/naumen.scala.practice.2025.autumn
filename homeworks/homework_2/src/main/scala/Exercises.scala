/*ЗАДАНИЕ IV*/
/*Дано: коллекция металлических шариков balls, где каждый элемент представлен в виде (Name: String -> (radius: Int, density: Double).
Здесь radius - радиус шарика [см], а density - плотность материала [г / (см^3)], из которого он изготовлен (например,
для серебра в коллекции представлен шарик "Silver" радиуса 4 см и плотности 4.505 г / (см^3) )
Необходимо реализовать функцию sortByHeavyweight, которая принимает коллекцию такого формата и возвращает список названий материалов шариков,
упорядоченный в зависимости от массы шариков (первый элемент списка соответствует наиболее "лёгкому" шарику, последний - наиболее "тяжёлому").
В качестве значения числа "Пи" можно использовать java.lang.Math.PI
*/
/*Реализовать юнит-тесты в src/test/scala для данной функции.*/
val balls: Map[String, (Int, Double)] =
    Map(
        "Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874),
        "Gold" ->     (2,   19.32),  "Potassium" -> (14,  0.862), "Calcium" ->   (8,   1.55),  "Cobalt" ->    (4,   8.90),
        "Lithium" ->  (12,  0.534),  "Magnesium" -> (10,  1.738), "Copper" ->    (3,   8.96),  "Sodium" ->    (5,   0.971),
        "Nickel" ->   (2,   8.91),   "Tin" ->       (1,   7.29),  "Platinum" ->  (1,   21.45), "Plutonium" -> (3,   19.25),
        "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Silver" ->    (4,   4.505), "Uranium" ->   (2,   19.04),
        "Chrome" ->   (3,   7.18),   "Cesium" ->    (7,   1.873), "Zirconium" -> (3,   6.45)
    )

def sortByHeavyweight(ballsArray: Map[String, (Int, Double)] = balls): Seq[String] = {
    val mass = ballsArray.map {
        case (name, (radius, density)) =>
            (name, calculateMassBalls(radius, density))
    }
    mass.toSeq.sortBy(_._2).map(_._1)
}


def calculateMassBalls(radius: Int, density: Double): Double = {
    density * (4.0 / 3.0) * java.lang.Math.PI * math.pow(radius, 3)
}

}