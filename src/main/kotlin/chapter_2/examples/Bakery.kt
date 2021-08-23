package chapter_2.examples

class Bakery(private val n: Int) : Lock {
    private val flag: BooleanArray = BooleanArray(n) { false }
    private val label: IntArray = IntArray(n) { 0 }

    override fun lock() {
        val i: Int = ThreadId.get(n)
        flag[i] = true
        label[i] = label.maxOf { it } + 1
        for (k in 0 until n) {
            // wait until determine that no thread with a raised flag has a
            // lexicographically smaller label/ID pair
            while (flag[k] && (label[k] < label[i] || (label[k] == label[i] && k < i))) {
            }
        }
    }

    override fun unlock() {
        flag[ThreadId.get(n)] = false
    }
}