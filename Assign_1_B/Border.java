package Assign_1_B;

import Media.*;                  // for Turtle and TurtleDisplayer
import static Media.Turtle.*;    // for Turtle speeds
import static java.lang.Math.*;  // for Math constants and functions
import static java.awt.Color.*;  // for Color constants


/** COSC 1P02
  *
  * @author Dhairya Jaiswal
  * Student #: 6292064
  * @version 1.0 (9/14/17)
  *@The purpose of this class is to create a border with greek keys that were created in the previous code*/

public class Border {//This is the method that draws the border on the turtle display using the turtle "yertle"
    
    
    // instance variables
    private TurtleDisplayer display;
    private Turtle yertle;
    
    /** This constructor ...                                                     */
    
    public Border( ) {
        
        // statements
        display = new TurtleDisplayer();//This is the variable that creates the display
        yertle = new Turtle(FAST);//This is the turtle that draws on the display "display"
        display.placeTurtle(yertle); //This line places the turtle "yertle" onto the display "display"
        yertle.backward(75);//This line is to move the turtle to the left before the drawing starts so that the border can fit on the display
        yertle.penDown();
        
        for(int i=0; i<8;i++){//This is the for loop that draws the greek key 8 times to create the border of the frame
          yertle.forward(2);
          yertle.left(PI/2);
          yertle.forward(12);
          yertle.right(PI/2);
          yertle.forward(12);
          yertle.right(PI/2);
          yertle.forward(8);
          yertle.right(PI/2);
          yertle.forward(4);
          yertle.right(PI/2);
          yertle.forward(4);
          yertle.left(PI/2);
          yertle.forward(4);
          yertle.left(PI/2);
          yertle.forward(8);
          yertle.left(PI/2);
          yertle.forward(10);
        }
    }; // constructor
    
    
    public static void main ( String[] args ) { Border s = new Border(); };
    
    
} // GreekKey
