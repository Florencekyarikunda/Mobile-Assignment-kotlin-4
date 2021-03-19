import java.util.*

fun main(){
car("BWM","Buick","Audi","Dacia")
    bigTowns()
    println()
    num()
    println(Arrays.toString(friends("florence","sarah","papai")))





}
fun car(N1:String,N2:String,N3:String,N4:String){
    var namesArray=arrayOf(N1,N2,N3,N4)
    println(Arrays.toString(namesArray))
}
fun bigTowns(){
    var citiesArray=arrayOf("harare","mumba","dodoma","jakarta")
    for (cities in citiesArray){
        println(cities.capitalize())
    }
}
fun num(){
    var numArray=arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62,)

    var b=numArray[1]
    var c=numArray[4]
    var result=b+c
    println(result)

println(numArray.indexOf(158))
var  sort=numArray
    var sortedNumbers=numArray.sortedArray()
    println(Arrays.toString(sortedNumbers))
}
fun friends(name1:String,name2:String,name3:String):Array<String>{
 return arrayOf(name1,name2,name3,)

}
