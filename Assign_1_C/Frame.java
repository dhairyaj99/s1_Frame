package Assign_1_C;

import Media.*;                  // for Turtle and TurtleDisplayer
import static Media.Turtle.*;    // for Turtle speeds
import static java.lang.Math.*;  // for Math constants and functions
import static java.awt.Color.*;  // for Color constants


/** COSC 1P02
  *
  * @author Dhairya Jaiswal
  * @Student #: 6292064
  * @version 1.0 (9/14/17)                        
  * @The purpose of this class is to create a frame with greek keys that were created in the previous code*/

public class Frame {
  
  
  // instance variables
  private TurtleDisplayer display;
  private Turtle yertle;
  
  /** This constructor ...                                                     */
  
  public Frame( ) {//This is the method that draws the frame on the turtle display using the turtle "yertle"
    
    // statements
    display = new TurtleDisplayer();//This is the variable that creates the display
    yertle = new Turtle(FAST);//This is the turtle that draws on the display "display"
    display.placeTurtle(yertle); //This line places the turtle "yertle" onto the display "display"
    yertle.backward(75);//1
    yertle.left(PI/2);//2
    yertle.forward(75);//3
    yertle.right(PI/2);//4- These 4 lines move the turtle to the top left corner of the frame
    yertle.penDown();
    for(int j=0; j<4; j++){//This is the for loop that draws the 4 borders of the frame
      for(int i=0; i<8;i++){//This is the for loop that draws out the greek key 8 times; one border of the frame
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
      yertle.right(PI/2);//This line changes the orientation of the turtle as it is done making one of the borders so that it can start creating the next border
    }
  }; // constructor
  
  
  public static void main ( String[] args ) { Frame s = new Frame(); };
  
  
} // GreekKey
