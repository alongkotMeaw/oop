package mid;

public class injection {
	private String name;
	private String type;
	
    //construct
	public  injection(String name,String type) {
		this.name = name;
		this.type = type;
	}

	
	//get/set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
