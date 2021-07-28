package in.anand.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.anand.response.FlightDetails;
import in.anand.service.FlightService;

@RestController
public class MyFlightRestController {
	@Autowired	
	private FlightService service;
	private String data="";
	
	@GetMapping("/flightDetails")
	public String flightDetails() {
		
		//String flightDeatils = service.getFlightDeatils();
		List<FlightDetails> flightDeatils = service.getFullFlightDeatils();
		Iterator<FlightDetails> iterator = flightDeatils.listIterator();
		int i=1;
		while(iterator.hasNext())
		{
			data=data+"Train "+(i++)+":"+iterator.next()+"\n\n";
		}
		System.out.println(data);

		return data;
	}
}
