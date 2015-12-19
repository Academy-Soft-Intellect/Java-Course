public class User {
	
	private String username;
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String password) {
		super();
		setUsername(username);
		setPassword(password);
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if (username.length() >= 5 && username.contains("@") && username.contains(".")) {
			this.username = username;
		}
		else{
			throw new IllegalArgumentException("Invalid username");
		}
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (password.length() >= 6 && containDigit2(password)) {
			this.password = password;
		}		else{
			throw new IllegalArgumentException("Invalid username");
		}
		
	}
	
	private boolean charContain(String str, char c){
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				return true;
			}
		}
				
		return false;
	}
	
	private boolean containDigit(String str){
			
			for (int i = 0; i < str.length(); i++) {
				switch (str.charAt(i)) {
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case '0':
					return true;
	
				}
			}
					
			return false;
	}

	private boolean containDigit2(String str){
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {	
			
				return true;
			}
		}
				
		return false;
	}
}

