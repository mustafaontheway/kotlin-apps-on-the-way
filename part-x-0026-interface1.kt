fun main() {
   
   
}

class Company: Calculations, Financials {
    
    override fun sum() {}
    override fun mult() {}
    override fun diff() {}
    override fun div() {}
    
    override fun profit() {}
    override fun interest() {}
    
}


interface Calculations {
    
    fun sum()
    
    fun mult()
    
    fun diff()
    
    fun div()
}

interface Financials {
    
    fun profit()
    
    fun interest()
}
