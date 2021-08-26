
import java.awt.Color;
public class Mountain extends Cell {
    public float elevation;
    public Mountain(char inCol, int inRow, int inX, int inY, float weight) {
        super(inCol, inRow, inX, inY);
        elevation = (float) (500.0 + 5500.0*(Math.random()));
        float darkness = elevation/6000;
        
        color = new Color(255,255,0);
        color = shade(color, darkness);
        
        
    }
    
}
