fun day02() {
    val resultA = a(parseRoundsFromInput())
    println("Result for a: $resultA")
    val resultB = b(parseRoundsFromInput())
    println("Result for b: $resultB")
}


fun parseRoundsFromInput(): List<List<String>> {
    val newLine = System.lineSeparator()
    val inputFile = getInputFile("02")

    return inputFile
        .readText()
        .trim()
        .split("$newLine")
        .map { it -> it.split(" ")}
        .toList()
}

fun a(guide: List<List<String>>): Int {
    var totalScore = 0
    for (round in guide) {
        val opponentHand = round[0]
        val myHand = round[1]
        var score = 0
        if (myHand == "X") {
            score += 1
            if (opponentHand == "A") {
                score += 3
            }
            else if (opponentHand == "B") {
                score += 0
            }
            else {
                score += 6
            }
        }
        else if (myHand == "Y") {
            score += 2
            if (opponentHand == "A") {
                score += 6
            }
            else if (opponentHand == "B") {
                score += 3
            }
            else {
                score += 0
            }
        }
        else {
            score += 3
            if (opponentHand == "A") {
                score += 0
            }
            else if (opponentHand == "B") {
                score += 6
            }
            else {
                score += 3
            }
        }
        totalScore += score
    }
    return totalScore
}

fun b(guide: List<List<String>>): Int {
    var totalScore = 0
    for (round in guide) {
        val opponentHand = round[0]
        val myHand = round[1]
        var score = 0
        if (myHand == "X") {
            score += 0
            if (opponentHand == "A") {
                score += 3
            }
            else if (opponentHand == "B") {
                score += 1
            }
            else {
                score += 2
            }
        }
        else if (myHand == "Y") {
            score += 3
            if (opponentHand == "A") {
                score += 1
            }
            else if (opponentHand == "B") {
                score += 2
            }
            else {
                score += 3
            }
        }
        else {
            score += 6
            if (opponentHand == "A") {
                score += 2
            }
            else if (opponentHand == "B") {
                score += 3
            }
            else {
                score += 1
            }
        }
        totalScore += score
    }
    return totalScore
}

