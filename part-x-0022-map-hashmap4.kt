fun main() {
 
    val salaryByEmpID= mutableMapOf<Int, UInt>(2214 to 62_000u, 1167 to 74_000u, 3254 to 42_000u) 
    
    salaryByEmpID.put(1110, 95000u)
    
	if (!salaryByEmpID.containsKey(3333)) {
        
        salaryByEmpID.put(3333, 100000u)
    }
    
    println(salaryByEmpID.toString()) // {2214=62000, 1167=74000, 3254=42000, 1110=95000, 3333=100000}
    
}


