package org.tamer1an.test1;

public class Triangle {
	private Point PointA;
	private Point PointB;
	private Point PointC;
	
	
	public Point getPointA() {
		return PointA;
	}

	public void setPointA(Point pointA) {
		PointA = pointA;
	}

	public Point getPointB() {
		return PointB;
	}

	public void setPointB(Point pointB) {
		PointB = pointB;
	}

	public Point getPointC() {
		return PointC;
	}

	public void setPointC(Point pointC) {
		PointC = pointC;
	}

	public void draw() {
		System.out.println(getPointA().getX() + " - "+getPointB().getY());
	}
}
