package chapter_1.dining_philisophers

const val THINK_TIME_MILLIS = 5;
const val EAT_TIME_MILLIS = 5;

interface Philosopher : Runnable {
    fun eat()
    fun pickUpForks()
    fun putDownForks()
    fun getResult(): String

    fun log(message: String) {
        println("$this $message")
    }

    fun think() {
        log("thinking...\n")
        waitMillis(THINK_TIME_MILLIS)
    }
}

abstract class AbstractPhilosopher(
    private val id: Int,
    val left: Fork,
    val right: Fork
) : Philosopher {

    var eatCounter: Int = 0
    companion object {
        const val NUM_EATS: Int = 10_000
    }

}