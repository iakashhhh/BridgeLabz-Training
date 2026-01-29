package com.lambdaexpressions.smarthomelighting;

public class SmartHome {
	
	public static void main(String[] args) {
		
		//LightController controller = new LightController();
		
		// motion detected
		LightAction motionDetected = () -> System.out.println("Lights ON at 100% brightness");
		
		//Night time
		LightAction nightTime = () -> System.out.println("Dim lights ON at 30% brightness");
		
		//voice command
		LightAction voiceCommand = () ->  System.out.println("Lights set to BLUE mood lighting");
		
		// Execute dynamically
		executeLightAction(motionDetected);
        nightTime.activate();
        voiceCommand.activate();
		
	}
     static void executeLightAction(LightAction action) {
         System.out.println("Checking power supply...");
         System.out.println("Logging trigger...");
         
         action.activate();
         
         System.out.println("Light action completed.");
        
	}
}
