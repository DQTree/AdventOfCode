package year2023.day1

import java.io.File

val numbersToInt: Map<Char, Int> = mapOf(
    '0' to 0,
    '1' to 1,
    '2' to 2,
    '3' to 3,
    '4' to 4,
    '5' to 5,
    '6' to 6,
    '7' to 7,
    '8' to 8,
    '9' to 9
)

fun trebuchet(path: String): Int{
    val file = File(path)
    var sum = 0
    var resultingFilter: String
    file.forEachLine {
        resultingFilter = it.filter { it.isDigit() }
        val first = numbersToInt[resultingFilter.first()]!!
        val last = numbersToInt[resultingFilter.last()]!!
        sum += first*10 + if(resultingFilter.length==1){ first }else{ last }
    }
    return sum
}

fun main(){
    println(trebuchet("src/main/kotlin/year2023/day1/input.txt"))
}