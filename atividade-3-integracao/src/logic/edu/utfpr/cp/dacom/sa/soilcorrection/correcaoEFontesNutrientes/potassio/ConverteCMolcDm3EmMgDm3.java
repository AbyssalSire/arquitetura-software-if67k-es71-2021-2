package logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.potassio;

import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.componentesNutrienteGenerico.Conversao;
import lombok.NonNull;

public class ConverteCMolcDm3EmMgDm3 
        implements Conversao<Double, Double> {

    @Override
    public Double converte(@NonNull Double valor) {
        
        if (valor <= 0) {
            throw new IllegalArgumentException();
        }

        return valor * 391;
    }

}
