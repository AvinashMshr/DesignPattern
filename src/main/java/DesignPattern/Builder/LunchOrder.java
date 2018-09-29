package DesignPattern.Builder;

public class LunchOrder {

	public static class Builder{
		private String bread;
		private String condiment;
		private String dressing;
		private String meat;
		
		public Builder() {
			
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		public Builder condiment(String condiment) {
			this.condiment = condiment;
			return this;
		}
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
		public Builder dressing(String dressing) {
			this.bread = dressing;
			return this;
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
	}
	
	
	private String bread;
	private String condiment;
	private String dressing;
	private String meat;
	
	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiment = builder.condiment;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}
	
	public String getBread() {
		return bread;
	}
	public String getCondiment() {
		return condiment;
	}
	public String getDressing() {
		return dressing;
	}
	public String getMeat() {
		return meat;
	}
}
