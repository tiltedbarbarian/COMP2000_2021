import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stage {
    Grid grid;
    List<Actor> actors;

    public Stage() {
        grid = new Grid();
        actors = new ArrayList<Actor>();
    }

    public void paint(Graphics g, Point mouseLoc) {
        grid.paint(g, mouseLoc);
        for(Actor a: actors) {
            a.paint(g);
        }

        Optional<Cell> underMouse = grid.cellAtPoint(mouseLoc);
        if(underMouse.isPresent()) {
            
            Cell hoverCell = underMouse.get();
            g.setColor(Color.DARK_GRAY);
            g.drawString(String.valueOf(hoverCell.col) + String.valueOf(hoverCell.row), 740, 30);
            String className = hoverCell.getClass().getSimpleName();
            //
            //g.drawString(className, 820, 30);
            if (hoverCell instanceof Building) {
                g.drawString(className, 760, 30);
            } else if (hoverCell instanceof Grass) {
                g.drawString(className + " Elevation: " + (int) ((Grass) hoverCell).elevation + "m", 760, 30);
            } else if (hoverCell instanceof Water) {
                g.drawString(className + " Elevation: " + (int) ((Water) hoverCell).elevation + "m", 760, 30);
            } else if (hoverCell instanceof Mountain) {
                g.drawString(className + " Elevation: " + (int) ((Mountain) hoverCell).elevation + "m", 760, 30);
            } else {
                g.drawString(className + " Elevation: " + (int) ((Road) hoverCell).elevation + "m", 760, 30);
            }
            
            
            //g.drawPolygon(hoverCell);
        }
    }
}
