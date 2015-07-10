package observer;

public class mainObsever {
	public static void main(String[] args) {
		BolsadeValores bolsaBovespa = new BolsadeValores();
		ApplePrice apple = new ApplePrice(1000);
		
		apple.register(bolsaBovespa);	
		
		//Apple Notifica seu preço assim q registrada.
		apple.notifyObserver();
		//Apple notifica seu preço depois de modificada
		apple.setPrice(2000);	
		
		///////////
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
				try {
					apple.setPrice((int)(Math.random()*1001));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		}).start();
		
		/////////////
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
				apple.notifyObserver();
			}
				}
		}).start();
		
	}
	
}
