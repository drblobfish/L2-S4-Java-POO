

public class Compteur{
    private int value;

    public Compteur(){
        this.value = 0;
    }

    public void increment(){
        this.value++;
    }
    public void increment(int nb_increment){
        this.value+=nb_increment;
    }

    public void decrement(){
        this.value--;
    }

    public void raz(){
        this.value = 0;
    }
    public int getValue(){
        return this.value;
    }
    public void printValue(){
        System.out.println("value : "+this.value);
    }
}

class Test_Compteur{
    public static void main(String[] args){
        Compteur c = new Compteur();
        c.increment(3);
        c.printValue();
        c.decrement();
        c.printValue();
        c.raz();
        c.printValue();

    }
} 