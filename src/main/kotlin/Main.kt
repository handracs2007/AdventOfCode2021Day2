import java.io.File

fun solvePart1(commands: List<String>) {
    var horz = 0
    var depths = 0

    for (command in commands) {
        val (dir, steps) = command.split(" ")

        when(dir) {
            "forward" -> horz += steps.toInt()
            "down" -> depths += steps.toInt()
            "up" -> depths -= steps.toInt()
        }
    }

    println("PART 1 ANSWER")
    println(horz * depths)
}

fun solvePart2(commands: List<String>) {
    var horz = 0
    var depths = 0
    var aim = 0

    for (command in commands) {
        val (dir, steps) = command.split(" ")

        when(dir) {
            "forward" -> {
                horz += steps.toInt()
                depths += aim * steps.toInt()
            }
            "down" -> aim += steps.toInt()
            "up" -> aim -= steps.toInt()
        }
    }

    println("PART 2 ANSWER")
    println(horz * depths)
}

fun main() {
    val commands = File("input.txt").readLines()

    solvePart1(commands)
    solvePart2(commands)
}