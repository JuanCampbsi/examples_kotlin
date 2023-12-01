/**
 * Definições mais comuns de intervalos (ranges) no Kotlin.
 *
 * @see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges)
 */

 fun main() {
    for (c in 'a'..'d') {
        println(c)
    }

    for (c in 'd' downTo 'a' step 2) {
        println(c)
    }

    val x = 2
    
    if(x in 3..10){
        println(true)
    }else {
        println(false)
    }
  }
    
  