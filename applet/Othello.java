import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class Othello extends PApplet {

// \u30d5\u30a3\u30fc\u30eb\u30c9
Field f;

public void setup() {
  // \u521d\u671f\u5316
  f = new Field(8);
  
  //\u753b\u9762\u30b5\u30a4\u30ba
  size(f.requiredWidth(), f.requiredHeight());
  
  //\u63cf\u753b\u95a2\u9023
  smooth();
  stroke(255);
  strokeWeight(2);
}

public void draw() {
  // \u80cc\u666f
  background(39, 214, 81);
  
  f.drawFrame(); // \u67a0\u7dda\u63cf\u753b
  f.drawPieces(); // \u30b3\u30de\u306e\u63cf\u753b
}

// \u30bb\u30eb\u30af\u30e9\u30b9
class Cell {
  // \u30b3\u30de\u3092\u63cf\u753b
  public void drawPiece() {
  }
}

final int CELL_SIZE = 50; //1\u30bb\u30eb\u306e\u30b5\u30a4\u30ba
final int SPAN = 10; //\u4f59\u767d

// \u30d5\u30a3\u30fc\u30eb\u30c9\u30af\u30e9\u30b9
class Field {
  private final int SIZE;
  private Cell[][] cells;
  
  public Field(int s) {
    SIZE = s; //\u7e26\u6a2a\u305d\u308c\u305e\u308c\u306e\u30bb\u30eb\u6570
  }
  
  // \u30d5\u30a3\u30fc\u30eb\u30c9\u306e\u521d\u671f\u5316
  public void init() {
  }
  
  // \u30b3\u30de\u306e\u63cf\u753b
  public void drawPieces() {
  }
  
  // \u753b\u9762\u30fb\u6a2a\u30b5\u30a4\u30ba
  public int requiredWidth() {
    return CELL_SIZE * SIZE + SPAN * 2;
  }
  
  // \u753b\u9762\u30fb\u7e26\u30b5\u30a4\u30ba
  public int requiredHeight() {
    return CELL_SIZE * SIZE + SPAN * 2;
  }
  
  // \u67a0\u306e\u63cf\u753b
  public void drawFrame() {
    // \u67a0
    for(int x = 0; x <= SIZE; x++) {
      int i = x * CELL_SIZE + SPAN;
      int j = SIZE * CELL_SIZE + SPAN;
      // \u7e26\u7dda
      line(i, SPAN, i, j);
      // \u6a2a\u7dda
      line(SPAN, i, j, i);
    }
    
    //\u70b9
    for(int y = 1; y < SIZE; y++) {
      for(int x = 1; x < SIZE; x++) {
        if(x % 2 == 0 && y % 2 == 0) {
          ellipse(x * CELL_SIZE + 10, y * CELL_SIZE + 10, 5, 5);
        }
      }
    }
  }
  
}


  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Othello" });
  }
}
