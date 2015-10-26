

object Bank {
  
  private var idCounter: Int = 0
  
  def transaction(from: Account, to: Account, amount: Double): Unit = { //Implement
    from.withdraw(amount)
    to.deposit(amount)
  }
  def getUniqueId: Int = {
    idCounter += 1
    idCounter
  }
  
}