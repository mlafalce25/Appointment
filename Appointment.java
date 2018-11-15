
public abstract class Appointment implements Comparable {
		
		int month;
		int day;
		int year;
		
		public boolean abstract occursOn(int m, int d, int y){
			if( (m == month) && (d == day) && (y == year) ){
				return true;
			}
			else{
				return false;
			}
			
		}
		
		public  abstract  slip(int n){
			
		}
}
