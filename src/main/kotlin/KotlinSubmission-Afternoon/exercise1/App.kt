package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaBelakang = "ikhwan"
    val namaDepan = "fauzi"
    val umur = 21

    var single = true

    println("$namaDepan $namaBelakang")
    println(umur)
    println("status sekarang ini : $single")

}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Nama kelompok : $groupId")
    println("Anggota kelompok : $groupMember")
    println("Sesi : $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    return listOf(
        "ikhwan,alman,rizki,lidya,jasmine,budi,nisaul,raden,faiiz,maulana,vintanny"
    )
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>()
    val countOfGroup = arrayOf<String>(
        "ikhwan",
        "alman",
        "jasmine",
        "rizki",
        "nisaul",
        "lidya",
        "maulana",
        "faiiz",
        "budi",
        "vintnny",
        "raden"
    )

    return mentor .count() + countOfGroup .count()
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("COSMOPOLITE" , listOf(
        "ikhwan",
        "alman",
        "jasmine",
        "rizki",
        "nisaul",
        "lidya",
        "maulana",
        "faiiz",
        "budi",
        "vintnny",
        "raden"
    ),
        "Afternoon",)
}