package OOP_126916_CarolineSandraChen.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: INT = 100
) {
    fun attack(targetName: String){
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int){
        if (damage < 0) return

        hp -= damage

        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}