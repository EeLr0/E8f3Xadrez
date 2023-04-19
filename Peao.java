import java.util.ArrayList;

public class Peao extends PecaXadrez {


    String posIni = "B2";

    public Peao(String coordenadas) {
        super(coordenadas);
    }

    public Peao() {
        super();
        setPosicao(posIni);
    }



    @Override
    ArrayList<String> podeMoverPara() {
        String s;
        String s1;
        String s2;
        char aux2 = posicao.charAt(0);
        if (aux2 == 'B') {
            int aux3 = (int) posicao.charAt(1);

            for (int i = 0; i < 2; i++) {
                aux3 = (int) aux3 + 1;
                s1 = String.valueOf(aux2);
                s2 = String.valueOf((char) aux3);
                s = s1 + s2;
                movimentos.add(s);
            }
        } else {
            int aux3;
            aux2 = posicao.charAt(0);
            aux3 = (int) posicao.charAt(1) + 1;
            s1 = String.valueOf(aux2);
            s2 = String.valueOf((char) aux3);
            s = s1 + s2;
            movimentos.add(s);
        }
        return super.podeMoverPara();
    }
}


