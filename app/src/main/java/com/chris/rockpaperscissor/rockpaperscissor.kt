package com.chris.rockpaperscissor

fun main () {
    var computerChoice = ""
    var playerChoice = ""

    while (playerChoice !in listOf("rock", "paper", "scissor")) {
        print("Enter your choice (rock, paper, or scissor): ")
        playerChoice = readLine().toString().lowercase()

        if (playerChoice !in listOf("rock", "paper", "scissor")) {
            println("Invalid choice. Please enter a valid choice.")
        }
    }


    val randomNumber = (1..3).random()

    computerChoice = if (randomNumber == 1) {
        "rock"
    }
    else if (randomNumber == 2) {
        "paper"
    }
    else "scissor"

    println(computerChoice)



    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissor" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "rock" && computerChoice == "scissor" -> "Player"
        else -> {
            "Computer"
        }
    }
    if (winner == "Tie") {
        println("It's a Tie !")
    }

    else println("$winner Win !")






}