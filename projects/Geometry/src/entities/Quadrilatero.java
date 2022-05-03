package entities;

import entities.enums.Color;

public class Quadrilatero {

	// atributos
	private Color color;
	private int x;
	private int y;
	private int z;
	private int w;

	// constructors
	public Quadrilatero(Color color, int x, int y, int z, int w) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}

	public Quadrilatero(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
		w = x;
		z = y;
	}

	public Quadrilatero(Color color, int x) {
		this.color = color;
		this.x = x;
		y = x;
		z = x;
		w = x;
	}
	
	// getters and setters
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public int getW() {
		return w;
	}
	
	
	public double area() {
		if(x == w) return x*y;
		else {
			double sp = perimetro()/2.0;
			return Math.sqrt((sp - x)*(sp - y)*(sp - w)*(sp-z));
		}
	}

	public double perimetro() {
		return x + y + w + z;
	}
	
}
