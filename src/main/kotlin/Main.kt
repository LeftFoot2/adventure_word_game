//Needed a random number for to choose the monster

import kotlin.random.Random

val playerCharacter = AttributesOfCharacter()

// Increases the players' strength.
var level = 1

// Not yet implemented.
var playerDamage = 0
var playerWeapon = ""


// Class used to set the weapons, damage, starting health, and starting coin of player.
class AttributesOfCharacter{
    // Weapon function that sets the name of the weapon based on the level of the player.
    /*NOTE: Later the shop will sell the weapons, but for now this will have to do.*/
    fun weapon(classChoice: String, level: Int): String {

        var weaponName = ""

        if (classChoice.lowercase() == "warrior"){

            when(level){
                1 -> {weaponName = "Short Sword"
                    return(weaponName)
                }
                2 ->{weaponName = "Longsword"
                    return(weaponName)
                }
                3 ->{weaponName = "Broadsword"
                    return(weaponName)
                }
            }



        }
        // Archer and Mage are not yet set up.
        else if (classChoice.lowercase() == "archer") {

        }
        else if (classChoice.lowercase() == "mage") {

        }
        return("Error")
    }

    // Sets the damage of the weapon.
    // Again based on level, so it corresponds to the weapon name
    // but is not the final product.
    fun damage(classChoice: String, level: Int): Int{

        var weaponDamage = 0

        if (classChoice.lowercase() == "warrior"){
            when(level) {
                1 -> {
                    weaponDamage = 3
                    return (weaponDamage)
                }

                2 -> {
                    weaponDamage = 6
                    return (weaponDamage)
                }

                3 -> {
                    weaponDamage = 12
                    return (weaponDamage)
                }
            }
        }
        // Archer and Mage are not yet set up.
        else if (classChoice.lowercase() == "archer") {

        }
        else if (classChoice.lowercase() == "mage") {

        }
        return(0)

    }
    // It's not much of a game yet because the player can not get hurt.
    fun health(classChoice: String){

        if (classChoice.lowercase() == "warrior"){

        }
        else if (classChoice.lowercase() == "archer") {

        }
        else if (classChoice.lowercase() == "mage") {

        }

    }
    // Coin has not yet been implemented.
    fun coin(classChoice: String){

        if (classChoice.lowercase() == "warrior"){

        }
        else if (classChoice.lowercase() == "archer") {

        }
        else if (classChoice.lowercase() == "mage") {

        }

    }



}

// Gets the name of the player. Called in main function.
fun name(): String{
    print("Adventurer! What is your name? ")
    val name = readLine()!!

    return(name)
}

// Gets the class of player. Called in main function.
fun classChoice(name: String): String {
    var classChoice = ""

    val classList = listOf("warrior", "mage", "archer")

    // Makes sure that the player chooses a class.
    while(classChoice.lowercase() !in classList) {
        // Right now warrior is the only one that can do damage.
        print("$name what class would you like to be? Please type: warrior, mage, or archer /*Note to player: Only warrior has anything implemented yet.*/")
        classChoice = readLine()!!
        if (classChoice.lowercase() == "warrior") {
            return (classChoice)
        } else if (classChoice.lowercase() == "archer") {
            return (classChoice)
        } else if (classChoice.lowercase() == "mage") {
            return (classChoice)
        } else println("You must choose one of the three classes.")
    }
    return (classChoice)
}


/*Right now all the shop does is increase the level of the player*/
fun shop(name: String, classChoice: String){
    // Since the weapons are based on levels and we only have up to three weapons
    // it can not go passed level 3.
    if(level != 3) {
        level += 1
    }
    questShop(name, classChoice)
}

