
//Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты.


import java.util.Arrays;
import java.util.List;
import java.util.Random;




public class Main {

    public static void main ( String[] args ){
        Random randomGenerator;
        Random randomGenerator2;

        List<String> strings = Arrays.asList ("Spades ", "Diamonds ", "Hearts ", "Clubs ");
        randomGenerator = new Random ( );
        String randomInt = strings.get (randomGenerator.nextInt (strings.size ( )));
        System.out.print (randomInt);

        List<String> strings2 = Arrays.asList ("2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ",
                                               "Jack ", "Queen ", "King ", "Ace ");
        randomGenerator2 = new Random ( );
        String randomInt2 = strings2.get (randomGenerator2.nextInt (strings2.size ( )));
        System.out.print (randomInt2);
    }
}


        /*public static void main(String[] args) {


            String[] suits = {
                    "Spades", "Diamonds", "Hearts", "Clubs"
            };

            String[] rank = {
                    "2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "Jack", "Queen", "King", "Ace"
            };

            int n = suits.length * rank.length;


            String[] deck = new String[n];
            for (int i = 0; i < rank.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    deck[suits.length*i + j] = rank[i] + " " + suits[j];
                }
            }


            for (int i = 0; i < n; i++) {
                int r = i + (int) (Math.random() * (n-i));
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;

            }


            for (int i = 0; i < 1; i++) {
                System.out.println(deck[i]);

            }
        }*/



