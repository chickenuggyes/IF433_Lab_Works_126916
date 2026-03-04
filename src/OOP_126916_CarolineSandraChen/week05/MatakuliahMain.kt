package OOP_126916_CarolineSandraChen.week05

fun main(){
    val ListMatkul: List<Matakuliah> = listOf(
        MatakuliahWajib(),
        MatakuliahElektif()
    )
    println("banyak tipe matkul: $ListMatkul")

    for(mku in ListMatkul){
        mku.set_matkul(3)

        //cara1 panggil method beda untuk all anak class
        if(mku is MatakuliahWajib){
            mku.ada_seminar()
        } else if (mku is MatakuliahElektif){
            mku.ada_praktek()
        }

        //cara2
        when(mku){
            is MatakuliahWajib ->{
                print("Wajib dari When: ")
                mku.ada_seminar()
            }
            is MatakuliahElektif ->{
                print("Elektif dari When: ")
                mku.ada_praktek()
            }
        }
    }


    //val wjb = MatakuliahWajib()
    /*wjb.set_matkul(3)

    val elk = MatakuliahElektif()
    elk.set_matkul(2)*/
}