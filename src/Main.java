import java.util.ArrayList;

class Person {
    private String navn;
    private String adresse;
    private String telefoner;

    Person(String navn, String adresse, String telefoner) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefoner = telefoner;
    }

    @Override
    public String toString() {
        return "navn: "+ navn + ", adresse: " + adresse + ", telefonnr: " + telefoner;
    }
}
class Student extends Person {
    private String studentnr;
    private String studienavn;
    Student(String navn, String adresse, String telefoner, String studentnr, String studienavn) {
        super(navn, adresse, telefoner);
        this.studentnr = studentnr;
        this.studienavn = studienavn;
    }
    @Override
    public String toString() {
        return super.toString() + " studentnr: " + studentnr + ", studienavn: " + studienavn;
    }
}
class Ansatt extends Person {
    private String inituttnavn;
    private String lonn;
    Ansatt (String navn, String adresse, String telefoner, String inituttnavn, String lonn) {
        super(navn, adresse, telefoner);
        this.inituttnavn = inituttnavn;
        this.lonn = lonn;
    }
    @Override
    public String toString() {
        return super.toString() + "institutt navn: " + inituttnavn + ", lonn: " + lonn;
    }
}

class Numbers {
    public void storst (int[] a) {
        int storst = 0;
        for (int element : a){
            if (element > storst){
                storst = element;
            }
        }
        System.out.println("Største nummeret i arrayen er: " + storst);
    }
    public void minst (int[] a) {
        int minst = a[0];
        for (int element : a){
            if (element < minst){
                minst = element;
            }
            System.out.println("current smallest number: " + minst);
        }
        System.out.println("Minste nummeret i arrayen er: " + minst);
    }

}
public class Main {
    public static void main(String[] args) {
        //oppgave 1
      /*  everyFifth();*/

        //oppgave 2
       /* int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        funnetTall(numbers, 61);*/

        //oppgave 3
       /* Numbers n = new Numbers();
        int[] arrayNumbers = {5,3,7,2,20,56,0};
        n.storst(arrayNumbers);
        n.minst(arrayNumbers);
*/

        //oppgave 4
        ArrayList<Person> persons = new ArrayList<>();
        Student per = new Student("Per Olsen", "budgata 3", "01231231265", "0013", "anvendt");
        persons.add(per);
        Ansatt lise = new Ansatt("Lise Holmstrand", "holtegata 5", "4500297852", "oslomet", "450k");
        persons.add(lise);
        for (Person person : persons){
            System.out.println(person);
        }

    }




    public static void funnetTall(int[] array, int n) {
        boolean isNumber = false;
        for (int element : array) {
            if (element == n) {
                isNumber = true;
            }
        }
        if (isNumber) {
            System.out.println("The number was found in the array");
        }
        else {
            System.out.println("The number was not found in the array");
        }
    }






    public static void everyFifth() {
        int sum = 0;
        for (int i = 4; i < 101; i++) {
            if (i%5 == 0) {
                System.out.println("number " + i);
                sum += i;
            }
        }
        System.out.println("sum of numbers is: " + sum);
    }
}