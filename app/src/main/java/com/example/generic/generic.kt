package com.example.generic

import javax.xml.transform.Source

//type of collections in kotlin

//we have 2 classes Mamal and Cat
open class Mamal() {}

class Cat() : Mamal()


//if you want get instance of a list of cat you can use this fake cat list class
class CatList {


    //get item of a cat and return instance of it from fake cat list
    fun getCat(listPosition: Int): Cat? {
        return null
    }

    //fake add to cat list
    fun addCat(cat: Cat) {}
}


//if you want get instance of a list of amamal you can use this fake mamal list class
class MamalList {

    //get item of a mamal and return instance of it from fake mamal list
    fun getMamal(listPosition: Int): Mamal? {
        return null
    }
    //fake add to mamal list

    fun addMamal(mamal: Mamal) {}
}

//so to use this instances u can make fun and ...

fun getFakeItem() {
    var mamalList = MamalList()
    mamalList.addMamal(Mamal())
    var mamal = mamalList.getMamal(0)


    var catList = CatList()
    catList.addCat(Cat())

    var cat = catList.getCat(0)
}

//see? this is not a good way to code the same logic multiple time
//whats the solution? using generics!




//know look at this one
//T is a unknown instance that can be generated to every instances like cat or mamal or Sting or Int or ....
class CustomeList<T> {
    fun getItem(i: Int): T? {
        return null
    }

    fun addItem(item: T) {}
}

fun addListItem() {

    //and use this like a ArrayList
    var catList = CustomeList<Cat>()
    var mamalList = CustomeList<Mamal>()
    var mamalList2: CustomeList<Mamal>? = null
    mamalList2 = mamalList
}




