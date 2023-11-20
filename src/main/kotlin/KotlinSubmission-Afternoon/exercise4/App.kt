package id.infinitelearning.KotlinSubmission.exercise4


fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    fun bagi(b:Int, c: Int): Int {
        return try {
            b / c
        } catch (e: ArithmeticException) {
            println("Terdapat Gangguan: ${e.message}")
            0 // Memulihkan nilai default apabila terjadi gangguan
        }

    }
    fun main() {
        val poin: Int = bagi(10, 0)
        println("hasil pembagian: $poin")
    }


}


