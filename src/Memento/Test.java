package Memento;

public class Test {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		originator.setState("FIRST");
		caretaker.saveMemento(originator.createMemento());
		
		originator.setState("SEC");
		originator.restoreMemento(caretaker.retrieveMemento());
		
		System.out.println(originator.getState());
	}

}
