fun main() {

	val sales = arrayOf<UInt>(500u, 600u, 400u, 650u)
    
	for ((i, sale) in sales.withIndex()) {
        
        println("Sales${i + 1}: $sale")
    }

}

// Sales1: 500
// Sales2: 600
// Sales3: 400
// Sales4: 650
