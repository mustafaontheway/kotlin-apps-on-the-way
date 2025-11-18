fun main() {
    
    val c = Calculus()
    
    println(c.sum(3, 4)) // 7
    
    println(c.sum(3, 4, -21)) // -14
    
    println(c.sum(3, 4, -11, 999)) // 995

    
}


class Calculus {
    
    fun sum(x: Int, y: Int) : Int {
        
        return x + y
    }
    
    fun sum(x: Int, y: Int, z: Int) : Int {
        
        return x + y + z
    }
    
    fun sum(x: Int, y: Int, z: Int, t: Int) : Int {
        
        return x + y + z + t
    }
    
}
