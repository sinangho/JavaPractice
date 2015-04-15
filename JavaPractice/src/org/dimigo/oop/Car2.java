package org.dimigo.oop;

public class Car2 {
    
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;
	    
	public Car2(){
	    	// 기본 생성자 --> 아무것도 안넘겨줄때를 위해
	    }
	    
	    public Car2(String newCompany, String newmodel, String newColor, int newMaxSpeed, int newPrice){
	    	company = newCompany;
	    	model = newmodel;
	    	color = newColor;
	    	maxSpeed = newMaxSpeed;
	    	price = newPrice;
	    	// 초기값 받아오기 위해서
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