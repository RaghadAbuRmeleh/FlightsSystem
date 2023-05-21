package application;

public class Flights implements Comparable<Flights>{
	
	
	private int flightnum;
	private String airlineName;
	private String source;
	private String destination;
	private int capacity;
	private LinkedList<Passengers> passengerList = new LinkedList<Passengers>();
	
	public Flights() {
		super();
	}

	public Flights(int flightnum, String airlineName, String source, String destination, int capacity) {
		super();
		this.flightnum = flightnum;
		this.airlineName = airlineName;
		this.source = source;
		this.destination = destination;
		this.capacity = capacity;
	}

	public int getFlightnum() {
		return flightnum;
	}

	public void setFlightnum(int flightnum) {
		this.flightnum = flightnum;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	
	
	@Override
	public String toString() {
		return "Flight Number = " + flightnum + ", Airline Name = " + airlineName + ", Source = " + source
				+ ", Destination = " + destination + ", Capacity = " + capacity + ".";
	}

	@Override
	public int compareTo(Flights o) {
		if(flightnum > o.flightnum)
			return 1;
		else if(flightnum < o.flightnum)
			return -1;
		else
			return 0;
	}

	public LinkedList<Passengers> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(LinkedList<Passengers> passengerList) {
		this.passengerList = passengerList;
	}
	
	
}
