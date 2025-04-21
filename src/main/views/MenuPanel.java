package main.views;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class MenuPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private String username;
	private JButton logoutButton;
	private JButton btnLeaderboard;
	private JButton btnPlayGame;
    private JLabel lblNewLabel;
    private JButton btnMyGames;
    public MenuPanel() {
        setBackground(Color.BLACK);
        // setForeground(Color.WHITE);
        setLayout(null);
        
        JLabel levelLabel = new JLabel("Breakout");
        levelLabel.setHorizontalAlignment(SwingConstants.CENTER);
        levelLabel.setFont(new Font("Impact", Font.PLAIN, 50));
        levelLabel.setForeground(Color.ORANGE);
        levelLabel.setBounds(266, 83, 274, 82);
        add(levelLabel);
        
        logoutButton = new JButton("Logout");
        logoutButton.setToolTipText("");
        logoutButton.setForeground(Color.black);
        logoutButton.setFont(new Font("Impact", Font.PLAIN, 20));
        logoutButton.setBackground(Color.WHITE);
        logoutButton.setBounds(300, 560, 209, 58);
        add(logoutButton);
        
        lblNewLabel = new JLabel("Welcome " + username);
        lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 35));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(Color.CYAN);
        lblNewLabel.setBounds(206, 207, 389, 58);
        add(lblNewLabel);
        
        btnLeaderboard = new JButton("Leaderboard");
        btnLeaderboard.setForeground(Color.black);
        btnLeaderboard.setBackground(Color.WHITE);
        btnLeaderboard.setFont(new Font("Impact", Font.PLAIN, 20));
        btnLeaderboard.setBounds(300, 404, 209, 58);
        add(btnLeaderboard);
        
        btnPlayGame = new JButton("Play Game");
        btnPlayGame.setForeground(Color.black);
        btnPlayGame.setBackground(Color.WHITE);
        btnPlayGame.setFont(new Font("Impact", Font.PLAIN, 20));
        btnPlayGame.setBounds(300, 323, 209, 58);
        add(btnPlayGame);
        
        btnMyGames = new JButton("My Games");
        btnMyGames.setForeground(Color.black);
        btnMyGames.setFont(new Font("Impact", Font.PLAIN, 20));
        btnMyGames.setBackground(Color.WHITE);
        btnMyGames.setBounds(300, 482, 209, 58);
        add(btnMyGames);
    }

    public void setUsername(String username) {
        System.out.println("Current Player: " + username + " Received.");
    	this.username = username;
        lblNewLabel.setText("Welcome " + username);
    }

    public void setPlayGameAction(ActionListener actionListener) {
    	btnPlayGame.addActionListener(actionListener);
    }
    
    public void setLeaderboardAction(ActionListener actionListener) {
    	btnLeaderboard.addActionListener(actionListener);
    }
    
    public void setMyGamesAction(ActionListener actionListener) {
    	btnMyGames.addActionListener(actionListener);
    }

    public void setLogoutAction(ActionListener actionListener) {
        logoutButton.addActionListener(actionListener);
    }
}
