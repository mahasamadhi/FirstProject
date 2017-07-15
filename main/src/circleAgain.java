/**
 * Created by bfica on 7/12/2017.
 */
import java.io.*;

    //a class defines the properties and behaviors for objects



public class circleAgain {

    //these are called fields, they are variables that are associated and used by the class, they can also be seen
    //as aspects or attributes of the class

    private double radius;
    private double area;
    private String color;
    private String regime; //large medium or small

    //this is called the constructor; the constructors purpose is actually create a new object, the constructor is invoked
    //to create a new object

    public circleAgain(double iniRadius, String iniColor, String iniRegime) {
        radius = iniRadius;
        color = iniColor;
        regime = iniRegime;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
        System.out.println(radius);
    }

    public void setColor(String newColor) {
        color = newColor;
        System.out.println(color);
    }

    public void getArea() {
        area = radius * radius * Math.PI;
        System.out.println(area);
    }

    public void findRegime() {
        if (0 < area && area <= 10) {
            regime = "small";
        } else if (10 < area && area < 20) {
            regime = "medium";
        } else {
            regime = "large";
        }
        System.out.println(regime);

    }

}
