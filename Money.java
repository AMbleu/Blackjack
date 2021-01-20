public class Money{
  int currentBalance = 0;

  public void setBalance(int amount){
    this.currentBalance = amount;
  }

  public void loseMoney(int moneyLost){
    if(currentBalance < moneyLost){
      int balanceOwed = moneyLost - currentBalance;
      System.out.println("\n*Ovedrawn* \nOwe: $" + balanceOwed);
    }
    currentBalance -= moneyLost;
  }
  public void gainMoney(int moneyGained){
    currentBalance += moneyGained;
  }
}
