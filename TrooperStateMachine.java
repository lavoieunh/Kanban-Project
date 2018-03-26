package endor;


class TrooperStateMachine { TrooperState TrooperDescribeItem, TrooperInventoryItem, TrooperEquipItem, TrooperDropItem;
	TrooperState state = null; 

public TrooperStateMachine(Boolean hasItem ) { 
    TrooperDescribeItem = new TrooperDescribeItemState(this); //1 
	TrooperInventoryItem = new TrooperInventoryItemState(this);  //2
	//TrooperEquipItem = new TrooperEquipItemState(this); 
	//TrooperUseItem = new TrooperUseItemState(this); 
	//TrooperItemState = new TrooperItemState(this);
	TrooperEquipItem = new TrooperEquipItemState(this); //3
	TrooperDropItem = new TrooperDropItemState(this); //4
	if (hasItem) state = TrooperDescribeItem;
	else state = TrooperInventoryItem;

}


public void display_trooper_state() {state.trooper_state();} 

public void setState(TrooperState s) {this.state = s; }

//public void trooperHasItem() {state.trooperHasItem(); state.trooper_state();}
//public String trooperItemCurrentState() { return null; } 
public void trooperDescribe() {state.trooperDescribeItem(); state.trooper_state();} 
public void trooperEquipping() {state.trooperEquipping(); state.trooper_state();}
//public void trooperConsuming() {state.trooperConsuming(); state.trooper_state();}
public void trooperDropItem() {state.trooperDropItem(); state.trooper_state();}
public void trooperInventoryItem() {state.trooperInventoryItem(); state.trooper_state();}




}

