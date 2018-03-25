package endor;

public abstract class TrooperState {

		
	abstract void trooperHasItem(); // Stored in backpack or on belt.
	abstract void trooperNoItem(); // What you are currently looking at...
	abstract void trooperDescribe(); // Is in your hand.
	abstract void trooperEquipping(); //Item is activated
	abstract void trooperConsuming();
	abstract void trooperUseItem();
				
	}

