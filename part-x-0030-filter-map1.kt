fun main() {
    
	val nums = arrayListOf(3, 12, 32, 45, 67, -100, 145, -67)
    
    // find odd numbers and add 10
    
    val numsOddPlusTen = nums.filter {n -> n % 2 != 0}.map {n -> n + 10}
    
    for (num in numsOddPlusTen) {
        
        println("Odd num plus 10: $num")
    }
  
}

// Odd num plus 10: 13
// Odd num plus 10: 55
// Odd num plus 10: 77
// Odd num plus 10: 155
// Odd num plus 10: -57
