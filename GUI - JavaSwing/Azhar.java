import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Azhar extends JFrame {
    private JPanel contentPane;
    private JTextField name;
    private JTextField address;
    private JTextField phone;
    private JTextField total;
    private JLabel nama;
    private JCheckBox steak;
    private JCheckBox spageti;
    private JCheckBox pizza;
    private TextArea PayResult;
    private String resultStruck = "";
    private void getPayTotal() {
        int pay = 0;
        if (steak.isSelected()) {
            pay = pay + 50000;
        }
        if (spageti.isSelected()) {
            pay = pay + 40000;
        }
        if (pizza.isSelected()) {
            pay = pay + 80000;
        }
        total.setText(String.valueOf(pay));
    }
    private void setStruck() {
        resultStruck += ("============[NEW ORDER]============\n");
        resultStruck += "Name :" + name.getText() + "\n";
        resultStruck += "Address :" + address.getText() + "\n";
        resultStruck += "Phone :" + phone.getText() + "\n";
        resultStruck += ("===================================\n");
        resultStruck += "Order : \n";
        if (steak.isSelected()) {
            resultStruck += "*" + steak.getText() + " (Rp50000)\n ";
    }
    if (spageti.isSelected()) {
        resultStruck += "*" + spageti.getText() + " (Rp40000)\n";
    }
    if (pizza.isSelected()) {
        resultStruck += "*" + pizza.getText() + " (Rp80000)\n ";
}
resultStruck += ("===================================\n");
resultStruck += "Pay Total :\n";
resultStruck += " Rp." + total.getText() + "\n";
resultStruck += ("===================================");
PayResult.setText(resultStruck);
}
/**
 * Launch the application.
 */
public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                Azhar frame = new
                Azhar();
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
public Azhar() {
    setTitle("Aplikasi Pemesanan");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 562, 507);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    JLabel lblNewLabel = new JLabel("Customer's Data");
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblNewLabel.setBounds(34, 36, 135, 28);
    contentPane.add(lblNewLabel);
    Panel panel = new Panel();
    panel.setBounds(34, 59, 272, 104);
    contentPane.add(panel);
    panel.setLayout(null);
    JLabel telfon = new JLabel("Phone :");
    telfon.setBounds(10, 70, 69, 17);
    panel.add(telfon);
    telfon.setFont(new Font("Tahoma", Font.PLAIN, 14));
    nama = new JLabel("Name :");
    nama.setFont(new Font("Tahoma", Font.PLAIN, 14));
    nama.setBounds(10, 14, 69, 17);
    panel.add(nama);
    JLabel alamat = new JLabel("Address :");
    alamat.setFont(new Font("Tahoma", Font.PLAIN, 14));
    alamat.setBounds(10, 42, 69, 17);
    panel.add(alamat);
    name = new JTextField();
    name.setBounds(88, 14, 96, 20);
    panel.add(name);
    name.setColumns(10);
    address = new JTextField();
    address.setColumns(10);
    address.setBounds(89, 42, 96, 20);
    panel.add(address);
    phone = new JTextField();
    phone.setColumns(10);
    phone.setBounds(88, 70, 96, 20);
    panel.add(phone);
    Panel panel_1 = new Panel();
    panel_1.setBounds(301, 59, 223, 104);
    contentPane.add(panel_1);
    panel_1.setLayout(null);
    steak = new JCheckBox("Steak");
    steak.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            getPayTotal();
        }
    });
    steak.setFont(new Font("Tahoma", Font.PLAIN, 14));
    steak.setBounds(6, 7, 168, 30);
    panel_1.add(steak);
    spageti = new JCheckBox("Spaghetti");
    spageti.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            getPayTotal();
        }
    });
    spageti.setFont(new Font("Tahoma", Font.PLAIN, 14));
    spageti.setBounds(6, 34, 168, 30);
    panel_1.add(spageti);
    pizza = new JCheckBox("Pizza");
    pizza.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            getPayTotal();
        }
    });
    pizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
    pizza.setBounds(6, 61, 168, 30);
    panel_1.add(pizza);
    JLabel lblListOfMenu = new JLabel("List of Menu");
    lblListOfMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblListOfMenu.setBounds(301, 36, 135, 28);
    contentPane.add(lblListOfMenu);
    JLabel lblNewLabel_2 = new JLabel("TOTAL");
    lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblNewLabel_2.setBounds(301, 169, 145, 28);
    contentPane.add(lblNewLabel_2);
    total = new JTextField();
    total.setForeground(Color.WHITE);
    total.setBackground(Color.BLACK);
    total.setSelectedTextColor(Color.WHITE);
    total.setBounds(301, 197, 223, 28);
    contentPane.add(total);
    total.setColumns(10);
    JButton btnNewButton = new JButton("ADD");
    btnNewButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            setStruck();
        }
    });
    btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
    btnNewButton.setBounds(415, 236, 109, 35);
    contentPane.add(btnNewButton);
    PayResult = new TextArea();
    PayResult.setBounds(10, 285, 514, 174);
    contentPane.add(PayResult);
    JLabel lblSellingData = new JLabel("Sales Data");
    lblSellingData.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblSellingData.setBounds(10, 248, 135, 28);
    contentPane.add(lblSellingData);
}
}