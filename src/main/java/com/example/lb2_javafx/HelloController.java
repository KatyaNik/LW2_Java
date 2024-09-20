package com.example.lb2_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.util.Objects;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Canvas canvas;

    @FXML
    private Button draw;


    @FXML
    private TextField textField;


    @FXML
    private ColorPicker colorPicker;

    @FXML
    protected void onHelloButtonClick() {

        GraphicsContext gc = canvas.getGraphicsContext2D();
        Color color = colorPicker.getValue();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        String command = textField.getText();
        if (Objects.equals(command, "Линия")){
            Line line = new Line(10, 100, color);
            line.draw(gc);
        }
        if(Objects.equals(command, "Квадрат")){
            Rectangle rectangle = new Rectangle(100,200,color);
            rectangle.draw(gc);
        }
        if(Objects.equals(command, "Треугольник")){
            Triangle triangle = new Triangle(color);
            triangle.draw(gc);
        }


        /*gc.setFill(Color.RED);
        gc.setStroke(Color.BLUE);
        gc.fillRoundRect(10, 10, 50, 50, 10, 10);
        gc.strokeRoundRect(10, 10, 50, 50, 10, 10);
        // ДРисование шестиугольника

        double centerX = canvas.getWidth()/2;
        double centerY = canvas.getHeight()/2;
        double radius = Math.min(centerX,centerY)*0.8;
        gc.beginPath();
        for (int i=0;i<6;i++){
            double angle = Math.PI / 2 +i*2*Math.PI/6;
            double x = centerX+radius*Math.cos(angle);
            double y = centerY+radius*Math.sin(angle);
            if (i==0){
                gc.moveTo(x, y);
            }
            else {
                gc.lineTo(x,y);
            }
        }
        gc.closePath();
        gc.stroke();*/

    }

}