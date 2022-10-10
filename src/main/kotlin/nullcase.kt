fun main() {

    var dateOut: String? = null
    var status = "Booked"

    status = "Checkout"

    if (status.equals("Checkout")){
        dateOut = "29/09/2022/21:12:00"
    }
    // jika dalam status equal tidak ada nilai maka program akan meng output nilai null
    println(dateOut)
}