
public class Plant extends Basic{
	public Plant(String name, String color, String tall,int type) {
		super(name, color, tall,type);	
	}
			
	public void build() {
		switch (getType()) {
		case 1 : // cacti
				System.out.println("Your garden has a " +this.getTall() + " spiny " + this.getColor() + " " +this.getName() + " cactus.");
				break;
		case 2 : // tree
			System.out.println("Your garden has a " + getTall() + " " + getColor() + " " + getName() + " tree.");
			break;
		case 3 : // flower
			System.out.println("Your garden has a " + getColor() + " " + getName() + " flower.");
			break;
		case 4 : // grass
			System.out.println("Your garden has " + getTall() + " " + getName() + " grass." );
			break;
		}
		
	}
		
}
