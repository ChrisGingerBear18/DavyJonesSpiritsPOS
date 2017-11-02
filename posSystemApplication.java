package Package01;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.JInternalFrame;
import java.awt.Rectangle;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.UIManager;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Insets;
import javax.swing.JLabel;

/*	Group:			BitCoin Bandits -- ( Chris Ginger , Chase Futrell, Hannah Walsh, Hao Fu, Brenden Boldt, Megan Moore ) --
 *  Team Number: 	3
 *  Professor:		John Carlson - MIS 4320
 * 	Date Started:	11/1/2017	
 * 	Date Completed:	--
 * 	Program:		POS System
*/
public class posSystemApplication extends JFrame implements ActionListener
{
	
	/**
	 * -- Serialization of the class posSystemApplication object --
	 */
	private static final long serialVersionUID = 1L;

	/* -- Variable Declarations Section -- */
	private final JTabbedPane menuSelection = new JTabbedPane(JTabbedPane.TOP);
	private JPanel mainPanel;

	

	/* -- Constructor Starts Here -- */ 
	/*|||||||||||||||||||||||||||||||*/	
	public posSystemApplication() 
	{
		mainPanel = new JPanel();
		JPanel checkoutPanel = new JPanel();
		JPanel couponPanel = new JPanel();
		checkoutPanel.setBackground(UIManager.getColor("Menu.background")); 
		mainPanel.setBackground(Color.GRAY);
		couponPanel.setBackground(Color.WHITE);
		
		JFrame window = new JFrame();
		window.setTitle("The Davy Jones Spirits POS System");
		mainPanel.setLayout(new CardLayout(0, 0));
		menuSelection.setFocusTraversalKeysEnabled(false);
		
		
		menuSelection.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		/*Add the tabs to the JTabbedPane so we can switch to different parts of the POS system*/
		menuSelection.addTab("Home", mainPanel);
		menuSelection.addTab("Checkout", checkoutPanel);
		GridBagLayout gbl_checkoutPanel = new GridBagLayout();
		gbl_checkoutPanel.columnWidths = new int[]{750, 559, 0};
		gbl_checkoutPanel.rowHeights = new int[]{700, 0};
		gbl_checkoutPanel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_checkoutPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		checkoutPanel.setLayout(gbl_checkoutPanel);
		menuSelection.addTab("Coupon Catalog", couponPanel);
		GridBagLayout gbl_couponPanel = new GridBagLayout();
		gbl_couponPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_couponPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_couponPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_couponPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		couponPanel.setLayout(gbl_couponPanel);
		
		JLabel lblCoupon = new JLabel("Coupon 1");
		GridBagConstraints gbc_lblCoupon = new GridBagConstraints();
		gbc_lblCoupon.anchor = GridBagConstraints.BASELINE;
		gbc_lblCoupon.ipady = 40;
		gbc_lblCoupon.ipadx = 40;
		gbc_lblCoupon.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoupon.gridx = 1;
		gbc_lblCoupon.gridy = 1;
		couponPanel.add(lblCoupon, gbc_lblCoupon);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.ipady = 40;
		gbc_lblNewLabel_5.ipadx = 40;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 13;
		gbc_lblNewLabel_5.gridy = 1;
		couponPanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.ipady = 40;
		gbc_lblNewLabel_13.ipadx = 40;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 25;
		gbc_lblNewLabel_13.gridy = 1;
		couponPanel.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.ipady = 40;
		gbc_lblNewLabel_21.ipadx = 40;
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_21.gridx = 36;
		gbc_lblNewLabel_21.gridy = 1;
		couponPanel.add(lblNewLabel_21, gbc_lblNewLabel_21);
		
		JLabel lblCoupon_1 = new JLabel("Coupon 2");
		GridBagConstraints gbc_lblCoupon_1 = new GridBagConstraints();
		gbc_lblCoupon_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblCoupon_1.ipady = 40;
		gbc_lblCoupon_1.ipadx = 40;
		gbc_lblCoupon_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoupon_1.gridx = 1;
		gbc_lblCoupon_1.gridy = 4;
		couponPanel.add(lblCoupon_1, gbc_lblCoupon_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.ipady = 40;
		gbc_lblNewLabel_6.ipadx = 40;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 13;
		gbc_lblNewLabel_6.gridy = 4;
		couponPanel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.ipady = 40;
		gbc_lblNewLabel_14.ipadx = 40;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 25;
		gbc_lblNewLabel_14.gridy = 4;
		couponPanel.add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.ipady = 40;
		gbc_lblNewLabel_22.ipadx = 40;
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_22.gridx = 36;
		gbc_lblNewLabel_22.gridy = 4;
		couponPanel.add(lblNewLabel_22, gbc_lblNewLabel_22);
		
		JLabel lblCoupon_2 = new JLabel("Coupon 3");
		GridBagConstraints gbc_lblCoupon_2 = new GridBagConstraints();
		gbc_lblCoupon_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblCoupon_2.ipady = 40;
		gbc_lblCoupon_2.ipadx = 40;
		gbc_lblCoupon_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoupon_2.gridx = 1;
		gbc_lblCoupon_2.gridy = 7;
		couponPanel.add(lblCoupon_2, gbc_lblCoupon_2);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.ipady = 40;
		gbc_lblNewLabel_7.ipadx = 40;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 13;
		gbc_lblNewLabel_7.gridy = 7;
		couponPanel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.ipady = 40;
		gbc_lblNewLabel_15.ipadx = 40;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 25;
		gbc_lblNewLabel_15.gridy = 7;
		couponPanel.add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		JLabel lblNewLabel_23 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.ipady = 40;
		gbc_lblNewLabel_23.ipadx = 40;
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_23.gridx = 36;
		gbc_lblNewLabel_23.gridy = 7;
		couponPanel.add(lblNewLabel_23, gbc_lblNewLabel_23);
		
		JLabel lblNewLabel = new JLabel("Coupon 4");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.ipady = 40;
		gbc_lblNewLabel.ipadx = 40;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 10;
		couponPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.ipady = 40;
		gbc_lblNewLabel_8.ipadx = 40;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 13;
		gbc_lblNewLabel_8.gridy = 10;
		couponPanel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.ipady = 40;
		gbc_lblNewLabel_16.ipadx = 40;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 25;
		gbc_lblNewLabel_16.gridy = 10;
		couponPanel.add(lblNewLabel_16, gbc_lblNewLabel_16);
		
		JLabel lblNewLabel_24 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_24 = new GridBagConstraints();
		gbc_lblNewLabel_24.ipady = 40;
		gbc_lblNewLabel_24.ipadx = 40;
		gbc_lblNewLabel_24.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_24.gridx = 36;
		gbc_lblNewLabel_24.gridy = 10;
		couponPanel.add(lblNewLabel_24, gbc_lblNewLabel_24);
		
		JLabel lblNewLabel_1 = new JLabel("Coupon 5");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_1.ipady = 40;
		gbc_lblNewLabel_1.ipadx = 40;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 13;
		couponPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.ipady = 40;
		gbc_lblNewLabel_9.ipadx = 40;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 13;
		gbc_lblNewLabel_9.gridy = 13;
		couponPanel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.ipady = 40;
		gbc_lblNewLabel_17.ipadx = 40;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 25;
		gbc_lblNewLabel_17.gridy = 13;
		couponPanel.add(lblNewLabel_17, gbc_lblNewLabel_17);
		
		JLabel lblNewLabel_25 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_25 = new GridBagConstraints();
		gbc_lblNewLabel_25.ipady = 40;
		gbc_lblNewLabel_25.ipadx = 40;
		gbc_lblNewLabel_25.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_25.gridx = 36;
		gbc_lblNewLabel_25.gridy = 13;
		couponPanel.add(lblNewLabel_25, gbc_lblNewLabel_25);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.ipady = 40;
		gbc_label.ipadx = 40;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 13;
		gbc_label.gridy = 14;
		couponPanel.add(label, gbc_label);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.ipady = 40;
		gbc_lblNewLabel_4.ipadx = 40;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 17;
		couponPanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.ipady = 40;
		gbc_lblNewLabel_2.ipadx = 40;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 13;
		gbc_lblNewLabel_2.gridy = 17;
		couponPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.ipadx = 40;
		gbc_lblNewLabel_20.ipady = 40;
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 25;
		gbc_lblNewLabel_20.gridy = 17;
		couponPanel.add(lblNewLabel_20, gbc_lblNewLabel_20);
		
		JLabel lblNewLabel_29 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_29 = new GridBagConstraints();
		gbc_lblNewLabel_29.ipadx = 40;
		gbc_lblNewLabel_29.ipady = 40;
		gbc_lblNewLabel_29.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_29.gridx = 36;
		gbc_lblNewLabel_29.gridy = 17;
		couponPanel.add(lblNewLabel_29, gbc_lblNewLabel_29);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.ipady = 40;
		gbc_lblNewLabel_3.ipadx = 40;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 20;
		couponPanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.ipady = 40;
		gbc_lblNewLabel_12.ipadx = 40;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 13;
		gbc_lblNewLabel_12.gridy = 20;
		couponPanel.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		JLabel lblNewLabel_26 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_26 = new GridBagConstraints();
		gbc_lblNewLabel_26.ipady = 40;
		gbc_lblNewLabel_26.ipadx = 40;
		gbc_lblNewLabel_26.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_26.gridx = 25;
		gbc_lblNewLabel_26.gridy = 20;
		couponPanel.add(lblNewLabel_26, gbc_lblNewLabel_26);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.ipady = 40;
		gbc_lblNewLabel_10.ipadx = 40;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 1;
		gbc_lblNewLabel_10.gridy = 23;
		couponPanel.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.ipady = 40;
		gbc_lblNewLabel_18.ipadx = 40;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 13;
		gbc_lblNewLabel_18.gridy = 23;
		couponPanel.add(lblNewLabel_18, gbc_lblNewLabel_18);
		
		JLabel lblNewLabel_27 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_27 = new GridBagConstraints();
		gbc_lblNewLabel_27.ipady = 40;
		gbc_lblNewLabel_27.ipadx = 40;
		gbc_lblNewLabel_27.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_27.gridx = 25;
		gbc_lblNewLabel_27.gridy = 23;
		couponPanel.add(lblNewLabel_27, gbc_lblNewLabel_27);
		
		JLabel label_2 = new JLabel("");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.ipady = 40;
		gbc_label_2.ipadx = 40;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 26;
		couponPanel.add(label_2, gbc_label_2);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.ipady = 40;
		gbc_lblNewLabel_11.ipadx = 40;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 1;
		gbc_lblNewLabel_11.gridy = 27;
		couponPanel.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		JLabel lblNewLabel_19 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.ipady = 40;
		gbc_lblNewLabel_19.ipadx = 40;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 13;
		gbc_lblNewLabel_19.gridy = 27;
		couponPanel.add(lblNewLabel_19, gbc_lblNewLabel_19);
		
		JLabel lblNewLabel_28 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_28 = new GridBagConstraints();
		gbc_lblNewLabel_28.ipady = 40;
		gbc_lblNewLabel_28.ipadx = 40;
		gbc_lblNewLabel_28.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_28.gridx = 25;
		gbc_lblNewLabel_28.gridy = 27;
		couponPanel.add(lblNewLabel_28, gbc_lblNewLabel_28);
		
		JLabel label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.ipady = 40;
		gbc_label_1.ipadx = 40;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 13;
		gbc_label_1.gridy = 28;
		couponPanel.add(label_1, gbc_label_1);
		JInternalFrame internalFrame = new JInternalFrame("About this System");
		internalFrame.setNormalBounds(new Rectangle(10, 50, 200, 200));
		mainPanel.add(internalFrame, "Homepage_InternalFrame");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{200, 0};
		gridBagLayout.rowHeights = new int[]{664, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		internalFrame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(75, 50));
		panel.setPreferredSize(new Dimension(200, 50));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		internalFrame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(null);
		internalFrame.setVisible(true);

		/* -- add the JTabbedPane to the frame --*/
		window.getContentPane().add(menuSelection, BorderLayout.CENTER);

	
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setSize(1348, 793);
		window.setVisible(true);
	}
	
	
	/* -- Main Method Starts here -- */ 
	/*|||||||||||||||||||||||||||||||*/
	public static void main(String[] args)
	{
		posSystemApplication app = new posSystemApplication();	
	
	}


	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
}
