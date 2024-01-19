package eu.tutorials.rockpaperscissors

fun main() {
    var computerChoice = ""
    var playerChoice = ""
    print("Rock, Paper or Scissors? Enter your choice: ")
    playerChoice = readln()
    while(playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissors" && playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors" && playerChoice != "ROCK" && playerChoice != "PAPER" && playerChoice != "SCISSORS")
    {
        print("Enter valid choice: ")
        playerChoice = readln()
    }
    playerChoice = playerChoice.lowercase()

    val randomNumber = (1..3).random()

    /*if(randomNumber == 1)
        computerChoice = "Rock"
    else if(randomNumber == 2)
        computerChoice = "Paper"
    else if(randomNumber == 3)
        computerChoice = "Scissors"*/

    when(randomNumber){
        1-> {
            computerChoice = "Rock"
        }
        2-> {
            computerChoice = "Paper"
        }
        3-> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    val winner = when{
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie")
        println("It's a tie")
    else
        println("$winner won!")
}