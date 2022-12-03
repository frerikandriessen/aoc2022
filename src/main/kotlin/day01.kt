fun day01() {
    val resultA = a(parseElvesFromInput())
    println("Result for a: $resultA")
    val resultB = b(parseElvesFromInput())
    println("Result for b: $resultB")
}


fun parseElvesFromInput(): List<Int> {
    val newLine = System.lineSeparator()
    val inputFile = getInputFile("01")

    return inputFile
        .readText()
        .trim()
        .split("$newLine$newLine")
        .map { it -> it
            .split("$newLine")
            .map { it.toInt()}
            .sum() }
        .toList()
}

fun a(elves: List<Int>): Int {
    return elves.max()
}

fun b(elves: List<Int>): Int {
    return elves
        .sortedDescending()
        .take(3)
        .sum()
}

