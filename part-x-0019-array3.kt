fun main() {

    val years = Array<UInt>(5){0u}
    
    println(years.get(0)) // 0
    
    years[0] = 2021u
    
    println(years.get(0)) // 2021
   
}
