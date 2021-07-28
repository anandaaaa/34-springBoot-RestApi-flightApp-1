package in.anand.response;

import java.util.List;

public class FlightApiResponse {
	
	private List<FlightDetails> flights;

	public List<FlightDetails> getFlights() {
		return flights;
	}

	public void setFlights(List<FlightDetails> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "FlightApiResponse [flights=" + flights + "]";
	}
	

}
