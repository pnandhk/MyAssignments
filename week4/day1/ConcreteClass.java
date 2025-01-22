package week4.day1;

public class ConcreteClass implements DatabaseConnection {
	

	public static void main(String[] args) {

		ConcreteClass object = new ConcreteClass();
		object.connect();
		object.disconnect();
		object.executeUpdate();
		
	}

	@Override
	public void connect() {

		System.out.println("Database Connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Database Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Database Updated");
		
	}

}
