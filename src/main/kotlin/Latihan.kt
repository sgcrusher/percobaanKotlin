fun main () {
    // tipe data string
    // tipe data ini berisi lebih dari 1 character
    // menggunakan tanda ( "" )
    val stringtxt: String = "Latihan Kotlin"
    println(stringtxt)
    println("==================================")

    // pada dasarnya nilai string bisa dikatakan dalam bentuk array
    // sehingga kita dapat memanggil menggunakan indeks
    val stringtext = "Latihan Kotlin"
    val firstChar = stringtext[0]
    println(firstChar)
    // indeks array selalu mulai dari angka '0'
    // maka output array '0' adalah char pertama yaitu L
}