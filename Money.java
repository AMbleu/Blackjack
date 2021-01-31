public class Money{

  public void loseMoney(Player loser, int moneyLost){
    if(loser.playerCurrentBalance < moneyLost){
      int balanceOwed = moneyLost - loser.playerCurrentBalance;
      System.out.println("\n*Ovedrawn* \nOwe: $" + balanceOwed);
    }else{
      loser.playerCurrentBalance -= moneyLost;
    }
  }


  public void gainMoney(Player winner, int moneyGained){
     winner.playerCurrentBalance += moneyGained;
  }
}
