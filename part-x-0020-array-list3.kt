fun main() {
    
    val names = arrayListOf("ayhan", "hakan", "bengü")
    
    names.add(1, "bilge")
    
    if (names.contains("kültigin") == false) {
        
        names.add("kültigin")
    }
    
    println(names.toString()) // [ayhan, bilge, hakan, bengü, kültigin]
 }

