/**
 * Definições mais comuns de intervalos (ranges) no Kotlin.
 *
 * @see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges)
 */

 fun main() {
    for (x in 1..5) {
        println(x)
    }
    
     for (x in 9 downTo 0 step 3) {
        println(x)
    }
      
    for (x in 0..10 step 2) {
        println(x)
    } 
    
    for (x in 10 downTo 0 step 2) {
      println(x)
    } 
    
    for (x in 2 until 3) {
        println(x)
    }
  }
    
  