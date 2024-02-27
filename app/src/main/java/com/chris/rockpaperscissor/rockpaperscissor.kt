package com.chris.rockpaperscissor

fun main () {
    var computerChoice = ""
    var playerChoice = ""

    println("Rock/Paper/Scissor. Please enter your choice!")

    playerChoice = readln()

    val randomNumber = (1..3).random()

    computerChoice = if (randomNumber == 1) {
        "Rock"
    }
    else if (randomNumber == 2) {
        "Paper"
    }
    else "Scissor"

    println(computerChoice)

}