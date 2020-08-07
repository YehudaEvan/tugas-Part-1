fun main(){
    val user = setUser("Yehuda Hazaq Evangelli","music",16)
    println(user)
}
fun setUser (name : String, hobby : String,age : Int) = "My name is $name ,I like $hobby , and I'm $age years old"