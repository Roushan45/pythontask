package cheggAugust;
public class Point
{
   private int x;
   private int y;

   /**
      Constructs a point at the origin.
   */
   public Point()
   {
      this.x = 0;
      this.y = 0;
   }

   /**
      Moves this point by a given amount.
      @param dx the x-distance
      @param dy the y-distance
   */
   public void move(int dx, int dy)
   {
      x = x + dx;
      y = y + dy;
   }

   /**
      Checks whether this point is equal to another.
      @param otherObject another point
      @return true if this point and otherObject have the
      same position.
   */
   public boolean equals(Object otherObject)
   {
      Point other = (Point) otherObject;
      return x == other.x 
         && y == other.y;
   }
}