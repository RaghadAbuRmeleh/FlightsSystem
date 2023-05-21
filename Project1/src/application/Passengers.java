package application;

import java.util.Date;

public class Passengers implements Comparable<Passengers> {
	private int flightnum;
	private int ticketnum;
	private String fullName;
	private String passportNum;
	private String nationality;
	private Date birthdate;
	
	public Passengers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passengers(int flightnum, int ticketnum, String fullName, String passportNum, String nationality,
			Date birthdate) {
		super();
		this.flightnum = flightnum;
		this.ticketnum = ticketnum;
		this.fullName = fullName;
		this.passportNum = passportNum;
		this.nationality = nationality;
		this.birthdate = birthdate;
	}

	public int getTicketnum() {
		return ticketnum;
	}
	public void setTicketnum(int ticketnum) {
		this.ticketnum = ticketnum;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "Ticket Number = "+ ticketnum + ", Full Name = " + fullName + ", Passport Number = " + passportNum
				+ ", Nationality = " + nationality + ", Birthdate = " + birthdate + ".";
	}
	public int getFlightnum() {
		return flightnum;
	}
	public void setFlightnum(int flightnum) {
		this.flightnum = flightnum;
	}

	@Override
	public int compareTo(Passengers o) {
		if(fullName.compareTo(o.fullName) < 0)
			return 1 ;
		else if(fullName.compareTo(o.fullName) > 0)
			return -1 ;
		else
			return 0;
	}
	
	
}
