package DesignPattern.FactoryMethod;

public class Shop extends Website {

	@Override
	public void create() {
		pages.add(new CartPage());
		pages.add(new Comment());

	}

}
