package DTO;

public class Color {
	private int idColors;
	private String type;
	private String name;
	private String color;
	
	
	public Color(int idColors, String type, String name, String color) {
		super();
		this.idColors = idColors;
		this.type = type;
		this.name = name;
		this.color = color;
		
	}

	public Color() {
		super();
	}

	public int getIdColors() {
		return idColors;
	}

	public void setIdColors(int idColors) {
		this.idColors = idColors;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Color [idColors=" + idColors + ", type=" + type + ", name=" + name + ", color=" + color + "]";
	}
	

}
