package browserbuddy;

public class BrowserTab {
	private Page current;
	
	public void visitPage(String url) {
		Page newPage = new Page(url);
		if(current != null) {
			newPage.prev = current;
			current.next = newPage;
		}
		current = newPage;
		System.out.println("Visited " + url);
	}
	
	
	public void backPage() {
		// check kro koi page pehle khula bhi h ya nhi
		if(current == null || current.prev == null) {
			System.out.println("No previous page found");
		}
		current = current.prev;
		System.out.println("Back to: " + current.url);
	}
	
	
	public void forwardPage() {
		// aage koi page hai hi nhi to kya khologe
		if(current == null || current.next==null) {
			System.out.println("No forward page found ");
		}
		
		current = current.next;
		System.out.println("Forward to: " + current.url);
	}
	
	public String getCurrentPage() {
		return current != null ? current.url : null;
	}

}
