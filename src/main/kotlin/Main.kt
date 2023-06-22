/**
Este programa serve apenas para estudos de Kotlin e/ou Java. No momento estou apenas estudando Kotlin, mas
 pretendo migrar para o Java futuramente (Isto para agregar mais na linguagem Kotlin).
 */

fun main() {
    println("Hello World!")
    //val nomeaqui
    formatacao()

    //aqui vai estar uma bagunça porque sou eu aprendendo os valores de variaveis numericas.. Ent peço desculpa kk
    println("Valor Maximo de Double é ${Double.MAX_VALUE},e o minimo é ${Double.MIN_VALUE}")
    println("Valor Maximo de Float é ${Float.MAX_VALUE},e o minimo é ${Float.MIN_VALUE}")
    println("Valor Maximo de Long é ${Long.MAX_VALUE},e o minimo é ${Long.MIN_VALUE}") // utilizado para medidas
    println("Valor Maximo de Int é ${Int.MAX_VALUE},e o minimo é ${Int.MIN_VALUE}")
    println("Valor Maximo de Short é ${Short.MAX_VALUE},e o minimo é ${Short.MIN_VALUE}")
    println("Valor Maximo de Byte é ${Byte.MAX_VALUE},e o minimo é ${Byte.MIN_VALUE}")

    //variaveis que não são numericas:

    val Caractere: Char = 'a'
    val Palavra_ou_Frase: String = "ai James da Salada de Fruta Apelão"
    val Booleano_ein: Boolean = true

    //podemos usar "unsigned" para retirar o minimo do negativo e trazer para o positivo (No exemplo de byte,
    //tirar do -128 e deixar um total de 250... Por exemplo:
    val num_broken:UByte = 200u //UByte pra transformar em unsigned e "u" dps de 200 para ajudar o compilador a saber que não é um numero "padrão"

    //teste de integrar uma função na outra
    val soma = sum(a = 3, b = 2)
    println("O valor da funcao soma é: $soma")
}

fun sum(a: Int, b: Int): Int{
    return (a+b)
}