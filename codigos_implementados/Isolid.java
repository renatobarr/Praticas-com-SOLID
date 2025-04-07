package codigos_implementados;

interface Veiculo {
    void dirigir();
}

interface VeiculoVoador {
    void voar();
}

interface VeiculoNautico {
    void navegar();
}



class Carro implements Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Carro está dirigindo na estrada...");
    }
}

class Aviao implements Veiculo, VeiculoVoador {
    @Override
    public void dirigir() {
        System.out.println("Avião taxiando na pista...");
    }

    @Override
    public void voar() {
        System.out.println("Avião está voando...");
    }
}

class Barco implements VeiculoNautico {
    @Override
    public void navegar() {
        System.out.println("Barco está navegando no mar...");
    }
}


