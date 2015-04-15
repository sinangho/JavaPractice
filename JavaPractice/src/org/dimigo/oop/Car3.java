package org.dimigo.oop;

public class Car3 {
    
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;
	    
	public Car3(){
	    	// 기본 생성자 --> 아무것도 안넘겨줄때를 위해
	    }
	    
	    public Car3(String company, String model, String color, int maxSpeed, int price){
	    	this.company = company;
	    	this.model = model;
	    	this.color = color;
	    	this.maxSpeed = maxSpeed;
	    	this.price = price;
	    }
	    public Car3(String company, String model, String color, int maxSpeed){
	    	this(company, model, color, maxSpeed, 0);
	    }
	    public Car3(String company, String model, String color){
	    	this(company, model, color, 0, 0);
	    }

    public String getCompany() {
        
        return company;
    }

    public String getModel() {
        // TODO implement here
        return model;
    }

    public String getColor() {
        // TODO implement here
        return color;
    }
    
    public int getMaxSpeed() {
        // TODO implement here
        return maxSpeed;
    }

    public int getPrice() {
        // TODO implement here
        return price;
    }

}