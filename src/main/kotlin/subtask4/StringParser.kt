package subtask4

import java.lang.StringBuilder
import java.util.ArrayList

class StringParser() {

    fun getResult(inputString: String): Array<String> {
        val resultStrings = ArrayList<String>()
        val strbuilder = StringBuilder()
        val openedBrackets = arrayOf('(', '[', '<')
        val closedBrackets = arrayOf(')', ']', '>')
        var bracketsCounter = 0
        var index: Int

        for (i in inputString.indices) {

            if (openedBrackets.contains(inputString[i])) {
                index = openedBrackets.indexOf(inputString[i])
                bracketsCounter++

                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == openedBrackets[index])
                        bracketsCounter++
                    else if (inputString[j] == closedBrackets[index]) {
                        bracketsCounter--
                        if (bracketsCounter == 0) {
                            resultStrings.add(strbuilder.toString())
                            strbuilder.clear()
                            break
                        }
                    }

                    strbuilder.append(inputString[j])
                }
            }
        }

        return resultStrings.toTypedArray()
    }

}
