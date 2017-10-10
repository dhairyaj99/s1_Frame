package Assign_1_A;

import Media.*;                  // for Turtle and TurtleDisplayer
import static Media.Turtle.*;    // for Turtle speeds
import static java.lang.Math.*;  // for Math constants and functions
import static java.awt.Color.*;  // for Color constants


/** COSC 1P02
  *
  * @author Dhairya Jaiswal
  * Studend #: 6292064
  * @version 1.0 (9/14/17)   
  *@The purpose of this class is to create a greek key using turtle graphics*/

public class GreekKey {
    
    
    // instance variables
    private TurtleDisplayer display;
    private Turtle yertle;
    
    /** This constructor ...                                                     */
    
    public GreekKey( ) {
        
        // statements
        display = new TurtleDisplayer();//This is the variable that creates the display
        yertle = new Turtle(FAST);//This is the turtle that draws on the display "display"
        display.placeTurtle(yertle); //This line places the turtle "yertle" onto the display "display"
        
        yertle.penDown();//1
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
        yertle.forward(10);//18; These previous 18 lines are to draw one greek key
        
    }; // constructor
    
    
    public static void main ( String[] args ) { GreekKey s = new GreekKey(); };
    
    
} // GreekKey
