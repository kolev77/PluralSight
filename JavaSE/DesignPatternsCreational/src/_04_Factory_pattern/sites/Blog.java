package _04_Factory_pattern.sites;

import _04_Factory_pattern.pages.AboutPage;
import _04_Factory_pattern.pages.CommentPage;
import _04_Factory_pattern.pages.ContactPage;
import _04_Factory_pattern.pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
