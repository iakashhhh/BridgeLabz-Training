package ambulanceroute;

public class ConnectingUnits {
	
	private Unit head;
	
	public void addUnits(String name, boolean isAvailable) {
		Unit newUnit = new Unit(name, isAvailable);
		if(head == null) {
			head = newUnit;
			newUnit.next=head;
			return;
		} 
			Unit temp = head;
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = newUnit;
			newUnit.next = head;
		
	}
	
	// display route
	public void displayRoute() {
		
		if(head == null) {
			System.out.println("No units available");
		}
		
		Unit temp = head;
		System.out.print("Hospital Route: ");
		
		do {
			System.out.print(temp.name + " -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("Back to Emergency");
		
	}
	
	// find available route
	public void findAvailableUnit() {
		
		if(head == null) {
			System.out.println("No unit is available ");
			return;
		}
		
		Unit temp = head;
		do {
			if (temp.isAvailable) {
				System.out.println("Patient admitted in " + temp.name);
				return;
			}
			temp = temp.next;
		} while (temp != head);
		
		
	}
}
