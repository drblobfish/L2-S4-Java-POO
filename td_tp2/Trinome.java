import java.lang.Math;
import javax.swing.JOptionPane;

enum Roots_status{
    UNKNOWN,
    REAL,
    COMPLEX,
    SINGLE
}

public class Trinome {
    // Attributs
    private double a,b,c;
    private double delta;
    private double r1,r2;

    private Roots_status roots_status;

    //Constructor
    public Trinome(double c1,double c2,double c3){
        this.a = c1;
        this.b = c2;
        this.c = c3;
        this.roots_status = Roots_status.UNKNOWN;
    }

    //Method
    public void computeRoots(){
        delta = (this.b * this.b) - 4 * this.a * this.c;
        if (this.delta > 0){
            this.r1 = (-this.b - Math.sqrt(this.delta))/(2 * this.a);
            this.r2 = (-this.b + Math.sqrt(this.delta))/(2 * this.a);
            this.roots_status = Roots_status.REAL;
        } else if (this.delta < 0){
            this.roots_status = Roots_status.COMPLEX;
        } else {
            this.r1 = -this.b / (2 * this.a);
            this.roots_status = Roots_status.SINGLE;
        }
    }

    public String afficheRacines(){
        if (this.roots_status == Roots_status.COMPLEX){
            return "2 racines complexes";
        } else if (this.roots_status == Roots_status.REAL){
            return "x_1 = "+this.r1+"\nx_2 = "+this.r2;
        } else {
            return ("x = "+this.r1);
        }
    }
}

class Test_trinome{
    public static void main(String[] args){
        int a,b,c;
        // int a = Saisie.lireEntier("a = ");
        // int b = Saisie.lireEntier("b = ");
        // int c = Saisie.lireEntier("c = ");

        String s = null;
        while (s==null) {
            s = JOptionPane.showInputDialog("a");
        }
        b = Integer.parseInt(s);
        s = null;
        while (s==null) {
            s = JOptionPane.showInputDialog("b");
        }
        c = Integer.parseInt(s);
        s = null;
        while (s==null) {
            s = JOptionPane.showInputDialog("c");
        }
        a = Integer.parseInt(s);

        Trinome trin = new Trinome(a, b, c);
        trin.computeRoots();
        JOptionPane.showMessageDialog(null,trin.afficheRacines());
        
    }
}
