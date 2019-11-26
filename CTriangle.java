interface Shape
{
  abstract double getArea();
}

class Rectangle implements Shape
{
  double length;
  double width;

  public Rectangle(double l, double w)
  {
    this.length = l;
    this.width = w;
  }
  
  public double getArea()
  {
    return length*width;
  }

  public String toString()
  {
    return "矩形面積為: "+ String.valueOf(length*width);
  }
}


class Triangle implements Shape
{
  double base;
  double height;

  public Triangle(double b, double h)
  {
    this.base = b;
    this.height = h;
  }
  
  public double getArea()
  {
    return base*height*0.5;
  }

  public String toString()
  {
    double area = getArea();
    return "矩形面積為: "+ String.valueOf(area);
  }
}

class test()
{
  public static void main(String args[])
  {
     Rectangle r = new Rectangle(3.5, 5.6);
     r.toString();

     Triangle t = new Triangle(5.6, 4.4);
     t.toString();
  }
}
