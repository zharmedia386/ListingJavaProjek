package Aplikasi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class apl extends JFrame {

	private JPanel contentPane;
	private JTextField alamat;
	private JTextField no_telp;
	private JTextField TotalBayar;
	private JTextField nama;
	private JCheckBox Steak;
	private JCheckBox Spagethi;
	private JCheckBox Pizza;
	private JButton tambah;
	private JTextArea result;
	private String res = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					apl frame = new apl();
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
	public apl() {
		setTitle("Aplikasi Pemesanan Makanan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 590);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel title = DefaultComponentFactory.getInstance().createTitle("Aplikasi Pemesanan");
		title.setFont(new Font("Arial", Font.BOLD, 15));
		title.setBounds(219, 13, 140, 16);
		contentPane.add(title);

		JPanel data_customer = new JPanel();
		data_customer
				.setBorder(new TitledBorder(null, "Data Customer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		data_customer.setBounds(12, 42, 296, 152);
		contentPane.add(data_customer);
		data_customer.setLayout(null);

		JLabel lblNama = new JLabel("Nama :");
		lblNama.setBounds(12, 25, 56, 16);
		data_customer.add(lblNama);

		JLabel lblAlamat = new JLabel("Alamat :");
		lblAlamat.setBounds(12, 66, 56, 16);
		data_customer.add(lblAlamat);

		JLabel lblNoTelp = new JLabel("No Telp :");
		lblNoTelp.setBounds(12, 108, 56, 16);
		data_customer.add(lblNoTelp);

		alamat = new JTextField();
		alamat.setBounds(80, 66, 116, 19);
		data_customer.add(alamat);
		alamat.setColumns(10);

		no_telp = new JTextField();
		no_telp.setBounds(80, 106, 116, 19);
		data_customer.add(no_telp);
		no_telp.setColumns(10);

		nama = new JTextField();
		nama.setColumns(10);
		nama.setBounds(80, 22, 116, 19);
		data_customer.add(nama);

		JPanel menu = new JPanel();
		menu.setBorder(new TitledBorder(null, "Pilih Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		menu.setBounds(347, 64, 192, 130);
		contentPane.add(menu);
		menu.setLayout(null);

		Steak = new JCheckBox("Steak");
		Steak.setBounds(8, 17, 61, 25);
		Steak.setHorizontalAlignment(SwingConstants.LEFT);
		Steak.setVerticalAlignment(SwingConstants.TOP);
		Steak.addActionListener(new checkboxlistener());
		menu.add(Steak);

		Spagethi = new JCheckBox("Spagethi");
		Spagethi.setBounds(8, 47, 113, 25);
		Spagethi.addActionListener(new checkboxlistener());
		menu.add(Spagethi);

		Pizza = new JCheckBox("Pizza");
		Pizza.setBounds(8, 77, 113, 25);
		Pizza.addActionListener(new checkboxlistener());
		menu.add(Pizza);

		JPanel total_bayar = new JPanel();
		total_bayar.setBorder(null);
		total_bayar.setBounds(293, 205, 247, 101);
		contentPane.add(total_bayar);
		total_bayar.setLayout(null);

		JLabel lblNewLabel = new JLabel("Total Bayar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 0, 92, 16);
		total_bayar.add(lblNewLabel);

		TotalBayar = new JTextField();
		TotalBayar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TotalBayar.setHorizontalAlignment(SwingConstants.RIGHT);
		TotalBayar.setText("0");
		TotalBayar.setEditable(false);
		TotalBayar.setForeground(new Color(255, 255, 0));
		TotalBayar.setBackground(new Color(0, 0, 0));
		TotalBayar.setBounds(0, 29, 247, 36);
		total_bayar.add(TotalBayar);
		TotalBayar.setColumns(10);

		tambah = new JButton("TAMBAH");
		tambah.setBounds(150, 71, 97, 25);
		tambah.addActionListener(new buttonlistener());
		total_bayar.add(tambah);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Data Penjualan", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(12, 319, 528, 211);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(2, 2));

		result = new JTextArea("");
		JScrollPane ScrollRes = new JScrollPane(result);
		panel_3.add(ScrollRes, BorderLayout.CENTER);
	}

	private class checkboxlistener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			getTotalBayar();
		}
	}

	private void getTotalBayar() {
		int totalHarga = 0;
		if (Steak.isSelected())
			totalHarga += 50000;
		if (Spagethi.isSelected())
			totalHarga += 40000;
		if (Pizza.isSelected())
			totalHarga += 80000;
		TotalBayar.setText(Integer.toString(totalHarga));
	}

	private class buttonlistener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			res += addRes();
			result.setText(res);
		}
	}

	private String addRes() {
		if (nama.getText().isEmpty() || alamat.getText().isEmpty() || no_telp.getText().isEmpty()) {
			return "Terdapat Field Kosong Pada Data Customer, Harap Penuhi Semua Field!!!" + "\n"
					+ "====================================================================" + "\n";
		}
		if (!(Pizza.isSelected()) && !(Spagethi.isSelected()) && !(Steak.isSelected())) {
			return "Tidak Terdapat Menu yang dipilih, Harap pilih Menu!!!" + "\n"
					+ "====================================================================" + "\n";
		}
		String add = new String();
		add += "Nama : " + nama.getText() + "\n";
		add += "Alamat : " + alamat.getText() + "\n";
		add += "Telp : " + no_telp.getText() + "\n";
		add += "--------------------------------" + "\n";
		add += "Pesanan : " + "\n";
		int total = 0;
		if (Steak.isSelected()) {
			add += " -Steak (50000)" + "\n";
			total += 50000;
		}
		if (Spagethi.isSelected()) {
			add += " -Spagethi (40000)" + "\n";
			total += 40000;
		}
		if (Pizza.isSelected()) {
			add += " -Pizza (80000)" + "\n";
			total += 80000;
		}
		add += "--------------------------------" + "\n";
		add += "Total Bayar : " + "\n";
		add += "    Rp. " + total + "\n";
		add += add += "====================================================================" + "\n";
		return add;
	}
}
