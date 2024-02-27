https://tutorials.eu/exploring-basic-kotlin-syntax-and-structure-day-2-android-14-masterclass/

Using while loop to check input with list of string :

while (playerChoice !in listOf("rock", "paper", "scissors")) {
print("Enter your choice (rock, paper, or scissors): ")
playerChoice = readLine()?.toLowerCase()

        if (playerChoice !in listOf("rock", "paper", "scissors")) {
            println("Invalid choice. Please enter a valid choice.")
        }
    }