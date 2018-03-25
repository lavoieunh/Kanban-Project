package endor;

public class TrooperInventoryState extends TrooperState {

	TrooperStateMachine tsm; 
	
	public TrooperInventoryState(TrooperStateMachine tsmStateMachine) { 
		tsm = tsmStateMachine;

	}
	
	public void trooperDescribe() {tsm.setState(tsm.TrooperDescribeItem);}
	
	public void trooperEquipping() {tsm.setState(tsm.TrooperEquipItem);}

	public void trooperUseItem() {tsm.setState(tsm.TrooperUseItem);}

	public void trooperConsuming() {tsm.setState(tsm.TrooperConsumeItem); }

	public void trooperNoItem() {tsm.setState(tsm.TrooperNoItem);}

    public void trooperHasItem(){ tsm.setState(tsm.TrooperHasItem);} 
	
	

}
