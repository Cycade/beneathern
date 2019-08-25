public class FactoryPatternDemo {
  public static void main (String[] args) {
    Shape s1 = ShapeFactory.onCreate("CIRCLE");
    s1.draw();
    Shape s2 = ShapeFactory.onCreate("RECTANGLE");
    s2.draw();
    Shape s3 = ShapeFactory.onCreate("SQUARE");
    s3.draw();
  }
}