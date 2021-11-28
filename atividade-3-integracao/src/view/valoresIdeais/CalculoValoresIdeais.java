package view.valoresIdeais;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.Locale;

import javax.swing.JTextField;

import logic.edu.utfpr.cp.dacom.sa.soilcorrection.valoresIdeais.*;
import view.PaginaPrincipal;

public class CalculoValoresIdeais implements EventListener{
    private PaginaPrincipal pg;
    private JTextField texto;
    List<JTextField> listaTextFieldsComInputUsuárioGuiaValoresIdeais = new ArrayList<JTextField>();
    List<JTextField> listaTextFieldsSemInputUsuárioGuiaValoresIdeais = new ArrayList<JTextField>();
    
    public void ApagaBotoes(PaginaPrincipal pg){
        this.pg = pg;
        this.listaTextFieldsComInputUsuárioGuiaValoresIdeais = pg.getTextFieldsComInputUsuárioGuiaValoresIdeais();
        for (int i = 0; i < listaTextFieldsComInputUsuárioGuiaValoresIdeais.size(); i++) {
        	this.texto = pg.getTextField(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(i));
        texto.setText("");
        }        
    }
    
	public void VerificaVazio(PaginaPrincipal pg){
        this.pg = pg;
        this.listaTextFieldsComInputUsuárioGuiaValoresIdeais = pg.getTextFieldsComInputUsuárioGuiaValoresIdeais();
        for (int i = 0; i < listaTextFieldsComInputUsuárioGuiaValoresIdeais.size(); i++) {
        	if (pg.getTextField(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(i)).getText().equals("")) {
        		this.texto = pg.getTextField(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(i));
        		texto.setText("1");
        	}
        }        
    }
	
	
    public void CalculaIdeal(PaginaPrincipal pg) {
    	
    	NumberFormat format = NumberFormat.getInstance(Locale.getDefault());

        this.pg = pg;
        this.listaTextFieldsComInputUsuárioGuiaValoresIdeais = pg.getTextFieldComInputUsuarioGuiaFosforo();
        this.listaTextFieldsSemInputUsuárioGuiaValoresIdeais = pg.getTextFieldsSemInputUsuárioGuiaValoresIdeais();
        //System.out.println(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(0).getText().equals("Argiloso"));
        VerificaVazio(pg);
        
        //Calcula valores ideais para tipo de solo
        if(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(0).getText().equals("Argiloso")) {
        	NutrientesCTC idealArgiloso = TexturaSolo.ARGILOSO.calculaValorIdeal();
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(0).setText(Double.toString(idealArgiloso.fosforo()));
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(1).setText(Double.toString(idealArgiloso.potassio()));
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(2).setText(Double.toString(idealArgiloso.calcio()));
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(3).setText(Double.toString(idealArgiloso.magnesio()));
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(4).setText(Double.toString(idealArgiloso.enxofre()));
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(5).setText(Double.toString(idealArgiloso.aluminioHidrogenio()));
        } else if (listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(0).getText().equals("Textura média")){
        	NutrientesCTC idealTextura_Media = TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal();
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(0).setText(Double.toString(idealTextura_Media.fosforo()));
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(1).setText(Double.toString(idealTextura_Media.potassio()));
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(2).setText(Double.toString(idealTextura_Media.calcio()));
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(3).setText(Double.toString(idealTextura_Media.magnesio()));
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(4).setText(Double.toString(idealTextura_Media.enxofre()));
        	listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(5).setText(Double.toString(idealTextura_Media.aluminioHidrogenio()));
        }
        
        //Calcula S mol, CTC mol, V porcentual MO% e Carbono
        
        double SCmol;
		try {
			SCmol = new EquilibrioCorrecaoCTC().
					calculaSCmol(
							format.parse(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(2).getText()).doubleValue(), 
							format.parse(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(3).getText()).doubleValue(), 
							format.parse(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(4).getText()).doubleValue()
							);
			
			double CTCCmol = new EquilibrioCorrecaoCTC().
					calculaCTCCmol(
							format.parse(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(2).getText()).doubleValue(), 
							format.parse(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(3).getText()).doubleValue(), 
							format.parse(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(4).getText()).doubleValue(),						
							format.parse(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(7).getText()).doubleValue()
							);
			System.out.println(CTCCmol);
			double vPorcentual = new EquilibrioCorrecaoCTC().calculaVPercentual(SCmol, CTCCmol);
			
			double moPercentual = new EquilibrioCorrecaoCTC().calculaMOPercentual(Double.parseDouble(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(8).getText()));
			
			double carbono = new EquilibrioCorrecaoCTC().calculaCarbono(moPercentual);
			
			
			System.out.println(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(8).getText());
			
			listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(10).setText(Double.toString(SCmol));
			listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(11).setText(Double.toString(CTCCmol));
			listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(12).setText(Double.toString(vPorcentual));
			listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(13).setText(Double.toString(moPercentual));
			listaTextFieldsSemInputUsuárioGuiaValoresIdeais.get(14).setText(Double.toString(carbono));
		} catch (NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
    }
}
