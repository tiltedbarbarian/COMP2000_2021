import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;






class Cell extends Rectangle {
    static int size = 35;
    char col;
    int row;
    float colorFloat;
    Color color;

   
    

    public Cell(char inCol, int inRow, int inX, int inY) {
        
        super(inX, inY, size, size);
        col = inCol;
        row = inRow;
        
        
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

    Color shade(Color e, float scaling) {
        if (scaling > 0.8) {
            e = e.brighter().brighter();
        } else if (scaling <= 0.2) {
            e = e.darker().darker();
        } else if (scaling > 0.2 && scaling <= 0.4) {
            e = e.darker();
        } else if (scaling > 0.6 && scaling <= 0.8) {
            e = e.brighter();
        }
        
        return e;
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






class Building extends Cell {

    public Building(char inCol, int inRow, int inX, int inY, float weight) {
        super(inCol, inRow, inX, inY);
        color = new Color(165,100,42);
        

        
        
    }
}