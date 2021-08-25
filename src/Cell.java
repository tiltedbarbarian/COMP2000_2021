import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;





class Cell extends Rectangle {
    static int size = 35;
    char col;
    int row;
    float colorFloat;
    float elevationFloat;
    Color color;
    int elevation;

    public Cell(char inCol, int inRow, int inX, int inY) {
        
        super(inX, inY, size, size);
        col = inCol;
        row = inRow;
        colorFloat = (float) Math.random();
        if (colorFloat < 0.8) {
            elevationFloat = (float) Math.random();
        } else {
            elevationFloat = -1;
        }
        if (colorFloat < 0.1) {
            color = Color.GRAY;
        } else if (colorFloat < 0.3 && colorFloat >= 0.1) {
            color = Color.BLUE;
        } else if (colorFloat < 0.7 && colorFloat >= 0.3 ) {
            color = Color.GREEN;
        } else if (colorFloat < 0.95 && colorFloat >= 0.7 ) {
            color = Color.YELLOW;
        } else if (colorFloat >= 0.95 ) {
            color = new Color(150,102,0);
        }
        elevation = (int) ((float) 500 + (5500*elevationFloat));
        
        
        
    }

    void paint(Graphics g, Point mousePos) {
        if(contains(mousePos)) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(this.color);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

         

    @Override
    public boolean contains(Point p) {
        if (p != null) {
            return(super.contains(p));
        } else {
            return false;
        }
    }
}