package chapter_2.examples

class Filter(val n: Int) : Lock {

    private val level: IntArray = IntArray(n) { 0 }
    private val victim: IntArray = IntArray(n)

    override fun lock() {
        val me: Int = ThreadId.get(n)
        for (i in 1 until n) {
            level[me] = i
            victim[i] = me
            // spin while conflicts exist
            for (k in 0 until n) {
                while (k != me && level[k] >= i && victim[i] == me) {
                    //spin wait
                }
            }
        }
    }

    override fun unlock() {
        val me = ThreadId.get(n);
        level[me] = 0
    }
}
