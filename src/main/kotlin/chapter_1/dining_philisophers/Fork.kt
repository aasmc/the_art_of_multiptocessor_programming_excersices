package chapter_1.dining_philisophers

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

class Fork(private val id: Int) {
    private val lock: Lock = ReentrantLock()

    fun pickUp(): Boolean {
        lock.lock()
        return true
    }

    fun putDown() {
        lock.unlock()
    }

    override fun toString(): String {
        return "Fork: $id"
    }
}