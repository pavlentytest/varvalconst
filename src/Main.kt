data class Mutable(var mute: Int)

fun main12() {
    var varDemo = Mutable(10) /* Initialization */
    println(varDemo)
    varDemo = Mutable(20)     /* Assigning a new value */
    println(varDemo)
    varDemo.mute = 40		  /* Mutating value */
    println(varDemo)
}
fun main() {
    val valDemo = Mutable(10) /* Initialization */
    println(valDemo)
    valDemo.mute = 20		  /* Mutating value */
    println(valDemo)
    //valDemo = Mutable(30)   /* Throw an error */
}
/*
Распространенным заблуждением, является то что val не изменяемо, но на самом деле это не так,
поскольку оно допускает изменение значение.
Неизменное значение можно создать, добавив модификатор const к ключевому слову val.
 */

//Разрешено только инициализировать const val со строковыми или примитивными типами.
const val CONST_VAL_VALID = 10
const val CONST_VAL_VALID_TOO = "compile-time"
// const val CONST_VAL_INVALID = Mutable(10) /* Throw an error */

//Разрешается определять const val только в области верхнего уровня или элементом объекта или в companion object.

class Mutable2() {
    // const val CONST_VAL_INVALID = 10 /* Throw an error */
    fun runTimeFunc() {
        // const val CONST_VAL_INVALID = 10 /* Throw an error */
    }
    companion object {
        const val CONST_VAL_VALID_HERE = 10
    }
}
const val CONST_VAL_VALID2 = 10