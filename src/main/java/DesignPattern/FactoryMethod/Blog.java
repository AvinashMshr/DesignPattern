package DesignPattern.FactoryMethod;

public class Blog extends Website {

	@Override
	public void create() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new Comment());
		pages.add(new ContactPage());

	}

}
