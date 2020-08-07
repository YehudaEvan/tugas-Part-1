fun main (){
    val kkm = 75
    val nilai = 80
    val word = "Nilai Kamu "
    val school : String
    school = if (nilai < 70) {
        " Silahkan ikut remidial :)"
    } else if (nilai == kkm){
        " Tuntas"
    } else {
        " Selamat Ya! ;)"
    }
    print(word+nilai+school)
}
/*
beres juga :(
 */