import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import java.awt.Panel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class MainDriver extends JFrame {

	/**
	 * Variable Declaration
	 */
	private JPanel contentPane;
	private JTextField textField_nama;
	private JTextField textField_alamat;
	private JTextField textField_notelp;
	private JTextField textField_totalBayar;
	private JLabel lbl_totalbayar;
	private JCheckBox chckbx_pizza;
	private JCheckBox chckbx_spaghetti;
	private JCheckBox chckbx_steak;
	private TextArea textArea_dataPenjualan;
	private String disp_receipt = "";

	// Operasi Menjumlahkan Harga Total Pesanan
	private void getTotalBayar(){
		int totalBayar = 0;
		if(chckbx_steak.isSelected())
			totalBayar += 30000;
		if(chckbx_spaghetti.isSelected())
			totalBayar += 50000;
		if(chckbx_pizza.isSelected())
			totalBayar += 70000;

		textField_totalBayar.setText(String.valueOf(totalBayar));
	}

	// Operasi Menampilkan Receipt Pemesanan
	private void setReceipt(){
		disp_receipt += ("[ FOOD ORDERING RECEIPT ]\n");
		disp_receipt += ("Name    : " + textField_nama.getText() +"\n");
		disp_receipt += ("Address : " + textField_alamat.getText() + "\n");
		disp_receipt += ("Phone   : " + textField_notelp.getText() + "\n");
		disp_receipt += ("==========\n");
		disp_receipt += ("Ordered Food :\n");
		if(chckbx_steak.isSelected())
			disp_receipt += ("1. " + chckbx_steak.getText() + " Rp30.000\n") ;
		if(chckbx_spaghetti.isSelected())
			disp_receipt += ("2. " + chckbx_spaghetti.getText() + " Rp50.000\n");
		if(chckbx_pizza.isSelected())
			disp_receipt += ("3. " + chckbx_pizza.getText() + " Rp70.000\n");
		disp_receipt += ("==========\n");
		disp_receipt += ("Total :\n");
		disp_receipt += ("Rp" + textField_totalBayar.getText() + "\n");
		disp_receipt += ("==========\n");
		textArea_dataPenjualan.setText(disp_receipt);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDriver frame = new MainDriver();
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
	public MainDriver() {
		setTitle("Aplikasi Pemesanan Makanan\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_judul = new JLabel("APLIKASI PEMESANAN MAKANAN");
		lbl_judul.setBounds(5, 5, 471, 20);
		lbl_judul.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_judul.setFont(new Font("Noto Sans", Font.BOLD, 14));
		contentPane.add(lbl_judul);
		
		JPanel panel_datacustomer = new JPanel();
		panel_datacustomer.setBounds(10, 42, 190, 100);
		panel_datacustomer.setBorder(new TitledBorder(null, "DataCustomer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_datacustomer);
		panel_datacustomer.setLayout(null);
		
		JLabel lbl_nama = new JLabel("Nama    :");
		lbl_nama.setBounds(10, 21, 46, 14);
		panel_datacustomer.add(lbl_nama);
		
		JLabel lbl_alamat = new JLabel("Alamat  :");
		lbl_alamat.setBounds(10, 46, 46, 14);
		panel_datacustomer.add(lbl_alamat);
		
		JLabel lbl_notelp = new JLabel("No Telp :");
		lbl_notelp.setBounds(10, 71, 46, 14);
		panel_datacustomer.add(lbl_notelp);
		
		textField_nama = new JTextField();
		textField_nama.setBounds(66, 18, 86, 20);
		panel_datacustomer.add(textField_nama);
		textField_nama.setColumns(10);
		
		textField_alamat = new JTextField();
		textField_alamat.setColumns(10);
		textField_alamat.setBounds(66, 43, 86, 20);
		panel_datacustomer.add(textField_alamat);
		
		textField_notelp = new JTextField();
		textField_notelp.setColumns(10);
		textField_notelp.setBounds(66, 68, 86, 20);
		panel_datacustomer.add(textField_notelp);
		
		JPanel panel_pilihmenu = new JPanel();
		panel_pilihmenu.setBorder(new TitledBorder(null, "Pilih Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_pilihmenu.setBounds(263, 42, 190, 100);
		contentPane.add(panel_pilihmenu);
		panel_pilihmenu.setLayout(null);
		
		chckbx_steak = new JCheckBox("Steak");
		chckbx_steak.setBounds(10, 21, 97, 23);
		panel_pilihmenu.add(chckbx_steak);
		chckbx_steak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				getTotalBayar();
			}
		});
		
		chckbx_spaghetti = new JCheckBox("Spaghetti");
		chckbx_spaghetti.setBounds(10, 43, 97, 23);
		panel_pilihmenu.add(chckbx_spaghetti);
		chckbx_spaghetti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				getTotalBayar();
			}
		});
		
		chckbx_pizza = new JCheckBox("Pizza");
		chckbx_pizza.setBounds(10, 65, 97, 23);
		panel_pilihmenu.add(chckbx_pizza);
		chckbx_pizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				getTotalBayar();
			}
		});
		
		lbl_totalbayar = new JLabel("TOTAL BAYAR");
		lbl_totalbayar.setFont(new Font("Noto Sans", Font.BOLD, 14));
		lbl_totalbayar.setBounds(230, 164, 102, 14);
		contentPane.add(lbl_totalbayar);
		
		textField_totalBayar = new JTextField();
		textField_totalBayar.setEditable(false);
		textField_totalBayar.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_totalBayar.setFont(new Font("Noto Serif", Font.BOLD, 13));
		textField_totalBayar.setBackground(Color.BLACK);
		textField_totalBayar.setForeground(Color.YELLOW);
		textField_totalBayar.setText("0");
		textField_totalBayar.setBounds(230, 183, 223, 28);
		contentPane.add(textField_totalBayar);
		textField_totalBayar.setColumns(10);
		
		JButton btnTambah = new JButton("TAMBAH");
		btnTambah.setBounds(351, 222, 102, 23);
		contentPane.add(btnTambah);
		btnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				setReceipt();
			}
		});
		
		JPanel panelDataPenjualan = new JPanel();
		panelDataPenjualan.setLayout(null);
		panelDataPenjualan.setBorder(new TitledBorder(null, "Data Penjualan", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDataPenjualan.setBounds(5, 256, 448, 120);
		contentPane.add(panelDataPenjualan);
		
		textArea_dataPenjualan = new TextArea();
		textArea_dataPenjualan.setEditable(false);
		textArea_dataPenjualan.setBounds(10, 20, 428, 90);
		panelDataPenjualan.add(textArea_dataPenjualan);
	}
}
