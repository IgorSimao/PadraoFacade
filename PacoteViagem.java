import java.util.ArrayList;

public class PacoteViagem {
    private PagamentoPacote pagamento;
    private ReservaAereo reservaAereo;
    private ReservaHotel reservaHotel;
    private AlguelCarro aluguelCarro;

    public PacoteViagem(){
        pagamento = new PagamentoPacote();
        reservaAereo = new ReservaAereo();
        reservaHotel = new ReservaHotel();
        aluguelCarro = new AlguelCarro();
    }

    public void comprarPacote(ArrayList<String> hospedes, String hospedePrincipal, int diarias){
        if(diarias > 0){
        double valorReservaAereo = reservaAereo.fazerReservaAereo(hospedes);
        double valorReservaHotel = reservaHotel.fazerReservaHotel(hospedePrincipal, hospedes, diarias);
        double valorAluguelCarro = aluguelCarro.alugarCarro(hospedePrincipal, diarias);
        
        double valorTotalPacote = valorAluguelCarro + valorReservaAereo + valorReservaHotel;

        System.out.println("Valor total do Pacote: R$"+ valorTotalPacote);
        
        if(valorTotalPacote > 0){
            boolean fazerPagamento = pagamento.fazerPagamento(valorTotalPacote);
            if (fazerPagamento) {
                System.out.println("-------Pagamento Realizado!-------");
                }
            }
        
        }else{
            System.out.println("Ocorreu um erro ao tentar comprar o pacote! informe um numero de diárias maior que 0");
        }
    }
}
