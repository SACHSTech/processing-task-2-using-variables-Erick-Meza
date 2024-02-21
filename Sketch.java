import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(620, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  
    //Casts the values of width and height as doubles
    float fltWidth = (float) (width);
    float fltHeight = (float) (height);

	  // defines the thickness of the lines/shapes
    strokeWeight(12);

	  // draws red equilateral triangle on the left
    stroke(255, 0, 0);
    fill(0, 0, 0, 0);
    triangle((fltWidth / 6.888888889f), (fltHeight / 1.290322581f), (fltWidth / 6.888888889f), (fltHeight / 5.714285714f), (fltWidth / 2.296296296f), (fltHeight / 2.0f));

    // draws a blue diamond on the right side
    stroke(0, 0, 255);
    quad((fltWidth / 1.9375f), (fltHeight / 2.0f), (fltWidth / 1.409090909f), (fltHeight / 5.714285714f), (fltWidth / 1.117117117f), (fltHeight / 2.0f), (fltWidth / 1.409090909f), (fltHeight / 1.315789474f));
  
    // draws a white ellipse in the center
    stroke(255, 255, 255);
    fill(0, 0, 0, 0);
    ellipse((fltWidth / 2.066666667f), (fltHeight / 2.105263158f), (fltWidth / 2.066666667f), (fltHeight / 1.538461538f));

    // draws a blue line in front of the ellipse for the diamond
    stroke(0, 0, 255);
    line((fltWidth / 1.9375f), (fltHeight / 2.02020202f), (fltWidth / 1.409090909f), (fltHeight / 5.714285714f));
  
    // draws a red line in front of the ellipse for the triangle
    stroke(255, 0, 0);
    line((fltWidth / 6.888888889f), (fltHeight / 5.714285714f), (fltWidth / 2.296296296f), (fltHeight / 2.0f));
    
  }
  
  // define other methods down here.
}