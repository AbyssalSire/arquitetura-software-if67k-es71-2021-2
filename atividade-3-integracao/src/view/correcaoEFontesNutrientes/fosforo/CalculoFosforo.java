package view.correcaoEFontesNutrientes.fosforo;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.Locale;

import javax.swing.JTextField;

import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.fosforo.ConverteKgHaEmP2O5;
import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.fosforo.CorrecaoFosforo;
import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.fosforo.FonteFosforo;
import view.PaginaPrincipal;

public class CalculoFosforo implements EventListener{
    private PaginaPrincipal pg;
    private JTextField texto;
    List<JTextField> listaTextFieldsComInputUsuárioGuiaFosforo = new ArrayList<JTextField>();
    List<JTextField> listaTextFieldsSemInputUsuárioGuiaFosforo = new ArrayList<JTextField>();
    
    public void ApagaBotoes(PaginaPrincipal pg){
        this.pg = pg;
        this.listaTextFieldsComInputUsuárioGuiaFosforo = pg.getTextFieldComInputUsuarioGuiaFosforo();
        for (int i = 0; i < listaTextFieldsComInputUsuárioGuiaFosforo.size(); i++) {
        	this.texto = pg.getTextField(listaTextFieldsComInputUsuárioGuiaFosforo.get(i));
        texto.setText("");
        }        
    }
    
	public void VerificaVazio(PaginaPrincipal pg){
        this.pg = pg;
        this.listaTextFieldsComInputUsuárioGuiaFosforo = pg.getTextFieldComInputUsuarioGuiaFosforo();
        for (int i = 0; i < listaTextFieldsComInputUsuárioGuiaFosforo.size(); i++) {
        	if (pg.getTextField(listaTextFieldsComInputUsuárioGuiaFosforo.get(i)).getText().equals("")) {
        		this.texto = pg.getTextField(listaTextFieldsComInputUsuárioGuiaFosforo.get(i));
        		texto.setText("1");
        	}
        }        
    }

    
    public void CalculaFosforo(PaginaPrincipal pg) {   
    	NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
        this.pg = pg;
        this.listaTextFieldsComInputUsuárioGuiaFosforo = pg.getTextFieldComInputUsuarioGuiaFosforo();
        this.listaTextFieldsSemInputUsuárioGuiaFosforo = pg.getTextFieldSemInputUsuarioGuiaFosforo();
        try {
        
        VerificaVazio(pg);
        //System.out.println(listaTextFieldsComInputUsuárioGuiaFosforo.get(1).getText());
        double valorNoSolo = format.parse(pg.getTextFieldsSemInputUsuárioGuiaValoresIdeais().get(1).getText()).doubleValue();

        double teorFosforoAdicionarMgDm3 = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(1).getText()).doubleValue()-valorNoSolo;

        double teorFosforoAdicionarKgHa = new ConverteKgHaEmP2O5()
                .converte(teorFosforoAdicionarMgDm3);
        double teorFosforoAdicionarP2O5 = new ConverteKgHaEmP2O5()
                .converte(teorFosforoAdicionarKgHa);
        

        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo();

        double eficienciaFosforo = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(2).getText()).doubleValue()/100;
        double necessidadeFosforo = correcaoFosforo
                    .calculaEficienciaNutriente(teorFosforoAdicionarP2O5, eficienciaFosforo);
        double qtdeFosforoAplicar=0;
        double custoFonte;
        Integer indiceFonte;
        double testaCustoReaisHa = 0;
        double nutrientesAdicionais = 0;
        switch (listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText()) {
		case "1":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES).size();
			break;
		case "2":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_TRIPO);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_TRIPO).size();
			break;
		case "3":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.MAP);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.MAP).size();
			break;
			// Casos 4 a 12 não implementados pois não existem Fontes de Fósforo referentes, por favor alterar para o tipo correto
		case "4":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES).size();
			break;

		case "5":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES).size();
			break;
		case "6":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES).size();
			break;
		case "7":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES).size();
			break;
		case "8":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES).size();
			break;
		case "9":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
			break;
		case "10":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES).size();
			break;
		case "11":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES).size();
			break;
		case "12":
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;
	        custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();
	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES).size();
			break;
		default:
	        qtdeFosforoAplicar = correcaoFosforo.calculaQuantidadeAplicar(
	                necessidadeFosforo, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES);
	        indiceFonte = Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())+3;

				custoFonte = format.parse(listaTextFieldsComInputUsuárioGuiaFosforo.get(indiceFonte).getText()).doubleValue();

	        
	        testaCustoReaisHa = correcaoFosforo.calculaCusto(
	        		custoFonte, 
	                qtdeFosforoAplicar);
	        
	        nutrientesAdicionais = correcaoFosforo.getNutrientesAdicionais(
	                qtdeFosforoAplicar, 
	                FonteFosforo.SUPERFOSFATO_SIMPLES).size();
	        
	        
			break;
		}
                      
        listaTextFieldsSemInputUsuárioGuiaFosforo.get(5).setText(Double.toString(qtdeFosforoAplicar));
        if(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText().equals("1")||listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText().equals("12")) {
        	listaTextFieldsSemInputUsuárioGuiaFosforo.get(2).setText("Enxofre");
        } else if(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText().equals("5")) {
        	listaTextFieldsSemInputUsuárioGuiaFosforo.get(2).setText("Magnésio");
        } else {
        	listaTextFieldsSemInputUsuárioGuiaFosforo.get(1).setText("0.0");
        }
        
        if(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText().equals("1")||listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText().equals("2")
        		||listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText().equals("5")||listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText().equals("6")||
        		Integer.parseInt(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText())>=7) {
        	listaTextFieldsSemInputUsuárioGuiaFosforo.get(4).setText("Cálcio");
        } else if(listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText().equals("3")||listaTextFieldsComInputUsuárioGuiaFosforo.get(0).getText().equals("4")) {
        	listaTextFieldsSemInputUsuárioGuiaFosforo.get(2).setText("Nitrogênio");
        } else {
        	listaTextFieldsSemInputUsuárioGuiaFosforo.get(3).setText("0.0");
        }

        
        listaTextFieldsSemInputUsuárioGuiaFosforo.get(6).setText(Double.toString(testaCustoReaisHa*1000));
        

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
  
    
    
}
