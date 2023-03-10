package jsonTransformPack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Window.Type;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;

public class ConversorGUI extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtCantidad;
	ConversorMoneda conMoneda = new ConversorMoneda();
	comboAgregar comboagregar = new comboAgregar();
	ConversorTemperatura conTemperatura = new ConversorTemperatura();
	ConversorDistancia conDistancia = new ConversorDistancia();
	private JTextField txtResultado;
	private JTextField txtGrado;
	private JTextField txtResultadoTemp;
	private JTextField txtValorDistancia;
	private JTextField txtResultadoDistancia;
	/**
	 * Launch the application.
	 */
	public void mainGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorGUI frame = new ConversorGUI();
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
	public ConversorGUI() {
		setForeground(Color.BLACK);
		setFont(new Font("Dialog", Font.PLAIN, 13));
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "name_538441071062100");
		
		JPanel panelMoneda = new JPanel();
		tabbedPane.addTab("Moneda", null, panelMoneda, null);
		panelMoneda.setLayout(null);
		
		JLabel lblMoneda = new JLabel("Moneda");
		lblMoneda.setBounds(66, 11, 59, 14);
		panelMoneda.add(lblMoneda);
		
		final JComboBox cbMoneda = new JComboBox();
		cbMoneda.setModel(new DefaultComboBoxModel(new String[] {"Dolar", "Euro", "Libras", "Won", "Yen"}));
		cbMoneda.setToolTipText("\r\n");
		cbMoneda.setBounds(153, 7, 89, 22);
		panelMoneda.add(cbMoneda);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(153, 49, 89, 20);
		panelMoneda.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(66, 52, 46, 14);
		panelMoneda.add(lblCantidad);
		
		JLabel lblCambioMoneda = new JLabel("Cambio");
		lblCambioMoneda.setBounds(66, 108, 46, 14);
		panelMoneda.add(lblCambioMoneda);
		
		final JComboBox cbMonedaConvertir = new JComboBox();
		cbMonedaConvertir.setModel(new DefaultComboBoxModel(new String[] {"Euro", "Libras", "Won", "Yen"}));
		cbMonedaConvertir.setBounds(153, 104, 89, 22);
		panelMoneda.add(cbMonedaConvertir);
		
		
		txtResultado = new JTextField();
		txtResultado.setEnabled(false);
		txtResultado.setBounds(153, 146, 89, 20);
		panelMoneda.add(txtResultado);
		txtResultado.setColumns(10);
		
		
		JButton btnConvertir = new JButton("Convertir");
		
		btnConvertir.setBounds(153, 189, 89, 23);
		panelMoneda.add(btnConvertir);
		
		
		
		JPanel panelTemperatura = new JPanel();
		tabbedPane.addTab("Temperatura", null, panelTemperatura, null);
		panelTemperatura.setLayout(null);
		
		JLabel lblEscala = new JLabel("Escala");
		lblEscala.setBounds(78, 26, 46, 14);
		panelTemperatura.add(lblEscala);
		
		final JComboBox cbTemperatura = new JComboBox();
		
		cbTemperatura.setModel(new DefaultComboBoxModel(new String[] {"Fahrenheit", "Celsius", "Kelvin"}));
		cbTemperatura.setToolTipText("");
		cbTemperatura.setBounds(167, 22, 96, 22);
		panelTemperatura.add(cbTemperatura);
		
		txtGrado = new JTextField();
		txtGrado.setBounds(167, 55, 96, 20);
		panelTemperatura.add(txtGrado);
		txtGrado.setColumns(10);
		
		JLabel lblgrado = new JLabel("Grado");
		lblgrado.setBounds(78, 58, 46, 14);
		panelTemperatura.add(lblgrado);
		
		JLabel lblCambioTemp = new JLabel("Cambio");
		lblCambioTemp.setBounds(78, 94, 46, 14);
		panelTemperatura.add(lblCambioTemp);
		
		final JComboBox cbCambioTemp = new JComboBox();
		cbCambioTemp.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Kelvin"}));
		cbCambioTemp.setBounds(167, 90, 96, 22);
		panelTemperatura.add(cbCambioTemp);
		
		JButton btnConvertirTemp = new JButton("Convertir");
		
		btnConvertirTemp.setBounds(167, 177, 96, 23);
		panelTemperatura.add(btnConvertirTemp);
		
		txtResultadoTemp = new JTextField();
		txtResultadoTemp.setEditable(false);
		txtResultadoTemp.setBounds(167, 135, 96, 20);
		panelTemperatura.add(txtResultadoTemp);
		txtResultadoTemp.setColumns(10);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Distancia", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblMedida = new JLabel("Distancia");
		lblMedida.setBounds(38, 11, 46, 14);
		panel.add(lblMedida);
		
		final JComboBox cbDistancia = new JComboBox();
		cbDistancia.setModel(new DefaultComboBoxModel(new String[] {"Milla", "Kilometro", "Metro", "Centimetro", "Milimetro"}));
		cbDistancia.setBounds(144, 7, 143, 22);
		panel.add(cbDistancia);
		
		txtValorDistancia = new JTextField();
		txtValorDistancia.setBounds(144, 50, 143, 20);
		panel.add(txtValorDistancia);
		txtValorDistancia.setColumns(10);
		
		JLabel lblConvertir = new JLabel("Convertir");
		lblConvertir.setBounds(38, 88, 46, 14);
		panel.add(lblConvertir);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(38, 53, 46, 14);
		panel.add(lblValor);
		
		final JComboBox cbConvertirDistancia = new JComboBox();
		cbConvertirDistancia.setModel(new DefaultComboBoxModel(new String[] {"Kilometro", "Metro", "Centimetro", "Milimetro"}));
		cbConvertirDistancia.setBounds(144, 84, 143, 22);
		panel.add(cbConvertirDistancia);
		
		txtResultadoDistancia = new JTextField();
		txtResultadoDistancia.setEditable(false);
		txtResultadoDistancia.setBounds(144, 133, 143, 20);
		panel.add(txtResultadoDistancia);
		txtResultadoDistancia.setColumns(10);
		
		JButton btnConvertirDistancia = new JButton("Convertir");
		
		btnConvertirDistancia.setBounds(144, 177, 143, 23);
		panel.add(btnConvertirDistancia);
		
		JLabel lblResultadoDistancia = new JLabel("Resultado");
		lblResultadoDistancia.setBounds(38, 136, 58, 14);
		panel.add(lblResultadoDistancia);
		//Metodos
		
		btnConvertirDistancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado= conDistancia.detalle(txtValorDistancia.getText(), cbDistancia.getSelectedItem(), cbConvertirDistancia.getSelectedItem());
				txtResultadoDistancia.setText(resultado);
			}
		});
		cbDistancia.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//Se pasa el combo box a vacio para evitar duplicados
				//for each para insertar los datos al combo box
				cbConvertirDistancia.setModel(new DefaultComboBoxModel(new String[] {}));
				
				for (String t: comboagregar.agregarCombo(cbDistancia.getSelectedItem(), new String[] {"Milla","Kilometro", "Metro", "Centimetro", "Milimetro"})) {
					cbConvertirDistancia.addItem(t);
				}
			}
		});
		
		
		btnConvertirTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado =conTemperatura.converTemperatura(txtGrado.getText(), cbTemperatura.getSelectedItem(), cbCambioTemp.getSelectedItem());
				txtResultadoTemp.setText(resultado);
			}
		});
		
		cbTemperatura.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//Se pasa el combo box a vacio para evitar duplicados
				//for each para insertar los datos al combo box
				cbCambioTemp.setModel(new DefaultComboBoxModel(new String[] {}));
				
				for (String t: comboagregar.agregarCombo(cbTemperatura.getSelectedItem(), new String[] {"Fahrenheit","Celsius","Kelvin"})) {
					cbCambioTemp.addItem(t);
				}
			}
		});
		
		
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = conMoneda.convertirMoneda(txtCantidad.getText(), cbMoneda.getSelectedItem(), 
						cbMonedaConvertir.getSelectedItem());
				txtResultado.setText(resultado);
			}
		});
		
		cbMoneda.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//Se pasa el combo box a vacio para evitar duplicados
				//for each para insertar los datos al combo box
				cbMonedaConvertir.setModel(new DefaultComboBoxModel(new String[] {}));
				
				for (String t: comboagregar.agregarCombo(cbMoneda.getSelectedItem(), new String[] {"Dolar", "Euro", "Libras", "Won", "Yen"})) {
					cbMonedaConvertir.addItem(t);
				}
			}
		});
	}
}
