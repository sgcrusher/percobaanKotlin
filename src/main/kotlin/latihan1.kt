fun main() {
    // Dalam String terdapat 2 jenis dalam kotlin yaitu Escaped String dan Raw String
    // Penggunaan Escaped string berada di dalam ( "" )
    // jenis-jenis Escaped String
    var Stringtxt = "\"Penggunaan Escaped String\""
    println(Stringtxt)

    // kegunaan \t yaitu sama seperti fungsi Tab memberi jarak text
    println("=============================")
    println("Contoh Penggunaan \\t")
    var nama = "Sandy Gustyanto"
    println("nama saya adalah " + nama)
    println("nama saya adalah\t" + nama)

    // kegunaan \n yaitu berfungsi membuat baris baru
    println("=============================")
    println("Contoh Penggunaan \\n")
    var nama1 = "Sandy Gustyanto"
    println("nama saya adalah " + nama1)
    println("nama saya adalah\n" + nama1)

    // kegunaan \' yaitu membuat tanda petik 1
    println("=============================")
    println("Contoh Penggunaan \\'")
    var nama2 = "Itu adalah nama saya"
    println("Sandy Gustyanto " + nama2)
    println("\'Sandy Gustyanto\' " + nama2)

    // kegunaan \" yaitu membuat tanda petik 2
    println("=============================")
    println("Contoh Penggunaan \\\" ")
    var nama3 = "itu adalah nama saya"
    println("Sandy Gustyanto " + nama3)
    println("\"Sandy Gustyanto\" " + nama3)

    // kegunaan \\ yaitu menambahkan backslash
    println("=============================")
    println("Contoh Penggunaan \\\\ ")
    var nama4 = "itu adalah nama saya"
    println("Sandy Gustyanto " + nama4)
    println("\\Sandy Gustyanto\\ " + nama4)
    
}