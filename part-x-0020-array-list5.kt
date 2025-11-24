fun main() {
    
    val emp1 = Employee("Ayhan", "Operations", 4300u)
    val emp2 = Employee("Kağan", "Finance", 4000u)
    val emp3 = Employee("Hakan", "Sales", 3200u)
    
    val employees = arrayListOf(emp1, emp2, emp3)
    
    println(employees.get(1).department) // Finance

}

class Employee(val name: String, val department: String, var salaryUSD: UInt) {
    
    
}
