fun main() {

    // range (1..10)
    val rangeint = 10..10
    println("angka : " + rangeint.step)
    println(rangeint.toList())

    // using .rangeTo()
    val rangeInt = 1.rangeTo(10)
    println("angka : " + rangeInt.step)
    println(rangeInt.toList())

    // Range step
    // memberikan jarak antar angka
    val Rangeint = 1..10 step 3
    println("angka : " + Rangeint.step)   //step = langkah dalam proses
    println(Rangeint.toList())

    // DownTo menghitung mundur
    val rangeIn = 10.downTo(1)
    println("angka : " + rangeIn.step)
    println(rangeIn.toList())
    println("=============================================")

    // Untuk mengecek ada atau tidak ada nilai pada range
    // bisa menggunakan in or !in
    var i = 5
    if (i in 1.rangeTo(10)){
        println("Angka berada pada range")
    }

    var y = 11
    if (y !in 1.rangeTo(10)) {
        println("Angka tidak berada pada range")
    }
}