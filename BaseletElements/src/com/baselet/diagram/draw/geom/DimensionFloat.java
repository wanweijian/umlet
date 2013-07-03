package com.baselet.diagram.draw.geom;

public class DimensionFloat {

	private float height;
	private float width;

	public DimensionFloat(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "DimensionFloat [height=" + height + ", width=" + width + "]";
	}
	
}
