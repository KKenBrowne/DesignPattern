package Observer;

public class ConcreteObserver implements Observer {
	private String observerState;


	@Override
	public void update(String state) {
		observerState = state;
        System.out.println("×´Ì¬Îª£º"+observerState);
	}

}
