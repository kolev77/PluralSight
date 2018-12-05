package _04_Factory_pattern;

import _04_Factory_pattern.sites.Website;
import _04_Factory_pattern.sites.WebsiteType;

public class FactoryDemo {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println(site.getPages());
	}

}
