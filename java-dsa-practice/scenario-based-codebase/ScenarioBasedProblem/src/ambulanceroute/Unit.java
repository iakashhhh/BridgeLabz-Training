
// Node = Unit

package ambulanceroute;

public class Unit {
	String name;
	boolean isAvailable;
	Unit next;
	public Unit(String name, boolean isAvailable) {
		this.name = name;
		this.isAvailable = isAvailable;
		this.next = null;
	}
	
	
}
