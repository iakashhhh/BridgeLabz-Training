package browserbuddy;

public class Page {
	String url;
	Page next;
	Page prev;
	public Page(String url) {
		super();
		this.url = url;
		this.next = null;
		this.prev = null;
	}
	
	
}
