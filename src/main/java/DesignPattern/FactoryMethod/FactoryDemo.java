package DesignPattern.FactoryMethod;

public class FactoryDemo {
	public static void main(String... arg) {
		Website site = WebsiteFactory.getWebsite(1);
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebsite(2);
		System.out.println(site.getPages().toString());
	}

}
