

import exceptions.IllegalAmountException
import exceptions.NoSufficientFundsException

class Account(initialBalance: Double, val uid: Int = Bank getUniqueId) {
  /* 
   * a class Account with a constructor which takes a variable double called initialBalance and a constant int called Uid,
   * which it gets from the Bank
   */
  var balance:Double = initialBalance

  def withdraw(amount: Double): Unit = { //Implement
    if(amount < 0){
      throw new IllegalAmountException
    }else if(balance - amount < 0){
      throw new NoSufficientFundsException
    } else {
      balance = balance - amount
    }
  }
  def deposit(amount: Double): Unit = { //Implement
    if(amount < 0){
      throw new IllegalAmountException
    } else {
    	balance = balance + amount
    }
  }
  
  def getBalanceAmount: Double = { //Implement
    balance
  }
}