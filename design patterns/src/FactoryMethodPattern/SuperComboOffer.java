package FactoryMethodPattern;

public class SuperComboOffer extends ComboOfferFactory{
	
	
    @Override
    protected void createComboOffer(){
    	
    	
        comboItem.add(new ChickenFriedRice());
        
        comboItem.add(new ChilliChicken()); 
        
        comboItem.add(new BigBossBurger());
        
        comboItem.add(new FrenchFries());
        
    } 

}
