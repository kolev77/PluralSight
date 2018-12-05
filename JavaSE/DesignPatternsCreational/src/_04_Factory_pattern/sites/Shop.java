package _04_Factory_pattern.sites;

import _04_Factory_pattern.pages.CartPage;
import _04_Factory_pattern.pages.ItemPage;
import _04_Factory_pattern.pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
