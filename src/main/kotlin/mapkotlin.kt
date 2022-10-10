
// map merupakan collection yang dapat menyimpan data dalam key-value
// dimana setiap key-value dapat dikaitkan dengan satu nilai
// bisa di delklarasikan dengan tipe yang berbeda
// map dapat diubah(mutable) dan hanya dibaca(mapOf)

fun main() {
    val grupmap = mapOf(
        1 to "Group 1",
        2 to "Group 2",
        3 to "Group 3",
        4 to "Group 4",
        5 to "Group 5",
        6 to "Group 6"
    )
    println(grupmap)
    println(grupmap[2])
    println(grupmap.getValue(1))
    println(grupmap.values) // menampilkan semua value dari key
    println(grupmap.keys) // menampilkan keys

    println("==================Mutablemap============================")

    // Mutablemap
    val mutablemap = grupmap.toMutableMap()
    println(mutablemap)

    mutablemap[2] = "Group dua"
    mutablemap.put(7, "Group 7")
    println(mutablemap)

}