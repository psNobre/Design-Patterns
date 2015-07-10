package observer;

import java.util.ArrayList;

public class ApplePrice implements iSubjectObservable {
	private ArrayList<iObserver> observers;
	private double price;
	
	public ApplePrice(double price) {
		// TODO Auto-generated constructor stub
		this.price = price;
		observers = new ArrayList<iObserver>();
	}
	
	public void setPrice(double price) {
		this.price = price;
		notifyObserver();
	}
	
	@Override
	public void register(iObserver observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}

	@Override
	public void unregister(iObserver observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (iObserver iObserver : observers) {
			iObserver.update(this.price);
		}
		
	}

}
