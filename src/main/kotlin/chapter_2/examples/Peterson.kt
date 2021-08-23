package chapter_2.examples

class Peterson : Lock {
    private val flag: BooleanArray = booleanArrayOf(false, false)
    private var victim: Int = 0

    override fun lock() {
        val i: Int = 0 // here we get the id of the current thread, ex Thread.getId(), if we had the method
        val j = 1 - i
        flag[i] = true
        victim = i
        while (flag[j] && victim == i) {
        } // wait
    }

    override fun unlock() {
        val i: Int = 0 // here we get the id of the current thread, ex Thread.getId(), if we had the method
        flag[i] = false
    }
}