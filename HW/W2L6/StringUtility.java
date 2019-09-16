package W2L6;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StringUtility extends JFrame {

	/**
	 * 
	 */
	JFrame jframe;
	JPanel pnlMain = new JPanel();
	JPanel pnlBtn = new JPanel();
	JPanel pnlTF = new JPanel();
	JLabel lblInput = new JLabel("Input");
	JLabel lblOutput = new JLabel("Output");
	JTextField tfInput = new JTextField(20);
	JTextField tfOutput = new JTextField(20);
	JButton btnCount = new JButton ("Count Letters        ");
	JButton btnRev = new JButton   ("Reverse Letters      ");
	JButton btnRemDup = new JButton("Remove Duplicates");

	public StringUtility() {
		super ("String Utility");
		jframe = new JFrame();
		setBounds(400,250,0,0);
		pnlMain.setLayout(new BorderLayout());
		pnlBtn.setLayout(new BoxLayout(pnlBtn, BoxLayout.Y_AXIS));
		pnlTF.setLayout(new BoxLayout(pnlTF, BoxLayout.Y_AXIS));
		
		pnlBtn.add(btnCount);
		pnlBtn.add(btnRev);
		pnlBtn.add(btnRemDup);
		
		pnlTF.add(lblInput);
		pnlTF.add(tfInput);
		pnlTF.add(lblOutput);
		pnlTF.add(tfOutput);
		
		pnlMain.add(pnlBtn,BorderLayout.CENTER);
		pnlMain.add(pnlTF,BorderLayout.EAST);
		
		btnCount.addActionListener(new ButtonListenerCount());
		btnRev.addActionListener(new ButtonListenerRev());
		btnRemDup.addActionListener(new ButtonListenerRemDup());
		
		jframe.getContentPane().add(pnlMain);

		jframe.setSize(200,300);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		getContentPane().add(pnlMain);
		pack();
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	class ButtonListenerCount implements ActionListener {
		
		public void actionPerformed(ActionEvent evt) {
			String input = tfInput.getText();
			int c = input.length();
			tfOutput.setText(Integer.toString(c));
			 
		}
	}
	
	class ButtonListenerRev implements ActionListener {
		
		private String Rev(String str) {
			if(str.length() <= 1) return str;
			return str.charAt(str.length() - 1) + Rev(str.substring(0,str.length() -1));
			
		}
		
		public void actionPerformed(ActionEvent evt) {
			String input = tfInput.getText();
			String rev = Rev(input);
			tfOutput.setText(rev);
			 
		}
	}
	
	class ButtonListenerRemDup implements ActionListener {
		
		private String RemDup(String input) {
			
			if(input.length() < 2) return input;
			
			String res = "";
			char[] arr = input.toCharArray();
			
			for(int i = 0; i < arr.length - 1; i++) {
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[i] == arr[j]) arr[i] = '^';
					
				}
				
			}
			
			for(char c : arr) if (c != '^') res += c;
			
			return res;
		}
		
		public void actionPerformed(ActionEvent evt) {
			String input = tfInput.getText();
			String res = RemDup(input);
			tfOutput.setText(res);
			 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringUtility b = new StringUtility();

		b.setVisible(true);
		

	}

}
