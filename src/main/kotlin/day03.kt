fun day03() {
    val alphabetSet = CharRange('A', 'z').toSet()
    val charMap = mutableMapOf<Char, Int>()
    var charValue = 1
    for (chr in 'a'..'z') {
        charMap[chr] = charValue
        charValue++
    }
    for (chr in 'A'..'Z') {
        charMap[chr] = charValue
        charValue++
    }

    fun findCommonChar(strings: List<String>): Char {
        return strings.fold(alphabetSet) {commonChars, string -> commonChars.intersect(string.toSet())}.first()
    }


    fun a(rucksacks: List<String>): Int {
        return rucksacks
            .map { findCommonChar(it.chunked(it.length / 2)) }
            .sumOf { charMap[it] ?: 0 }
    }

    fun b(rucksacks: List<String>): Int {
        return rucksacks
            .chunked(3)
            .map { findCommonChar(it) }
            .sumOf {charMap[it] ?: 0}
    }

    val resultA = a(parseRucksacksFromInput())
    println("Result for a: $resultA")
    val resultB = b(parseRucksacksFromInput())
    println("Result for b: $resultB")
}


fun parseRucksacksFromInput(): List<String> {
    val inputFile = getInputFile("03")

    return inputFile
        .readText()
        .trim()
        .split("\n")
        .toList()
}



