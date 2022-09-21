public class LabComputer extends Computer implements BudgetItem, Comparable<LabComputer> {

	private String location;
	
	public LabComputer() throws Exception {
		super();  //super MUST be first line in constructor
		setLocation("YC 207");
	}
	
	public LabComputer(String newId, boolean newIsLaptop, int newUpdateYear, String newLocation) throws Exception {
		super(newId, newIsLaptop, newUpdateYear);
		setLocation(newLocation);
	}
	public String getLocation() {
		return location;
	}
	
	public String toString() {
		String s = super.toString();
		s += " Location: " + location;
		s += " Update year: " + updateYear;
		return s;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override // this means it will override a method
	public double getCost() {
		return 1500;
	}

	@Override
	public int compareTo(LabComputer other) {
		if (this.getUpdateYear() < other.getUpdateYear())
			return -1;
		else if (this.getUpdateYear() > other.getUpdateYear())
			return 0;
		// if they are equal, compare based on location String
		if (this.getLocation().compareTo(other.getLocation()) < 0)
			return -1;
		else if (this.getLocation().compareTo(other.getLocation()) > 0)
			return 1;
		return 0;
		// Alternative for comparing Strings
		// return (this.getLocation().compareTo(other.getLocation()));
	}

}
