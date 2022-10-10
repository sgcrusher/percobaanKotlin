fun main() {

    // while loop sangat fleksible
    // penggunaan 'while'
    // while loop melakukan eksekusi pengulangan jika kondisi benar
    // while loop selalu running sampai kondisi salah
    var i = 1

    while (i <= 5) {
        println("Lakukan perulangan hingga : $i")
        i++
    }
    println("=====================================")
    // dibawah melakukan eksekusi code pertama lalu akan mengecek kondisi diakhir

    var y = 0
    do {
        println("$y Infinite Learning")
        y++
    }while (y <= 5)

}