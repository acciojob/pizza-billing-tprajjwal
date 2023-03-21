package com.driver;

public class Pizza {
    private int basePrice;
    private int cheesePrice;
    private int toppingPrice;
    private int paperBagPrice;
    private String bill;
    private int totalPrice;
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

        if(isVeg){
            basePrice=300;
            toppingPrice=70;
        }
        else {
            basePrice=400;
            toppingPrice=120;
        }
        bill="";
        bill+="Base Price of Pizza: "+this.basePrice+"\n";
    }

    public int getBasePrice(){
        return this.basePrice;
    }

    public void setCheeseAdded(){
        if(!isCheeseAdded){
            this.basePrice+=+80;
            this.isCheeseAdded=true;
        }

    }
    public void setToppingAdded(){
        if(!isToppingAdded){
            this.basePrice+=this.toppingPrice;
            isToppingAdded=true;
        }
    }
    public void setPaperBagAdded(){
        if (!isPaperBagAdded) {

            this.basePrice+=20;
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
            this.bill += "Total Price: "+this.basePrice +"\n";
            isBillCreated = true;
            return this.bill;
        }
        return this.bill;
    }



}
