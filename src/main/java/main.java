public class main {


    public static void main(String[] args) {


        Complexo C1 = new Complexo();
        Complexo C2 = new Complexo(2,2);
        Complexo C3 = new Complexo(5,1);
        Complexo C4 = new Complexo();

        System.out.println("C1: "+C1.toString());

        System.out.println("C2: "+C2.toString());

        System.out.println("C3: "+C3.toString());

        System.out.println("C4: "+C4.toString());

        C1.soma(C2);
        System.out.println("Soma de C1 com C2: "+ C1.toString());

        C3.subtracao(C4);
        System.out.println("Subtração C3 com C4 "+C3.toString());

        C4.soma(C2);
        System.out.println("Soma C4 com C2 "+ C4.toString());

        C3.soma(C4);
        System.out.println("Soma C3 com C4 "+C3.toString());

        C3.subtracao(C3);
        System.out.println("Subtração C3 com C3 "+ C3.toString());

    }
}
