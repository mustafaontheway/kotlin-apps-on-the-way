fun main() {
    
    val emp1 = Employee("Ayhan Bilir", 50000u)
    val emp2 = Employee("Bilge Kağan", 65000u)
    val emp3 = Employee("Bengü Başaran", 40000u)
    val emp4 = Employee("Kültigin Acun", 62000u)
    val emp5 = Employee("Sevda Sever", 35400u)
    
    val employees = arrayListOf<Employee>(emp1, emp2, emp3, emp4, emp5)
    
	//val employeesWithLowSalaries = employees.filter {it.salary < 50_000u}.map {it.name}
    
    val employeesWithLowSalaries = employees.filter {emp -> emp.salary < 50_000u}.map {emp -> emp.name}
    
  	for (emp in employeesWithLowSalaries) {
        
        println("Employee with low salary: $emp")
    }
  
}

class Employee(val name: String, val salary: UInt) {
    
}

// Employee with low salary: Bengü Başaran
// Employee with low salary: Sevda Sever
