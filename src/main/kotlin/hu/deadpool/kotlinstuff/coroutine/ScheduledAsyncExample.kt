package hu.deadpool.kotlinstuff.coroutine

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.CoroutineStart
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

private inline fun scheduledAsyncAction(interval: Long, timeUnit: TimeUnit, crossinline action: () -> Unit) =
        launch(start = CoroutineStart.LAZY, context = CommonPool) {
            while (isActive) {
                action()
                delay(interval, timeUnit)
            }
        }


private fun calculation() {
    Thread.sleep(5)
}


private val interval: Long = 10
private val consoleScanner: Scanner = Scanner(System.`in`)


object PertTestScheduledAsync {

    @JvmStatic
    fun main(arg: Array<String>) {
        Thread.sleep(5000)
        ScheduledAsyncExample().start()
        consoleScanner.next()
    }

}

object PerfTestScheduledExecutor {

    @JvmStatic
    fun main(arg: Array<String>) {
        Thread.sleep(5000)
        ScheduledExecutorExample(Executors.newScheduledThreadPool(1)).start()
        consoleScanner.next()
    }

}

object PerfTestScheduledAsyncMultipleInstance {

    @JvmStatic
    fun main(arg: Array<String>) {
        Thread.sleep(5000)
        (0..1000).forEach {
            ScheduledAsyncExample().start()
        }
        consoleScanner.next()
    }

}


object PerfTestScheduledExecutorMultipleInstance {

    @JvmStatic
    fun main(arg: Array<String>) {
        Thread.sleep(5000)
        val scheduledExecutor = Executors.newScheduledThreadPool(3)
        (0..1000).forEach {
            ScheduledExecutorExample(scheduledExecutor).start()
        }
        consoleScanner.next()
    }

}

class ScheduledAsyncExample {

    private var scheduledJob: Job = scheduledAsyncAction(interval, TimeUnit.MILLISECONDS, ::calculation)

    fun start() {
        scheduledJob.start()
        println("Done")
    }

}


class ScheduledExecutorExample(private val scheduler: ScheduledExecutorService) {

    fun start() {
        scheduler.scheduleAtFixedRate(::calculation, 0, interval, TimeUnit.MILLISECONDS)
        println("Reading data from https started")
    }

}