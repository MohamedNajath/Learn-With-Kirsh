package FactoryMethodPattern;

public class BasicComboOffer extends ComboOfferFactory{
	
	
    protected void createComboOffer(){
    	
        comboItem.add(new ChickenFriedRice());
        
        comboItem.add(new ChilliChicken());
        
    } 

}
