package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {

        return if(sadArray.isNotEmpty()) {
            var i = 1
            val sadArrayList = sadArray.toMutableList()
            do {
                if (sadArrayList[i] > sadArray[i - 1] + sadArrayList[i + 1]) {
                    sadArrayList.removeAt(i)
                    i = 0
                    continue
                }
            } while (i++ < sadArrayList.size - 2)
            sadArrayList.toIntArray()

        } else { sadArray }

    }

}
