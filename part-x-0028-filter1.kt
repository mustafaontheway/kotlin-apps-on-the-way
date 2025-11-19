fun main() {
    
	val nums = arrayListOf(3, 12, 32, 45, 67, -100, 145, -67)
    
    val oddNums = nums.filter {n -> n % 2 != 0}
    
    for (num in oddNums) {
        
        println("Odd number: $num")
    }
  
}

// Odd number: 3
// Odd number: 45
// Odd number: 67
// Odd number: 145
// Odd number: -67
