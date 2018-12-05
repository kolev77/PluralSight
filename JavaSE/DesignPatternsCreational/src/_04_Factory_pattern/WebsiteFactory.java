package _04_Factory_pattern;

import _04_Factory_pattern.sites.Blog;
import _04_Factory_pattern.sites.Shop;
import _04_Factory_pattern.sites.Website;
import _04_Factory_pattern.sites.WebsiteType;

public class WebsiteFactory {

	public static Website getWebsite(WebsiteType siteType) {
		switch(siteType) {
			case BLOG : {
				return new Blog();
			}
		
			case SHOP : {
				return new Shop();
			}
			
			default : {
				return null;
			}
 		}
	}
	
}
