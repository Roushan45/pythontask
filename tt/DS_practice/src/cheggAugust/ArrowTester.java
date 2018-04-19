package cheggAugust;
public class ArrowTester
{
   public static void main(String[] args)
   {
      Arrow arrow1 = new Arrow(1, 2, "SE");
      Object arrow2 = new Arrow(1, 2, "W");
      Arrow arrow3 = new Arrow(1, 0, "SE");
      Arrow arrow4 = new Arrow(0, 2, "SE");
      Arrow arrow5 = new Arrow(1, 2, "SEE".substring(0, 2));

      System.out.println(arrow1.equals(arrow1));
      System.out.println("Expected: true");
      System.out.println(arrow1.equals(arrow2));
      System.out.println("Expected: false");
      System.out.println(arrow1.equals(arrow3));
      System.out.println("Expected: false");
      System.out.println(arrow1.equals(arrow4));
      System.out.println("Expected: false");
      System.out.println(arrow1.equals(arrow5));
      System.out.println("Expected: true");
   }
}