// Determines what monster you will fight.
fun quest(name: String, classChoice: String){

    val randMonster = (0..25).random()
    var monsterName = ""
    var monsterHealth = 0
    var monsterDamage = 0
    /*NOTE: Although coins are not implemented I would like the corresponding case
    * number to be the number of coins you get if you win.*/
    when(randMonster){
        1 -> {monsterName = "Goblin"
            monsterHealth = 5
            monsterDamage = 2}
        2 ->{monsterName = "Imp"
            monsterHealth = 6
            monsterDamage = 3}
        3 ->{monsterName = "Harpy"
            monsterHealth = 7
            monsterDamage = 4}
        4 ->{monsterName = "Mummy"
            monsterHealth = 8
            monsterDamage = 5}
        5 ->{monsterName = "Orc"
            monsterHealth = 9
            monsterDamage = 6}
        6 ->{monsterName = "Ogre"
            monsterHealth = 10
            monsterDamage = 7}
        7 ->{monsterName = "Dark Phoenix"
            monsterHealth = 11
            monsterDamage = 8}
        8 ->{monsterName = "Dark Unicorn"
            monsterHealth = 12
            monsterDamage = 9}
        9 ->{monsterName = "Troll"
            monsterHealth = 13
            monsterDamage = 10}
        10 ->{monsterName = "Vampire"
            monsterHealth = 14
            monsterDamage = 11}
        11 ->{monsterName = "Werewolf"
            monsterHealth = 15
            monsterDamage = 12}
        12 ->{monsterName = "Witch"
            monsterHealth = 16
            monsterDamage = 13}
        13 ->{monsterName = "Zombie"
            monsterHealth = 17
            monsterDamage = 14}
        14 ->{monsterName = "Yeti"
            monsterHealth = 18
            monsterDamage = 15}
        15 ->{monsterName = "Golem"
            monsterHealth = 19
            monsterDamage = 16}
        16 ->{monsterName = "Ghost"
            monsterHealth = 20
            monsterDamage = 17}
        17 ->{monsterName = "Ghoul"
            monsterHealth = 21
            monsterDamage = 18}
        18 ->{monsterName = "Giant"
            monsterHealth = 22
            monsterDamage = 19}
        19 ->{monsterName = "Dark Gnome"
            monsterHealth = 23
            monsterDamage = 20}
        20 ->{monsterName = "Dark Elf"
            monsterHealth = 24
            monsterDamage = 21}
        21 ->{monsterName = "Dark Angel"
            monsterHealth = 25
            monsterDamage = 22}
        22 ->{monsterName = "Banshee"
            monsterHealth = 26
            monsterDamage = 23}
        23 ->{monsterName = "Behemoth"
            monsterHealth = 27
            monsterDamage = 24}
        24 ->{monsterName = "Cyclops"
            monsterHealth = 28
            monsterDamage = 25}
        25 ->{monsterName = "Starfire"
            monsterHealth = 29
            monsterDamage = 26}
        else -> {
            // This should never happen.
            println("Something went very wrong.")
        }

    }

    println(monsterName)
    println("The monsters health is $monsterHealth")
    println("The monsters damage is $monsterDamage")


    // Do you think you can beat the monster?
    print("Battle (b), Run (r): ")
    var battleRun = readLine()

    // If you choose to fight you go to the battle function.
    if(battleRun == "b") {
        println()
        battle(name, monsterName, monsterHealth, monsterDamage, classChoice)
    }
    else if(battleRun == "r"){
        //If you run you go back to choose a quest or the shop.
        println("You ran away.")
        println()
        questShop(name, classChoice)
    }

}

fun battle(name: String, monsterName: String, monsterHealth: Int, monsterDamage: Int, classChoice: String){

    var monsterNewHealth = monsterHealth


    while(monsterNewHealth > 0) {
        // Attack you do the amount of damage you can do.
        println("Attack (a)")
        // If you realized you bit off more than you could chew.
        println("Run (r)")
        print("What do you do: ")
        var battleChoice = readLine()

        if(battleChoice == "a"){

            // We are getting damage numbers from the AttributesOfCharacter class.
            monsterNewHealth -= playerCharacter.damage(classChoice, level)
            println()
            println("$name attacks with his ${playerCharacter.weapon(classChoice, level)}, and does, ${playerCharacter.damage(classChoice, level)} damage.")
            println("The $monsterName is now $monsterNewHealth")
            println()

        }
        else if(battleChoice == "r"){
            println()
            questShop(name, classChoice)
        }
        // Beating Starfire is the win condition.
        if(monsterName == "Starfire" && monsterNewHealth <= 0) {
            println("Congratulations!!! You have defeated the dragon Starfire and saved the kingdom.")
            println("You're a hero and are remembered for the rest of your days!")
        }
        // You beat the monster, so you go back to home base.
        // NOTE: When coin is implemented you will be given coin.
        else if(monsterNewHealth <= 0){
            println("You defeated the $monsterName")
            println()
            questShop(name, classChoice)
        }


    }



}

// This is the main crossroad of the program. Do you go on a quest or shopping for better gear.
fun questShop(name: String, classChoice: String){

    // NOTE: Player health and coin should be displayed here.
    print("Would you like to go to the shop or go questing? (type: s or q) ")
    var intoChoice = readLine()
    if (intoChoice == "s"){
        shop(name, classChoice)
    }
    else if (intoChoice == "q"){
        quest(name, classChoice)
    }
}

// This is the introduction to the story.
fun story(name: String, classChoice: String){//, playerCharacter: AttributesOfCharacter){

    //This is simply to make the code look better.
    fun continueFun(){
        print("press enter to continue...")
        readLine()
        println()
    }

    println()
    println("Welcome $name to the adventure of a lifetime!")
    println("Your goal in this adventure you will be to find and")
    println("defeat the great dragon Starfire!")
    continueFun()
    println("On this quest you will be able to do two things:")
    println("Quest for the dragon or shop at the store.")
    println("When you quest you will have a small chance of running into")
    continueFun()
    println("the dragon and will run into monsters otherwise.")
    println("You can get gold from those monsters and spend it at the")
    println("shop to improve your character.")
    continueFun()
    println("You will type 's' for shop and 'q' to go questing.")
    println("Welcome to your new life. Enjoy!")
    continueFun()

    questShop(name, classChoice)


}

fun main() {
    // We have to have the name and class choice for the whole game
    // so we get them at the beginning with the main function.
    val name = name()
    val classChoice = classChoice(name)

    story(name, classChoice)
}


