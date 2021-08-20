package chapter_1.dining_philisophers

class PhilosopherImpl(
    id: Int, left: Fork, right: Fork
) : AbstractPhilosopher(id, left, right) {

    override fun eat() {
        if (!pickUpForks()) {
            log("waiting...")
        } else {
            ++eatCounter
            log("eating with $left and $right forks (#$eatCounter)")
            waitMillis((Math.random() * 100).toInt())
            putDownForks()
        }
    }

    override fun pickUpForks() : Boolean {
        if (!left.pickUp()) {
            return false
        }
        if (!right.pickUp()) {
            return false
        }
        return true
    }

}

