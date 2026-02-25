package OOP_126916_CarolineSandraChen.week04

class Manager(
    name: String,
    baseSalary: Int
) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500_000
    }
}