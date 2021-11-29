package pl.imijad.Dybowski;

import java.awt.*;

public class test_rectangle {
    public static void main(String[] args)
    {
        betterRectangle kwadrat = new betterRectangle(3,5,2,5);
        System.out.println(kwadrat.getPerimeter());
        System.out.println(kwadrat.getArea());
    }
}
