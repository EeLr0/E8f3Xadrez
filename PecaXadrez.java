import java.util.ArrayList;

public class PecaXadrez {
    public String posicao;
    char aux;
    char[] coorHor = new char[]{'A','B','C','D','E','F','G','H'};
    public ArrayList<String>movimentos = new ArrayList<>();

    public PecaXadrez(String coordenadas){
        this.posicao = coordenadas;
    }

    public PecaXadrez(){
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String coordenadas) {
        this.posicao = coordenadas;
    }

    ArrayList<String>podeMoverPara(){
      this.aux  = posicao.charAt(0);
        for (char c : coorHor) {
            if (this.aux == c) {
                break;
            }
        }
        return movimentos;
    }
}