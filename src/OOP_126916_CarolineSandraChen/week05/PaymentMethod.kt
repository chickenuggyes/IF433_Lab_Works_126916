package OOP_126916_CarolineSandraChen.week05

abstract class PaymentMethod(val accountName: String){
        abstract fun processPayment(amount: Double)
    }