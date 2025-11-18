fun main() {
    
	val empAyhan = Employee("Ayhan Bilir", "HR", 42_000u)
    
    val manMustafa = Manager("Mustafa Burada", "FinTech", 185_000u, 365_000u)
    
    manMustafa.printInfo() // Mustafa Burada - FinTech - 185000
    
}


open class Employee(val name: String, var department: String, var salary: UInt) {
    
    fun printInfo() {
        
        println("$name - $department - $salary")
    }
    
}


class Manager(name: String, department: String, salary: UInt, var annualPremium: UInt): Employee(name, department, salary) {
    
    
}
