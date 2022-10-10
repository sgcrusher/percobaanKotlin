fun main() {

    // When Expression
    // Dalam penggunaan when selalu ada else
    // else akan dijalankan jika tidak ada kondisi yang sesuai di percabangan sebelumnya
    val Bilangan = 4

    val Hasil = when (Bilangan) {
        1 -> "Bilangan Bulat"
        2 -> "Bilangan Prima"
        3 -> "Bilangan Asli"
        4 -> "Bilangan Ganjil"
        5 -> "Bilangan Cacah"
        6 -> "Bilangan Rasional"
        7 -> "Bilangan Irasional"
        else -> "Invalid Bilangan" // else harus ada jika tidak ada maka program error
    }
    println(Hasil)
    println("=====================================")


    // when bisa dideklarasikan seperti ini
    val day = 5
    when (day) {
        1, 2, 3, 4, 5 -> println("Weekdays")
        else -> println ("Weekend")
    }
    println("=====================================")

    // Jika kita ingin menginput lebih dari satu kode disetiap percabangan
    // bisa dilakukan seperti ini dengan memasukkan kedalam '{}'
    val Blngn = 4

    
    when (Blngn) {
        1 -> {
            println("Ini adalah")
            println("Bilangan bulat")
            }
        2 ->{
            println("Ini adalah")
            println("Bilangan Genap")
             }
        3 -> {
            println("Ini adalah")
            println("Bilangan Asli")
            }
        4 -> {
            println("Ini adalah")
            println("Bilangan Ganjil")
            }
        5 -> println("Bilangan Cacah")
        6 -> println("Bilangan Rasional")
        7 -> println("Bilangan Irasional")
        else -> println("Invalid Bilangan") // else harus ada jika tidak ada maka program error
    }
}