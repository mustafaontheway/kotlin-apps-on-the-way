fun main() {

	val sales = arrayOf<UInt>(500u, 600u, 400u, 650u)
    
    println(sales.count()) // 4
    
    if (sales.isEmpty() == false) {
        
        sales.set(2, 740u)
    }

    println(sales.contentToString()) // [500, 600, 740, 650]
}
