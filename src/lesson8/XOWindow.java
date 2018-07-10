package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XOWindow extends JFrame {
    private static final int SIZE = 3;

    private static String EMPTY_DOT = "*";

    private Button[][] map;
    private JPanel gamePanel;
    private boolean gameOver;
    private Label gameStatusLabel;

    // Домашнее задание
    // 1. Разбор кода
    // 2. Добавить проверку на заполненность поля, останавливать игру если ходить больше некуда
    // * 3. Сделать так, чтобы при изменении boolean gameOver менялась надпись на gameStatusLabel

    public void initMap() {
        map = new Button[SIZE][SIZE];
        gamePanel.removeAll();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = new Button(EMPTY_DOT);
                gamePanel.add(map[i][j]);
                int x = i, y = j;
                map[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (!gameOver) {
                            if (humanTurn(x, y)) {
                                checkWin("X");
                                aiTurn();
                            }
                        }
                    }
                });
            }
        }
    }

    public boolean humanTurn(int x, int y) {
        if (map[x][y].getLabel().equals(EMPTY_DOT)) {
            map[x][y].setLabel("X");
            return true;
        }
        return false;
    }

    public void aiTurn() {
        if (!gameOver) {
            int x = -1, y = -1;
            while (true) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);
                if (map[x][y].getLabel().equals(EMPTY_DOT)) {
                    map[x][y].setLabel("O");
                    break;
                }
            }
            checkWin("O");
        }
    }

    public void checkWin(String dot) {
        if (map[0][0].getLabel().equals(dot) && map[1][0].getLabel().equals(dot) && map[2][0].getLabel().equals(dot)) {
            gameOver = true;
            gameStatusLabel.setText("Game Over");
        }
        if (map[0][1].getLabel().equals(dot) && map[1][1].getLabel().equals(dot) && map[2][1].getLabel().equals(dot)) {
            gameOver = true;
            gameStatusLabel.setText("Game Over");
        }
        if (map[0][2].getLabel().equals(dot) && map[1][2].getLabel().equals(dot) && map[2][2].getLabel().equals(dot)) {
            gameOver = true;
            gameStatusLabel.setText("Game Over");
        }

        if (map[0][0].getLabel().equals(dot) && map[0][1].getLabel().equals(dot) && map[0][2].getLabel().equals(dot)) {
            gameOver = true;
            gameStatusLabel.setText("Game Over");
        }
        if (map[1][0].getLabel().equals(dot) && map[1][1].getLabel().equals(dot) && map[1][2].getLabel().equals(dot)) {
            gameOver = true;
            gameStatusLabel.setText("Game Over");
        }
        if (map[2][0].getLabel().equals(dot) && map[2][1].getLabel().equals(dot) && map[2][2].getLabel().equals(dot)) {
            gameOver = true;
            gameStatusLabel.setText("Game Over");
        }

        if (map[0][0].getLabel().equals(dot) && map[1][1].getLabel().equals(dot) && map[2][2].getLabel().equals(dot)) {
            gameOver = true;
            gameStatusLabel.setText("Game Over");
        }
        if (map[0][2].getLabel().equals(dot) && map[1][1].getLabel().equals(dot) && map[2][0].getLabel().equals(dot)) {
            gameOver = true;
            gameStatusLabel.setText("Game Over");
        }
        //
        gameOver=true;
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++){
                if (map[i][j].getLabel()==EMPTY_DOT) {
                    gameOver = false;
                }
            }
        }
    }

    public void startNewGame() {
        gameOver = false;
        gameStatusLabel.setText("Play");
        initMap();
        gamePanel.setVisible(false);
        gamePanel.setVisible(true);
    }

    public XOWindow() {
        setBounds(600, 200, 400, 400);
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel southPanel = new JPanel(new GridLayout(1, 2));
        add(southPanel, BorderLayout.SOUTH);
        JButton btnStart = new JButton("Start New Game");
        JButton btnExit = new JButton("Exit Game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGame();
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        gameStatusLabel = new Label();
        add(gameStatusLabel, BorderLayout.NORTH);
        gameStatusLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gameStatusLabel.setAlignment(Label.CENTER);
        southPanel.add(btnStart);
        southPanel.add(btnExit);
        southPanel.setPreferredSize(new Dimension(1, 40));
        gamePanel = new JPanel(new GridLayout(SIZE, SIZE));
        add(gamePanel, BorderLayout.CENTER);
        startNewGame();

        setVisible(true);
    }
}
