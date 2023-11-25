import java.util.Scanner;

public class MenuPrincipal {
    Scanner ler = new Scanner(System.in);
    public int menu() {
        System.out.println("--------------------------------");
        System.out.println("Main Menu");
        System.out.println("[1]. Battle Enemies;");
        System.out.println("[2]. Inventory;");
        System.out.println("[3]. Character;");
        System.out.println("[4]. Skill Tree;");
        System.out.println("[5]. Shop;");
        System.out.println("[6]. Save and leave;");
        System.out.println("[7]. Delete Save;");
        System.out.println("--------------------------------");

        int menus = ler.nextInt();

        switch (menus) {
            case 1:

                break;
            case 2:
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                break;
            case 6:

                break;
            case 7:

                break;
            default:

                break;
        }
        return menus;
    }
}
