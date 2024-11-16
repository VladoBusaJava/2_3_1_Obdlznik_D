package academy.metis.javabasics.lesson2.activity3.exercise1.part4.RectangleIntersectionDisplay.java;
import java.awt.*;


public class RectangleIntersectionDisplay
{
    public static void main(String[] args)

    {

        Rectangle rectangle1 = new Rectangle(50 ,50,30,20);
        Rectangle rectangle2 = new Rectangle(50,30,20,30);
        boolean intersect = checkIntersection(rectangle1,rectangle2);

        if (intersect) {
            System.out.println("Obdlzniky sa prekryvaju");
        }else {
            System.out.println("Obdlzniky sa neprekryvaju");
        }




    }

    public static boolean checkIntersection(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.intersects(rectangle2);



    }
}
