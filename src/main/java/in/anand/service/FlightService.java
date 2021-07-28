package in.anand.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.anand.response.FlightApiResponse;
import in.anand.response.FlightDetails;

@Service
public class FlightService {
	
	public String getFlightDeatils()
	{
		String apiurl="http://mu.mulesoft-training.com/essentials/united/flights/";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiurl, String.class);
			int statuscode=responseEntity.getStatusCodeValue();
		if(statuscode==200)
		{
			String body=responseEntity.getBody();
			return body;
		}
		return null;
	}

	
	public List<FlightDetails> getFullFlightDeatils()
	{
		String apiurl="http://mu.mulesoft-training.com/essentials/united/flights/";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<FlightApiResponse> responseEntity = restTemplate.getForEntity(apiurl, FlightApiResponse.class);
			int statuscode=responseEntity.getStatusCodeValue();
		if(statuscode==200)
		{
			FlightApiResponse body=responseEntity.getBody();
			System.out.println(body.getFlights());
			return body.getFlights();
		}
		return null;
	}

	
}
