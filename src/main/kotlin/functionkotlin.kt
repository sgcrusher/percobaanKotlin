
// Function
// Deklarasi function di kotlin dengan 'fun'
// Kemudian melakukan penamaan terhadap function cth dibawah 'main' dan 'setUser'
// Kemudian '()' sebagai parameter,
// kita bisa memasukkan kondisi parameter dan ini bersifat opsional

fun main () { // cth parameter tak ada kondisi

    val hasil = setUser("Sandy Gustyanto", 19)
    println(hasil)
}

// jika kita ingin memasukkan kondisi parameter
// kita bisa memasukkan nama parameter cth 'name' dan 'age'
// kemudian ':' untuk menentukan tipe data didlm parameter tersebut
// setelah kita setting parameter kita juga harus menentukan tipedata return kita
fun setUser (name: String, age: Int): String { // parameter kondisi
    return "Nama kamu adalah $name dan Umur kamu $age tahun"
    // return untuk menjalankan fuction
    // $ untuk memanggil paramater
}
