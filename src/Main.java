import models.Carro;

public class Main {
    public static void main(String[] args) {
        Carro novoCarro = new Carro("GM", "Celta VHC", "2023",5,5,"abc123def456abc000","Flex");
        novoCarro.setCor("Verde");

        System.out.println(" ----- VEICULO CADASTRADO ----- ");
        System.out.println("Marca: " + novoCarro.getMarca());
        System.out.println("Modelo: " + novoCarro.getModelo());
        System.out.println("Ano de Fabricacao: " + novoCarro.getAnoDeFabricacao());
        System.out.println("Numero de Portas: " + novoCarro.getNumeroDePortas());
        System.out.println("Quantidade de Pneus: " + novoCarro.getQtdPneus());
        System.out.println("Chassi: " + novoCarro.getChassi());
        System.out.println("Combustivel: " + novoCarro.getCombustivel());
        System.out.println("Cor: " + novoCarro.getCor());
    }
}