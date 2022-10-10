
// if statement dalam kotlin di deklarasi kan dengan 'if'
// if digunakan biasanya untuk menyatakan berdasarkan kondisi
// if statement jika tidak mengembalikan nilai maka dia hanya perintah untuk mencetak data

fun main() {
    val kondisi = true

    if (kondisi) {
        println("Kondisi adalah true") // jika kondisi true program akan eksekusi if
    } else{
        println("kondisi adalah false") // jika kondisi false program akan ekseskui else
    }
    println("================================================")

    // if ekspresi
    // if ekspresi mengembalikan nilai dan disimpan dalam sebuah variable

    val angka = 12
    val angka1 = 2

    if (angka==angka1) {
        println("angka 12 sama dengan angka 2") // jika kondisi true program akan eksekusi if
    } else{
        println("angka 12 tidak sama dengan angka 2") // jika kondisi false program akan ekseskui else
    }

    println("==================================================")
    // if else juga bisa kita gunakan pada kotlin untuk menambah suatu kondisi
    // if else dalam kotlin di delkarasikan dengan 'else if'
    // contoh sebagai berikut
    val a = 12
    val b = 2
    val c = 6

    if ( a == b ) {
        println("angka 12 sama dengan angka 2") // jika kondisi benar program akan eksekusi if
    } else if( b >= c ){
        println("angka 2 lebi besar dari sama dengan angka 2") // jika kondisi salah program akan ekseskui else if
    } else{
        println("Semua kondisi salah") // jika kondisi benar program akan eksekusi else
    }
}

