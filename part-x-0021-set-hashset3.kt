fun main() {
    
    val someYears = listOf(2000, 2000, 2000, 2000, 2000, 2002)
    
    val uniqueYears = someYears.toHashSet()
    
    uniqueYears.forEach {
        
        println(it)
    }
}

// 2000
// 2002

