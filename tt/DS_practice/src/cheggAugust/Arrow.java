package cheggAugust;
public class Arrow
{
   private Point start;
   private String direction;
   /**
      Constructs an arrow.
      @param x the x-position
      @param y the y-position
      @param direction a compass direction N E S W NE NW SE SW
   */
   public Arrow(int x, int y, String direction)
   {
      start = new Point();
      start.move(x, y);
      this.direction = direction;
   }
   /**
      Checks whether this arrow is equal to another.
      @param otherObject another arrow
      @return true if this arrow and otherObject have the
      same start and direction.
   */
   public boolean equals(Object otherObject)
   {
	   Arrow arrow = (Arrow)otherObject;
	if(this.direction.equals(arrow.direction)
			&&this.start.equals(arrow.start))
		return true;
	return false;
   }
}