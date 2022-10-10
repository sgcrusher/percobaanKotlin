fun main(){

    // Penulisan null dalam kotlin ditandai dengan '?'
    // null artinya tidak ada nilai
    val text: String? = null

    if(text != null){
        println(text.length)

        // untuk mengecek value null bisa menggunakan if
        // jika mencetak langsung maka program akan error


    }
    // Safe calls & elvis operator
    // memudahkan objek nullable
    // untuk menggunakan safe calls menggunakan sign ?.

    val safeText: String? = null
    safeText?.length
    // Dengan menggunakan safecalls program akan skip proses jika kondisi null


    // untuk menggunakan elvis operator menggunakan sign ?:
    // sign tersebut dimasukkan diakhir objek

    val elvisText: String? = null
    val elvisTextlLength = elvisText?.length ?: 0
    // elvis akan mengambalikan nilai default (0) jika elvisTextLength adalah null


}