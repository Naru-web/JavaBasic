package shape;

public class Rectangle extends Shape{
   public int width;
   public int height; 
    
  public Rectangle(int w, int h) {
      
      //조상으로 이름 초기화
      super("Rectangle");
      width = w;
      height = h;
  }
  //면적
  public double computeArea() {
      return (double)width * height;
  }
  //둘레
  public double computePerimeter() {
      return 2.0*(width + height);
  }
  public String toString() {
      return "Rectangle: width is " + width + ", height is " + height;
  }

}
