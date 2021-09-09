import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.TextArea;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MainProgram extends JFrame {

	private JPanel contentPane;
	private JTextField textNama;
	private JTextField textAlamat;
	private JTextField textNoTelp;
	private JTextField textTotalBayar;
	private String result = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProgram frame = new MainProgram();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainProgram() {
		setTitle("Aplikasi Pemesanan Makanan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		setMinimumSize(new Dimension(450, 433));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("APLIKASI PEMESANAN");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitle.setBounds(0, 11, 434, 20);
		contentPane.add(lblTitle);
		
		JPanel panelDataCustomer = new JPanel();
		panelDataCustomer.setToolTipText("");
		panelDataCustomer.setBorder(new TitledBorder(null, "Data Customer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDataCustomer.setBounds(10, 42, 190, 100);
		contentPane.add(panelDataCustomer);
		panelDataCustomer.setLayout(null);
		
		JLabel lblNama = new JLabel("Nama :");
		lblNama.setBounds(10, 20, 46, 14);
		panelDataCustomer.add(lblNama);
		
		JLabel lblAlamat = new JLabel("Alamat :");
		lblAlamat.setBounds(10, 45, 46, 14);
		panelDataCustomer.add(lblAlamat);
		
		JLabel lblNoTelp = new JLabel("No Telp :");
		lblNoTelp.setBounds(10, 70, 46, 14);
		panelDataCustomer.add(lblNoTelp);
		
		textNama = new JTextField();
		textNama.setBounds(66, 17, 86, 20);
		panelDataCustomer.add(textNama);
		textNama.setColumns(10);
		
		textAlamat = new JTextField();
		textAlamat.setColumns(10);
		textAlamat.setBounds(66, 42, 86, 20);
		panelDataCustomer.add(textAlamat);
		
		textNoTelp = new JTextField();
		textNoTelp.setColumns(10);
		textNoTelp.setBounds(66, 67, 86, 20);
		panelDataCustomer.add(textNoTelp);
		
		JPanel panelPilihMenu = new JPanel();
		panelPilihMenu.setLayout(null);
		panelPilihMenu.setToolTipText("");
		panelPilihMenu.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pilih Menu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelPilihMenu.setBounds(235, 42, 190, 100);
		contentPane.add(panelPilihMenu);
		
		JCheckBox chkSteak = new JCheckBox("Steak");
		chkSteak.setBounds(6, 20, 97, 23);
		panelPilihMenu.add(chkSteak);
		
		JCheckBox chkSpaghetti = new JCheckBox("Spaghetti");
		chkSpaghetti.setBounds(6, 46, 97, 23);
		panelPilihMenu.add(chkSpaghetti);
		
		JCheckBox chkPizza = new JCheckBox("Pizza");
		chkPizza.setBounds(6, 72, 97, 23);
		panelPilihMenu.add(chkPizza);
		
		class pilihMenuListener implements ChangeListener {
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				int totalBayar = 0;
				if(chkSteak.isSelected())
					totalBayar += 30000;
				if(chkSpaghetti.isSelected())
					totalBayar += 50000;
				if(chkPizza.isSelected())
					totalBayar += 70000;
				textTotalBayar.setText(Integer.toString(totalBayar));
			}
		}
		
		chkSteak.addChangeListener(new pilihMenuListener());
		chkSpaghetti.addChangeListener(new pilihMenuListener());
		chkPizza.addChangeListener(new pilihMenuListener());
		
		JLabel lblTotalBayar = new JLabel("TOTAL BAYAR");
		lblTotalBayar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalBayar.setBounds(200, 154, 224, 14);
		contentPane.add(lblTotalBayar);
		
		textTotalBayar = new JTextField();
		textTotalBayar.setFont(new Font("Tahoma", Font.BOLD, 11));
		textTotalBayar.setHorizontalAlignment(SwingConstants.RIGHT);
		textTotalBayar.setText("0");
		textTotalBayar.setEditable(false);
		textTotalBayar.setBackground(Color.BLACK);
		textTotalBayar.setForeground(Color.YELLOW);
		textTotalBayar.setBounds(200, 178, 224, 25);
		contentPane.add(textTotalBayar);
		textTotalBayar.setColumns(10);
		
		JButton btnTambah = new JButton("TAMBAH");
		btnTambah.setBounds(335, 214, 89, 23);
		contentPane.add(btnTambah);
		
		JPanel panelDataPenjualan = new JPanel();
		panelDataPenjualan.setLayout(null);
		panelDataPenjualan.setToolTipText("");
		panelDataPenjualan.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Data Penjualan", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelDataPenjualan.setBounds(10, 248, 414, 135);
		contentPane.add(panelDataPenjualan);
		
		TextArea textDataPenjualan = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textDataPenjualan.setEditable(false);
		textDataPenjualan.setBounds(10, 20, 394, 105);
		panelDataPenjualan.add(textDataPenjualan);
		
		btnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result += "Nama : " + textNama.getText() + "\n";
				result += "Alamat : " + textAlamat.getText() + "\n";
				result += "Telp : " + textNoTelp.getText() + "\n";
				result += "------------------------------\n";
				result += "Pesanan : \n";
				if(chkSteak.isSelected())
					result += "\t-Steak (30000)\n";
				if(chkSpaghetti.isSelected())
					result += "\t-Spaghetti (50000)\n";
				if(chkPizza.isSelected())
					result += "\t-Pizza (70000)\n";
				result += "------------------------------\n";
				result += "Total Bayar: \n";
				result += "\tRp." + textTotalBayar.getText() + "\n";
				result += "------------------------------\n";
				textDataPenjualan.setText(result);
			}
		});
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				
				panelPilihMenu.setBounds(getBounds().width - 215, 42, 190, 100);
				lblTotalBayar.setBounds(getBounds().width - 250, 154, 224, 14);
				btnTambah.setBounds(getBounds().width - 115, 214, 89, 23);
				textTotalBayar.setBounds(getBounds().width - 250, 178, 224, 25);
				
				panelDataPenjualan.setBounds(10, 248, getBounds().width - 36, getBounds().height - 298);
				textDataPenjualan.setBounds(10, 20, panelDataPenjualan.getBounds().width - 20, panelDataPenjualan.getBounds().height - 30);
				
			}
		});
		
		
	}
}
