package inventario;

public class Inventario {
    //variaveis para os slots de armaduras;
    boolean capacete;
    boolean peitoral;
    boolean calca;
    boolean bota;
    boolean arma;

    //variaveis que agrupam os slots do inventario;
    int numeroDoSlot = 10; //Vai indicar em qual slot está e qual o limite da array;
    int numeroDoItem = 30; //Vai indicar qual item é pela enumeração e tambem definir limite do array
    int[][] slots = new int[numeroDoSlot][numeroDoItem];

 public void inventario(){
     Pocoes pocoes = new Pocoes();
     pocoes.pocao[0] = 7;
     pocoes.pocao[1] = 1;
     pocoes.pocao[2] = 0;
     pocoes.pocao[3] = 2;
     pocoes.pocao[4] = 2;

     Inventario slots = new Inventario();
     slots.slots[0][3] = 3;
     slots.slots[9][29] = 1;


//Exibe a quantidade de itens, o tipo e em qual slot o item esta:
     for(int i=0; i<slots.numeroDoItem; i++){
         for(int j=0; j<slots.numeroDoSlot; j++){
             if(slots.slots[j][i]>0) {
                 System.out.println("Slot "+(j+1)+" tem "+slots.slots[j][i]+" itens do tipo "+(i+1));
             }
             else if(slots.slots[j][i]==0){
                 continue;
             }
         }
     }


            /*
//Exibe um "mapa" do seu inventario, onde as linhas são os slots e colunas os itens e o valor é a quantidade:
        for(int[] slot : slots.slots){
            for(int slot1 : slot){
                    System.out.print(slot1 + " ");
            }
            System.out.println();
        }
*/

     System.out.println();

//Exibe quais poções você tem:
     for(int i=0; i<5; i++)
         if(pocoes.pocao[i]>0){
             System.out.print("Você tem "+pocoes.pocao[i]+" poções");
             if(i==0){
                 System.out.println(" de Cura");
                 continue;
             }
             else if(i==1){
                 System.out.println(" de Mana");
                 continue;
             }
             else if(i==2){
                 System.out.println(" de Invisibilidade");
                 continue;
             }
             else if(i==3){
                 System.out.println(" de Resistencia ao Fogo");
                 continue;
             }
             else if(i==4){
                 System.out.println(" de Veneno");
             }
         }
         else if(pocoes.pocao[i]==0){
             System.out.println("Você não tem poções do tipo "+(i+1));
         }
 }
}
