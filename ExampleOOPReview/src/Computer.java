/**
 * This is class for computer objects
 * @author self
 * @version 20220907
 */
public abstract class Computer {
	
	public static final int CURRENT_YEAR = 2022;
	
	//this would be allowed in interfaces
	// public void setValue(int x);
	// to do something in abstract classes. . .
	// public void setValue(int x);
	
	public Computer() throws Exception {
		setId("00000");
		setIsLaptop(true);
		setUpdateYear(2022);
	}
	
	public Computer(String newId, boolean newIsLaptop, int newUpdateYear) throws Exception {
		setId(newId);
		setIsLaptop(newIsLaptop);
		setUpdateYear(newUpdateYear);
	}
	
	/** The unique identifier of the computer */
	private String id;
	
	/** Set to true if laptop, false if desktop*/
	private boolean isLaptop;
	
	/** The last time this computer was updated */
	protected int updateYear;
	
	/**
	 * Setter for the ID
	 * @param newId The new id of computer
	 * @throws Exception id must be at least 5 digits
	 * 
	 */
	public void setId(String newId) throws Exception {

		if (newId.length() != 5)
			throw new Exception("The length must be exactly 5 digits");
		// Check first char separately
		if (newId.charAt(0) < '1' || newId.charAt(0) > '9');
		// can change int i = 1; dont have to but will speed up code 		for (int i = 0; i < newId.length(); i++) {
		if (newId.charAt(i) < '0' || newId.charAt(i) > '9')
			throw new Exception("The ID must only contain digits");
	}

	id = newId;

	
	/**
	 * Getter for ID
	 * @return The ID for this computer
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * 
	 * @return boolean value: true-for laptop, false-not a laptop
	 */
	public boolean isLaptop() {
		return isLaptop;
	}
	
	/**
	 * Setter for Laptop
	 * @param isLaptop for each laptop
	 */
	public void setIsLaptop(boolean isLaptop) {
		this.isLaptop = isLaptop;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getUpdateYear() {
		
		return updateYear;
	}
	
	/**
	 * This is setter for updateYear
	 * @param updateYear, year computer was updated
	 * @throws Exception if year is less than 2000
	 */
	public void setUpdateYear(int updateYear) throws Exception {
		
		if (updateYear < 2000)
			throw new Exception("The update year must be at least 2000");
		if (updateYear > CURRENT_YEAR)
			throw new Exception("The update year must not be greater than " + CURRENT_YEAR);
		
		this.updateYear = updateYear;
	}
	
	public String toString() {
		String s = "";
		s += "ID: " + id;
		s = s + " Update year: " + updateYear + "\n";
		if (isLaptop)
			s = s + "This is a laptop";
		else
			s = s + "This is a desktop";
		return s;
	}
	

}
