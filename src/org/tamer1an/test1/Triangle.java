package org.tamer1an.test1;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape { //implements InitializingBean, DisposableBean {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("triangle "+getPointA().getX() + " - "+getPointB().getY());
	}

	/*public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
	}

	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}*/
	
	public void myInit (){
		System.out.println("afterPropertiesSet");
	}
	
	public void cleanUp (){
		System.out.println("destroy");
	}
}
