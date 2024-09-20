package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape
{
    public double length;
    public double width;
    public Rectangle (double length, double width, Color color)
    {
        super(color);
        this.length=length;
        this.width=width;

    }
    public double area()
    {
        return length*width;

    }
    public void draw (GraphicsContext gc){
        // установка цвета
        gc.setStroke(color);
        gc.strokeRoundRect(10, 100, width, length, 10, 10);
    }
}
