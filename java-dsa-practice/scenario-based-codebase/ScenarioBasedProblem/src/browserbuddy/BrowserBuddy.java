package browserbuddy;

import java.util.Stack;

public class BrowserBuddy {
	
	private BrowserTab currentTab;
	private Stack<BrowserTab> closedTabs = new Stack<>(); 
	
	public BrowserBuddy() {
		currentTab = new BrowserTab();
	}
	
	public void visitPage(String url) {
		currentTab.visitPage(url);
	}
	
	public void backPage() {
		currentTab.backPage();
	}
	
	public void forwardPage() {
		currentTab.forwardPage();
	}
	
	public void closeTab() {
		closedTabs.push(currentTab);
		System.out.println("Tab clossed");
		currentTab = new BrowserTab();
	}
	
	public void restoreTab() {
		if(closedTabs.isEmpty()) {
			System.out.println("No tabs to restore");
		}
		currentTab = closedTabs.pop();
		System.out.println("Tab restored, current page: " + currentTab.getCurrentPage());
	}
}
