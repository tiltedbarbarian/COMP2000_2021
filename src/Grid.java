import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;

class Grid {
    Cell[][] cells = new Cell[20][20];
    float[][] weights = new float[cells.length][cells[0].length];

    public Grid() {
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                weights[i][j] = (float) Math.random();
            }
        }
        for(int i = 0; i < cells.length; i++) {
            for(int j = 0; j < cells[i].length; j++) {
                if (weights[i][j] < 0.4) {
                    cells[i][j] = new Grass(colToLabel(i), j, 10+35*i, 10+35*j, weights[i][j]);
                } else if (weights[i][j] >= 0.4 && weights[i][j] < 0.65) {
                    cells[i][j] = new Mountain(colToLabel(i), j, 10+35*i, 10+35*j, weights[i][j]);
                } else if (weights[i][j] >= 0.65 && weights[i][j] < 0.85) {
                    cells[i][j] = new Water(colToLabel(i), j, 10+35*i, 10+35*j, weights[i][j]);
                } else if (weights[i][j] >= 0.85 && weights[i][j] < 0.95) {
                    cells[i][j] = new Road(colToLabel(i), j, 10+35*i, 10+35*j, weights[i][j]);
                } else if (weights[i][j] >= 0.95) {
                    cells[i][j] = new Building(colToLabel(i), j, 10+35*i, 10+35*j, weights[i][j]);
                } else {
                    cells[i][j] = new Cell(colToLabel(i), j, 10+35*i, 10+35*j);
                }
            }
        }
    }


    private char colToLabel(int col) {
        return (char) (col + 65);
    }

    private int labelToCol(char col) {
        return (int) col - 65;
    }

    public void paint(Graphics g, Point mousePos) {
        for(int i = 0; i < cells.length; i++) {
            for(int j = 0; j < cells[i].length; j++) { 
                cells[i][j].paint(g, mousePos);
            }
        }
    }

    private Optional<Cell> cellAtColRow(int c, int r) {
        if(c >= 0 && c < cells.length && r >= 0 && r < cells[c].length) {
            return Optional.of(cells[c][r]);
        } else {
            return Optional.empty();
        }
    }

    public Optional<Cell> cellAtColRow(char c, int r) {
        return cellAtColRow(labelToCol(c), r);
    }
    
    public Optional<Cell> cellAtPoint(Point p) {
        for(int i=0; i < cells.length; i++) {
            for(int j=0; j < cells[i].length; j++) {
                if(cells[i][j].contains(p)) {
                    //System.out.println(cells[i][j].toString());
                     
                    return Optional.of(cells[i][j]);
                }
            }
        }
        return Optional.empty();
    }
}

