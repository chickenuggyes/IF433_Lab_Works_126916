package OOP_126916_CarolineSandraChen.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName){

    override fun processPayment(amount: Double){
        if (balance >= amount){
            balance -= amount
            println("EWallet [$accountName] pembayaran Rp${amount.toInt()} berhasil. Sisa saldo: Rp\${balance.toInt()}")
        } else {
            println("EWallet [$accountName] pembayaran Rp${amount.toInt()} gagal. Saldo tidak cukup (saldo: Rp${balance.toInt()})")
        }
    }
    fun topUp(amount: Double){
        balance += amount
        println("EWallet [\$accountName] top up Rp\${amount.toInt()} sukses. Saldo sekarang: Rp\${balance.toInt()}")
    }
}