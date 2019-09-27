import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread

class Delay {

}


fun main()= runBlocking{

    GlobalScope.launch {

        delay(1000)
        println("Hello")
    }

    println("World")


    doWork()


}

suspend fun doWork() {

    delay(2000)
}
