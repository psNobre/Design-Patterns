package observer;

public interface iSubjectObservable {
	
	public void register(iObserver observer);
	public void unregister(iObserver observer);
	public void notifyObserver();
}
