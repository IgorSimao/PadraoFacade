import java.util.ArrayList;

public class ReservaAereo {

    public double fazerReservaAereo(ArrayList<String> hospedes) {
        if(hospedes.size() > 0 ){
            double valorTotalAreo = hospedes.size() * 1200;
            System.out.println("Reserva Aereo Realizada! ");
            System.out.println("Valor Total Aereo: R$"+ valorTotalAreo);
            System.out.println("|__________________________________________|");
            
            return valorTotalAreo;
        }
        return 0;
    }

}
