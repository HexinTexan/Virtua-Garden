
public abstract class Basic {
private	String name;
private	String color;
private	String tall;
private	int type;
	

// this is to get the basic stuff from every plant, color, name, height

	//name
	public String getName(){
		return this.name;
		}
	public void setName(String name) {
		this.name = name;
	}
	//color
	public String getColor(){
		return this.color;
		}
	public void setColor(String color) {
		this.color = color;
	}
	// height
	public String getTall() {
		return this.tall;
	}
	public void setTall(String tall) {
		this.tall = tall;
	}
	//type
	public int getType() {
		return this.type;
	}
	public void setType(int type) {
		this.type = type;
	}
public abstract void build();
	public Basic(String name,String color, String tall,int type) {
		this.name=name;
		this.color=color;
		this.tall=tall;
		this.type = type;

	}
	}
	