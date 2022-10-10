fun main() {
    val numberList = listOf("satu", "dua", "tiga")
    println(numberList)

    val numberList1 = mutableListOf(1, 2, 3)
    numberList1 [2] = 1
    numberList1.set(0,10)
    numberList1.add(3,4)
    println(numberList1)

    println("==================================")

    val setA = setOf(1,2,3,2,5,1)
    val setB = setOf(2,1,3,5)
    println(setA == setB)

}