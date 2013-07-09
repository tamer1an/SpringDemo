package org.tamer1an.test1;

import org.springframework.beans.factory.annotation.Required;

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

	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

}
