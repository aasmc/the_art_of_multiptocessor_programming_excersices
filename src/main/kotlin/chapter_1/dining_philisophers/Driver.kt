package chapter_1.dining_philisophers

fun main() {
    println("Enter the number of philosophers: ")
    val num = readLine()?.toInt() ?: 5
    val philosophers = PhilosopherFactory.createPhilosophers(num)
    val threads = arrayOfNulls<Thread>(philosophers.size)
    for (i in threads.indices) {
        val t = Thread(philosophers[i])
        t.start()
        threads[i] = t
    }

    awaitTermination(threads)

    for (p in philosophers) {
        println(p.getResult())
    }
}