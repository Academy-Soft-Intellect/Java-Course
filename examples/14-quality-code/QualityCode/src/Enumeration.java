public class Enumeration {

	 Day day;
	    
    public Enumeration(Day day) {
        this.day = day;
    }
	
	  public void tellItLikeItIs() {
	        switch (day) {
	            case MONDAY:
	                System.out.println("Mondays are bad.");
	                break;
	                    
	            case FRIDAY:
	                System.out.println("Fridays are better.");
	                break;
	                         
	            case SATURDAY: case SUNDAY:
	                System.out.println("Weekends are best.");
	                break;
	                        
	            default:
	                System.out.println("Midweek days are so-so.");
	                break;
	        }
	    }
	  public static void main(String[] args) {
		  	Enumeration firstDay = new Enumeration(Day.MONDAY);
	        firstDay.tellItLikeItIs();
	        Enumeration thirdDay = new Enumeration(Day.WEDNESDAY);
	        thirdDay.tellItLikeItIs();
	        Enumeration fifthDay = new Enumeration(Day.FRIDAY);
	        fifthDay.tellItLikeItIs();
	        Enumeration sixthDay = new Enumeration(Day.SATURDAY);
	        sixthDay.tellItLikeItIs();
	        Enumeration seventhDay = new Enumeration(Day.SUNDAY);
	        seventhDay.tellItLikeItIs();
	        
	    }

}
