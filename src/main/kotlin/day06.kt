
fun day06() {
    val day = "06"

    fun parseInput() = getInputFile(day).readText()

    fun findWindowWithUniqueCharacters(input: String, windowSize: Int): Int {
        for ((index, window) in input.windowed(windowSize).withIndex()) {
            if (window.toSet().size == windowSize) {
                return index + windowSize
            }
        }
        return -1
    }


    fun a(input: String): Int {
        return findWindowWithUniqueCharacters(input, 4)
    }

    fun b(input: String): Int {
        return findWindowWithUniqueCharacters(input, 14)
    }

    val resultA = a(parseInput())
    println("Result for a: $resultA")
    val resultB = b(parseInput())
    println("Result for b: $resultB")
}






