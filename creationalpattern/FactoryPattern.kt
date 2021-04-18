package com.mu.jan.myapplication.creationalpattern

/**
 * Factory pattern - (Part of Creational Design pattern)
 * In Factory patter, we create objects of classes without directly using
 * constructor.
 */
interface AnimalInterface{
    fun getInfo()
}
enum class AnimalType{
    CAT,DOG
}
class CatAnimal: AnimalInterface{
    override fun getInfo()  {
    }
}
class DogAnimal: AnimalInterface{
    override fun getInfo() {

    }
}
object AnimalFactory{
    fun createAnimal(type: AnimalType)
    : AnimalInterface = when(type){
        AnimalType.CAT -> {
            CatAnimal()
        }
        AnimalType.DOG -> {
            DogAnimal()
        }
    }
}
//Let's see
class MyClass{
    fun foo(){
        val i = AnimalFactory.createAnimal(AnimalType.DOG)
        //info of cat
        i.getInfo()

    }
}