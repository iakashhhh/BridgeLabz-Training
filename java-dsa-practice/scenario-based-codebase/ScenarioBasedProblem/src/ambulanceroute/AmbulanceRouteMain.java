package ambulanceroute;

public class AmbulanceRouteMain {
	public static void main(String[] args) {
	ConnectingUnits route = new ConnectingUnits();
	
	route.addUnits("Emergency", false);
    route.addUnits("Radiology", false);
    route.addUnits("Surgery", true);
    route.addUnits("ICU", false);
    
    route.displayRoute();

    route.findAvailableUnit();
	}
    
}
