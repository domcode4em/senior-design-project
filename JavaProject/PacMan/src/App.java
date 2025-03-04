import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int collumnCount = 19;
        int tileSize = 32;
        int boardWidth = collumnCount * tileSize;
        int boardHeight = rowCount * tileSize;
        
        // Creating window
        JFrame frame = new JFrame("Pac Man");
        // comment out because we do set visable until we have all components
        // frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create instance of JPanel
        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        pacmanGame.requestFocus(); 
        frame.setVisible(true);
    }
}
