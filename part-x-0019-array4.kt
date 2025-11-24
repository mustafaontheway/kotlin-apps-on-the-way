fun main() {

	val sales = arrayOf<UInt>(500u, 600u, 400u, 650u)
    
    // sales amount can't be negative
    
    //sales[2] = -300 // Argument type mismatch: actual type is 'Int', but 'UInt' was expected.
    
    println(sales.contentToString()) // [500, 600, 400, 650]
    
    sales[2] = 440u

    println(sales.contentToString()) // [500, 600, 440, 650]
}
