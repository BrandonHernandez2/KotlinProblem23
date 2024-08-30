fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.

    return if (age <= 12) 15
    else if (age <= 60 && age >= 13 && isMonday) 25
    else if (age <= 60 && age >= 13) 30
    else if (age >= 61) 20
    else -1

//    if (age <= 12){
//        return 15;
//    }else if (age <= 60 && age >= 13 && isMonday){
//        return 25
//    }else if (age <=50 && age >= 13){
//        return 30
//    }else if (age >= 61){
//        return 20
//    }else{
//        return -1
//    }
}
