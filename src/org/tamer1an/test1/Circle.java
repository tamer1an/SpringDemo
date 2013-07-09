package org.tamer1an.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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

	@Autowired
	@Qualifier("myCircle")
	public void setCenter(Point center) {
		this.center = center;
	}

}
