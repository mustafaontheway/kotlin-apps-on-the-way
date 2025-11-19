fun main() {
    
    val sumNums = {x: Int, y: Int -> x + y}
    
    println(sumNums(15, -999)) // -984
    
    val multNums: (Int, Int, Int) -> Int = {a, b, c -> a * b * c}
    
    println(multNums(3,4,5)) // 60
  
}

