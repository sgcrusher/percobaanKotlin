fun main() {

    // For loop (Perulangan)
    // Untuk mencetak suatu output yang sama secara banyak kita bisa gunakan for loop
    // Dengan menggunakan range sebagai berikut
    for (i in 1..7) {
        println("Infinite Learning")
    }
    println("---------------------------------------------")

    // for loop juga bisa digunakan pada array
    val hari = arrayOf("senin","selasa","rabu","kamis","jumat","sabtu","minggu")
        for (day in hari){
            println(day)
        }
    println("---------------------------------------------")

    // for loop juga bisa digunakan pada indeks
    val days = arrayOf("senin","selasa","rabu","kamis","jumat","sabtu","minggu")
    for ((indeks, value )in days.withIndex()){
        println("Hari $value dengan index $indeks")
    }
    println("---------------------------------------------")

    // for loop juga bisa digunakan pada foreach
    val day = arrayOf("senin","selasa","rabu","kamis","jumat","sabtu","minggu")
    day.forEach { Hari ->
        println("Hari ini $Hari")
    }
    println("---------------------------------------------")

    // for loop juga bisa digunakan pada foreachIndexed
    val harihari = arrayOf("senin","selasa","rabu","kamis","jumat","sabtu","minggu")
    harihari.forEachIndexed { indeks, Hari ->
        println("Hari ini $Hari dengan indeks $indeks")
    }

}