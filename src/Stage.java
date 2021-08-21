import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Stage {
    Grid grid;
    List<Actor> actors;

    public Stage() {
        grid = new Grid();
        actors = new ArrayList<Actor>();

        actors.add(new Train(grid.cellAtColRow(0, 0).get()));
        actors.add(new Car(grid.cellAtColRow(0, 15).get()));
        actors.add(new Boat(grid.cellAtColRow(12, 9).get()));
    }

    public void paint(Graphics g, Point mouseLoc) {
        grid.paint(g, mouseLoc);
        for(Actor a: actors) {
            a.paint(g);
        }
    }
}
