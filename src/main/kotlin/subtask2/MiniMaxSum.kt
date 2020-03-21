package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {

        val result = IntArray(2)
        val minElem = input.min() ?: 0
        val maxElem = input.max() ?: 0
        val sum = input.sum()

        result[0] = sum - maxElem
        result[1] = sum - minElem

        print("${result[0]} ${result[1]}")
        return result
    }

}
