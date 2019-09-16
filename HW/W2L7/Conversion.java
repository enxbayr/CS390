package W2L7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Conversion extends JFrame {

	/**
	 * 
	 */
	JFrame jframe;
	JPanel pnlMain = new JPanel();
	JPanel pnlInput = new JPanel();
	JPanel pnlDist = new JPanel();
	JPanel pnlWeight = new JPanel();
	JPanel pnlLiquid = new JPanel();
	JPanel pnlTempa = new JPanel();
	JPanel pnlBtn = new JPanel();
	
	JLabel lblMile = new JLabel("          Mile:");
	JTextField tfMile = new JTextField(16);
	JLabel lblKM = new JLabel("   Kilometer:");
	JTextField tfKM = new JTextField(16);
	
	JLabel lblPound = new JLabel("        Pount:");
	JTextField tfPound = new JTextField(16);
	JLabel lblKG = new JLabel("    Kilogram:");
	JTextField tfKG = new JTextField(16);
	
	JLabel lblGallon = new JLabel("       Gallon:");
	JTextField tfGallon = new JTextField(16);
	JLabel lblLiter = new JLabel("           Liter:");
	JTextField tfLiter = new JTextField(16);
	
	JLabel lblFahr = new JLabel(" Fahrenheit:");
	JTextField tfFahr = new JTextField(16);
	JLabel lblCenti = new JLabel("Centrigrade:");
	JTextField tfCentri = new JTextField(16);
	
	JButton btnConvert = new JButton("Convert");
	public Conversion() {
		super ("String Utility");
		jframe = new JFrame();
		setBounds(400,250,0,0);
		pnlMain.setLayout(new BorderLayout());
		pnlInput.setLayout(new BoxLayout(pnlInput, BoxLayout.Y_AXIS));
		pnlDist.setLayout(new FlowLayout());
		pnlWeight.setLayout(new FlowLayout());
		pnlLiquid.setLayout(new FlowLayout());
		pnlTempa.setLayout(new FlowLayout());
		pnlBtn.setLayout(new BorderLayout());
		
		pnlDist.add(lblMile);
		pnlDist.add(tfMile);
		pnlDist.add(lblKM);
		pnlDist.add(tfKM);
		
		pnlWeight.add(lblPound);
		pnlWeight.add(tfPound);
		pnlWeight.add(lblKG);
		pnlWeight.add(tfKG);
		
		pnlLiquid.add(lblGallon);
		pnlLiquid.add(tfGallon);
		pnlLiquid.add(lblLiter);
		pnlLiquid.add(tfLiter);
		
		pnlTempa.add(lblFahr);
		pnlTempa.add(tfFahr);
		pnlTempa.add(lblCenti);
		pnlTempa.add(tfCentri);
		
		pnlBtn.add(new JLabel("                                                               "), BorderLayout.EAST);
		pnlBtn.add(btnConvert, BorderLayout.CENTER);
		pnlBtn.add(new JLabel("                                                               "), BorderLayout.WEST);
		
		pnlInput.add(pnlDist);
		pnlInput.add(pnlWeight);
		pnlInput.add(pnlLiquid);
		pnlInput.add(pnlTempa);
		
		pnlMain.add(pnlInput,BorderLayout.CENTER);
		pnlMain.add(pnlBtn,BorderLayout.SOUTH);
		
		btnConvert.addActionListener(e -> {
			tfKM.setText(Double.toString(Double.parseDouble(tfMile.getText())*1.609344));
			tfKG.setText(Double.toString(Double.parseDouble(tfPound.getText())*0.45359237 ));
			tfLiter.setText(Double.toString(Double.parseDouble(tfGallon.getText())*3.78541178));
			tfCentri.setText(Double.toString((Double.parseDouble(tfFahr.getText())-32)*0.555555555555556));
		});
	
		jframe.getContentPane().add(pnlMain);

		//jframe.setSize(200,300);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		getContentPane().add(pnlMain);
		pack();
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	class ButtonListenerConvert implements ActionListener {
		
		public void actionPerformed(ActionEvent evt) {
			 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conversion b = new Conversion();

		b.setVisible(true);
		

	}

}
