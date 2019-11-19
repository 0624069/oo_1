
class CTriangle extends CShape
{
  protected double a, b, c;
  protected double area;
  
  public CTriangle(double length, double width, double height)
  {
    a = length;
    b = width;
    c = height;
    area = a*b*0.5;
  }
  
  public void show()
  {
     system.out.println("Triangle is "+color+", and the area is "+area+".");
  }
}

class test(){
  public static void main(string args[]){
     CTriangle c = new CTriangle(3, 4, 5);
     c.setColor("Red");
     c.show();
  }
}
