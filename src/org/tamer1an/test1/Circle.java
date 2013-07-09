package org.tamer1an.test1;

public class Circle implements Shape{
	
	private Point center;

//	@Override
	public void draw() {
		System.out.println(center.getX());		
	}

	/**
	 * @return the center
	 */
	public Point getCenter() {
		return center;
	}

	/**
	 * @param center the center to set
	 */
	public void setCenter(Point center) {
		this.center = center;
	}

}
