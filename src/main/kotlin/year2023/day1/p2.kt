package year2023.day1

import java.io.File

val numbersStringToInt: HashMap<String, Int> = hashMapOf(
    "zero" to 0,
    "one" to 1,
    "two" to 2,
    "three" to 3,
    "four" to 4,
    "five" to 5,
    "six" to 6,
    "seven" to 7,
    "eight" to 8,
    "nine" to 9
)

fun trebuchet2(path: String): Int{
    val file = File(path)
    var sum = 0
    var currentIndex = 0
    val numericValues = mutableListOf<Int>()
    var foundMatch = false
    file.forEachLine {
        while (currentIndex < it.length) {
            if(it[currentIndex].isDigit() && numbersToInt.containsKey(it[currentIndex])) {
                numericValues.add(numbersToInt[it[currentIndex]]!!)
                currentIndex++
            }else {
                for (entry in numbersStringToInt) {
                    if (it.startsWith(entry.key, currentIndex)) {
                        numericValues.add(entry.value)
                        currentIndex += entry.key.length-1
                        foundMatch = true
                        break
                    }
                }
                if (!foundMatch) {
                    currentIndex++
                }
            }
            foundMatch = false
        }
        sum += numericValues.first()*10 + numericValues.last()
        currentIndex = 0
        numericValues.clear()
    }
    return sum
}

fun main(){
    println(trebuchet2("src/main/kotlin/year2023/day1/input.txt"))
}