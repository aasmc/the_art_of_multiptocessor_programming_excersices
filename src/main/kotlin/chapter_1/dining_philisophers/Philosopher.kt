package chapter_1.dining_philisophers


interface Philosopher : Runnable {
    fun eat()
    fun pickUpForks() : Boolean
    fun putDownForks()
    fun getResult(): String

    fun log(message: String) {
        println("$this $message")
    }

    fun think() {
        log("thinking...\n")
        waitMillis((Math.random() * 100).toInt())
    }
}

abstract class AbstractPhilosopher(
    private val id: Int,
    val left: Fork,
    val right: Fork
) : Philosopher {

    var eatCounter: Int = 0
    companion object {
        const val NUM_EATS: Int = 50
    }

    override fun run() {
        for(i in 0 until NUM_EATS) {
            eat()
            think()
        }
    }

    override fun putDownForks() {
        right.putDown()
        left.putDown()
    }

    override fun toString(): String {
        return "Philosopher-$id"
    }

    override fun getResult(): String {
        var message = "done"
        if (eatCounter == 0) {
            message = "left hungry"
        } else if (eatCounter < NUM_EATS) {
            val eatsLeft = NUM_EATS - eatCounter
            message = "$eatsLeft eats left"
        }
        return "$this $message"
    }

}























