package endor;

class TrooperDropItemState implements TrooperState {

		TrooperStateMachine tsm;
		
		public TrooperDropItemState(TrooperStateMachine tsmStateMachine) {
				tsm = tsmStateMachine;
				
		}
		
		public void trooperDescribeItem() {tsm.setState(tsm.TrooperDropItem);}
		
		public void trooperInventoryItem() {tsm.setState(tsm.TrooperDropItem);}
		
		public void trooperDropItem() {tsm.setState(tsm.TrooperEquipItem);}
		
		@Override
		public void trooperDescribeItem() {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void trooperInventoryItem() {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void trooperEquipItem() {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void trooper_state() {
			// TODO Auto-generated method stub
		}
}
