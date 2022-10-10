import java.security.KeyStore.TrustedCertificateEntry

fun main() {

    // Tipe data Boolean
    // Tipe data ini hanya berisi nilai yaitu True dan False
    // Sebelumnya kita harus mengetahui logic boolean
    // kita bisa search Table Logic Boolean
    // Untuk mengetahui Perubahan nilai T/F dalam Operasi AND,OR,NOT,Dll.

    println("Penggunaan Tipe data Boolean dalam 3 operator")
    println("================================================")
    // delkarasi variable boolean
    var Boolean1 = true
    var Boolean2 = false

    // Penggunaan Operator AND (&&)
    println("Operator AND \'&&\' ")
    println("Nilai Boolean1 AND Boolean2 = " + (Boolean1 && Boolean2))
    println("Nilai Boolean2 AND Boolean1 = " + (Boolean2 && Boolean1))
    println("Nilai Boolean2 AND Boolean2 = " + (Boolean2 && Boolean2))
    println("Nilai Boolean1 AND Boolean1 = " + (Boolean1 && Boolean1))
    println("---------------------------------------")
    // Penggunaan Operator OR (||)
    println("Operator OR \'||\' ")
    println("Nilai Boolean1 OR Boolean2 = " + (Boolean1 || Boolean2))
    println("Nilai Boolean2 OR Boolean1 = " + (Boolean2 || Boolean1))
    println("Nilai Boolean2 OR Boolean2 = " + (Boolean2 || Boolean2))
    println("Nilai Boolean1 OR Boolean1 = " + (Boolean1 || Boolean1))
    println("---------------------------------------")

    // Penggunaan Operator NOT (!)
    println("Operator OR \'!\' ")
    println("Nilai Boolean1 NOT = " + !Boolean1)
    println("Nilai Boolean2 NOT = " + !Boolean2)
    println("---------------------------------------")

}