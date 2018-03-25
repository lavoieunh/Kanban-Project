package endor;


class TrooperStateMachine {
    TrooperStateMachine TrooperInventoryItem, TrooperDescribeItem, TrooperEquipItem, TrooperUseItem, TrooperNoItem, TrooperConsumeItem, TrooperHasItem;
	TrooperStateMachine state = null; 

public TrooperStateMachine(Boolean hasItem ) { 
    TrooperInventoryItem = new TrooperInventoryItemState(this);
	TrooperDescribeItem = new TrooperDescribeItemState(this);  
	TrooperEquipItem = new TrooperEquipItemState(this); 
	TrooperUseItem = new TrooperUseItemState(this); 
	TrooperNoItem = new TrooperNoItemState(this);
	TrooperConsumeItem = new TrooperConsumeItemState(this);
	TrooperHasItem = new TrooperHasItemState(this);
	if (hasItem) state = TrooperHasItem; 
	else state = TrooperInventoryItem;

}


public void trooper_state() {state.trooper_state();} 

public void setState(TrooperStateMachine s) {this.state = s; }

public void trooperHasItem() {state.trooperHasItem(); state.trooper_state();}
public void trooperNoItem() {state.trooperNoItem(); state.trooper_state();} 
public void trooperDescribe() {state.trooperDescribe(); state.trooper_state();} 
public void trooperEquipping() {state.trooperEquipping(); state.trooper_state();}
public void trooperConsuming() {state.trooperConsuming(); state.trooper_state();}
public void trooperUseItem() {state.trooperConsuming(); state.trooper_state();}


}

