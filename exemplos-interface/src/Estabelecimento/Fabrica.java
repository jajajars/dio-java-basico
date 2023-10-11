package Estabelecimento;

import Equipamentos.Multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Multifuncional multifuncional = new Multifuncional();
        multifuncional.imprimir();
        multifuncional.copiar();
        multifuncional.digitalizar();

    }
}
