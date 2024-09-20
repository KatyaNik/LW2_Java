package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Line extends Shape
{
    public double x;
    public double y;
    public Line(double x, double y, Color color){
        super(color);
        this.x=x;
        this.y=y;

    }

    public void draw (GraphicsContext gc){

        gc.setStroke(color);
        gc.strokeLine(10, 10, 190, 190);
    }

}


