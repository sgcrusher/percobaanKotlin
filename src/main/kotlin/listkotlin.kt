
// list adalah collection terurut dengan mengakses elemen berdasarkan indeks
// kotlin list dapat berubah-ubah (mutableListOf) atau sekedar baca (listOf)
// element di list dapat diakses menggunakan indeks
// kotlin dengan mutable atau imutable dapat memiliki element duplikat
// list dapat menyimpan elemen dengan tipe data berbeda


fun main() {

    // listof
    // menggunakan standar libary function ( listOf() ) hanya bisa membaca list
    // jika elemen atau nilai yang ada di list bertipe string, kotlin akan membaca tipe data list bertipe string
    val listangka = listOf("satu", "dua", "tiga")
    println(listangka)

    println("==============================================")

    // mutableLisOf
    // sama seperti listof akan tetapi list ini dapat diubah
    // jika bertipe data integer maka objek tidak bisa diubah dengan tipe data lain

    val listangka1 = mutableListOf(1, 2, 3)
    println(listangka1)

    listangka1[2] = 4 // jika elemen yang dimasuukan bertipe string/char maka akan error
    println(listangka1)

    println("===============================================")

    // list<any>
    // jika kita ingin membuat dengan tipe data berbeda
    // masukkan langsung elemen yang ingin dibuat

    val listbeda = mutableListOf("satu", 2, true, 4, 5)
    println(listbeda)

    listbeda.set(0, "dua") // set untuk mengganti elemen
    listbeda.remove(true) // remove menghapus
    listbeda.add(4, "angka")
    listbeda[1]= "tiga"
    println(listbeda)
}