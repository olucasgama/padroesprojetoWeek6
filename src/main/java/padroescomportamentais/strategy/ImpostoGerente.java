package padroescomportamentais.strategy;

public class ImpostoGerente implements Imposto {

    public double calcularImposto(double valor) {
        return valor * 0.85;
    }
}
