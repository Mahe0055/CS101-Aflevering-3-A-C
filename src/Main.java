import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getRandomNumber(); //Calling exercise A
        System.out.println(insertCPR()); //Calling exercise B

        //Creating 5 new Article objects. Exercise C
        Article article1 = new Article("Tre mænd reddet ud fra ruin otte dage efter jordskælv", "Ritzau");
        Article article2 = new Article("Kraftig stigning i Danmarks samlede økonomi", "Mikkel Walentin Mortensen");
        Article article3 = new Article("Der venter en slåskamp forude, siger politisk redaktør", "Ida Marie Lomholt Wismann");
        Article article4 = new Article("Inflationen falder for tredje måned i træk", "Mikkel Walentin Mortensen & Steffen Neupert");
        Article article5 = new Article("Danmark sender kampvogne til Ukraine", "Jakob Kjøgx Bohr");
        //creating an new ArrayList with articles. Exercise C
        ArrayList<Article> articleList = new ArrayList<>();
        articleList.add(article1);
        articleList.add(article2);
        articleList.add(article3);
        articleList.add(article4);
        articleList.add(article5);
        //Printing the array of articles. Exercise C
        System.out.println(articleList);
    }

    //Exercise A
    public static void getRandomNumber() {
        int maxNumber = 10;
        int minNumber = 1;
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * (maxNumber - minNumber));
            System.out.println("Random number between 1-10: " + randomNumber);
        }
    }


    //Exercise B
    public static boolean insertCPR() {
        Scanner scanCPR = new Scanner(System.in); //Opretter scanner object.
        String userCPR = scanCPR.nextLine();
        String firstTwoDigit = userCPR.substring(0, 2);
        int day = Integer.parseInt(firstTwoDigit);
        System.out.println(firstTwoDigit);
        String middleDigit = userCPR.substring(2, 4);
        int month = Integer.parseInt(middleDigit);
        System.out.println(middleDigit);
        if(userCPR.length() == 10 && day <= 31 && month <= 12) {
            System.out.println("The CPR is valid");
            return true;
        }
        else {
            System.out.println("The CPR is not valid");
            return false;
        }
    }
}