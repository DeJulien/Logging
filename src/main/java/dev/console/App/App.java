package dev.console.App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService.AppService;



public class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) 
	{
		LOG.info("Bonjour Slf4J !");
		LOG.info("Implementation Logback");
		
		AppService appSer= new AppService();
		
		appSer.executer("test");
		
	}
	
}
