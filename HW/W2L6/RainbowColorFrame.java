package W2L6;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RainbowColorFrame extends JFrame {

	/**
	 * 
	 */
	final Color VIOLET = new Color( 128, 0, 128 );
	final Color INDIGO = new Color( 75, 0, 130 );
	JFrame jframe;
	JPanel mainPanel = new JPanel();
	JButton btnRed = new JButton();
	JButton btnOra = new JButton();
	JButton btnYel = new JButton();
	JButton btnGre = new JButton();
	JButton btnBlu = new JButton();
	JButton btnInd = new JButton();
	JButton btnVio = new JButton();
    // rainbow: red, orange, yellow, green, blue, indigo and violet
	public RainbowColorFrame() {	
		super ("Rainbow Color Frame");
		jframe = new JFrame();
		setBounds(350,250,0,0);
		mainPanel.setLayout(new FlowLayout());
		
		btnRed.setBackground(Color.RED);
		btnRed.setOpaque(true);
		btnRed.setBorderPainted(false);
		btnOra.setBackground(Color.ORANGE);
		btnOra.setOpaque(true);
		btnOra.setBorderPainted(false);
		btnYel.setBackground(Color.YELLOW);
		btnYel.setOpaque(true);
		btnYel.setBorderPainted(false);
		btnGre.setBackground(Color.GREEN);
		btnGre.setOpaque(true);
		btnGre.setBorderPainted(false);
		btnBlu.setBackground(Color.BLUE);
		btnBlu.setOpaque(true);
		btnBlu.setBorderPainted(false);
		btnInd.setBackground(INDIGO);
		btnInd.setOpaque(true);
		btnInd.setBorderPainted(false);
		btnVio.setBackground(VIOLET);
		btnVio.setOpaque(true);
		btnVio.setBorderPainted(false);
		
		mainPanel.add(btnRed);
		mainPanel.add(btnOra);
		mainPanel.add(btnYel);
		mainPanel.add(btnGre);
		mainPanel.add(btnBlu);
		mainPanel.add(btnInd);
		mainPanel.add(btnVio);
		
		btnRed.addActionListener(e -> JOptionPane.showMessageDialog(jframe, "Red signifies passion, vitality, enthusiasm, and security",
				"Color Meaning", JOptionPane.INFORMATION_MESSAGE));
		btnOra.addActionListener(e -> JOptionPane.showMessageDialog(jframe, "Orange signifies energy, balance, warmth, and enthusiasm",
				"Color Meaning", JOptionPane.INFORMATION_MESSAGE));
		btnYel.addActionListener(e -> JOptionPane.showMessageDialog(jframe, "Yellow signifies joy, optimism, happiness, and danger",
				"Color Meaning", JOptionPane.INFORMATION_MESSAGE));
		btnGre.addActionListener(e -> JOptionPane.showMessageDialog(jframe, "Green signifies nature, environment, health, and good luck",
				"Color Meaning", JOptionPane.INFORMATION_MESSAGE));
		btnBlu.addActionListener(e -> JOptionPane.showMessageDialog(jframe, "Blue signifies Peace, harmony, unity, and trust",
				"Color Meaning", JOptionPane.INFORMATION_MESSAGE));
		btnInd.addActionListener(e -> JOptionPane.showMessageDialog(jframe, "Indigo signifies mystery, transformation, wisdom and enlightenment",
				"Color Meaning", JOptionPane.INFORMATION_MESSAGE));
		btnVio.addActionListener(e -> JOptionPane.showMessageDialog(jframe, "Violet signifies royalitet, nobility, spirituality, and ceremony",
				"Color Meaning", JOptionPane.INFORMATION_MESSAGE));
		
		jframe.getContentPane().add(mainPanel);

		setDefaultCloseOperation( EXIT_ON_CLOSE );
		getContentPane().add(mainPanel);
		pack();
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RainbowColorFrame b = new RainbowColorFrame();

		b.setVisible(true);
		

	}

}
