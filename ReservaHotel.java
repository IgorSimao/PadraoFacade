import java.util.ArrayList;

public class ReservaHotel {

    public double fazerReservaHotel(String hospedePrincipal, ArrayList<String> hospedes, int diarias) {
        if(diarias > 0){
            System.out.println("Reserva Realizada Hotel TSI");
            System.out.println("Hospede Principal: " + hospedePrincipal);
            double valorTotal = (double) (hospedes.size() * 100) * diarias;
            System.out.println("Valor Total Reserva: R$" + valorTotal);
            System.out.println("|__________________________________________|");
            return valorTotal;
        }
        return 0;
    }

}
