fun main() {
 
    val numbers = mutableSetOf(20, 42, -11, 24, 37, 37, 96, 21, 100, 100)
    
	numbers.remove(37)
    
    for ((i, n) in numbers.withIndex()) {
        
        println("Number${i + 1}: $n")
    }
   
}

// Number1: 20
// Number2: 42
// Number3: -11
// Number4: 24
// Number5: 96
// Number6: 21
// Number7: 100
