package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private float price;
    private static final int DISCOUNT=5;

    public FurnitureItem(){

        furnitureCode=0;
        furnitureType="";
        gradeOfFurniture="";
        furnitureUsage="";
        price=0;

    }
    public int getFurnitureCode(){
        return furnitureCode;
    }
    public void setFurnitureCode(int furnitureCode){
        this.furnitureCode=furnitureCode;
    }
    public String getFurnitureType(){
        return furnitureType;
    }
    public void setFurnitureType(String furnitureType){
        this.furnitureType=furnitureType;
    }
    public String getGradeOfFurniture(){
        return gradeOfFurniture;
    }
    public void setGradeOfFurniture(String gradeOfFurniture){
        this.gradeOfFurniture=gradeOfFurniture;
    }
    public String getFurnitureUsage(){
        return furnitureUsage;
    }
    public void setFurnitureUsage(String furnitureUsage){
        this.furnitureUsage=furnitureUsage;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public float calculateDiscount(){
        if (gradeOfFurniture.equals("grade1")&&furnitureUsage.equals("Outdoor")){
            return getPrice()-(getPrice()*DISCOUNT)/100;
        }
        else {
            return price;
        }


    }



}
