package chapter_1.dining_philisophers

import java.lang.RuntimeException
import java.util.concurrent.TimeUnit

fun joinThreads(threads: Array<Thread>) {
    try {
        for (t in threads) {
            t.join()
        }
    } catch (e: InterruptedException) {
        throw RuntimeException(e)
    }
}

fun stopWatchSec(start: Long) : Double {
    return (System.currentTimeMillis() - start) / 1000.0
}

fun waitSeconds(seconds: Int) {
    TimeUnit.SECONDS.sleep(seconds.toLong())
}

fun waitMillis(millis: Int) {
    TimeUnit.MILLISECONDS.sleep(millis.toLong())
}

fun awaitTermination(threads: Array<Thread?>) {
    for(t in threads) {
        t?.join()
    }
}