public class SistemaIbge {
    public static void main(String[] args) throws Exception {
        for(EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        EstadoBrasileiro piaui = EstadoBrasileiro.PIAUI;
        System.out.println(piaui.getNome());
        System.out.println(piaui.getSigla());
        System.out.println(piaui.getNomeMaiusculo());
        System.out.println(piaui.getIbge());
    }
}
