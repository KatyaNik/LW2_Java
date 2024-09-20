package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract class Shape
{
    //коментарий
    public Color color;

    public Shape (Color color)
    {
        this.color=color;
    }

    abstract void draw( GraphicsContext gr);

}
