fun main() {

    // Break digunakan untuk stop proses looping
    // Untuk stop proses gunakan 'break'

    var i = 1
    while (true) {
        println("Lakukan perulangan hingga : $i")
        i++
        if (i > 5){
            break
        }
    }
    println("----------------------------------------")
    var a = 2
    for (b in 1..5){
        println("Hooh Tenan")

        if (b == a) {
            println("Ente kadang-kadang")
            break
        }
    }
    println("-----------------------------------------")


    // Continue
    // digunakan untuk memberhentikan loop yang sedang berlangsung
    // dan melanjutkan ke next loop
    // gunakan 'continue' untuk pengunaanya

    val listInt = listOf(1, 2, null, 4, 5, null, 7)
        for (i in listInt){
            if (i == null) continue // loop null di skip
            println(i)
        }
    println("-----------------------------------------")

    println("cetak angka")
    for (i in 1..20){
        if (i % 2 == 0) { // setiap angka yang dimasukkan maka angka yang berada di angka yang kita masukkan
            continue        // akan terskip dalam program
        }
        println("$i ini adalah angka")
    }


}