import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Peao p2 = new Peao();
    System.out.println(p2.getPosicao());

    Peao p3 = new Peao("F3");

    System.out.println(p2.podeMoverPara());

    System.out.println(p3.podeMoverPara());

    //////////////////////////////////////
    Torre t1 = new Torre("E4");
    System.out.println(t1.getPosicao());
    System.out.println(t1.podeMoverPara());

    }
}