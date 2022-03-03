const val COMMISSION_FACTOR = 75U
const val COMMISSION_MIN = 35_00U

fun main() {
    print("Введите сумму в копейках, которую вы хотите перевести: ")
    val moneyTransferAmount = readLine()?.toUInt()?: return

    val amount = if (moneyTransferAmount * COMMISSION_FACTOR / 10_000_U <= COMMISSION_MIN) (moneyTransferAmount + COMMISSION_MIN)
    else (moneyTransferAmount + (moneyTransferAmount * COMMISSION_FACTOR / 10_000_U))

    println("Сумма перевода $moneyTransferAmount с комиссией ${amount - moneyTransferAmount} составит: = $amount копеек")
}