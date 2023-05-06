import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Afiseaza la consola  "Welcome to Hangman!" .
        // 2. Afiseaza "Cuvantul este : ****** ".
        // 3. Cere o litera de la user : afiseaza "Introdu o litera: ".
        // 4. Dupa introducere, salveaza intr-o variabila.
        // 5. Parcurgem cuvantul si comparam fiecare litera din cuvant cu litera salvata  daca exista in cuvant
        //6. Daca exista litera, inlocuim * de la pozitia literei din cuvant cu litera introdusa.

        String hidden_word = "avion";
        System.out.println("Welcome to Hangman!");

        System.out.print("Cuvantul este: ");
        char[] stars = new char[hidden_word.length()];
//        for (int i = 0; i <= stars.length -1; i++){
//            stars[i]='*';
//        }
        Arrays.fill(stars,'*');
        System.out.println(String.valueOf(stars));
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Introdu o litera: ");
        char letter = sc.next().charAt(0);
        for(int i = 0; i < hidden_word.length(); i++){
            if(hidden_word.charAt(i) == letter){
                stars[i] = letter;
            }

        }
            System.out.println(stars);
        if(hidden_word.equals(String.valueOf(stars))){
            System.out.println("Felicitari! Ai castigat!");
            break;
        }
        }
    }
}