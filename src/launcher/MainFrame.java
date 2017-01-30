package launcher;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnPlayGame = new JButton("Play Game");
		btnPlayGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//play game function
			}
		});
		btnPlayGame.setBounds(100, 15, 200, 50);
		contentPane.add(btnPlayGame);
		
		JButton btnOptions = new JButton("Options");
		btnOptions.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				//Option function
			}
		});
		btnOptions.setBounds(100, 74, 200, 50);
		contentPane.add(btnOptions);
		
		JButton btnCredits = new JButton("Credits");
		btnCredits.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				//Option function
			}
		});
		btnCredits.setBounds(100, 137, 200, 50);
		contentPane.add(btnCredits);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				//Quit function
			}
		});
		btnQuit.setBounds(100, 198, 200, 50);
		contentPane.add(btnQuit);
	}
}
