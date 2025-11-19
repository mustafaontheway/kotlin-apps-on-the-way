fun main() {
    
	val nums = arrayListOf(3, 12, 32, 45, 67, -100, 145, -67)
    
    val numsPlusTen = nums.map {n -> n + 10}
    
    for (num in numsPlusTen) {
        
        println("Num plus 10: $num")
    }
  
}

// Num plus 10: 13
// Num plus 10: 22
// Num plus 10: 42
// Num plus 10: 55
// Num plus 10: 77
// Num plus 10: -90
// Num plus 10: 155
// Num plus 10: -57
