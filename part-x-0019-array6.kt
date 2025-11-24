fun main() {

	val sales = arrayOf<UInt>(500u, 600u, 400u, 650u)
    
	println(sales.max())
    
    println(sales.min())
    
    println(sales.indexOf(400u))
    
    println(sales.contains(650u))
    
    sales.sort()
    
    println(sales.contentToString())
    
    sales.reverse()
    
    println(sales.contentToString())

}

// 650
// 400
// 2
// true
// [400, 500, 600, 650]
// [650, 600, 500, 400]
