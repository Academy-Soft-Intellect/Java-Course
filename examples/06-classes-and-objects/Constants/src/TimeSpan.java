public class TimeSpan {
	
	private static final int HOURS_PER_DAY = 24;
	private static final int MINUTES_PER_HOUR = 60;
	
	private int days;
	
	public TimeSpan(){
		this.days = 0;
	}
	
	public TimeSpan(int days){
		this();
		
		setDays(days);
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		if(days >= 0){
			this.days = days;
		}
	}
	
	public int calculateHours(){
		int hours = this.days * HOURS_PER_DAY;
		return hours;
	}
	
	public int calculateMinutes(){
		int minutes = this.days * HOURS_PER_DAY * MINUTES_PER_HOUR;
		return minutes;
	}
}
