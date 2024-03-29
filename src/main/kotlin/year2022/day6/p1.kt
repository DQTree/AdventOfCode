package year2022.day6

import java.io.File

fun main() {

    val bufferedReader = File("src/main/kotlin/year2022/day6/input.txt").bufferedReader()
    var count = 0

    bufferedReader.useLines { lines ->
        lines.forEach { l ->
            val uniqueLine = l.toCharArray().toList()
            for(i in 0..uniqueLine.size){
                if(uniqueLine.subList(i,i+4).distinct().size == 4) { count = i+4; break }
            }
        }
    }
    println(count)
}