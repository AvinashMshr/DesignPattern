package DesignPattern.FactoryMethod;

public class WebsiteFactory {
	
	public static Website getWebsite(int type) {
		switch (type) {
		case 1: {
			return new Blog();
		}
		case 2: {
			return new Blog();
		}
		}
		return null;
	}

}
