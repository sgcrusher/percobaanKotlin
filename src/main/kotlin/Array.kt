fun main (){

    // Array
    // Untuk membuat array pada kotlin menggunakan arrayof()
    println("PENGGUNAAN ARRAY KOTLIN")
    println("==================================")

    val group = arrayOf("KUCING", "HARIMAU", "SINGA", "ULAR")
    // atau bisa juga dengan menggunakan berikut
    val group1 = arrayOf<String>("Grup 1", "Grup 2", "Grup 3", "Grup 4")

    // Untuk mengambil nilai yang terdapat pada array kita bisa menggunakan indeks
    // indeks ini memiliki simbol []
    // array selalu mulai dari '0'
    // Untuk memanggil kita bisa menggunakan sebagai berikut

    println("Memanggil nilai array")
    println ( group[0] )
    // ATAU BISA JUGA MENGGUNAKAN INI
    println ( group.get(1) )

    println("--------------------------")
    println("Mengubah Nilai array")
    // kita mengubah array group1 menjadi nama hewan
    group1[2] = "Kuda"
    group1.set(3, "Gajah")
    // setelah merubah nilai kita panggil menggunakan indek
    println( group1[2] )
    println( group1.get(3) )
    // dan kita juga panggil array yang tidak dirubah
    println( group1[1])
    println( group1.get(0) )
    // berhasil terubah

}