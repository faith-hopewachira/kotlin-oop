//CREATING CLASSES FOR OUR OBJECTS
fun main() {
    val car = Car("Subaru", "Legacy", "UBA 133F", 0)
    val audi = Car("Audi", "A4", "KDN 387J", 0)
    println(car.registration)
    println(audi.speed)
    val school = TechSchool("Karen", "Akirachix", 100)
    println(school.location)
    audi.start()
    val benz = Car("C200", "Classic", "KDD 149Q", 0)
    benz.start()
    println(audi.speed)
    audi.accelerate(50)
    audi.accelerate(30)
    println(audi.speed)
    println("${audi.make} ${audi.model} ${audi.registration}")


    val yellowBulb = LightBulb()
    val blueBulb = LightBulb()
    yellowBulb.switchOn()
    blueBulb.swithchOff()
    yellowBulb.brightnessLvl = 7

    audi.decelerate(60)
    println(audi.speed)

    var faith = Person("Wachira", 90)
    println(faith.age)
    faith.habits()
    audi.hoot("beep beep")

    bel(cities = arrayOf("harare", "mumbai", "dodoma", "jakarta"))
//    addNums(arrayOf(2,17,4,213,78,43))
    println(threeNames("Faith", "Hope", "Wachira").contentToString())


    val myBook = Book("Smart Money Woman", "Ivy Nyabang", 294)
    println(myBook.pages)
    println(myBook.author)
    println(myBook.title)


    var result = calculate(8,6)
    println(result)


    println(getLeader())



}


//THE CONSTRUCTOR IS USED TO CREATE OBJECTS
class Car(var make: String, var model: String, var registration: String, var speed: Int) {  //STATE or ATTRIBUTES
    //BODY OF THE CLASS
    //BEHAVIOURS-similar
    fun start() {
        println("vroooom, vroom")
    }

    fun accelerate(acceleration: Int) {
        speed += acceleration

    }

    fun decelerate(deceleration: Int) {
        if (deceleration <= speed) {
            speed -= deceleration
        } else {
            speed = 0
        }

    }

    fun hoot(sound: String) {
        println(sound)
    }

    fun stop() {
//        speed = 0
        decelerate(speed)

    }


}


class TechSchool(var location: String, var name: String, var numOfPeople: Int) {
    fun founders() {
        println("Linda")
    }

    fun teachers() {
        println("Mwai")
    }

}

class LightBulb() {

    var brightnessLvl = 5
    fun switchOn() {

    }

    fun swithchOff() {

    }
}

class Person(var name: String, var age: Int) {
    fun habits() {
        println("singing")
    }
}

//CAPITALIZING EACH WORD
fun bel(cities: Array<String>) {
    cities.forEachIndexed { index, cities ->
        if (index in arrayOf(0, 1, 2, 3))
            (println(cities.capitalize()))
    }

    cities.sort()
    println(cities.contentToString())

}

//ADDING NUMBERS IN AN ARRAY
fun threeNames(name1: String, nae2: String, name3: String): Array<String> {
    var x = arrayOf(name1, nae2, name3)
    return x

}
//CREATE A NEW VARIABLE THAT WILL HOLD THE EXISTING ARRAY AND THE ADDED ARRAY
// val names2 = names.plus(arrayOf("Faith", "Hope", "Wachira"))


//TITLE CASING AND PUTTING IN AN ARRAY
fun cities(cities1: Array<String>) {
    val newCities = Array(cities1.size) { "" }
    //CREATING A VARIABLE FOR THE NEW ARRAY FOR THE TITLECASE
    cities1.forEachIndexed { idx, city ->
        //"CITY" - IS NAME OF EVERY ELEMENT IN THE ARRAY
        newCities[idx] = city.replaceFirstChar { it.titlecase() }


    }
    println(newCities.contentToString())
}


//DATA CLASSES
data class Book(
    var title: String,
    var author: String,
    var pages: Int
)


//CREATING A DATA CLASS FOR OUR OPERATIONS
data class Calculations(
    var sum: Int,
    var diff: Int,
    var product: Int,
    var quotient: Double,


    )


//RETURNING MULTIPLE VALUES
fun calculate(x: Int, y: Int): Calculations{
    val sum = x + y
    val diff = x - y
    val product = x * y
    val quotient = x.toDouble()/y

    val calc = Calculations(sum, diff, product, quotient)
    return calc


}

data class ClassReps(
    var lovelaceRep: String,
    var anitaB: String,
    var adaLab: String


)

fun getLeader(): ClassReps{
    val reps = ClassReps("Nancy", "Wainania","Gloria")
    return  reps

}








