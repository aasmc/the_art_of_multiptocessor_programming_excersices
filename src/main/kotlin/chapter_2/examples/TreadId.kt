package chapter_2.examples

import kotlin.random.Random

object ThreadId {

    fun get(number: Int): Int {
        return Random.nextInt(0, number)
    }

}