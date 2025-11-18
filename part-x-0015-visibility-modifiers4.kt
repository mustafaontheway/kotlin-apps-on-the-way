fun main() {
    
	var empAyhan = Employee("Ayhan Bilir", "HR", 42_000u)
    
    //println(empAyhan.companyName) // Error => Cannot access 'var companyName: String': it is private in 'Employee'.

    empAyhan.getCompany() // Employee company: ABC Company
    
    empAyhan.year = 2040 // !
   
}


class Employee(var name: String, var department: String, var salary: UInt) {
    
    private var companyName = "ABC Company"
    
    var year = 2025 // public
    
    fun getCompany(){
        
        println("Employee company: $companyName")
    }
}
