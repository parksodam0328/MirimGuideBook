package MirimGuideBook;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SelectMenu extends JFrame{
	private JLabel label;
	private JPanel contentPane;
	public SelectMenu() {
		
		setTitle("�̸����̵��");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		
		label = new JLabel("");
		label.setSize(850,600);
		Image img2 = new ImageIcon(this.getClass().getResource("/MenuSelect.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img2));
	}
}
