
// set kotlin merupakan kumpulan item yang tidak beraturan dan hanya dapat mengumpulkan nilai unik
// set sama seperti list dapat diubah(mutableSetOf) atau hanya baca (setOf)
// set tidak dapat memiliki elemen yang sama/duplikat
// berguna ketika kita tidak ingin ada elemen yang sama/duplikat
fun main() {

    //setOf
    // setof dikhususkan hanya read
    // setOf akan otomatis menghapus element yang sama
    // jika kita membandingkan dengan 2 set yang sama nilainya, maka set tidak akan berguna

    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(2, 4, 3, 1, 5, 2, 1)
    println(set1==set2)
    println(3 in set1) // mengcek elemen 3 ada di set1
    println("============================================")

    // union dan intersect
    // union berguna untuk menggabungkan data dan menghapus yang sama
    // intersect berguna untuk menampilkan nilai yang sama

    val a = listOf("satu", "dua", "tiga", "empat")
    val b = setOf("satu", "satu", "dua", 3, 4)
    val c = mutableSetOf("tujuh", "satu", 9)

    val intersect = a intersect b
    val union = a union c

    println(intersect)
    println(union)

    println("============================================")

    // mutablesetof
    // hanya bisa menambahkan dan menghapus elemen, tidak bisa mengganti element

    val mutablest = mutableSetOf(1, 2, 3, 4, 1)
    mutablest.add(6)
    mutablest.remove(1)
    println(mutablest)
}