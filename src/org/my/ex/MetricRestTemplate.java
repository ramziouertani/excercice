package org.my.ex;

import java.util.HashMap;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MetricRestTemplate {
	 
	private static final String METRICS_ENDPOINT = "/metrics";	 	 
	private RestTemplate restTemplate;
	   
	private HashMap<String, Object> getMetrics(String uriBackend) throws Exception {	    
	   return this.restTemplate.getForObject(buildUrl(uriBackend), HashMap.class); 	
	}
	 
	private static String buildUrl(String backendUri) {
	   return backendUri + METRICS_ENDPOINT;
	}
}
