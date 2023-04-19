import java.util.ArrayList;
import java.util.Arrays;

public class Torre extends PecaXadrez{
    public Torre(String coordenadas){
        super(coordenadas);
    }

    @Override
    ArrayList<String> podeMoverPara() {
        int movVer;
        int count = 0;
        int movHor = 0;
        char movHori;
        char aux3 = posicao.charAt(0);
        char aux2 = posicao.charAt(1);
        char aux4;
        String s;
        String s1;
        String s2;
       for (int i=0; i<super.coorHor.length; i++){
            if ((int)aux2 == 56){
                movVer = (int)aux2 -1 -count;
                aux4 = (char)movVer;
                s1 = String.valueOf(aux3);
                s2 = String.valueOf(aux4);
                s = s1 + s2;
                movimentos.add(s);
                count++;
            }
            if ((int)aux2 == 49){
                movVer = (int)aux2 +1 +count;
                aux4 = (char)movVer;
                s1 = String.valueOf(aux3);
                s2 = String.valueOf(aux4);
                s = s1 + s2;
                movimentos.add(s);
                count++;
            }
            if ((int)aux2<57 && (int)aux2>48){
                movVer = (int)aux2 -1 -count;
                aux4 = (char)movVer;
                s1 = String.valueOf(aux3);
                s2 = String.valueOf(aux4);
                s = s1 + s2;
                if (movVer > 48)
                    movimentos.add(s);
                movVer = (int)aux2 +1 +count;
                aux4 = (char)movVer;
                s1 = String.valueOf(aux3);
                s2 = String.valueOf(aux4);
                s = s1 + s2;
                if (movVer <57)
                    movimentos.add(s);
                count++;
            }
        }
        count = 0;
        for (int i=0; i<super.coorHor.length; i++){
            if ((int)aux3 == (int)coorHor[7]){
                movHor = (int)aux3 -1 -count;
                movHori = (char)movHor ;
                s1 = String.valueOf(movHori);
                s2 = String.valueOf(aux2);
                s = s1 + s2;
                if (movHor >64)
                    movimentos.add(s);
                count++;
            }
            if ((int)aux3 == (int)coorHor[0]){
                movHor = (int)aux3 + 1 + count;
                movHori = (char)movHor;
                s1 = String.valueOf(movHori);
                s2 = String.valueOf(aux2);
                s = s1 + s2;
                if (movHor<73)
                    movimentos.add(s);
                count++;
            }
            if ((int)aux3<(int)coorHor[7] && (int)aux3>(int)coorHor[1]){
                movHor = (int)aux3 -1 -count;
                movHori = (char)movHor;
                s1 = String.valueOf(movHori);
                s2 = String.valueOf(aux2);
                s = s1 + s2;
                if (movHori > 64)
                    movimentos.add(s);
                movHor = (int)aux3 +1 +count;
                movHori = (char)movHor;
                s1 = String.valueOf(movHori);
                s2 = String.valueOf(aux2);
                s = s1 + s2;
                if (movHori < 73)
                    movimentos.add(s);
                count++;
            }
        }
        return super.podeMoverPara();
    }
}
