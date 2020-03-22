package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        var mismatch = 0
        for (i in 0 until n/2)
            if (digitString[i] != digitString[digitString.lastIndex - i])
                if(++mismatch > k)
                    return "-1"

        val copyString = digitString.toMutableList()

        if (k >= n) {
            for (i in digitString.indices)
                if (digitString[i] != '9')
                    copyString[i] = '9'
        } else {
            mismatch = k
            for (i in 0 until n / 2) {
                if (digitString[i] > digitString[digitString.lastIndex - i]) {
                    copyString[copyString.lastIndex - i] = copyString[i]
                    mismatch--
                } else if (digitString[i] < digitString[digitString.lastIndex - i]) {
                    copyString[i] = copyString[copyString.lastIndex - i]
                    mismatch--
                }
            }
            var i = 0
            if (mismatch % 2 == 1)
                mismatch++
            while (i < n/2 && mismatch > 0) {
                if (copyString[i] != '9') {
                    copyString[i] = '9'
                    copyString[copyString.lastIndex - i] = '9'
                    mismatch -= 2
                }
                i++
            }
            if (n % 2 == 1 && mismatch >= 1)
                if (copyString[n / 2] != '9')
                    copyString[n / 2] = '9'
        }

        val result = StringBuilder()
        copyString.forEach { result.append(it) }
        return result.toString()
    }

}
