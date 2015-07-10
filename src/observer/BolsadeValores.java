package observer;

public class BolsadeValores implements iObserver {
	private double price;
	
	@Override
	public void update(double newPrice) {
		// TODO Auto-generated method stub
		this.price = newPrice;
		printPrice();
		
	}
	
	public void printPrice(){
		System.out.println("Apple novo price:"+price);
	}

}
