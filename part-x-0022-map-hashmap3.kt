fun main() {
 
    val salaryByEmpID= mutableMapOf<Int, UInt>(2214 to 62_000u, 1167 to 74_000u, 3254 to 42_000u) 
    
    salaryByEmpID.put(1110, 95000u)
    
	println(salaryByEmpID.toString()) // {{2214=62000, 1167=74000, 3254=42000, 1110=95000}
    
    salaryByEmpID.put(1110, 25000u) // update! 
    
    println(salaryByEmpID.toString()) // {2214=62000, 1167=74000, 3254=42000, 1110=25000}
    
    println(salaryByEmpID.containsKey(2214)) // true
    
    println(salaryByEmpID.containsValue(62000u)) // true
    
    for ((k, v) in salaryByEmpID) {
        
        println("Employee ID: $k and salary: $v")
        
    }
    
}

// Employee ID: 2214 and salary: 62000
// Employee ID: 1167 and salary: 74000
// Employee ID: 3254 and salary: 42000
// Employee ID: 1110 and salary: 25000

