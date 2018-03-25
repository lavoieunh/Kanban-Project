package endor;

class TrooperDescribeItemState extends TrooperState{
	
		
		TrooperStateMachine tsm; 
		
		public TrooperDescribeItemState(TrooperStateMachine minStateMachine) { 
			tsm = minStateMachine;

		}
		
		public void trooperDescribe() {tsm.setState(tsm.TrooperDescribeItem);}
		
		public void trooperEquipping() {tsm.setState(tsm.TrooperEquipItem);}

		public void trooperUseItem() {tsm.setState(tsm.TrooperUseItem);}

		public void trooperConsuming() {tsm.setState(tsm.TrooperConsumeItem); }

		public void trooperNoItem() {tsm.setState(tsm.TrooperNoItem);}

        public void trooperHasItem(){ tsm.setState(tsm.TrooperHasItem);} 
		
}
