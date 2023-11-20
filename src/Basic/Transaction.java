package Basic;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int joibonus=100;
		int wallwtcash=2;
		int nooftrans=3;
		int tranfee=25;
		int itemcost=20;
		
		int userid=52;
		int walletbal=joibonus+(wallwtcash*nooftrans);
		
		walletbal-=tranfee;
		walletbal-=itemcost;
		
		System.out.println("Total walletbalance of rohit is:"+walletbal+"RS");
	}

}
