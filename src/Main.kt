import java.security.KeyStore.TrustedCertificateEntry

fun main(){
    var name ="Fanny"
    greeting(name)
println(presentation("murungi agnes", 20))
    val marks = intArrayOf(2, 3, 4, 5, 6)
evennum(marks)
    printMessage("Hello, world!")

    countries(arrayOf("kigali","nairobi","dodoma","bujumbura"))


}
fun greeting(name :String){
    println("Hello,$name  You are Welcome")
}

fun presentation(names :String ,age :Int) :String{
    var names="Mutesi Aline"
    var age=20
   var present="Hy $names I am $age years Old "
    return present

}

fun evennum( marks: IntArray)  {
    println("even numbers:")
    for (number in marks) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}
fun printMessage(message: String) {
    println(message)}


fun countries(cities: Array<String>){
    val newCities= Array(cities.size){""}
cities.forEachIndexed{ idx, city ->
    newCities[idx] = city.replaceFirstChar{ it.titlecase() }
}
    println(newCities.contentToString())
}


