fun main() {
    
    val names = arrayListOf("ata", "ayhan", "hakan", "bengü", "kültigin", "aygün", "aybüke", "kutluk", "bumin", "mustafa")
    
    println(names.contains("mustafa"))
    
    println(names.max())
    
    println(names.min())
    
    names.sort()
    
    println(names.toString())
    
    names.reverse()
    
    println(names.toString())
    
    names.remove("mustafa")
    
    names.removeAt(0)
    
    println(names.toString())
    
    names.clear()
    
    println(names.toString())
    
 }

// true
// mustafa
// ata
// [ata, aybüke, aygün, ayhan, bengü, bumin, hakan, kutluk, kültigin, mustafa]
// [mustafa, kültigin, kutluk, hakan, bumin, bengü, ayhan, aygün, aybüke, ata]
// [kutluk, hakan, bumin, bengü, ayhan, aygün, aybüke, ata]
// []
