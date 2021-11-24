package logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.calcioMagnesio;

import logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.componentesNutrienteGenerico.ICorrecaoNutriente;

public class CorrecaoCalcioMagnesio 
        implements ICorrecaoNutriente<FonteCalcioMagnesio> {

    public double calculaQuantidadeAplicar(
        double qtdeFonteAdicionar, 
        double prntPercent) {

        if (qtdeFonteAdicionar <= 0) {
            throw new IllegalArgumentException();
        }

        if (prntPercent <= 0) {
            throw new IllegalArgumentException();
        }

        return qtdeFonteAdicionar / prntPercent;
    }
}
