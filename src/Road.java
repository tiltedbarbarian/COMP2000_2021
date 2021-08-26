import java.awt.Color;
public class Road extends Cell {
    public float elevation;
    public Road(char inCol, int inRow, int inX, int inY, float weight) {
        super(inCol, inRow, inX, inY);
        elevation = (int) (500.0 + 5500.0*(Math.random()));
        float darkness = (float) elevation/6000;
        
        color = new Color(128,128,128);
        color = shade(color, darkness);
        
        
    }
}
