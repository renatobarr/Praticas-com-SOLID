package codigos_antigos;

public class Carro implements Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Carro está dirigindo na estrada...");
    }

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Carro não voa!");
    }

    @Override
    public void navegar() {
        throw new UnsupportedOperationException("Carro não navega!");
    }
}