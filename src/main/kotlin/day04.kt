fun day04() {
    fun rangeToSet(range: String): Set<Int> {
        val start = range.split("-")[0].toInt()
        val end = range.split("-")[1].toInt()
        return IntRange(start, end).toSet()
    }
    fun a(assignments: List<String>): Int {
        return assignments
            .map { it.split(",").map {rangeToSet(it)} }
            .filter {it[0].containsAll(it[1]) or it[1].containsAll(it[0])}
            .count()
    }

    fun b(assignments: List<String>): Int {
        return assignments
            .map { it.split(",").map {rangeToSet(it)} }
            .filter {it[0].intersect(it[1]).isNotEmpty()}
            .count()
    }

    val resultA = a(parseAssignmentsFromInput())
    println("Result for a: $resultA")
    val resultB = b(parseAssignmentsFromInput())
    println("Result for b: $resultB")
}


fun parseAssignmentsFromInput(): List<String> {
    val inputFile = getInputFile("04")

    return inputFile
        .readText()
        .trim()
        .split("\n")
        .toList()
}



