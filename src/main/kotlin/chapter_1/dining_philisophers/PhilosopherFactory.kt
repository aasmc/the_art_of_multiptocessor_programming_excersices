package chapter_1.dining_philisophers

class PhilosopherFactory {
    companion object {
        fun createPhilosophers(num: Int): Array<Philosopher> {
            val forks = Array(num) { i -> Fork(i + 1) }
            return Array(num) { idx ->
                val right = (idx + 1) % forks.size
                // make sure no circular deadlock ever happens
                // All Philosophers reach for their left fork first,
                // except one who first reaches for his right fork.
                if (idx == num - 1) {
                    // The last philosopher picks up the right fork first
                    PhilosopherImpl(idx + 1, forks[right], forks[idx])
                } else {
                    PhilosopherImpl(idx + 1, forks[idx], forks[right])
                }
            }
        }
    }
}