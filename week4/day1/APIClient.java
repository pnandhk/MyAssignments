package week4.day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		
		System.out.println(endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,String requestStatus) {
		
		System.out.println(endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}

	public static void main(String[] args) {

		APIClient object = new APIClient();
		object.sendRequest("Endpoint created");
		object.sendRequest("Endpoint created", "Request Body Added", "Request Status is Pass");

		
	}

}
