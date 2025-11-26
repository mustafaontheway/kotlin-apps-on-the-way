fun main() {

    // size is constant, namely you can't add new elements
    // it keeps unique items
    
    val someYears = setOf(2010, 2010, 2011, 2111, 1990, 1997, 1997, 1997, 1997)
    
    println(someYears.size) // 5
    
    //someYears.add(2000) // Unresolved reference 'add'. 
    
    someYears.forEach {
        
        println(it)
    }
   
}

// 2010
// 2011
// 2111
// 1990
// 1997
