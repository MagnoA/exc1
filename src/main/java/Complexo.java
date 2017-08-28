public class Complexo {


    private int real;
    private int im;

    public Complexo(){
        real = 0;
        im = 0;
    }

    public Complexo(int r, int i){
        real = r;
        im = i;
    }

    public String toString() {
        return "(" + real + "," + im + ")";
    }

    public void soma(Complexo n) {
        real += n.real;
        im += n.im;
    }

    public void subtracao(Complexo n){
        real -= n.real;
        im -= n.im;
    }
}
