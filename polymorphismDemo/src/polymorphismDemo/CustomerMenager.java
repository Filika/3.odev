package polymorphismDemo;

public class CustomerMenager {
	private BaseLogger logger;

	public CustomerMenager ( BaseLogger logger) {
		this.logger = logger;
		
	}

	public void Add() {
		System.out.println("Müşteri eklendi");
		this.logger.Log("log mesajı");

	}
}
