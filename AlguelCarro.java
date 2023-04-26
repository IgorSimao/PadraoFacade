
public class AlguelCarro {

    public double alugarCarro(String hospedePrincipal, int diarias) {
        if(diarias > 0){
            System.out.println("Alguel Corolla 2016");
            System.out.println("Para: " + hospedePrincipal);
            double valorTotal = diarias * 150;
            System.out.println("Valor Total: R$"+ valorTotal);
            System.out.println("|__________________________________________|");
            return valorTotal;
        }
        return 0;
    }

}
