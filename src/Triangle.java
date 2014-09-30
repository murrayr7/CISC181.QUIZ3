import java.lang.Math;

public class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea(){
		double s=this.getPerimeter()/2;
		return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
	}
	
	public double getPerimeter(){
		return (this.side1+this.side2+this.side3);
	}
	
	public String toString(){
		double area = this.getArea();
		double perimeter = this.getPerimeter();
		return ("The Area of this Triangle is "+String.valueOf(area)+"\nThe Perimeter of this Triangle is "+String.valueOf(perimeter));
	}

}
