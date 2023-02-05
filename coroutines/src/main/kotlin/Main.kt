import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

suspend fun main() {

    val totalTime = measureTimeMillis {
        coroutineScope {
            repeat(200000) { index ->
                launch {
                    println("Job kotlin coroutine: $index")
                }
            }
        }
    }

    println("Finish in: " + (totalTime / 1000) + " seconds")
}