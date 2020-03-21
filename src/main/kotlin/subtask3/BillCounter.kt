package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val AnnaShouldPay = (bill.sum() - bill[k]) / 2
        return if (b == AnnaShouldPay) { "Bon Appetit" }
        else { "${b - AnnaShouldPay}" }
    }

}
