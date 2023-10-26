import GUI.View;
import Logic.Operations;
import Model.Monom;
import Model.Polynomial;

public class Main {
    public static void main(String[] args) {
        View app = new View();
        app.setVisible(true);

        Monom m1 = new Monom(0, -2);
        Monom m2 = new Monom(1, 3);
        Monom m3 = new Monom(2, 1);

        Monom m4 = new Monom(1, 2);
        Monom m5 = new Monom(2, -3);
        Monom m6 = new Monom(3, 5);

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();

        p1.addMonom(m1);
        p1.addMonom(m2);
        p1.addMonom(m3);

        p2.addMonom(m4);
        p2.addMonom(m5);
        p2.addMonom(m6);


        System.out.println("p1-p2");
        System.out.println(p1);
        System.out.println(p2);
        Polynomial p3 = Operations.subtractPolynomial(p1, p2);
        System.out.println(p3);


        System.out.println("p1+p2");
        System.out.println(p1);
        System.out.println(p2);
        Polynomial p4 = Operations.addPolynomial(p1, p2);
        System.out.println(p4);


        System.out.println("p1*p2");
        System.out.println(p1);
        System.out.println(p2);
        Polynomial p5 = Operations.multiplyPolynomial(p1, p2);
        System.out.println(p5);

        System.out.println("p1'");
        System.out.println(p1);
        Polynomial p6 = Operations.differentiatePolynomial(p1);
        System.out.println(p6);

        System.out.println("!p1");
        System.out.println(p1);
        Polynomial p7 = Operations.integralPolynomial(p1);
        System.out.println(p7);

        System.out.println("p1'");
        System.out.println(p7);
        Polynomial p8 = Operations.differentiatePolynomial(p7);
        System.out.println(p8);


    }

}
