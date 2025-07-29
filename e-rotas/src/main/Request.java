package main;

public class Request {

	private int id;
	private String status;
	//DateTime of Request
	
	
	public Request() {

	}

	public void confirmTrip(String status) {
		this.setStatus(status);
		status = "Trip Accepted!";
		// starts a Ride

	}

	public void declineTrip(String status) {
		this.setStatus(status);
		status = "Trip Declined!";
		// notify Driver
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
