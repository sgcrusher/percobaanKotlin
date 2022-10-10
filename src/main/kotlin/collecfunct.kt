
// function filter() & filterNot()
// menghasilkan list of selection baru berdasarkan kondisi yang kita inginkan
// digunakan untuk memfilter atau memfilter data dalam collection

fun main() {

    val listangka = listOf(1, 2, 3, 4, 5)

    val list1 = listangka.filter { it % 2 == 0}

    val list2 = listangka.filterNot { it % 2 == 0 }

    println(list1) //  menampilkan angka yang habis dibagi 2
    println(list2) //  menampilkan angka yang tidak habis dibagi 2
    println("==========================================")

    // map()
    // Fungsi map() akan membuat collection baru sesuai dengan perubahan
    // yang akan dilakukan dari koleksi sebelumnya.
    val listangka1 = listOf(1, 2, 3, 4, 5)

    val list3 = listangka1.map { it * 2 }
    println(list3)

    // count()
    // menghitung items dalam collection
    val totalangka = listangka1.count()
    println(totalangka)
    println("===========================================")

    // find() digunaka untuk menemukan item dalam collection
    val listangka2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10)
    val findangka = listangka2.find { it % 2  == 0}
    println(findangka)

    //fisrtornull() menemukan item pertama yang cocok dengan kondisi yang ditentukan
    val fisrtNull = listangka2.firstOrNull { it % 2 == 1 }
    println(fisrtNull)

    //lastornull menemukan item terakir yang cocok dengan kondisi yang ditentukan
    val lastNull = listangka2.lastOrNull { it % 2 == 1 }
    println(lastNull)

    // first() dan last() function biasa digunakan untuk memfilter first or last item dari collection
    val firstangka = listangka2.first()
    val lastangka = listangka2.last()
    println(firstangka)
    println(lastangka)

    // Sum() digunakan untuk menjumlahkan setiap data dalam collection
    // sum() bisa digunakan untuk collection tipe number
    val total = listangka2.sum()
    println(total)
    println("============================================")

    // sorted() untuk mengurutkan item dalam collection
    val listangka3 = listOf(1, 4, 5, 2, 7, 3, 6)
    val listchar   = listOf("a", "c", "d", "b", "e", "f")
    // sorted mengurutkan dari atas ke bawah
    val sortedangka = listangka3.sorted()
    val sortedchar = listchar.sorted()

    println(sortedangka)
    println(sortedchar)
    // sortedDescending mengurutkan dari bawah ke atas

    val descendingangka = listangka3.sortedDescending()
    val descendingchar  = listchar.sortedDescending()
    println(descendingangka)
    println(descendingchar)




}