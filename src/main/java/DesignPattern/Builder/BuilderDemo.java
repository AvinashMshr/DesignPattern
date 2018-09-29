package DesignPattern.Builder;


public class BuilderDemo {
	public static void main(String... arg) {

		LunchOrder lunch = new LunchOrder.Builder().bread("wheat")
				.condiment("leuttece")
				.meat("chicken").build();
		
		System.out.println(lunch.getBread());
		System.out.println(lunch.getCondiment());
		System.out.println(lunch.getDressing());
		System.out.println(lunch.getMeat());
		
		System.out.println(System.getProperty("java.runtime.version"));
	}

}
