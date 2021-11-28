package view.correcaoEFontesNutrientes.calcioMagnesio;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.Locale;

import javax.swing.JTextField;

import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.calcioMagnesio.CorrecaoCalcioMagnesio;
import view.PaginaPrincipal;

public class CalculoCalcioMagnesio implements EventListener{
    private PaginaPrincipal pg;
    private JTextField texto;
    List<JTextField> listaTextFieldsComInputUsuárioGuiaCalcioEMagnesio = new ArrayList<JTextField>();
    List<JTextField> listaTextFieldsSemInputUsuárioGuiaCalcioEMagnesio = new ArrayList<JTextField>();
    
	public void VerificaVazio(PaginaPrincipal pg){
        this.pg = pg;
        this.listaTextFieldsComInputUsuárioGuiaCalcioEMagnesio = pg.getTextFieldComInputUsuarioGuiaCalcioMagnesio();
        for (int i = 0; i < listaTextFieldsComInputUsuárioGuiaCalcioEMagnesio.size(); i++) {
        	if (pg.getTextField(listaTextFieldsComInputUsuárioGuiaCalcioEMagnesio.get(i)).getText().equals("")) {
        		this.texto = pg.getTextField(listaTextFieldsComInputUsuárioGuiaCalcioEMagnesio.get(i));
        		texto.setText("1");
        	}
        }        
    }

    
    public void CalculaCalcioMagnesio(PaginaPrincipal pg) {
    	NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
		this.pg = pg;
		this.listaTextFieldsComInputUsuárioGuiaCalcioEMagnesio = pg.getTextFieldComInputUsuarioGuiaCalcioMagnesio();
		this.listaTextFieldsSemInputUsuárioGuiaCalcioEMagnesio = pg.getTextFieldSemInputUsuarioGuiaCalcioMagnesio();
		
		VerificaVazio(pg);
		
		try {
			CorrecaoCalcioMagnesio correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
			double calcioNoSolo= format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(3).getText()).doubleValue();
			double magnesioNoSolo= format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(4).getText()).doubleValue();
			double valorDivisao;
			valorDivisao = (
					format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(3).getText()).doubleValue()+
					format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(4).getText()).doubleValue()+
					format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(2).getText()).doubleValue()
					)
					+format.parse(pg.getTextFieldsComInputUsuárioGuiaValoresIdeais().get(7).getText()).doubleValue();
			double ctcCalcioNoSolo = calcioNoSolo/valorDivisao;
			double ctcMagnesioNoSolo = magnesioNoSolo/valorDivisao;
			pg.getTextFieldComInputUsuarioGuiaCalcioMagnesio().get(0).setText(Double.toString(ctcCalcioNoSolo));
			pg.getTextFieldComInputUsuarioGuiaCalcioMagnesio().get(3).setText(Double.toString(ctcMagnesioNoSolo));
			double aposCorrecoesCalcio = (calcioNoSolo)/valorDivisao;
			double aposCorrecoesMagnesio = magnesioNoSolo/valorDivisao;
			pg.getTextFieldComInputUsuarioGuiaCalcioMagnesio().get(2).setText(Double.toString(aposCorrecoesCalcio));
			pg.getTextFieldComInputUsuarioGuiaCalcioMagnesio().get(5).setText(Double.toString(aposCorrecoesMagnesio));
			
			double qtdeAplicar;//=T70*100/C53
			double custoFonte;
			
			/*switch (key) {
			case value:
				
				break;

			default:
				break;
			}*/
			
			//double custoReaisHa = correcaoCalcioMagnesio.calculaCusto(custoFonte, qtdeAplicar);
			
			
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
