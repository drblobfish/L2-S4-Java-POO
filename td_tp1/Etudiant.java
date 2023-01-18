

public class Etudiant{
    private final int NB_GRADES = 5;
    private String nom;
    private float[] notes;
    private float moyenne;
    private boolean estAdmis;

    public Etudiant(
        String nom,
        float grade1,
        float grade2,
        float grade3,
        float grade4,
        float grade5){
        this.nom = nom;
        this.notes = new float[NB_GRADES];
        this.notes[0] = grade1;
        this.notes[1] = grade2;
        this.notes[2] = grade3;
        this.notes[3] = grade4;
        this.notes[4] = grade5;
        this.calculMoyenne();
    }

    public void calculMoyenne(){
        float sum=0;
        for(int i=0;i<NB_GRADES;i++){
            sum += this.notes[i];
        }
        this.moyenne = sum/5;

        if (this.moyenne>=10){
            this.estAdmis = true;
        }
        else {
            this.estAdmis = false;
        }
    }

    public String notesToString(){
        String result = "[";
        for (int i = 0;i<NB_GRADES-1;i++){
            result  += this.notes[i] +",";
        }
        result  += this.notes[NB_GRADES-1] +"]";

        return result;
    }

    public void afficher(){
        System.out.println("Nom : "+this.nom);
        System.out.println("Notes : "+this.notesToString());
        System.out.println("Moyenne : "+this.moyenne);
        System.out.println(this.estAdmis ? "Admis" : "Non admis");
    }
}

class Test_Etudiant{
    public static void main(String[] args){
        Etudiant e = new Etudiant("Michel",10f,12f,15.5f,14f,17.5f);

        e.afficher();
    }
}