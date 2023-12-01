/**
 * Verificações de igualdade.
 *
 * @see [Equality Checks](https://play.kotlinlang.org/byExample/02_control_flow/04_Equality%20Checks)
 */

 fun main() {
	val listOne = setOf("Banana", "Morango", "Limão")
    val listTwo = setOf("Banana", "Morango", "Limão")
    
    println(listOne == listTwo) //Estrutural
    println(listOne === listTwo) //Referencial, busca checar as referencas desses objetos
}
  
