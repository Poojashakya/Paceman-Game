import javax.swing.JFrame;




public class app_1 {
    public static void main(String[] args) throws Exception{
        int rowCount = 21;
        int columnCount = 19;
        int tileSize  = 32;
        int boardWith = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac Man");
        //frame.setVisible(true);
        frame.setSize(boardWith, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pacman pacmanGame = new pacman();
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true);





    }
}
