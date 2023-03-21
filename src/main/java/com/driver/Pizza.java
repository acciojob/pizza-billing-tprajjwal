package com.driver;

public class Pizza {
    private int price;
    private int cheesePrice;
    private int toppingPrice;
    private int paperBagPrice;
    private String bill;
    private boolean isVeg;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isPaperBagAdded;
    private boolean isBillCreated;
    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        isCheeseAdded=false;
        isToppingAdded=false;
        isPaperBagAdded=false;
        isBillCreated=false;
        bill="";

        if(isVeg){
            this.price=300;
            this.toppingPrice=70;
        }
        else {
            this.price=400;
            this.toppingPrice=120;
        }

        this.bill+="Base Price of Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            this.price+=+80;
            isCheeseAdded=true;
        }

    }
    public void addExtraToppings(){
        if(!isToppingAdded){
            this.price+=this.toppingPrice;
            isToppingAdded=true;
        }
    }
    public void addTakeaway(){
        if (!isPaperBagAdded) {

            this.price+=20;
            isPaperBagAdded=true;
        }
    }
    public String getBill(){
        if(!isBillCreated) {
            if (isCheeseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isToppingAdded) {
                this.bill += "Extra Toppings Added: " + this.toppingPrice + "\n";
            }
            if (isPaperBagAdded) {
                this.bill += "Paperbag Added: 20"+"\n";
            }
            this.bill += "Total Price: "+this.price +"\n";
            isBillCreated = true;
            return this.bill;
        }
        return this.bill;
    }



}
