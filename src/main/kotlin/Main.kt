
fun main() {
    val moneyTransferAmount: Int = 4830_00
    val commissionFactor: Int = 75
    val commissionMin: Int = 35_00

    val amount = if (moneyTransferAmount * commissionFactor / 10000 <= commissionMin) (moneyTransferAmount + commissionMin)
    else (moneyTransferAmount + (moneyTransferAmount * commissionFactor / 10000))

    println("Сумма перевода $moneyTransferAmount с комиссией ${amount - moneyTransferAmount} составит: = $amount копеек")
}