fun main() {
    // Penggunaan Raw String
    // Raw String mendeklarasi dengan triple quote (""" """)
    // berfungsi sebagai otomatisasi line

    val Stringtxt = """
        Bahasa Kotlin 
        ---------------- 
        saya sedang belajar kotlin
        di Infinite Learning
        """.trimIndent()
    println(Stringtxt)

    println("===============================================")

    // penggunaannya juga bisa langsung tanpa perlu deklarasi variable
    println("""
        Bahasa Kotlin 
        ---------------- 
        saya sedang belajar kotlin 
        di Infinite Learning
        """.trimIndent())

}