
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HyperTicTacToeGUI extends JFrame implements Runnable {

    private Cliente clt;
    Socket sc;
    private int f;
    private int H;
    OutputStream os;
    DataOutputStream flujoDOS;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HyperTicTacToeGUI game;
            try {
                game = new HyperTicTacToeGUI();
                game.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(HyperTicTacToeGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
    }

    private String Turno;
    private Color micolor;

    private JButton[][] boardButtons;
    private int currentPlayer;
    private int winCondition[][] = {{0, 1, 2},
    {3, 4, 5},
    {6, 7, 8},
    {0, 3, 6},
    {1, 4, 7},
    {2, 5, 8},
    {0, 4, 8},
    {2, 4, 6}};

    private ArrayList<Integer> panelesGanados = new ArrayList<>();

    public HyperTicTacToeGUI() throws IOException {
        setTitle("HyperTicTacToe");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        boardButtons = new JButton[9][9];
        //currentPlayer = 1;

        initializeBoard();
        resetBoard();

        sc = new Socket("192.168.100.4", 5000);

        //Leer l1 = new Leer(sc,f);
        Thread leer = new Thread(this);
        leer.start();
        System.out.println(f);
        os = sc.getOutputStream();
        flujoDOS = new DataOutputStream(os);
    }

    private void initializeBoard() {
        for (int i = 0, a = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++, a++) {
                JPanel subGridPanel = new JPanel(new GridLayout(3, 3));

                for (int k = 0, m = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++, m++) {
                        JButton button = new JButton();
                        button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
                        button.addActionListener(new ButtonClickListener(a, m));
                        boardButtons[a][m] = button;
                        subGridPanel.add(button);
                    }
                }

                add(subGridPanel);
            }
        }
    }

    private class ButtonClickListener implements ActionListener {

        private int panel, posicion;

        public ButtonClickListener(int panel, int posicion) {
            this.panel = panel;
            this.posicion = posicion;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            try {
                // Implement your game logic here
                bailarLaMacarena(panel, posicion, true);
                enviarDatos(panel, posicion);
            } catch (IOException ex) {
                Logger.getLogger(HyperTicTacToeGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void enviarDatos(int panel, int posicion) throws IOException {
        flujoDOS.writeDouble(panel);
        flujoDOS.writeInt(posicion);
    }

    public void bailarLaMacarena(int panel, int posicion, boolean pantalla) {
        if (boardButtons[panel][posicion].getText().equals("")) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    boardButtons[i][j].setEnabled(false);
                }
            }
            boardButtons[panel][posicion].setBackground(Color.red);
            if (Turno == "X" && !pantalla) {
                System.out.println("Cambiando valor");
                System.out.println("Antes de entrar al metodo" + panel + pantalla);
                boardButtons[panel][posicion].setText("O");

                if (!checkForWinner(panel, pantalla)) {
                    System.out.println("Entre al metodo valor " + checkForWinner(panel, pantalla));
                    nextMove(posicion);
                }
            } else if (Turno == "O" && !pantalla) {
                boardButtons[panel][posicion].setText("X");
                if (!checkForWinner(panel, pantalla)) {
                    nextMove(posicion);
                }
            } else if (pantalla) {
                boardButtons[panel][posicion].setText(Turno);
                if (!checkForWinner(panel, pantalla)) {
                    //nextMove(posicion);
                }
            }
        }

    }

    private boolean checkForWinner(int panel, boolean frame) {
        for (int i = 0; i < winCondition.length; i++) {
            if (boardButtons[panel][winCondition[i][0]].getText() == boardButtons[panel][winCondition[i][1]].getText() && boardButtons[panel][winCondition[i][1]].getText() == boardButtons[panel][winCondition[i][2]].getText() && (boardButtons[panel][winCondition[i][0]].getText() == "X" || boardButtons[panel][winCondition[i][0]].getText() == "O")) {
                System.out.println("Accedi al metodo valores " + Turno + frame);
                if (Turno == "X" && frame || Turno == "O" && !frame) {
                    for (int j = 0; j < 9; j++) {
                        boardButtons[panel][j].setBackground(Color.pink);
                        boardButtons[panel][j].setEnabled(false);
                        System.out.println("Pintado");
                    }
                } else if (Turno == "O" && frame || Turno == "X" && !frame) {
                    for (int j = 0; j < 9; j++) {
                        boardButtons[panel][j].setBackground(Color.orange);
                        boardButtons[panel][j].setEnabled(false);
                        System.out.println("PIntado");
                    }
                }

                panelesGanados.add(panel);

            }
            if (panelesGanados.contains(winCondition[i][0]) && panelesGanados.contains(winCondition[i][1]) && panelesGanados.contains(winCondition[i][2])) {
                if (boardButtons[winCondition[i][0]][0].getBackground() == boardButtons[winCondition[i][1]][0].getBackground() && boardButtons[winCondition[i][1]][0].getBackground() == boardButtons[winCondition[i][2]][0].getBackground()) {
                    if (boardButtons[winCondition[i][0]][0].getBackground() == Color.pink) {
                        JOptionPane.showMessageDialog(null, "Gano el jugador: 1");
                    }
                    if (boardButtons[winCondition[i][0]][0].getBackground() == Color.orange) {
                        JOptionPane.showMessageDialog(null, "Gano el jugador: 2");
                    }
                    resetBoard();
                    return true;
                }
            }
        }
        return false;

    }

    private void nextMove(int panel) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (panelesGanados.contains(panel)) {
                    if (panelesGanados.contains(i)) {
                        boardButtons[i][j].setEnabled(false);
                        if (boardButtons[i][j].getBackground() == Color.cyan) {
                            boardButtons[i][j].setBackground(Color.white);
                        }
                    } else {
                        if (boardButtons[i][j].getBackground() == Color.white || boardButtons[i][j].getBackground() == Color.cyan) {
                            boardButtons[i][j].setBackground(Color.cyan);
                            boardButtons[i][j].setEnabled(true);
                        }
                    }
                } else {
                    if (i == panel) {
                        if (boardButtons[i][j].getBackground() == Color.white || boardButtons[i][j].getBackground() == Color.cyan) {
                            boardButtons[i][j].setBackground(Color.cyan);
                            boardButtons[i][j].setEnabled(true);
                        }
                    } else {
                        if (boardButtons[i][j].getBackground() == Color.white || boardButtons[i][j].getBackground() == Color.cyan) {
                            boardButtons[i][j].setBackground(Color.white);
                            boardButtons[i][j].setEnabled(false);
                        }
                    }
                }
            }
        }

        /*if (panelesGanados.contains(panel)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (panelesGanados.contains(i)) {
                        boardButtons[i][j].setEnabled(false);
                        if (boardButtons[i][j].getBackground() == Color.cyan) {
                            boardButtons[i][j].setBackground(Color.white);
                        }
                    } else {
                        if (boardButtons[i][j].getBackground() == Color.white || boardButtons[i][j].getBackground() == Color.cyan) {
                            boardButtons[i][j].setBackground(Color.cyan);
                            boardButtons[i][j].setEnabled(true);
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (i == panel) {
                        if (boardButtons[i][j].getBackground() == Color.white || boardButtons[i][j].getBackground() == Color.cyan) {
                            boardButtons[i][j].setBackground(Color.cyan);
                            boardButtons[i][j].setEnabled(true);
                        }
                    } else {
                        if (boardButtons[i][j].getBackground() == Color.white || boardButtons[i][j].getBackground() == Color.cyan) {
                            boardButtons[i][j].setBackground(Color.white);
                            boardButtons[i][j].setEnabled(false);
                        }
                    }
                }
            }
        }*/
    }

    private void resetBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boardButtons[i][j].setBackground(Color.cyan);
                boardButtons[i][j].setEnabled(true);
                boardButtons[i][j].setText("");
            }
        }

        panelesGanados.clear();

    }

    @Override
    public void run() {
        InputStream aux;
        int h = 0;
        DataInputStream flujo;
        try {
            aux = sc.getInputStream();
            flujo = new DataInputStream(aux);
            while (true) {
                f = flujo.readInt();
                if (f == 100) {
                    Turno = "X";
                } else if (f == 101) {
                    Turno = "O";
                } else if (f == 999) {
                    this.dispose();
                } else {
                    System.out.println("Bailando la macarena con " + h + "" + f + false);
                    bailarLaMacarena(h, f, false);
                    System.out.println("Acabe de bailar la macarena con " + h + "" + f + false);
                }
                System.out.println(f);
                h = (int) flujo.readDouble();
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
