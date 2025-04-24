//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovel a1 = new Automovel("11-11-AA","Toyota",1400);
        System.out.println(a1);
        System.out.println("Matrícula do automóvel 1: " + a1.getMatricula() );
        System.out.println("Total de automóveis: " + Automovel.getTotalAutomoveis() + "\n");

        Automovel a2 = new Automovel("22-22-BB", "Fiat");
        System.out.println(a2);
        a2.setCilindrada(1800);
        System.out.println(a2);
        System.out.println("Total de automóveis: " + Automovel.getTotalAutomoveis() + "\n");


        if (a2.calcularDiferencaCilindrada(a1)<0) {
            System.out.println("Diferença de cilindrada: " + a2.calcularDiferencaCilindrada(a1)*(-1));
        }
        else {
            System.out.println("Diferença de cilindrada: " + a2.calcularDiferencaCilindrada(a1));
        }

        if (!a2.isCilindradaMaior(a1)) {
            System.out.println("Matrícula do automóvel com maior cilindrada: " + a1.getMatricula());
        }
        else {
            System.out.println("Matrícula do automóvel com maior cilindrada: " + a2.getMatricula());
        }

        a1.isCilindradaMaior(2000);
    }
}