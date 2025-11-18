fun main() {
    
    val a = Animal()
    
    a.print() // An animal is here!
    
    val c = Cat()
    
    c.print() // A cat is here!
}


open class Animal {
    
    open fun print() {
        
        println("An animal is here!")
    }
}

class Cat: Animal() {
    
    override fun print() {
        
        println("A cat is here!")
    }
}
