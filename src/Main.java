import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Stage stage;

        public App() {
            setPreferredSize(new Dimension(1024, 720));
            stage = new Stage();
            //task 13:  
            // try {
            stage = StageReader.readStage("data/stage1.rvb");
            // }      
            // catch (IOException exception) {
                 //exception.getStackTrace();
            // }
        }

        @Override
        public void paint(Graphics g) {
            stage.paint(g, getMousePosition());
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        
        while (true) {
            
            this.repaint();
            try {
                Thread.sleep(20);
            }
            catch (InterruptedException exception){
                System.out.println(exception.toString());
            }
        }
    }
}