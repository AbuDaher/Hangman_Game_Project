import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Afiseaza la consola  "Welcome to Hangman!" .
        // 2. Afiseaza "Cuvantul este : ****** ".
        // 3. Cere o litera de la user : afiseaza "Introdu o litera: ".
        // 4. Dupa introducere, salveaza intr-o variabila.
        // 5. Parcurgem cuvantul si comparam fiecare litera din cuvant cu litera salvata  daca exista in cuvant
        // 6. Daca exista litera, inlocuim * de la pozitia literei din cuvant cu litera introdusa.
        // 7.
        // 8.
        // 9.
//        String hiddenWord = "avion";
        int attempts = 7;
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> pictures = new ArrayList<>(List.of(
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "       |\n",
                        "       |\n",
                        "       |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        "       |\n",
                        "       |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        "  |    |\n",
                        "       |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        " /|    |\n",
                        "       |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        " /|\\   |\n",
                        "       |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        " /|\\   |\n",
                        " /     |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        " /|\\   |\n",
                        " / \\   |\n",
                        "       |\n",
                        "=========\n"
                }));
        ArrayList<Character> usedLetters = new ArrayList<>();
        Random rnd = new Random();
        ArrayList<String> words = new ArrayList<>(Arrays.asList("perfume", "transport", "manager", "woman", "proportion", "prestige", "vegetable", "environment", "obligation", "example", "liability"));
        int index = rnd.nextInt(words.size());
        System.out.println("Welcome to Hangman!");
        System.out.print("Cuvantul este: ");
        String hiddenWord = words.get(index);
        char[] stars = new char[hiddenWord.length()];
//        for (int i = 0; i <= stars.length -1; i++){
//            stars[i]='*';
//        }a
        Arrays.fill(stars, '*');
        System.out.println(String.valueOf(stars));

        while (true) {
            boolean isLetterFound = false;
            System.out.println("Introdu o litera: ");
            char letter = sc.next().charAt(0);

            if (!usedLetters.contains(letter)) {
                usedLetters.add(letter);
            } else {
                System.out.println("The letter was already used: " + usedLetters);
            }

            for (int i = 0; i < hiddenWord.length(); i++) {
                if (hiddenWord.charAt(i) == letter) {
                    isLetterFound = true;
                    stars[i] = letter;
                }
            }

            if (!isLetterFound) {
                attempts--;
                System.out.println("You have " + attempts + " attempts left.");
                for(String line:pictures.get(0)){
                    System.out.println(line);
                }
                pictures.remove(0);
            }
            if (attempts == 0 || pictures.isEmpty()) {
                System.out.println("Game over ! Try again !");
                break;
            }

            System.out.println(stars);

            if (hiddenWord.equals(String.valueOf(stars))) {
                System.out.println("Felicitari! Ai castigat!");
                break;
            }
        }
    }
}