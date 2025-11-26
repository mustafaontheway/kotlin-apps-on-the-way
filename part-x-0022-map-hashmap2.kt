fun main() {
 
    val salaryByEmpID= mapOf<Int, UInt>(2214 to 62_000u, 1167 to 74_000u, 3254 to 42_000u) // immutable
    
    //salaryByEmpID.put(1110, 95000u) // Error!
    
	println(salaryByEmpID.toString()) // {2214=62000, 1167=74000, 3254=42000}
    
    println(salaryByEmpID.get(1167)) // 74000
   
}

