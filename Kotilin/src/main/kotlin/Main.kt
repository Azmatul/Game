import java.util.Scanner

fun game(Choice: Int){
    val array = arrayOf("Rock", "Paper", "Scissors")
    var com = (Math.random()*array.size).toInt()
    println("You: ${array[Choice]}")
    println("Computer: ${array[com]}")

    if((Choice == 0 && com == 1)||(Choice == 1 && com == 2)||(Choice == 2 && com == 0))
        println("You lost the game.")
    else if((Choice == 0 && com == 2)||(Choice == 1 && com == 0) || (Choice == 2 && com == 1))
        println("Congratulation!! You won the game")
    else
        println("game is tie. Try again")
}

fun main(args: Array<String>){
    val Reader = Scanner(System.`in`)
    var loop: Int = 1
    again@while(loop>0){
        println("Enter option 1. Rock   2. Paper    3. Scissors")
        var choice = Reader.nextInt()
        if(choice>3 || choice<1) {
            println("Invalid Input!! Try agian")
            continue@again
        }
            game(choice-1)

        println("Enter 1 to try again or 0 to exits")
        loop = Reader.nextInt()
    }
}