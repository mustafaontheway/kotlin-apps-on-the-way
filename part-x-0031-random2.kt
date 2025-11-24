import kotlin.random.Random

fun main() {
    
	for (n in 1..5) {
        
        val ranN = Random.nextInt(0, 100)
        
        println("Random number: $ranN")
    }
 }

// no constant values! they will change 

// Random number: 41
// Random number: 61
// Random number: 40
// Random number: 24
// Random number: 76
