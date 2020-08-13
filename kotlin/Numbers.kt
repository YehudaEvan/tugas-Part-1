fun main() {
    val panjang = 18
    val lebar = 13
    val tinggi = 14
    val volume = Double
    hitungVolume(18.0, 13.0, 14.0)
}
fun hitungVolume(p : Double, l : Double, t : Double) {
    val v = p * l * t
    println("Volume dari balok yang mempunyai panjang $p, lebar $l, dan tinggi $t, ini adalah $v")
}