fun main() {
    // tipe data Chararcter
    // Untuk tipe data char menggunakan ( '' )
    var nilai : Char = '1'
    println(nilai)

    // penggunaan increment++ dan decrement-- pada tipe data char
    // penggunaan increment 'N++'
    println("penggunaan increment didepan N++")
    println("Nilai " + nilai++)
    println("Nilai " + nilai++)
    println("Nilai " + nilai++)
    println("Nilai akhir " + nilai)
    println("===================")
    // penggunaan dekrement 'N--'
    println("penggunaan decrement didepan N--")
    println("Nilai " + nilai--)
    println("Nilai " + nilai--)
    println("Nilai " + nilai--)
    println("Nilai akhir " + nilai)
    println("===================")
    // penggunaan dekrement dan increment juga bisa digunakan diawal variable
    // contohnya sebagai berikut
    // penggunaan increment '++N'
    println("penggunaan increment dibelakang ++N")
    println("Nilai " + ++nilai)
    println("Nilai " + ++nilai)
    println("Nilai " + ++nilai)
    println("Nilai akhir " + nilai)
    println("===================")
    // penggunaan dekrement '--N'
    println("penggunaan increment dibelakang --N")
    println("Nilai " + --nilai)
    println("Nilai " + --nilai)
    println("Nilai " + --nilai)
    println("Nilai akhir " + nilai)
    println("===================")

}