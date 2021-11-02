package interfaces;

public class CustomerManager {
	
	
	private Logger[] loggers;  //we write the private variable to whatever we depend on
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	/*----------DEPENDENCY INJECTION------------*/
	//we have 2 types of Couple :
	//1-Loosly Coupled  (The following databaselogger is an example.)
	//2-Tightly Coupled
	
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi: "+customer.getFirstName());
				
		Utils.runLoggers(loggers, customer.getFirstName());
		
//		for(Logger logger:loggers) {
//			logger.log(customer.getFirstName());
//		}

//		This is example of Loosly Coupled:				
//		DatabaseLogger logger =new DatabaseLogger();
//		logger.log(customer.getFirstName()+"veri tabanına loglandı");
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi: "+ customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
//		for(Logger logger:loggers) {
//			logger.log(customer.getFirstName());
//		}
//		This is example of Loosly Coupled:
//		DatabaseLogger logger =new DatabaseLogger();
//		logger.log(customer.getFirstName()+"veri tabanından silindi");
	}
}
