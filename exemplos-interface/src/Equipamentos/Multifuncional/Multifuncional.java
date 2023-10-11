package Equipamentos.Multifuncional;
import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;

public class Multifuncional implements Impressora, Copiadora, Digitalizadora{
    
    public void imprimir(){
        System.out.println("IMPRIMINDO");

    }

    public void copiar(){
        System.out.println("COPIANDO");

    }

    public void digitalizar(){
        System.out.println("DIGITALIZANDO");
    }

}
