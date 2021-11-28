package view.valoresIdeais;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import javax.swing.JTextField;

import view.PaginaPrincipal;
import logic.edu.utfpr.cp.dacom.sa.soilcorrection.valoresIdeais.*;

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
    
   /* public void PreencheBotoes(PaginaPrincipal pg) {
        this.pg = pg;
        this.lista = pg.getTextFieldsSemInputUsuárioGuiaValoresIdeais();
        for (int i = 0; i < lista.size(); i++) {
        	this.texto = pg.getTextField(lista.get(i));
        texto.setText("Botão funcionou, guia Valores Ideais!");
        } 	
    }*/
    
    public void CalculaIdeal(PaginaPrincipal pg) {
        this.pg = pg;
        this.listaTextFieldsComInputUsuárioGuiaValoresIdeais = pg.getTextFieldsComInputUsuárioGuiaValoresIdeais();
        this.listaTextFieldsSemInputUsuárioGuiaValoresIdeais = pg.getTextFieldsSemInputUsuárioGuiaValoresIdeais();
        System.out.println(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(0).getText().equals("Argiloso"));
        
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
        
        double SCmol = new EquilibrioCorrecaoCTC().
        		calculaSCmol(
        				Double.parseDouble(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(2).getText()), 
        				Double.parseDouble(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(3).getText()), 
        				Double.parseDouble(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(4).getText())
        				);
        
        double CTCCmol = new EquilibrioCorrecaoCTC().
				calculaCTCCmol(
						Double.parseDouble(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(2).getText()), 
						Double.parseDouble(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(3).getText()), 
						Double.parseDouble(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(4).getText()),						
						Double.parseDouble(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(7).getText())
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
        
        
        
    }
}
