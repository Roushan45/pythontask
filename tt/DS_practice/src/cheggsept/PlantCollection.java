package cheggsept;
public class PlantCollection
{
        public static void main (String [] args)
        {
                System.out.println("\nOur plant collection has the following:\n");
        System.out.println("A succulent s1 that is a cactus and has red "
                        + "flowers");
        System.out.println("A succulent s2 that is not a cactus and has red "
                        + "flowers");
        System.out.println("A succulent s3 that is not a cactus and has white "
                        + "flowers");
                Plant p1 = new Succulent("red", true);          
                Plant p2 = new Succulent("red", false);         
                Plant p3 = new Succulent();

                System.out.println("\nThe color we have for plant p2 is " +
                        p2.getColor());
                System.out.println("It seems that plant s2's color is actually " +
                        "purple, so let's change it");
                Succulent s1 = (Succulent) p1;
                Succulent s2 = (Succulent) p2;
                Succulent s3 = (Succulent) p3;
                s2.setColor("purple");

        System.out.println("\nPlant s1 is a " + s1.getType());
        System.out.println("Plant s2 is a " + s2.getType());

                System.out.println("\nAre succulents s1 and s2 the same type? " +
                        (s1.isSameType(s2) ? "Yes" : "No"));
                
        System.out.println("\nLet's add two ferns to our collection:");
        Plant s4 = new Fern();
                Plant s5 = new Fern();
                System.out.println(s4);
                System.out.println(s5);
                Fern f1 = (Fern) s4;
                Fern f2 = (Fern) s5;
        
                System.out.println("Comparing watering of ferns:");
                System.out.println("f1 " + f1.getWatering() + " days");
                System.out.println("f2 " + f2.getWatering() + " days");
                int result = f1.compareTo(f2);
                System.out.println("Fern one needs to be watered " + 
                        ((result == 0) ? "the same as" : (result == 1) ? "less often than"
                        : "more often than") + " fern 2");

                System.out.println("\nThere are " + Plant.numberOfPlants() + 
                        " plants in our collection");

                Plant [] collection = {s1, s2, s3, s4, s5};
        System.out.println("\nHere's what our collection looks like:\n");
                for (int i = 0; i < collection.length; i++)
                {
                        System.out.println(collection[i].getClass().getSimpleName() + "\n"
                                + collection[i] + "\n");
                }

        System.out.println("A plant's energy source is: " + 
                        Plant.ENERGY_SOURCE + "\n");
        }
}