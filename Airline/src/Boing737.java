

public class Boing737 extends Aircraft {
	private String name ;

	public Boing737(String name){
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
