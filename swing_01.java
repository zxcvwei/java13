import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class swing_01 extends JFrame {
	private JButton jbtnExit = new JButton("Exit");
	private JButton jbtnStart = new JButton("Start");
	private JLabel jlb1 = new JLabel();
	private Container cp;
	private String str = "«öStart«ö¶sªº¦¸¼Æ";
	private int count = 0;

	public swing_01() {
		initComp();
	}

	public void initComp() {
		cp = this.getContentPane();
		this.setBounds(150, 100, 600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);

		jlb1.setBounds(50, 70, 250, 25);
		jlb1.setText(str + count);
		cp.add(jlb1);

		jbtnExit.setBounds(50, 125, 100, 20);
		cp.add(jbtnExit);
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aa) {
				System.exit(0);
			}
		});

		jbtnStart.setBounds(50, 100, 100, 20);
		cp.add(jbtnStart);
		jbtnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aa) {
				count++;
				jlb1.setText(str + count);
			}
		});
	}
}
