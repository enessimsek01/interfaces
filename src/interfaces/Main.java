package interfaces;

public class Main {
	public static void main(String[] args) {
		
		Logger[] loggers= {new SmsLogger(),new EmailLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		
		Customer enes=new Customer(1,"Enes","Şimşek");
		
		customerManager.add(enes);
	}

}
