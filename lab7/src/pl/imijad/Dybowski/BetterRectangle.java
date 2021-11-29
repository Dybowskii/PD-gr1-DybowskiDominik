package pl.imijad.Dybowski;
import java.awt.*;

class betterRectangle extends Rectangle {
    betterRectangle (int x, int y, int w, int h)
    {
        super(x,y,w,h);
    }
    public int getArea()
    {
        return width * height;
    }
    public int getPerimeter()
    {
        return width * 2 + height * 2;
    }
}
