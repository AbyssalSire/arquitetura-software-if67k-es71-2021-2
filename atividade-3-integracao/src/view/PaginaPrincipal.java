package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.fosforo.FonteFosforo;
import view.correcaoEFontesNutrientes.calcioMagnesio.CalculoCalcioMagnesio;
import view.correcaoEFontesNutrientes.fosforo.CalculoFosforo;
import view.correcaoEFontesNutrientes.potassio.CalculoPotassio;
import view.valoresIdeais.CalculoValoresIdeais;

import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PaginaPrincipal {
	
	private JFrame frmCorrecaoDeSolos;
	private JTextField textFieldNoSoloFosforo;
	private JTextField textFieldIdealFosforo;
	private JTextField textFieldAposCorrecaoFosforo;
	private JTextField textFieldNoSoloPotassio;
	private JTextField textFieldNoSoloCalcio;
	private JTextField textFieldNoSoloMagnesio;
	private JTextField textFieldIdealPotassio;
	private JTextField textFieldIdealCalcio;
	private JTextField textFieldIdealMagnesio;
	private JTextField textFieldAposCorrecaoPotassio;
	private JTextField textFieldAposCorrecaoCalcio;
	private JTextField textFieldAposCorrecaoMagnesio;
	private JTextField textFieldNoSoloEnxofre;
	private JTextField textFieldIdealEnxofre;
	private JTextField textFieldNoSoloAluminio;
	private JTextField textFieldIdealAluminio;
	private JTextField textFieldNoSoloHAL;
	private JTextField textFieldSCmol;
	private JTextField textFieldCTCMol;
	private JTextField textFieldVPorcentoAtual;
	private JTextField textFieldMOGdm3_1;
	private JTextField textFieldMOPorcento_Resultado;
	private JTextField textFieldCarbono_Resultado;
	private JTextField textFieldTeorIdealMO;
	private JTextField textFieldCorrecaoRecuperacaoFosforo;
	private JTextField textFieldFontesFosforo;
	private JLabel lblTeorDeFosforoAAtingir;
	private JLabel lblQuantidadeAAplicar;
	private JLabel lblEficinciaDoFsforo;
	private JTextField textFieldTeorDeFosforoAAtingir;
	private JTextField textFieldQuantidadeAAplicar;
	private JTextField textFieldEficienciaDoFosforo;
	private JLabel lblNewLabel_2;
	private JLabel lblUnidadeDeMedidaDm3_2;
	private JLabel lblKgHectare;
	private JLabel lblCustoRSHA;
	private JLabel lblNewLabel_4;
	private JTextField textFieldValor_Resposta_1;
	private JTextField textFieldEnxofreOuMagnesio;
	private JTextField textFieldValor_Resoposta_2;
	private JTextField textCalcioOuNitroGenio;
	private JTextField textFieldCustoRSHa_Resposta;
	private JTextField txtSuperfosfatoSimples;
	private JTextField txtDap;
	private JTextField txtFosfato_Gafsa;
	private JTextField txtEscoriaThomas;
	private JTextField textField_Valor_Superfosfato_Simples;
	private JTextField textField_Valor_DAP;
	private JTextField textField_Valor_Fosfato_Gafsa;
	private JTextField textField_Valor_EscoriaDeThomas;
	private JTextField txtSuperfosfato_Triplo;
	private JTextField txtYoorin;
	private JTextField txtFosfato_1Daoui;
	private JTextField txtAcidoFosforico;
	private JTextField textField_Valor_AcidoFosforico;
	private JTextField textField_Valor_Fosfato_Daoui;
	private JTextField textField_Valor_Yoorin;
	private JTextField textField_Valor_Superfosfato_Triplo;
	private JTextField txtMap;
	private JTextField txtFosfato_Arad;
	private JTextField txtFosfato_PatoMinas;
	private JTextField txtMultifmagnesiano;
	private JTextField textField_Valor_MultifMagnesiano;
	private JTextField textField_Valor_Fosfato_PatoMinas;
	private JTextField textField_Valor_Fosfato_Arad;
	private JTextField textField_Valor_Map;
	private JTextField txtCorrecorecuperacaoDePotassio;
	private JTextField textField_Potassio_CTC_Atual;
	private JTextField textField_Potassio_CTC_Desejada;
	private JTextField textField_Potassio_CTC_Corrigido;
	private JLabel lbl_CTC_Ideal;
	private JTextField textField_Potassio_CTC_Ideal;
	private JTextField txtFontesDePotassio;
	private JLabel lbl_Potassio_QuantidadeAAplicar;
	private JTextField textField_quantidadeAAplicarFosforo;
	private JLabel lblKhHectareMedida;
	private JLabel lbl_Custo_Rs_Ha;
	private JTextField textField_Custo_Rs_Ha_Resposta;
	private JLabel lblFonte_3;
	private JLabel lblValortonr_3;
	private JLabel lblFonte_4;
	private JLabel lblValortonr_4;
	private JLabel lblFonte_5;
	private JLabel lblValortonr_5;
	private JTextField txtCloreto;
	private JTextField txtCloreto_Resposta;
	private JTextField txtSulfato;
	private JTextField txtSulfato_Resposta;
	private JTextField txtSulfpotssiomag;
	private JTextField txtSulfPotMag_Resposta;
	private JTextField txtCorrecorecuperacaoDeCalcioMagnesio;
	private JLabel lblSecao_Calcio;
	private JLabel lblSecao_Magnesio;
	private JLabel lblParticipaoAtualCTCSolo;
	private JLabel lblParticipaoAtualCTCSolo_1;
	private JLabel lblIdeal_1;
	private JLabel lblIdeal_2;
	private JLabel lblAposCorrecoes;
	private JLabel lblAposCorrecoes_1;
	private JLabel lblDeParticipao;
	private JTextField txtCalcio_ParticipaoAtualCTCSolo;
	private JTextField txtCalcio_Ideal;
	private JTextField txtCalcio_AposCorrecoes;
	private JTextField txtCalcio_Desejado_Resposta;
	private JTextField txtMagnesio_ParticipaoAtualCTCSolo;
	private JTextField txtMagnesio_Ideal;
	private JTextField txtMagnesio_AposCorrecoes;
	private JTextField txtFontesDeClcio;
	private JLabel lblPorcento;
	private JLabel lblPorcento_1;
	private JLabel lblPorcento_2;
	private JLabel lblPorcento_3;
	private JLabel lblPorcento_4;
	private JLabel lblPorcento_5;
	private JLabel lblPorcento_6;
	private JLabel lblFonte_6;
	private JLabel lblValortonr_6;
	private JTextField txtCalcario_Dolomitico;
	private JTextField txt_Calcario_Dolomitico_Resposta;
	private JTextField txtCalcario_Calcidico;
	private JTextField txt_Calcario_Calcidico_Resposta;
	private JTextField txtCalcario_Conca;
	private JTextField txt_Calcario_Conca_Resposta;
	private JTextField txtGesso;
	private JTextField txt_Gesso_Resposta;
	private JTextField txtHidroxidoCalcio;
	private JTextField txt_HidroxidoCalcio_Resposta;
	private JTextField txtCalcarioMagnesiano;
	private JTextField txt_Calcario_Magnesiano_Resposta;
	private JLabel lvlPRNT;
	private JLabel lvlTeorCAOCorretivo;
	private JLabel lblQuantidadeAplicar;
	private JTextField textFieldFonteCalcioEMagnesio;
	private JTextField txt_PRNT_resposta;
	private JTextField txt_TeorCAO_Resposta;
	private JTextField txt_QuantidadeAAplicar_TONHa;
	private JLabel lblPorcento_8;
	private JLabel lblPorcento_9;
	private JLabel lblTonHa;
	private JTextField txtV;
	private JTextField txtAtual;
	private JTextField textField_Atual_Resposta;
	private JTextField txtApsAsCorrees;
	private JTextField textField_AposCorrecoes;
	private JTextField txtIdeal;
	private JTextField txt_Ideal_resp;
	private CalculoValoresIdeais func1 = new CalculoValoresIdeais();
	private CalculoFosforo func2 = new CalculoFosforo();
	private CalculoPotassio func3 = new CalculoPotassio();
	private CalculoCalcioMagnesio func4 = new CalculoCalcioMagnesio();
	private List<JTextField> listaComInputValoresIdeais = new ArrayList<JTextField>();
	private List<JTextField> listaSemInputValoresIdeais = new ArrayList<JTextField>();
	private List<JTextField> listaComInputFosforo = new ArrayList<JTextField>();
	private List<JTextField> listaSemInputFosforo = new ArrayList<JTextField>();
	private List<JTextField> listaComInputPotassio = new ArrayList<JTextField>();
	private List<JTextField> listaSemInputPotassio = new ArrayList<JTextField>();
	private List<JTextField> listaComInputCalcioMagnesio = new ArrayList<JTextField>();
	private List<JTextField> listaSemInputCalcioMagnesio = new ArrayList<JTextField>();
	JComboBox tipoTerrenoJComboBox = new JComboBox();
	JComboBox fonteFosforoJComboBox = new JComboBox();
	
	//Botões foram criados de forma pública para evitar ter de usar bibliotecas adicionais para fazer testes em Swing
	//Deletar após testes para voltar ao estado original, também deve-se descomentar a criação dos respectivos botões
	public JButton btnCalcular = new JButton("Calcular");
	public JButton btnCalcular_1 = new JButton("Calcular");
	public JButton btnCalcular_2 = new JButton("Calcular");
	public JButton btnCalcular_3 = new JButton("Calcular");
	private JTextField textFieldTipoDeSolo;
	private JTextField textFieldFonteFosforo;
	private JLabel lblNewLabel_5;
	private JComboBox fontePotassioJComboBox;
	private JTextField textFieldFontePotassio;
	private JLabel lblNewLabel_6;
	private JComboBox fonteCalcioEMagnesioJComboBox;


	/**
	 * Create the application.
	 */
	public PaginaPrincipal() {
		super();
		initialize();
	}
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaPrincipal window = new PaginaPrincipal();
					window.frmCorrecaoDeSolos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
	    List<JTextField> listaComInput = new ArrayList<JTextField>();
	    List<JTextField> listaSemInput = new ArrayList<JTextField>();
	    
		frmCorrecaoDeSolos = new JFrame();
		frmCorrecaoDeSolos.setResizable(false);
		frmCorrecaoDeSolos.setTitle("Corre\u00E7\u00E3o de solos");
		frmCorrecaoDeSolos.setBounds(100, 100, 900, 600);
		frmCorrecaoDeSolos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCorrecaoDeSolos.getContentPane().setLayout(null);
		
		JTabbedPane painelDeGuias = new JTabbedPane(JTabbedPane.TOP);
		painelDeGuias.setBounds(0, 0, 884, 561);
		frmCorrecaoDeSolos.getContentPane().add(painelDeGuias);
		
		guiaValoresIdeais(painelDeGuias);
		
		guiaFosforo(painelDeGuias);
		
		
		guiaPotassio(painelDeGuias);
		
		guiaCalcioMagnesio(painelDeGuias);
		JPanel guiaCalcioMagnesio = new JPanel();
		painelDeGuias.addTab("Cálcio e Magnésio", null, guiaCalcioMagnesio, null);
		guiaCalcioMagnesio.setLayout(null);
		
		txtCorrecorecuperacaoDeCalcioMagnesio = new JTextField();
		txtCorrecorecuperacaoDeCalcioMagnesio.setText("Correção/Recuperação de Cálcio e Magnésio");
		txtCorrecorecuperacaoDeCalcioMagnesio.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorrecorecuperacaoDeCalcioMagnesio.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtCorrecorecuperacaoDeCalcioMagnesio.setEditable(false);
		txtCorrecorecuperacaoDeCalcioMagnesio.setColumns(10);
		txtCorrecorecuperacaoDeCalcioMagnesio.setBackground(Color.GREEN);
		txtCorrecorecuperacaoDeCalcioMagnesio.setBounds(10, 11, 855, 30);
		guiaCalcioMagnesio.add(txtCorrecorecuperacaoDeCalcioMagnesio);
		
		lblSecao_Calcio = new JLabel("Cálcio");
		lblSecao_Calcio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSecao_Calcio.setBounds(10, 52, 100, 20);
		guiaCalcioMagnesio.add(lblSecao_Calcio);
		
		lblSecao_Magnesio = new JLabel("Magnésio");
		lblSecao_Magnesio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSecao_Magnesio.setBounds(400, 57, 100, 20);
		guiaCalcioMagnesio.add(lblSecao_Magnesio);
		
		lblParticipaoAtualCTCSolo = new JLabel("Participação atual na CTC do solo:");
		lblParticipaoAtualCTCSolo.setBounds(20, 83, 200, 14);
		guiaCalcioMagnesio.add(lblParticipaoAtualCTCSolo);
		
		lblParticipaoAtualCTCSolo_1 = new JLabel("Participação atual na CTC do solo:");
		lblParticipaoAtualCTCSolo_1.setBounds(410, 83, 200, 14);
		guiaCalcioMagnesio.add(lblParticipaoAtualCTCSolo_1);
		
		lblIdeal_1 = new JLabel("Ideal:");
		lblIdeal_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIdeal_1.setBounds(10, 108, 200, 14);
		guiaCalcioMagnesio.add(lblIdeal_1);
		
		lblIdeal_2 = new JLabel("Ideal:");
		lblIdeal_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIdeal_2.setBounds(420, 108, 200, 14);
		guiaCalcioMagnesio.add(lblIdeal_2);
		
		lblAposCorrecoes = new JLabel("Apos Correções:");
		lblAposCorrecoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAposCorrecoes.setBounds(20, 133, 200, 14);
		guiaCalcioMagnesio.add(lblAposCorrecoes);
		
		lblAposCorrecoes_1 = new JLabel("Apos Correções:");
		lblAposCorrecoes_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAposCorrecoes_1.setBounds(410, 133, 200, 14);
		guiaCalcioMagnesio.add(lblAposCorrecoes_1);
		
		lblDeParticipao = new JLabel("<html>% de participação do CÁLCIO na CTC, <br> desejada:</html>");
		lblDeParticipao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDeParticipao.setBounds(20, 158, 200, 28);
		guiaCalcioMagnesio.add(lblDeParticipao);
		
		txtCalcio_ParticipaoAtualCTCSolo = new JTextField();
		txtCalcio_ParticipaoAtualCTCSolo.setEditable(false);
		txtCalcio_ParticipaoAtualCTCSolo.setBounds(230, 80, 100, 20);
		guiaCalcioMagnesio.add(txtCalcio_ParticipaoAtualCTCSolo);
		txtCalcio_ParticipaoAtualCTCSolo.setColumns(10);
		
		txtCalcio_Ideal = new JTextField();
		txtCalcio_Ideal.setEditable(false);
		txtCalcio_Ideal.setColumns(10);
		txtCalcio_Ideal.setBounds(230, 105, 100, 20);
		guiaCalcioMagnesio.add(txtCalcio_Ideal);
		
		txtCalcio_AposCorrecoes = new JTextField();
		txtCalcio_AposCorrecoes.setEditable(false);
		txtCalcio_AposCorrecoes.setColumns(10);
		txtCalcio_AposCorrecoes.setBounds(230, 130, 100, 20);
		guiaCalcioMagnesio.add(txtCalcio_AposCorrecoes);
		
		txtCalcio_Desejado_Resposta = new JTextField();
		txtCalcio_Desejado_Resposta.setColumns(10);
		txtCalcio_Desejado_Resposta.setBounds(230, 155, 100, 20);
		guiaCalcioMagnesio.add(txtCalcio_Desejado_Resposta);
		
		txtMagnesio_ParticipaoAtualCTCSolo = new JTextField();
		txtMagnesio_ParticipaoAtualCTCSolo.setEditable(false);
		txtMagnesio_ParticipaoAtualCTCSolo.setColumns(10);
		txtMagnesio_ParticipaoAtualCTCSolo.setBounds(630, 77, 100, 20);
		guiaCalcioMagnesio.add(txtMagnesio_ParticipaoAtualCTCSolo);
		
		txtMagnesio_Ideal = new JTextField();
		txtMagnesio_Ideal.setEditable(false);
		txtMagnesio_Ideal.setColumns(10);
		txtMagnesio_Ideal.setBounds(630, 102, 100, 20);
		guiaCalcioMagnesio.add(txtMagnesio_Ideal);
		
		txtMagnesio_AposCorrecoes = new JTextField();
		txtMagnesio_AposCorrecoes.setEditable(false);
		txtMagnesio_AposCorrecoes.setColumns(10);
		txtMagnesio_AposCorrecoes.setBounds(630, 127, 100, 20);
		guiaCalcioMagnesio.add(txtMagnesio_AposCorrecoes);
		
		txtFontesDeClcio = new JTextField();
		txtFontesDeClcio.setText("Fontes de CÁLCIO  e MAGNÉSIO");
		txtFontesDeClcio.setHorizontalAlignment(SwingConstants.CENTER);
		txtFontesDeClcio.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFontesDeClcio.setEditable(false);
		txtFontesDeClcio.setColumns(10);
		txtFontesDeClcio.setBackground(Color.GREEN);
		txtFontesDeClcio.setBounds(459, 198, 410, 30);
		guiaCalcioMagnesio.add(txtFontesDeClcio);
		
		lblPorcento = new JLabel("%");
		lblPorcento.setBounds(340, 83, 46, 14);
		guiaCalcioMagnesio.add(lblPorcento);
		
		lblPorcento_1 = new JLabel("%");
		lblPorcento_1.setBounds(340, 108, 46, 14);
		guiaCalcioMagnesio.add(lblPorcento_1);
		
		lblPorcento_2 = new JLabel("%");
		lblPorcento_2.setBounds(340, 133, 46, 14);
		guiaCalcioMagnesio.add(lblPorcento_2);
		
		lblPorcento_3 = new JLabel("%");
		lblPorcento_3.setBounds(340, 158, 46, 14);
		guiaCalcioMagnesio.add(lblPorcento_3);
		
		lblPorcento_4 = new JLabel("%");
		lblPorcento_4.setBounds(740, 83, 46, 14);
		guiaCalcioMagnesio.add(lblPorcento_4);
		
		lblPorcento_5 = new JLabel("%");
		lblPorcento_5.setBounds(740, 105, 46, 14);
		guiaCalcioMagnesio.add(lblPorcento_5);
		
		lblPorcento_6 = new JLabel("%");
		lblPorcento_6.setBounds(740, 130, 46, 14);
		guiaCalcioMagnesio.add(lblPorcento_6);
		
		lblFonte_6 = new JLabel("Fonte");
		lblFonte_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblFonte_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFonte_6.setBounds(459, 240, 200, 14);
		guiaCalcioMagnesio.add(lblFonte_6);
		
		lblValortonr_6 = new JLabel("Valor/Ton. (R$)");
		lblValortonr_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblValortonr_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValortonr_6.setBounds(669, 240, 200, 14);
		guiaCalcioMagnesio.add(lblValortonr_6);
		
		txtCalcario_Dolomitico = new JTextField();
		txtCalcario_Dolomitico.setText("1 - Calcário Dolomítico");
		txtCalcario_Dolomitico.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCalcario_Dolomitico.setEditable(false);
		txtCalcario_Dolomitico.setColumns(10);
		txtCalcario_Dolomitico.setBounds(459, 265, 200, 20);
		guiaCalcioMagnesio.add(txtCalcario_Dolomitico);
		
		txt_Calcario_Dolomitico_Resposta = new JTextField();
		txt_Calcario_Dolomitico_Resposta.setColumns(10);
		txt_Calcario_Dolomitico_Resposta.setBounds(669, 264, 200, 20);
		guiaCalcioMagnesio.add(txt_Calcario_Dolomitico_Resposta);
		
		txtCalcario_Calcidico = new JTextField();
		txtCalcario_Calcidico.setText("2 - Calcário Calcítico");
		txtCalcario_Calcidico.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCalcario_Calcidico.setEditable(false);
		txtCalcario_Calcidico.setColumns(10);
		txtCalcario_Calcidico.setBounds(459, 297, 200, 20);
		guiaCalcioMagnesio.add(txtCalcario_Calcidico);
		
		txt_Calcario_Calcidico_Resposta = new JTextField();
		txt_Calcario_Calcidico_Resposta.setColumns(10);
		txt_Calcario_Calcidico_Resposta.setBounds(669, 296, 200, 20);
		guiaCalcioMagnesio.add(txt_Calcario_Calcidico_Resposta);
		
		txtCalcario_Conca = new JTextField();
		txtCalcario_Conca.setText("3 - Calcário de Concha");
		txtCalcario_Conca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCalcario_Conca.setEditable(false);
		txtCalcario_Conca.setColumns(10);
		txtCalcario_Conca.setBounds(459, 329, 200, 20);
		guiaCalcioMagnesio.add(txtCalcario_Conca);
		
		txt_Calcario_Conca_Resposta = new JTextField();
		txt_Calcario_Conca_Resposta.setColumns(10);
		txt_Calcario_Conca_Resposta.setBounds(669, 328, 200, 20);
		guiaCalcioMagnesio.add(txt_Calcario_Conca_Resposta);
		
		txtGesso = new JTextField();
		txtGesso.setText("4 - Gesso Agrícola");
		txtGesso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtGesso.setEditable(false);
		txtGesso.setColumns(10);
		txtGesso.setBounds(459, 361, 200, 20);
		guiaCalcioMagnesio.add(txtGesso);
		
		txt_Gesso_Resposta = new JTextField();
		txt_Gesso_Resposta.setColumns(10);
		txt_Gesso_Resposta.setBounds(669, 360, 200, 20);
		guiaCalcioMagnesio.add(txt_Gesso_Resposta);
		
		txtHidroxidoCalcio = new JTextField();
		txtHidroxidoCalcio.setText("5 - Hidróxido de cálcio");
		txtHidroxidoCalcio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtHidroxidoCalcio.setEditable(false);
		txtHidroxidoCalcio.setColumns(10);
		txtHidroxidoCalcio.setBounds(459, 393, 200, 20);
		guiaCalcioMagnesio.add(txtHidroxidoCalcio);
		
		txt_HidroxidoCalcio_Resposta = new JTextField();
		txt_HidroxidoCalcio_Resposta.setColumns(10);
		txt_HidroxidoCalcio_Resposta.setBounds(669, 392, 200, 20);
		guiaCalcioMagnesio.add(txt_HidroxidoCalcio_Resposta);
		
		txtCalcarioMagnesiano = new JTextField();
		txtCalcarioMagnesiano.setText("6 - Calcário Magnesiano");
		txtCalcarioMagnesiano.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCalcarioMagnesiano.setEditable(false);
		txtCalcarioMagnesiano.setColumns(10);
		txtCalcarioMagnesiano.setBounds(459, 425, 200, 20);
		guiaCalcioMagnesio.add(txtCalcarioMagnesiano);
		
		txt_Calcario_Magnesiano_Resposta = new JTextField();
		txt_Calcario_Magnesiano_Resposta.setColumns(10);
		txt_Calcario_Magnesiano_Resposta.setBounds(669, 424, 200, 20);
		guiaCalcioMagnesio.add(txt_Calcario_Magnesiano_Resposta);
		
		lvlPRNT = new JLabel("PRNT:");
		lvlPRNT.setHorizontalAlignment(SwingConstants.TRAILING);
		lvlPRNT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lvlPRNT.setBounds(20, 242, 100, 14);
		guiaCalcioMagnesio.add(lvlPRNT);
		
		lvlTeorCAOCorretivo = new JLabel("Teor de CaO do corretivo:");
		lvlTeorCAOCorretivo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lvlTeorCAOCorretivo.setBounds(20, 270, 200, 14);
		guiaCalcioMagnesio.add(lvlTeorCAOCorretivo);
		
		lblQuantidadeAplicar = new JLabel("Quantidade a aplicar:");
		lblQuantidadeAplicar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantidadeAplicar.setBounds(20, 298, 200, 14);
		guiaCalcioMagnesio.add(lblQuantidadeAplicar);
		
		textFieldFonteCalcioEMagnesio = new JTextField();
		textFieldFonteCalcioEMagnesio.setEditable(false);
		textFieldFonteCalcioEMagnesio.setColumns(10);
		textFieldFonteCalcioEMagnesio.setBounds(349, 204, 100, 20);
		guiaCalcioMagnesio.add(textFieldFonteCalcioEMagnesio);
		
		txt_PRNT_resposta = new JTextField();
		txt_PRNT_resposta.setColumns(10);
		txt_PRNT_resposta.setBounds(130, 239, 100, 20);
		guiaCalcioMagnesio.add(txt_PRNT_resposta);
		
		txt_TeorCAO_Resposta = new JTextField();
		txt_TeorCAO_Resposta.setColumns(10);
		txt_TeorCAO_Resposta.setBounds(230, 265, 100, 20);
		guiaCalcioMagnesio.add(txt_TeorCAO_Resposta);
		
		txt_QuantidadeAAplicar_TONHa = new JTextField();
		txt_QuantidadeAAplicar_TONHa.setEditable(false);
		txt_QuantidadeAAplicar_TONHa.setColumns(10);
		txt_QuantidadeAAplicar_TONHa.setBounds(230, 297, 100, 20);
		guiaCalcioMagnesio.add(txt_QuantidadeAAplicar_TONHa);
		
		lblPorcento_8 = new JLabel("%");
		lblPorcento_8.setBounds(240, 242, 46, 14);
		guiaCalcioMagnesio.add(lblPorcento_8);
		
		lblPorcento_9 = new JLabel("%");
		lblPorcento_9.setBounds(340, 268, 46, 14);
		guiaCalcioMagnesio.add(lblPorcento_9);
		
		lblTonHa = new JLabel("Ton./ha");
		lblTonHa.setBounds(340, 300, 46, 14);
		guiaCalcioMagnesio.add(lblTonHa);
		
		txtV = new JTextField();
		txtV.setForeground(new Color(255, 255, 255));
		txtV.setBackground(new Color(30, 144, 255));
		txtV.setHorizontalAlignment(SwingConstants.CENTER);
		txtV.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtV.setText("V%");
		txtV.setBounds(10, 460, 50, 50);
		guiaCalcioMagnesio.add(txtV);
		txtV.setColumns(10);
		
		txtAtual = new JTextField();
		txtAtual.setBackground(new Color(32, 178, 170));
		txtAtual.setHorizontalAlignment(SwingConstants.CENTER);
		txtAtual.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAtual.setText("Atual:");
		txtAtual.setEditable(false);
		txtAtual.setColumns(10);
		txtAtual.setBounds(60, 460, 175, 25);
		guiaCalcioMagnesio.add(txtAtual);
		
		textField_Atual_Resposta = new JTextField();
		textField_Atual_Resposta.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Atual_Resposta.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_Atual_Resposta.setColumns(10);
		textField_Atual_Resposta.setBackground(new Color(32, 178, 170));
		textField_Atual_Resposta.setBounds(235, 460, 100, 25);
		guiaCalcioMagnesio.add(textField_Atual_Resposta);
		
		txtApsAsCorrees = new JTextField();
		txtApsAsCorrees.setForeground(new Color(255, 255, 255));
		txtApsAsCorrees.setText("Após as correções");
		txtApsAsCorrees.setHorizontalAlignment(SwingConstants.CENTER);
		txtApsAsCorrees.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtApsAsCorrees.setEditable(false);
		txtApsAsCorrees.setColumns(10);
		txtApsAsCorrees.setBackground(new Color(0, 0, 255));
		txtApsAsCorrees.setBounds(60, 485, 175, 25);
		guiaCalcioMagnesio.add(txtApsAsCorrees);
		
		textField_AposCorrecoes = new JTextField();
		textField_AposCorrecoes.setEditable(false);
		textField_AposCorrecoes.setForeground(new Color(255, 255, 255));
		textField_AposCorrecoes.setHorizontalAlignment(SwingConstants.CENTER);
		textField_AposCorrecoes.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_AposCorrecoes.setColumns(10);
		textField_AposCorrecoes.setBackground(new Color(0, 0, 255));
		textField_AposCorrecoes.setBounds(235, 485, 100, 25);
		guiaCalcioMagnesio.add(textField_AposCorrecoes);
		
		txtIdeal = new JTextField();
		txtIdeal.setText("Ideal:");
		txtIdeal.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdeal.setForeground(new Color(255, 255, 255));
		txtIdeal.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtIdeal.setColumns(10);
		txtIdeal.setBackground(new Color(0, 139, 139));
		txtIdeal.setBounds(336, 460, 100, 50);
		guiaCalcioMagnesio.add(txtIdeal);
		
		txt_Ideal_resp = new JTextField();
		txt_Ideal_resp.setEditable(false);
		txt_Ideal_resp.setHorizontalAlignment(SwingConstants.CENTER);
		txt_Ideal_resp.setForeground(Color.WHITE);
		txt_Ideal_resp.setFont(new Font("Tahoma", Font.BOLD, 15));
		txt_Ideal_resp.setColumns(10);
		txt_Ideal_resp.setBackground(new Color(0, 139, 139));
		txt_Ideal_resp.setBounds(436, 460, 100, 50);
		guiaCalcioMagnesio.add(txt_Ideal_resp);
		guiaCalcioMagnesio.add(btnCalcular_3);
		
		lblNewLabel_6 = new JLabel("<html>Número da Fonte de Corretivo<br/>Cálcio e Magnesio a usar:</html>");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setBounds(10, 197, 210, 39);
		guiaCalcioMagnesio.add(lblNewLabel_6);
		
		fonteCalcioEMagnesioJComboBox = new JComboBox();
		fonteCalcioEMagnesioJComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		fonteCalcioEMagnesioJComboBox.setMaximumRowCount(6);
		fonteCalcioEMagnesioJComboBox.setBounds(230, 203, 109, 22);
		guiaCalcioMagnesio.add(fonteCalcioEMagnesioJComboBox);
	}



	private void guiaCalcioMagnesio(JTabbedPane painelDeGuias) {
		
//		descomentar após testes	para voltar ao estado original
//		JButton btnCalcular_3 = new JButton("Calcular");
		btnCalcular_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Botão funcionando Guia Cálcio e Magnésio, apagando textos input e adicionando texto nos JTextFields sem input");
				func4.CalculaCalcioMagnesio(null);	
			}
		});
		btnCalcular_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalcular_3.setBounds(712, 473, 100, 23);
	}



	private void guiaPotassio(JTabbedPane painelDeGuias) {
		JPanel guiaPotassio = new JPanel();
		painelDeGuias.addTab("Potássio", null, guiaPotassio, null);
		guiaPotassio.setLayout(null);
		
		txtCorrecorecuperacaoDePotassio = new JTextField();
		txtCorrecorecuperacaoDePotassio.setText("Correção/Recuperação de POTÁSSIO");
		txtCorrecorecuperacaoDePotassio.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorrecorecuperacaoDePotassio.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtCorrecorecuperacaoDePotassio.setEditable(false);
		txtCorrecorecuperacaoDePotassio.setColumns(10);
		txtCorrecorecuperacaoDePotassio.setBackground(Color.YELLOW);
		txtCorrecorecuperacaoDePotassio.setBounds(10, 11, 855, 30);
		guiaPotassio.add(txtCorrecorecuperacaoDePotassio);
		
		JLabel lbl_CTC_Atual = new JLabel("Participação atual do POTÁSSIO na CTC do solo:");
		lbl_CTC_Atual.setBounds(10, 52, 260, 14);
		guiaPotassio.add(lbl_CTC_Atual);
		
		JLabel lbl_CTC_Desejada = new JLabel("Participação do Potássio na CTC, desejada: ");
		lbl_CTC_Desejada.setBounds(10, 77, 260, 14);
		guiaPotassio.add(lbl_CTC_Desejada);
		
		JLabel lbl_3 = new JLabel("Participação do POTÁSSIO na CTC, após correção:");
		lbl_3.setBounds(10, 102, 290, 14);
		guiaPotassio.add(lbl_3);
		
		textField_Potassio_CTC_Atual = new JTextField();
		textField_Potassio_CTC_Atual.setEditable(false);
		textField_Potassio_CTC_Atual.setBounds(300, 49, 183, 20);
		guiaPotassio.add(textField_Potassio_CTC_Atual);
		textField_Potassio_CTC_Atual.setColumns(10);
		
		textField_Potassio_CTC_Desejada = new JTextField();
		textField_Potassio_CTC_Desejada.setColumns(10);
		textField_Potassio_CTC_Desejada.setBounds(300, 74, 86, 20);
		guiaPotassio.add(textField_Potassio_CTC_Desejada);
		
		textField_Potassio_CTC_Corrigido = new JTextField();
		textField_Potassio_CTC_Corrigido.setEditable(false);
		textField_Potassio_CTC_Corrigido.setColumns(10);
		textField_Potassio_CTC_Corrigido.setBounds(300, 99, 183, 20);
		guiaPotassio.add(textField_Potassio_CTC_Corrigido);
		
		lbl_CTC_Ideal = new JLabel("Participação ideal do Potássio na CTC:");
		lbl_CTC_Ideal.setBounds(396, 77, 234, 14);
		guiaPotassio.add(lbl_CTC_Ideal);
		
		textField_Potassio_CTC_Ideal = new JTextField();
		textField_Potassio_CTC_Ideal.setText("3%");
		textField_Potassio_CTC_Ideal.setEditable(false);
		textField_Potassio_CTC_Ideal.setColumns(10);
		textField_Potassio_CTC_Ideal.setBounds(640, 74, 86, 20);
		guiaPotassio.add(textField_Potassio_CTC_Ideal);
		
		txtFontesDePotassio = new JTextField();
		txtFontesDePotassio.setText("Fontes de POTÁSSIO");
		txtFontesDePotassio.setHorizontalAlignment(SwingConstants.CENTER);
		txtFontesDePotassio.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFontesDePotassio.setEditable(false);
		txtFontesDePotassio.setColumns(10);
		txtFontesDePotassio.setBackground(Color.YELLOW);
		txtFontesDePotassio.setBounds(10, 178, 855, 30);
		guiaPotassio.add(txtFontesDePotassio);
		
		lbl_Potassio_QuantidadeAAplicar = new JLabel("Quantidade a aplicar:");
		lbl_Potassio_QuantidadeAAplicar.setBounds(10, 150, 150, 14);
		guiaPotassio.add(lbl_Potassio_QuantidadeAAplicar);
		
		textField_quantidadeAAplicarFosforo = new JTextField();
		textField_quantidadeAAplicarFosforo.setEditable(false);
		textField_quantidadeAAplicarFosforo.setColumns(10);
		textField_quantidadeAAplicarFosforo.setBounds(145, 147, 155, 20);
		guiaPotassio.add(textField_quantidadeAAplicarFosforo);
		
		lblKhHectareMedida = new JLabel("kh/hectare");
		lblKhHectareMedida.setBounds(300, 150, 70, 14);
		guiaPotassio.add(lblKhHectareMedida);
		
		lbl_Custo_Rs_Ha = new JLabel("Custo - R$/ha:");
		lbl_Custo_Rs_Ha.setBounds(396, 150, 150, 14);
		guiaPotassio.add(lbl_Custo_Rs_Ha);
		
		textField_Custo_Rs_Ha_Resposta = new JTextField();
		textField_Custo_Rs_Ha_Resposta.setEditable(false);
		textField_Custo_Rs_Ha_Resposta.setColumns(10);
		textField_Custo_Rs_Ha_Resposta.setBounds(500, 147, 175, 20);
		guiaPotassio.add(textField_Custo_Rs_Ha_Resposta);
		
		lblFonte_3 = new JLabel("Fonte");
		lblFonte_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFonte_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFonte_3.setBounds(10, 219, 125, 14);
		guiaPotassio.add(lblFonte_3);
		
		lblValortonr_3 = new JLabel("Valor/Ton. (R$)");
		lblValortonr_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblValortonr_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValortonr_3.setBounds(145, 219, 125, 14);
		guiaPotassio.add(lblValortonr_3);
		
		lblFonte_4 = new JLabel("Fonte");
		lblFonte_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblFonte_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFonte_4.setBounds(280, 219, 125, 14);
		guiaPotassio.add(lblFonte_4);
		
		lblValortonr_4 = new JLabel("Valor/Ton. (R$)");
		lblValortonr_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblValortonr_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValortonr_4.setBounds(415, 219, 125, 14);
		guiaPotassio.add(lblValortonr_4);
		
		lblFonte_5 = new JLabel("Fonte");
		lblFonte_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblFonte_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFonte_5.setBounds(550, 219, 125, 14);
		guiaPotassio.add(lblFonte_5);
		
		lblValortonr_5 = new JLabel("Valor/Ton. (R$)");
		lblValortonr_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblValortonr_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValortonr_5.setBounds(685, 219, 125, 14);
		guiaPotassio.add(lblValortonr_5);
		
		txtCloreto = new JTextField();
		txtCloreto.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtCloreto.setText("1 – Cloreto de Potássio");
		txtCloreto.setEditable(false);
		txtCloreto.setColumns(10);
		txtCloreto.setBounds(10, 244, 125, 20);
		guiaPotassio.add(txtCloreto);
		
		txtCloreto_Resposta = new JTextField();
		txtCloreto_Resposta.setColumns(10);
		txtCloreto_Resposta.setBounds(145, 244, 125, 20);
		guiaPotassio.add(txtCloreto_Resposta);
		
		txtSulfato = new JTextField();
		txtSulfato.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtSulfato.setText("2 - Sulfato de Potássio");
		txtSulfato.setEditable(false);
		txtSulfato.setColumns(10);
		txtSulfato.setBounds(280, 244, 125, 20);
		guiaPotassio.add(txtSulfato);
		
		txtSulfato_Resposta = new JTextField();
		txtSulfato_Resposta.setColumns(10);
		txtSulfato_Resposta.setBounds(415, 244, 125, 20);
		guiaPotassio.add(txtSulfato_Resposta);
		
		txtSulfpotssiomag = new JTextField();
		txtSulfpotssiomag.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtSulfpotssiomag.setText("3 – Sulf.Potássio/Mag.");
		txtSulfpotssiomag.setEditable(false);
		txtSulfpotssiomag.setColumns(10);
		txtSulfpotssiomag.setBounds(550, 244, 125, 20);
		guiaPotassio.add(txtSulfpotssiomag);
		
		txtSulfPotMag_Resposta = new JTextField();
		txtSulfPotMag_Resposta.setColumns(10);
		txtSulfPotMag_Resposta.setBounds(685, 244, 125, 20);
		guiaPotassio.add(txtSulfPotMag_Resposta);

//		descomentar após testes	para voltar ao estado original
//		JButton btnCalcular_2 = new JButton("Calcular");
		btnCalcular_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				func3.CalculaPotassio(PaginaPrincipal.this);
			}
		});
		btnCalcular_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalcular_2.setBounds(710, 306, 100, 23);
		guiaPotassio.add(btnCalcular_2);
		
		lblNewLabel_5 = new JLabel("Número da Fonte de Potássio");
		lblNewLabel_5.setBounds(406, 311, 183, 14);
		guiaPotassio.add(lblNewLabel_5);
		
		fontePotassioJComboBox = new JComboBox();
		fontePotassioJComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		fontePotassioJComboBox.setMaximumRowCount(3);
		fontePotassioJComboBox.setBounds(591, 307, 109, 22);
		guiaPotassio.add(fontePotassioJComboBox);
		
		textFieldFontePotassio = new JTextField();
		textFieldFontePotassio.setEditable(false);
		textFieldFontePotassio.setColumns(10);
		textFieldFontePotassio.setBounds(591, 335, 109, 20);
		guiaPotassio.add(textFieldFontePotassio);
	}



	private void guiaFosforo(JTabbedPane painelDeGuias) {
		JPanel guiaFosforo = new JPanel();
		painelDeGuias.addTab("Fósforo", null, guiaFosforo, null);
		guiaFosforo.setLayout(null);
		
		textFieldCorrecaoRecuperacaoFosforo = new JTextField();
		textFieldCorrecaoRecuperacaoFosforo.setText("Correção/Recuperação de FÓSFORO");
		textFieldCorrecaoRecuperacaoFosforo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCorrecaoRecuperacaoFosforo.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldCorrecaoRecuperacaoFosforo.setEditable(false);
		textFieldCorrecaoRecuperacaoFosforo.setColumns(10);
		textFieldCorrecaoRecuperacaoFosforo.setBackground(Color.CYAN);
		textFieldCorrecaoRecuperacaoFosforo.setBounds(10, 11, 855, 30);
		guiaFosforo.add(textFieldCorrecaoRecuperacaoFosforo);
		
		textFieldFontesFosforo = new JTextField();
		textFieldFontesFosforo.setText("Fontes de FÓSFORO");
		textFieldFontesFosforo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFontesFosforo.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldFontesFosforo.setEditable(false);
		textFieldFontesFosforo.setColumns(10);
		textFieldFontesFosforo.setBackground(Color.CYAN);
		textFieldFontesFosforo.setBounds(10, 156, 855, 30);
		guiaFosforo.add(textFieldFontesFosforo);
		
		lblTeorDeFosforoAAtingir = new JLabel("Teor de Fósforo a atingir:");
		lblTeorDeFosforoAAtingir.setBounds(10, 53, 150, 14);
		guiaFosforo.add(lblTeorDeFosforoAAtingir);
		
		lblQuantidadeAAplicar = new JLabel("Quantidade a aplicar:");
		lblQuantidadeAAplicar.setBounds(10, 78, 150, 14);
		guiaFosforo.add(lblQuantidadeAAplicar);
		
		lblEficinciaDoFsforo = new JLabel("Eficiência do Fósforo %:");
		lblEficinciaDoFsforo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEficinciaDoFsforo.setBounds(10, 128, 150, 14);
		guiaFosforo.add(lblEficinciaDoFsforo);
		
		textFieldTeorDeFosforoAAtingir = new JTextField();
		textFieldTeorDeFosforoAAtingir.setBounds(170, 50, 50, 20);
		guiaFosforo.add(textFieldTeorDeFosforoAAtingir);
		textFieldTeorDeFosforoAAtingir.setColumns(10);
		
		textFieldQuantidadeAAplicar = new JTextField();
		textFieldQuantidadeAAplicar.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldQuantidadeAAplicar.setEditable(false);
		textFieldQuantidadeAAplicar.setColumns(10);
		textFieldQuantidadeAAplicar.setBounds(156, 75, 150, 20);
		guiaFosforo.add(textFieldQuantidadeAAplicar);
		
		textFieldEficienciaDoFosforo = new JTextField();
		textFieldEficienciaDoFosforo.setColumns(10);
		textFieldEficienciaDoFosforo.setBounds(170, 125, 50, 20);
		guiaFosforo.add(textFieldEficienciaDoFosforo);
		
		lblNewLabel_2 = new JLabel("OBS. Sugerimos uma eficiência  entre 70% a 90%");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblNewLabel_2.setBounds(230, 128, 250, 14);
		guiaFosforo.add(lblNewLabel_2);
		
		lblUnidadeDeMedidaDm3_2 = new JLabel("mg.dm³");
		lblUnidadeDeMedidaDm3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidadeDeMedidaDm3_2.setBounds(230, 53, 50, 14);
		guiaFosforo.add(lblUnidadeDeMedidaDm3_2);
		
		lblKgHectare = new JLabel("kg/hectare ");
		lblKgHectare.setBounds(316, 78, 70, 14);
		guiaFosforo.add(lblKgHectare);
		
		lblCustoRSHA = new JLabel("Custo - R$/ha:");
		lblCustoRSHA.setBounds(400, 103, 80, 14);
		guiaFosforo.add(lblCustoRSHA);
		
		lblNewLabel_4 = new JLabel("Essa correção de FÓSFORO, fornecerá também (kg/ha):");
		lblNewLabel_4.setBounds(400, 52, 300, 14);
		guiaFosforo.add(lblNewLabel_4);
		
		textFieldValor_Resposta_1 = new JTextField();
		textFieldValor_Resposta_1.setEditable(false);
		textFieldValor_Resposta_1.setBounds(400, 75, 70, 20);
		guiaFosforo.add(textFieldValor_Resposta_1);
		textFieldValor_Resposta_1.setColumns(10);
		
		textFieldEnxofreOuMagnesio = new JTextField();
		textFieldEnxofreOuMagnesio.setEditable(false);
		textFieldEnxofreOuMagnesio.setColumns(10);
		textFieldEnxofreOuMagnesio.setBounds(480, 75, 100, 20);
		guiaFosforo.add(textFieldEnxofreOuMagnesio);
		
		textFieldValor_Resoposta_2 = new JTextField();
		textFieldValor_Resoposta_2.setEditable(false);
		textFieldValor_Resoposta_2.setColumns(10);
		textFieldValor_Resoposta_2.setBounds(640, 75, 70, 20);
		guiaFosforo.add(textFieldValor_Resoposta_2);
		
		textCalcioOuNitroGenio = new JTextField();
		textCalcioOuNitroGenio.setEditable(false);
		textCalcioOuNitroGenio.setColumns(10);
		textCalcioOuNitroGenio.setBounds(720, 75, 100, 20);
		guiaFosforo.add(textCalcioOuNitroGenio);
		
		textFieldCustoRSHa_Resposta = new JTextField();
		textFieldCustoRSHa_Resposta.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldCustoRSHa_Resposta.setEditable(false);
		textFieldCustoRSHa_Resposta.setColumns(10);
		textFieldCustoRSHa_Resposta.setBounds(480, 100, 173, 20);
		guiaFosforo.add(textFieldCustoRSHa_Resposta);
		
		JLabel lblFonte = new JLabel("Fonte");
		lblFonte.setHorizontalAlignment(SwingConstants.CENTER);
		lblFonte.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFonte.setBounds(10, 197, 125, 14);
		guiaFosforo.add(lblFonte);
		
		JLabel lblValortonr = new JLabel("Valor/Ton. (R$)");
		lblValortonr.setHorizontalAlignment(SwingConstants.CENTER);
		lblValortonr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValortonr.setBounds(145, 197, 125, 14);
		guiaFosforo.add(lblValortonr);
		
		JLabel lblFonte_1 = new JLabel("Fonte");
		lblFonte_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFonte_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFonte_1.setBounds(280, 197, 125, 14);
		guiaFosforo.add(lblFonte_1);
		
		JLabel lblValortonr_1 = new JLabel("Valor/Ton. (R$)");
		lblValortonr_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblValortonr_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValortonr_1.setBounds(415, 197, 125, 14);
		guiaFosforo.add(lblValortonr_1);
		
		JLabel lblFonte_2 = new JLabel("Fonte");
		lblFonte_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFonte_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFonte_2.setBounds(550, 197, 125, 14);
		guiaFosforo.add(lblFonte_2);
		
		JLabel lblValortonr_2 = new JLabel("Valor/Ton. (R$)");
		lblValortonr_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblValortonr_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValortonr_2.setBounds(685, 197, 125, 14);
		guiaFosforo.add(lblValortonr_2);
		
		txtSuperfosfatoSimples = new JTextField();
		txtSuperfosfatoSimples.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtSuperfosfatoSimples.setText("1 – Superfosfato Simples");
		txtSuperfosfatoSimples.setEditable(false);
		txtSuperfosfatoSimples.setBounds(10, 222, 125, 20);
		guiaFosforo.add(txtSuperfosfatoSimples);
		txtSuperfosfatoSimples.setColumns(10);
		
		txtDap = new JTextField();
		txtDap.setText("4 – DAP");
		txtDap.setEditable(false);
		txtDap.setColumns(10);
		txtDap.setBounds(10, 253, 125, 20);
		guiaFosforo.add(txtDap);
		
		txtFosfato_Gafsa = new JTextField();
		txtFosfato_Gafsa.setText("7 – Fosfato  Gafsa");
		txtFosfato_Gafsa.setEditable(false);
		txtFosfato_Gafsa.setColumns(10);
		txtFosfato_Gafsa.setBounds(10, 284, 125, 20);
		guiaFosforo.add(txtFosfato_Gafsa);
		
		txtEscoriaThomas = new JTextField();
		txtEscoriaThomas.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtEscoriaThomas.setText("10 – Escória de Thomas");
		txtEscoriaThomas.setEditable(false);
		txtEscoriaThomas.setColumns(10);
		txtEscoriaThomas.setBounds(10, 315, 125, 20);
		guiaFosforo.add(txtEscoriaThomas);
		
		textField_Valor_Superfosfato_Simples = new JTextField();
		textField_Valor_Superfosfato_Simples.setColumns(10);
		textField_Valor_Superfosfato_Simples.setBounds(145, 222, 125, 20);
		guiaFosforo.add(textField_Valor_Superfosfato_Simples);
		
		textField_Valor_DAP = new JTextField();
		textField_Valor_DAP.setColumns(10);
		textField_Valor_DAP.setBounds(145, 253, 125, 20);
		guiaFosforo.add(textField_Valor_DAP);
		
		textField_Valor_Fosfato_Gafsa = new JTextField();
		textField_Valor_Fosfato_Gafsa.setColumns(10);
		textField_Valor_Fosfato_Gafsa.setBounds(145, 284, 125, 20);
		guiaFosforo.add(textField_Valor_Fosfato_Gafsa);
		
		textField_Valor_EscoriaDeThomas = new JTextField();
		textField_Valor_EscoriaDeThomas.setColumns(10);
		textField_Valor_EscoriaDeThomas.setBounds(145, 315, 125, 20);
		guiaFosforo.add(textField_Valor_EscoriaDeThomas);
		
		txtSuperfosfato_Triplo = new JTextField();
		txtSuperfosfato_Triplo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtSuperfosfato_Triplo.setText("2 – Superfosfato Triplo");
		txtSuperfosfato_Triplo.setEditable(false);
		txtSuperfosfato_Triplo.setColumns(10);
		txtSuperfosfato_Triplo.setBounds(280, 222, 125, 20);
		guiaFosforo.add(txtSuperfosfato_Triplo);
		
		txtYoorin = new JTextField();
		txtYoorin.setText("5 – Yoorin");
		txtYoorin.setEditable(false);
		txtYoorin.setColumns(10);
		txtYoorin.setBounds(280, 253, 125, 20);
		guiaFosforo.add(txtYoorin);
		
		txtFosfato_1Daoui = new JTextField();
		txtFosfato_1Daoui.setText("8 – Fosfato  Daoui");
		txtFosfato_1Daoui.setEditable(false);
		txtFosfato_1Daoui.setColumns(10);
		txtFosfato_1Daoui.setBounds(280, 284, 125, 20);
		guiaFosforo.add(txtFosfato_1Daoui);
		
		txtAcidoFosforico = new JTextField();
		txtAcidoFosforico.setText("11 – Ácido Fosfórico ");
		txtAcidoFosforico.setEditable(false);
		txtAcidoFosforico.setColumns(10);
		txtAcidoFosforico.setBounds(280, 315, 125, 20);
		guiaFosforo.add(txtAcidoFosforico);
		
		textField_Valor_AcidoFosforico = new JTextField();
		textField_Valor_AcidoFosforico.setColumns(10);
		textField_Valor_AcidoFosforico.setBounds(415, 315, 125, 20);
		guiaFosforo.add(textField_Valor_AcidoFosforico);
		
		textField_Valor_Fosfato_Daoui = new JTextField();
		textField_Valor_Fosfato_Daoui.setColumns(10);
		textField_Valor_Fosfato_Daoui.setBounds(415, 284, 125, 20);
		guiaFosforo.add(textField_Valor_Fosfato_Daoui);
		
		textField_Valor_Yoorin = new JTextField();
		textField_Valor_Yoorin.setColumns(10);
		textField_Valor_Yoorin.setBounds(415, 253, 125, 20);
		guiaFosforo.add(textField_Valor_Yoorin);
		
		textField_Valor_Superfosfato_Triplo = new JTextField();
		textField_Valor_Superfosfato_Triplo.setColumns(10);
		textField_Valor_Superfosfato_Triplo.setBounds(415, 222, 125, 20);
		guiaFosforo.add(textField_Valor_Superfosfato_Triplo);
		
		txtMap = new JTextField();
		txtMap.setText("3 – MAP\t");
		txtMap.setEditable(false);
		txtMap.setColumns(10);
		txtMap.setBounds(550, 222, 125, 20);
		guiaFosforo.add(txtMap);
		
		txtFosfato_Arad = new JTextField();
		txtFosfato_Arad.setText("6 – Fosfato  Arad");
		txtFosfato_Arad.setEditable(false);
		txtFosfato_Arad.setColumns(10);
		txtFosfato_Arad.setBounds(550, 253, 125, 20);
		guiaFosforo.add(txtFosfato_Arad);
		
		txtFosfato_PatoMinas = new JTextField();
		txtFosfato_PatoMinas.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtFosfato_PatoMinas.setText("9 - Fosf.  Patos Minas");
		txtFosfato_PatoMinas.setEditable(false);
		txtFosfato_PatoMinas.setColumns(10);
		txtFosfato_PatoMinas.setBounds(550, 284, 125, 20);
		guiaFosforo.add(txtFosfato_PatoMinas);
		
		txtMultifmagnesiano = new JTextField();
		txtMultifmagnesiano.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtMultifmagnesiano.setText("12 – Multif.Magnesiano");
		txtMultifmagnesiano.setEditable(false);
		txtMultifmagnesiano.setColumns(10);
		txtMultifmagnesiano.setBounds(550, 315, 125, 20);
		guiaFosforo.add(txtMultifmagnesiano);
		
		textField_Valor_MultifMagnesiano = new JTextField();
		textField_Valor_MultifMagnesiano.setColumns(10);
		textField_Valor_MultifMagnesiano.setBounds(685, 315, 125, 20);
		guiaFosforo.add(textField_Valor_MultifMagnesiano);
		
		textField_Valor_Fosfato_PatoMinas = new JTextField();
		textField_Valor_Fosfato_PatoMinas.setColumns(10);
		textField_Valor_Fosfato_PatoMinas.setBounds(685, 284, 125, 20);
		guiaFosforo.add(textField_Valor_Fosfato_PatoMinas);
		
		textField_Valor_Fosfato_Arad = new JTextField();
		textField_Valor_Fosfato_Arad.setColumns(10);
		textField_Valor_Fosfato_Arad.setBounds(685, 253, 125, 20);
		guiaFosforo.add(textField_Valor_Fosfato_Arad);
		
		textField_Valor_Map = new JTextField();
		textField_Valor_Map.setColumns(10);
		textField_Valor_Map.setBounds(685, 222, 125, 20);
		guiaFosforo.add(textField_Valor_Map);

// 		descomentar após testes para voltar ao estado original
//		JButton btnCalcular_1 = new JButton("Calcular");
		btnCalcular_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				func2.CalculaFosforo(PaginaPrincipal.this);
			} 
		});
		btnCalcular_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalcular_1.setBounds(746, 400, 100, 23);
		guiaFosforo.add(btnCalcular_1);
		
		JLabel lblNewLabel_3 = new JLabel("Número da Fonte de Fósfoso");
		lblNewLabel_3.setBounds(442, 377, 183, 14);
		guiaFosforo.add(lblNewLabel_3);
		

		fonteFosforoJComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		fonteFosforoJComboBox.setMaximumRowCount(12);
		fonteFosforoJComboBox.setBounds(627, 373, 109, 22);
		guiaFosforo.add(fonteFosforoJComboBox);
		
		textFieldFonteFosforo = new JTextField();
		textFieldFonteFosforo.setEditable(false);
		textFieldFonteFosforo.setColumns(10);
		textFieldFonteFosforo.setBounds(627, 401, 109, 20);
		guiaFosforo.add(textFieldFonteFosforo);
	}



	private void guiaValoresIdeais(JTabbedPane painelDeGuias) {
		JPanel guiaValoresIdeais = new JPanel();
		painelDeGuias.addTab("Valores ideais", null, guiaValoresIdeais, null);
		guiaValoresIdeais.setLayout(null);
		
		JLabel lblTeores = new JLabel("Teores");
		lblTeores.setBounds(10, 11, 80, 38);
		guiaValoresIdeais.add(lblTeores);
		
		JLabel lblNoSolo = new JLabel("No solo");
		lblNoSolo.setBounds(10, 64, 80, 14);
		guiaValoresIdeais.add(lblNoSolo);
		
		JLabel lblIdeal = new JLabel("Ideal");
		lblIdeal.setBounds(10, 89, 80, 14);
		guiaValoresIdeais.add(lblIdeal);
		
		JLabel lblAposCorrecao = new JLabel("Após correção");
		lblAposCorrecao.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAposCorrecao.setBounds(10, 114, 80, 14);
		guiaValoresIdeais.add(lblAposCorrecao);
		
		JLabel lblUnidadeDeMedidaDm3 = new JLabel("mg.dm³");
		lblUnidadeDeMedidaDm3.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidadeDeMedidaDm3.setBounds(100, 11, 50, 14);
		guiaValoresIdeais.add(lblUnidadeDeMedidaDm3);
		
		JLabel lblUnidadeDeMedidamehlich = new JLabel("mehlich");
		lblUnidadeDeMedidamehlich.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUnidadeDeMedidamehlich.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidadeDeMedidamehlich.setBounds(150, 11, 50, 14);
		guiaValoresIdeais.add(lblUnidadeDeMedidamehlich);
		
		JLabel lblFosforo = new JLabel("Fósforo");
		lblFosforo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFosforo.setBounds(100, 36, 100, 14);
		guiaValoresIdeais.add(lblFosforo);
		
		textFieldNoSoloFosforo = new JTextField();
		textFieldNoSoloFosforo.setBounds(104, 61, 100, 20);
		guiaValoresIdeais.add(textFieldNoSoloFosforo);
		textFieldNoSoloFosforo.setColumns(10);
		
		textFieldIdealFosforo = new JTextField();
		textFieldIdealFosforo.setEditable(false);
		textFieldIdealFosforo.setColumns(10);
		textFieldIdealFosforo.setBounds(104, 86, 100, 20);
		guiaValoresIdeais.add(textFieldIdealFosforo);
		
		textFieldAposCorrecaoFosforo = new JTextField();
		textFieldAposCorrecaoFosforo.setEditable(false);
		textFieldAposCorrecaoFosforo.setColumns(10);
		textFieldAposCorrecaoFosforo.setBounds(104, 111, 100, 20);
		guiaValoresIdeais.add(textFieldAposCorrecaoFosforo);
		
		JLabel lblUnidadeDeMedidaCmol = new JLabel("cmol");
		lblUnidadeDeMedidaCmol.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidadeDeMedidaCmol.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUnidadeDeMedidaCmol.setBounds(210, 11, 300, 14);
		guiaValoresIdeais.add(lblUnidadeDeMedidaCmol);
		
		JLabel lblPotassio = new JLabel("Potássio");
		lblPotassio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPotassio.setBounds(210, 36, 100, 14);
		guiaValoresIdeais.add(lblPotassio);
		
		JLabel lblCalcio = new JLabel("Cálcio");
		lblCalcio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalcio.setBounds(310, 36, 100, 14);
		guiaValoresIdeais.add(lblCalcio);
		
		JLabel lblMagnésio = new JLabel("Magnésio");
		lblMagnésio.setHorizontalAlignment(SwingConstants.CENTER);
		lblMagnésio.setBounds(410, 36, 100, 14);
		guiaValoresIdeais.add(lblMagnésio);
		
		textFieldNoSoloPotassio = new JTextField();
		textFieldNoSoloPotassio.setColumns(10);
		textFieldNoSoloPotassio.setBounds(210, 61, 100, 20);
		guiaValoresIdeais.add(textFieldNoSoloPotassio);
		
		textFieldNoSoloCalcio = new JTextField();
		textFieldNoSoloCalcio.setColumns(10);
		textFieldNoSoloCalcio.setBounds(310, 61, 100, 20);
		guiaValoresIdeais.add(textFieldNoSoloCalcio);
		
		textFieldNoSoloMagnesio = new JTextField();
		textFieldNoSoloMagnesio.setColumns(10);
		textFieldNoSoloMagnesio.setBounds(410, 61, 100, 20);
		guiaValoresIdeais.add(textFieldNoSoloMagnesio);
		
		textFieldIdealPotassio = new JTextField();
		textFieldIdealPotassio.setEditable(false);
		textFieldIdealPotassio.setColumns(10);
		textFieldIdealPotassio.setBounds(210, 86, 100, 20);
		guiaValoresIdeais.add(textFieldIdealPotassio);
		
		textFieldIdealCalcio = new JTextField();
		textFieldIdealCalcio.setEditable(false);
		textFieldIdealCalcio.setColumns(10);
		textFieldIdealCalcio.setBounds(310, 86, 100, 20);
		guiaValoresIdeais.add(textFieldIdealCalcio);
		
		textFieldIdealMagnesio = new JTextField();
		textFieldIdealMagnesio.setEditable(false);
		textFieldIdealMagnesio.setColumns(10);
		textFieldIdealMagnesio.setBounds(410, 86, 100, 20);
		guiaValoresIdeais.add(textFieldIdealMagnesio);
		
		textFieldAposCorrecaoPotassio = new JTextField();
		textFieldAposCorrecaoPotassio.setEditable(false);
		textFieldAposCorrecaoPotassio.setColumns(10);
		textFieldAposCorrecaoPotassio.setBounds(210, 111, 100, 20);
		guiaValoresIdeais.add(textFieldAposCorrecaoPotassio);
		
		textFieldAposCorrecaoCalcio = new JTextField();
		textFieldAposCorrecaoCalcio.setEditable(false);
		textFieldAposCorrecaoCalcio.setColumns(10);
		textFieldAposCorrecaoCalcio.setBounds(310, 111, 100, 20);
		guiaValoresIdeais.add(textFieldAposCorrecaoCalcio);
		
		textFieldAposCorrecaoMagnesio = new JTextField();
		textFieldAposCorrecaoMagnesio.setEditable(false);
		textFieldAposCorrecaoMagnesio.setColumns(10);
		textFieldAposCorrecaoMagnesio.setBounds(410, 111, 100, 20);
		guiaValoresIdeais.add(textFieldAposCorrecaoMagnesio);
		
		JLabel lblUnidadeDeMedidaDm3_1 = new JLabel("mg.dm³");
		lblUnidadeDeMedidaDm3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidadeDeMedidaDm3_1.setBounds(520, 11, 100, 14);
		guiaValoresIdeais.add(lblUnidadeDeMedidaDm3_1);
		
		JLabel lblEnxofre = new JLabel("Enxofre");
		lblEnxofre.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnxofre.setBounds(520, 35, 100, 14);
		guiaValoresIdeais.add(lblEnxofre);
		
		textFieldNoSoloEnxofre = new JTextField();
		textFieldNoSoloEnxofre.setColumns(10);
		textFieldNoSoloEnxofre.setBounds(520, 61, 100, 20);
		guiaValoresIdeais.add(textFieldNoSoloEnxofre);
		
		textFieldIdealEnxofre = new JTextField();
		textFieldIdealEnxofre.setEditable(false);
		textFieldIdealEnxofre.setColumns(10);
		textFieldIdealEnxofre.setBounds(520, 86, 100, 20);
		guiaValoresIdeais.add(textFieldIdealEnxofre);
		
		textFieldNoSoloAluminio = new JTextField();
		textFieldNoSoloAluminio.setColumns(10);
		textFieldNoSoloAluminio.setBounds(630, 61, 100, 20);
		guiaValoresIdeais.add(textFieldNoSoloAluminio);
		
		textFieldIdealAluminio = new JTextField();
		textFieldIdealAluminio.setEditable(false);
		textFieldIdealAluminio.setColumns(10);
		textFieldIdealAluminio.setBounds(630, 86, 100, 20);
		guiaValoresIdeais.add(textFieldIdealAluminio);
		
		textFieldNoSoloHAL = new JTextField();
		textFieldNoSoloHAL.setColumns(10);
		textFieldNoSoloHAL.setBounds(740, 61, 100, 20);
		guiaValoresIdeais.add(textFieldNoSoloHAL);
		
		JLabel lblAluminio = new JLabel("Alumínio");
		lblAluminio.setHorizontalAlignment(SwingConstants.CENTER);
		lblAluminio.setBounds(630, 11, 100, 38);
		guiaValoresIdeais.add(lblAluminio);
		
		JLabel lblHAL = new JLabel("H + AL");
		lblHAL.setHorizontalAlignment(SwingConstants.CENTER);
		lblHAL.setBounds(740, 11, 100, 38);
		guiaValoresIdeais.add(lblHAL);
		
		JLabel lblSCmol = new JLabel("S cmol:");
		lblSCmol.setBounds(104, 162, 50, 14);
		guiaValoresIdeais.add(lblSCmol);
		
		textFieldSCmol = new JTextField();
		textFieldSCmol.setEditable(false);
		textFieldSCmol.setBounds(154, 159, 50, 20);
		guiaValoresIdeais.add(textFieldSCmol);
		textFieldSCmol.setColumns(10);
		
		JLabel lblCTCMol = new JLabel("CTC mol:");
		lblCTCMol.setBounds(214, 162, 50, 14);
		guiaValoresIdeais.add(lblCTCMol);
		
		textFieldCTCMol = new JTextField();
		textFieldCTCMol.setEditable(false);
		textFieldCTCMol.setBounds(264, 159, 50, 20);
		guiaValoresIdeais.add(textFieldCTCMol);
		textFieldCTCMol.setColumns(10);
		
		JLabel lblVPorcentoAtual = new JLabel("V% atual: ");
		lblVPorcentoAtual.setBounds(324, 162, 70, 14);
		guiaValoresIdeais.add(lblVPorcentoAtual);
		
		textFieldVPorcentoAtual = new JTextField();
		textFieldVPorcentoAtual.setEditable(false);
		textFieldVPorcentoAtual.setBounds(394, 159, 159, 20);
		guiaValoresIdeais.add(textFieldVPorcentoAtual);
		textFieldVPorcentoAtual.setColumns(10);
		
		JLabel lblMOGdm3 = new JLabel("M.O. (g.dm³)");
		lblMOGdm3.setBounds(10, 190, 80, 14);
		guiaValoresIdeais.add(lblMOGdm3);
		
		textFieldMOGdm3_1 = new JTextField();
		textFieldMOGdm3_1.setBounds(104, 187, 100, 20);
		guiaValoresIdeais.add(textFieldMOGdm3_1);
		textFieldMOGdm3_1.setColumns(10);
		
		textFieldMOPorcento_Resultado = new JTextField();
		textFieldMOPorcento_Resultado.setEditable(false);
		textFieldMOPorcento_Resultado.setColumns(10);
		textFieldMOPorcento_Resultado.setBounds(324, 187, 100, 20);
		guiaValoresIdeais.add(textFieldMOPorcento_Resultado);
		
		textFieldCarbono_Resultado = new JTextField();
		textFieldCarbono_Resultado.setEditable(false);
		textFieldCarbono_Resultado.setColumns(10);
		textFieldCarbono_Resultado.setBounds(552, 187, 226, 20);
		guiaValoresIdeais.add(textFieldCarbono_Resultado);
		
		JLabel lblNewLabel_1 = new JLabel("Teor ideal de M.O.:");
		lblNewLabel_1.setBounds(452, 217, 130, 14);
		guiaValoresIdeais.add(lblNewLabel_1);
		
		textFieldTeorIdealMO = new JTextField();
		textFieldTeorIdealMO.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFieldTeorIdealMO.setText("3,0 a 4,0%");
		textFieldTeorIdealMO.setEditable(false);
		textFieldTeorIdealMO.setBounds(592, 218, 100, 20);
		guiaValoresIdeais.add(textFieldTeorIdealMO);
		textFieldTeorIdealMO.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("M.O. %");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(210, 190, 100, 14);
		guiaValoresIdeais.add(lblNewLabel);
		
		JLabel lblCarbono = new JLabel("Carbono");
		lblCarbono.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarbono.setBounds(442, 190, 100, 14);
		guiaValoresIdeais.add(lblCarbono);
		
//		descomentar após testes	para voltar ao estado original	
//		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Botão funcionando guia Valores Ideais, apagando textos input e adicionando texto nos JTextFields sem input");
				func1.CalculaIdeal(PaginaPrincipal.this);
				//func1.PreencheBotoes(PaginaPrincipal.this);				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalcular.setBounds(740, 299, 100, 23);
		guiaValoresIdeais.add(btnCalcular);
		btnCalcular.setName("btnCalcular");
		

		tipoTerrenoJComboBox.setMaximumRowCount(2);
		tipoTerrenoJComboBox.setModel(new DefaultComboBoxModel(new String[] {"Argiloso", "Textura média"}));
		tipoTerrenoJComboBox.setBounds(621, 301, 109, 22);
		guiaValoresIdeais.add(tipoTerrenoJComboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de terreno");
		lblNewLabel_3.setBounds(520, 305, 100, 14);
		guiaValoresIdeais.add(lblNewLabel_3);
		
		textFieldTipoDeSolo = new JTextField();
		textFieldTipoDeSolo.setEditable(false);
		textFieldTipoDeSolo.setColumns(10);
		textFieldTipoDeSolo.setBounds(621, 329, 109, 20);
		guiaValoresIdeais.add(textFieldTipoDeSolo);
	}

	
	
	public JTextField getTextField(JTextField texto) {
		return texto;
	}

	public List<JTextField> getTextFieldsComInputUsuárioGuiaValoresIdeais() {
		textFieldTipoDeSolo.setText(tipoTerrenoJComboBox.getSelectedItem().toString());
		listaComInputValoresIdeais.add(textFieldTipoDeSolo);	
		listaComInputValoresIdeais.add(textFieldNoSoloFosforo);
		listaComInputValoresIdeais.add(textFieldNoSoloPotassio); //2
		listaComInputValoresIdeais.add(textFieldNoSoloCalcio);//3
		listaComInputValoresIdeais.add(textFieldNoSoloMagnesio);//4
		listaComInputValoresIdeais.add(textFieldNoSoloEnxofre);//5
		listaComInputValoresIdeais.add(textFieldNoSoloAluminio);//6
		listaComInputValoresIdeais.add(textFieldNoSoloHAL);//7
		listaComInputValoresIdeais.add(textFieldMOGdm3_1);//8
		//listaComInputValoresIdeais.add(textFieldMOGdm3_3);
		//listaComInputValoresIdeais.add(textFieldMOGdm3_5);	
		return listaComInputValoresIdeais;
	}

	public List<JTextField> getTextFieldsSemInputUsuárioGuiaValoresIdeais() {
		//textFieldTipoDeSolo.setText(tipoTerreno.getSelectedItem().toString());
		listaSemInputValoresIdeais.add(textFieldIdealFosforo);
		listaSemInputValoresIdeais.add(textFieldIdealPotassio);
		listaSemInputValoresIdeais.add(textFieldIdealCalcio);
		listaSemInputValoresIdeais.add(textFieldIdealMagnesio);
		listaSemInputValoresIdeais.add(textFieldIdealEnxofre);
		listaSemInputValoresIdeais.add(textFieldIdealAluminio);
		listaSemInputValoresIdeais.add(textFieldAposCorrecaoFosforo);
		listaSemInputValoresIdeais.add(textFieldAposCorrecaoPotassio);
		listaSemInputValoresIdeais.add(textFieldAposCorrecaoCalcio);
		listaSemInputValoresIdeais.add(textFieldAposCorrecaoMagnesio);
		listaSemInputValoresIdeais.add(textFieldSCmol);//10
		listaSemInputValoresIdeais.add(textFieldCTCMol);//11
		listaSemInputValoresIdeais.add(textFieldVPorcentoAtual);//12
		//listaSemInputValoresIdeais.add(textFieldMOGdm3_2);
		//listaSemInputValoresIdeais.add(textFieldMOGdm3_4);
		//listaSemInputValoresIdeais.add(textFieldMOGdm3_Resultado_1);
		listaSemInputValoresIdeais.add(textFieldMOPorcento_Resultado);//13
		listaSemInputValoresIdeais.add(textFieldCarbono_Resultado);//14
		listaSemInputValoresIdeais.add(textFieldTeorIdealMO);
		return listaSemInputValoresIdeais;
	}
	
	public List<JTextField> getTextFieldComInputUsuarioGuiaFosforo(){
		textFieldFonteFosforo.setText(fonteFosforoJComboBox.getSelectedItem().toString());
		listaComInputFosforo.add(textFieldFonteFosforo);
		listaComInputFosforo.add(textFieldTeorDeFosforoAAtingir); 
		//listaComInputFosforo.add(textFieldFonteDeFosforoAAplicar);
		listaComInputFosforo.add(textFieldEficienciaDoFosforo);
		listaComInputFosforo.add(textField_Valor_Superfosfato_Simples);
		listaComInputFosforo.add(textField_Valor_Superfosfato_Triplo);
		listaComInputFosforo.add(textField_Valor_Map);
		listaComInputFosforo.add(textField_Valor_DAP);
		listaComInputFosforo.add(textField_Valor_Yoorin);
		listaComInputFosforo.add(textField_Valor_Fosfato_Arad);
		listaComInputFosforo.add(textField_Valor_Fosfato_Gafsa);
		listaComInputFosforo.add(textField_Valor_Fosfato_Daoui);
		listaComInputFosforo.add(textField_Valor_Fosfato_PatoMinas);
		listaComInputFosforo.add(textField_Valor_EscoriaDeThomas);
		listaComInputFosforo.add(textField_Valor_AcidoFosforico);
		listaComInputFosforo.add(textField_Valor_MultifMagnesiano);
		return listaComInputFosforo;
	}
	
	public List<JTextField> getTextFieldSemInputUsuarioGuiaFosforo(){
		listaSemInputFosforo.add(textFieldFontePotassio);//0
		listaSemInputFosforo.add(textFieldValor_Resposta_1);//1
		listaSemInputFosforo.add(textFieldEnxofreOuMagnesio);//2
		listaSemInputFosforo.add(textFieldValor_Resoposta_2);//3
		listaSemInputFosforo.add(textCalcioOuNitroGenio);//4
		listaSemInputFosforo.add(textFieldQuantidadeAAplicar);//5
		listaSemInputFosforo.add(textFieldCustoRSHa_Resposta);//6
		return listaSemInputFosforo;
	}
	
	public List<JTextField> getTextFieldComInputUsuarioGuiaPotassio(){
		textFieldFontePotassio.setText(fontePotassioJComboBox.getSelectedItem().toString());
		listaComInputPotassio.add(textFieldFontePotassio);//0
		listaComInputPotassio.add(textField_Potassio_CTC_Desejada);//1
		listaComInputPotassio.add(txtCloreto_Resposta);//2
		listaComInputPotassio.add(txtSulfato_Resposta);//3
		listaComInputPotassio.add(txtSulfPotMag_Resposta);//4
		return listaComInputPotassio;
	}
	
	public List<JTextField> getTextFieldSemInputUsuarioGuiaPotassio(){
		listaSemInputPotassio.add(textField_Potassio_CTC_Atual);//0
		listaSemInputPotassio.add(textField_Potassio_CTC_Ideal);
		listaSemInputPotassio.add(textField_Potassio_CTC_Corrigido);//2
		listaSemInputPotassio.add(textField_quantidadeAAplicarFosforo);//3
		listaSemInputPotassio.add(textField_Custo_Rs_Ha_Resposta);//4
		return listaSemInputPotassio;
	}
	
	public List<JTextField> getTextFieldComInputUsuarioGuiaCalcioMagnesio(){
		textFieldFonteCalcioEMagnesio.setText(fonteCalcioEMagnesioJComboBox.getSelectedItem().toString());
		listaComInputCalcioMagnesio.add(textFieldFonteCalcioEMagnesio);
		listaComInputCalcioMagnesio.add(txtCalcio_Desejado_Resposta);
		//listaComInputCalcioMagnesio.add(txt_FonteCorretivoUsar_Resposta);
		listaComInputCalcioMagnesio.add(txt_PRNT_resposta);
		listaComInputCalcioMagnesio.add(txt_TeorCAO_Resposta);
		listaComInputCalcioMagnesio.add(txt_Calcario_Dolomitico_Resposta);
		listaComInputCalcioMagnesio.add(txt_Calcario_Calcidico_Resposta);
		listaComInputCalcioMagnesio.add(txt_Calcario_Conca_Resposta);
		listaComInputCalcioMagnesio.add(txt_Gesso_Resposta);
		listaComInputCalcioMagnesio.add(txt_HidroxidoCalcio_Resposta);
		listaComInputCalcioMagnesio.add(txt_Calcario_Magnesiano_Resposta);
		
		return listaComInputCalcioMagnesio;
	}
	public List<JTextField> getTextFieldSemInputUsuarioGuiaCalcioMagnesio(){
		listaSemInputCalcioMagnesio.add(txtCalcio_ParticipaoAtualCTCSolo);//0
		listaSemInputCalcioMagnesio.add(txtCalcio_Ideal);//1
		listaSemInputCalcioMagnesio.add(txtCalcio_AposCorrecoes);//2
		listaSemInputCalcioMagnesio.add(txtMagnesio_ParticipaoAtualCTCSolo);//3
		listaSemInputCalcioMagnesio.add(txtMagnesio_Ideal);//4
		listaSemInputCalcioMagnesio.add(txtMagnesio_AposCorrecoes);//5
		listaSemInputCalcioMagnesio.add(txt_QuantidadeAAplicar_TONHa);//6
		listaSemInputCalcioMagnesio.add(textField_Atual_Resposta);//7
		listaSemInputCalcioMagnesio.add(textField_AposCorrecoes);//8
		listaSemInputCalcioMagnesio.add(txt_Ideal_resp);//9
		return listaSemInputCalcioMagnesio;
	}
}
