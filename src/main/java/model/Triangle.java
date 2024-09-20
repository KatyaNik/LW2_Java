package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {

    public Triangle (Color color)
    {
        super(color);

    }


    public void draw (GraphicsContext gc)
    {
        gc.setStroke(color);
        gc.strokeLine(10, 10, 190, 190);
        gc.strokeLine(10, 10, 190, 10);
        gc.strokeLine(190, 10, 190, 190);

    }
}
