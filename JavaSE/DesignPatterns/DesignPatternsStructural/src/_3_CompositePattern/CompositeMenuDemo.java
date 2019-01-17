package _3_CompositePattern;


import java.util.ArrayList;
import java.util.List;

public class CompositeMenuDemo {

	public static void main(String[] args) {
		// Main menu
		Menu mainMenu = new Menu("Main", "/main");

		// Sub-menu
		Menu claimsSubMenu = new Menu("Claims", "/claims");

		// Menu-items
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

		mainMenu.add(claimsSubMenu);
		mainMenu.add(safetyMenuItem);
		claimsSubMenu.add(personalClaimsMenu);

		System.out.println(mainMenu.toString());
	}
}
