fun day01() {
    val day = "01"

    fun parseElvesFromInput() =
        getInputFile(day)
            .readText()
            .trim()
            .split("\n\n")
            .map { it.lines().sumOf { it.toInt() } }

    fun a(elves: List<Int>): Int {
        return elves.max()
    }

    fun b(elves: List<Int>): Int {
        return elves
            .sortedDescending()
            .take(3)
            .sum()
    }

    val resultA = a(parseElvesFromInput())
    println("Result for a: $resultA")
    val resultB = b(parseElvesFromInput())
    println("Result for b: $resultB")
}
