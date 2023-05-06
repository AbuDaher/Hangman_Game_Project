import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Afiseaza la consola  "Welcome to Hangman!" .
        // 2. Afiseaza "Cuvantul este : ****** ".
        // 3. Cere o litera de la user : afiseaza "Introdu o litera: ".
        // 4. Dupa introducere, salveaza intr-o variabila.
        // 5. Parcurgem cuvantul si comparam fiecare litera din cuvant cy litera salvata  daca exista in cuvant
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
    }
}