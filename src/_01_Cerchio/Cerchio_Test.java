package _01_Cerchio;

public class Cerchio_Test {

    public static void main(String[] args) {
        Cerchio c1, c2, c0;
        int r1 = 2;
        int r2 = 5;
        double circonf1;
        double circonf2;

        c1 = new Cerchio(r1);       //crea l'oggetto c1 di raggio r1 cioè 2
        c2 = new Cerchio(r2);
        c0 = new Cerchio();

        circonf1 = c1.circonferenza();
        circonf2 = c2.circonferenza();

        System.out.println("La circonferenza di c1 equivale a: "+circonf1);
        System.out.println("La circonferenza di c2 equivale a: "+circonf2);
        System.out.println("La circonferenza di c0 equivale a: "+c0.circonferenza());

        System.out.println("L'area di c1 equivale a: "+c1.area());
        System.out.println("L'area di c2 equivale a: "+c2.area());
        System.out.println("L'area di c0 equivale a: "+c0.area());

        System.out.println("Il diametro di c1 equivale a: "+c1.diametro());
        System.out.println("Il diametro di c2 equivale a: "+c2.diametro());
        System.out.println("Il diametro di c0 equivale a: "+c0.diametro());
    }

}
