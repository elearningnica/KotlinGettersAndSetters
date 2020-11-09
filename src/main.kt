import java.math.RoundingMode
import java.text.DecimalFormat

fun  main() {
    //height with two decimals
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING

    val a = Artist()
    a.firstName = "Will"
    a.lastName = "Smith"
    a.city = "New York"
    a.country = "USA"
    a.heightFeet = 6.15
    println(a.fullName)
    println(df.format(a.heightMeter))
    println(a.fullCityCountry)
}

class Artist {
    var firstName: String = ""
    var lastName: String = ""
    val fullName: String
        get() {
            val sb = StringBuilder()
            return sb.append(firstName).append(" ").append(lastName).toString()
        }
    var heightFeet: Double = 0.0
    var heightMeter: Double
        get() = heightFeet / 3.281
        set(value) {
            heightFeet = value * 3.281
        }
    var city: String = ""
    var country: String = ""
    val fullCityCountry: String
        get() {
            val sb = StringBuilder()
            return sb.append(city).append(", ").append(country).toString()
        }
}