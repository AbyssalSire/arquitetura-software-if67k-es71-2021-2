package view.correcaoEFontesNutrientes.potassio;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.Locale;

import javax.swing.JTextField;

import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.potassio.ConverteCMolcDm3EmMgDm3;
import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.potassio.ConverteKgHaEmK2O;
import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.potassio.CorrecaoPotassio;
import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.potassio.FontePotassio;
import view.PaginaPrincipal;

public class CalculoPotassio implements EventListener{
	    private PaginaPrincipal pg;
	    private JTextField texto;
	    List<JTextField> listaTextFieldsComInputUsuárioGuiaPotassio = new ArrayList<JTextField>();
	    List<JTextField> listaTextFieldsSemInputUsuárioGuiaPotassio = new ArrayList<JTextField>();
	    private String fonteFosfoto ="";
	    
	    public void ApagaBotoes(PaginaPrincipal pg){
	        this.pg = pg;
	        this.listaTextFieldsComInputUsuárioGuiaPotassio = pg.getTextFieldComInputUsuarioGuiaPotassio();
	        for (int i = 0; i < listaTextFieldsComInputUsuárioGuiaPotassio.size(); i++) {
	        	this.texto = pg.getTextField(listaTextFieldsComInputUsuárioGuiaPotassio.get(i));
	        texto.setText("");
	        }        
	    }
	    
		public void VerificaVazio(PaginaPrincipal pg){
	        this.pg = pg;
	        this.listaTextFieldsComInputUsuárioGuiaPotassio = pg.getTextFieldComInputUsuarioGuiaPotassio();
	        for (int i = 0; i < listaTextFieldsComInputUsuárioGuiaPotassio.size(); i++) {
	        	if (pg.getTextField(listaTextFieldsComInputUsuárioGuiaPotassio.get(i)).getText().equals("")) {
	        		this.texto = pg.getTextField(listaTextFieldsComInputUsuárioGuiaPotassio.get(i));
	        		texto.setText("1");
	        	}
	        }        
	    }
		
		public void CalculaPotassio(PaginaPrincipal pg) {
	    	NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
			this.pg = pg;
			this.listaTextFieldsComInputUsuárioGuiaPotassio = pg.getTextFieldComInputUsuarioGuiaPotassio();
			this.listaTextFieldsSemInputUsuárioGuiaPotassio = pg.getTextFieldSemInputUsuarioGuiaPotassio();
			
			VerificaVazio(pg);
			
			try {
			double potassioNoSolo = format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(2).getText()).doubleValue();
			double valorDivisao;
				valorDivisao = (
						format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(3).getText()).doubleValue()+
						format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(4).getText()).doubleValue()+
						format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(2).getText()).doubleValue()
						)
						+format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(7).getText()).doubleValue();
				double ctcPotassioNoSolo = potassioNoSolo/(valorDivisao);
				System.err.println(listaTextFieldsComInputUsuárioGuiaPotassio.get(0).getText());
				pg.getTextFieldSemInputUsuarioGuiaPotassio().get(0).setText(Double.toString(ctcPotassioNoSolo));

					pg.getTextFieldSemInputUsuarioGuiaPotassio().get(2).setText(listaTextFieldsComInputUsuárioGuiaPotassio.get(1).getText());
				
				CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio();
				System.err.println(listaTextFieldsSemInputUsuárioGuiaPotassio.get(0).getText());
				double necessidadeAdicionarCMolcDM3 = correcaoPotassio.calculaNecessidadeAdicionarCMolcDm3(
						format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(2).getText()).doubleValue(), 
						format.parse(listaTextFieldsSemInputUsuárioGuiaPotassio.get(0).getText()).doubleValue(), 
						format.parse(listaTextFieldsSemInputUsuárioGuiaPotassio.get(2).getText()).doubleValue()
						);
				
				double cmolcConvertido = new ConverteCMolcDm3EmMgDm3().converte(necessidadeAdicionarCMolcDM3);
				
				double k2oConvertido = new ConverteKgHaEmK2O().converte(cmolcConvertido*2);
				
				double eficiencia = correcaoPotassio.calculaEficienciaNutriente(k2oConvertido, 0.85);
				double quantidadeAplicar = 0;
				double custoReaisHa = 0;
				switch (listaTextFieldsComInputUsuárioGuiaPotassio.get(0).getText()) {
				case "1":
					quantidadeAplicar = correcaoPotassio.calculaQuantidadeAplicar(eficiencia, FontePotassio.CLORETO_POTASSIO);	
					custoReaisHa = correcaoPotassio.calculaCusto(format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(2).getText()).doubleValue(), quantidadeAplicar);
					break;
				case "2":
					quantidadeAplicar = correcaoPotassio.calculaQuantidadeAplicar(eficiencia, FontePotassio.SULFATO_POTASSIO);		
					custoReaisHa = correcaoPotassio.calculaCusto(format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(3).getText()).doubleValue(), quantidadeAplicar);
					break;
				case "3":
					
					quantidadeAplicar = correcaoPotassio.calculaQuantidadeAplicar(eficiencia, FontePotassio.SULFATO_POTASSIO_MAGNESIO);
					custoReaisHa = correcaoPotassio.calculaCusto(format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(4).getText()).doubleValue(), quantidadeAplicar);
					break;
					
				default:
					
					break;
				}
				
				listaTextFieldsSemInputUsuárioGuiaPotassio.get(3).setText(Double.toString(quantidadeAplicar));
				listaTextFieldsSemInputUsuárioGuiaPotassio.get(4).setText(Double.toString(custoReaisHa));
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}   

    
    
    
    
}
