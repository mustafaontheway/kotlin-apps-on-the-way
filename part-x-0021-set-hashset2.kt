fun main() {
    
    val someYears = HashSet<UInt>()
    
    someYears.add(2000u)
    someYears.add(2000u)
    someYears.add(2000u)
    someYears.add(2001u)
    someYears.add(2000u)
    someYears.add(2000u)
    
    println(someYears.size) // 2
    
    someYears.forEach {
        
        println(it)
    }
}

// 2000
// 2001

