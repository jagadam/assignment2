public class Car {

		int gear = 1;
		int location;
		int speed = 0;
		final int DESTINATION = 250;
		
		void reverseGear(){
			gear = -1;
		}
		void gearUp(){ 
			if (gear == 6){
				System.out.println("ERROR: Car is in highest gear, cannot increase");
			
			}else if (gear == -1){
				gear = gear + 2;
			
			}else{ 
				gear = gear + 1;
			}
			
		}
		void gearDown(){ 
			if (gear == -1){
				System.out.println("ERROR: Car is in lowest gear, cannot decrease");
			
			}else if (gear == 1){
				gear = gear - 2;
			
			}else{ 
				gear = gear - 1;
			}
			
		}
		
		int reportGear(){
			return gear;
		}
		
		int reportLocation(){
			return location;
		}
		
		int reportRemaining(){
			return DESTINATION - location;
		}
	
		
		void moveByTime(int time){
			if (time<0){
				System.out.println("ERROR: time should be positive.");
			}else if (time>0){
				speed = gear*20;
				int delta = speed*time;
				location = location+delta;
			}
		}
		
		boolean isArrived()	{
			if (location >= DESTINATION){
				return true;
			}
			else{
				return false;
			}
		}
		
	

}