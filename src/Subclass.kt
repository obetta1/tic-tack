class Subclass:ClassInheritance() {
    override var number =6

    override fun printName() {
        println(number)
        println("i override the method in the super class ")
    }
    fun sayHi() = "hi! am ben"
}
class Test:ClassInheritance(){
    override fun printName(){
        println("this is test to know if this can work")
    }
}