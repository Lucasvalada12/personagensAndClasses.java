
import inventario.Inventario;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Funcoes f = new Funcoes();
        MenuPrincipal m = new MenuPrincipal();
        Inventario i = new Inventario();
        System.out.println("ola aventureiros,  bem vindos a eldorian!");
        System.out.println();

        f.escolherPersonagens();

        m.menu();

        //i.inventario();




    }
}