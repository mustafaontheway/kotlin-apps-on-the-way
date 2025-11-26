fun main() {
    
	val salaryByName = hashMapOf<String, UInt>()
    
    salaryByName.put("Ayhan Bilir", 62_000u)
    salaryByName.put("Hakan İyi", 74_000u)
    salaryByName.put("Bilge Bilici", 42_000u)
    
    println(salaryByName.get("Ayhan Bilir")) // 62000
}






