package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();

        // Created two objects from BlogArticle
        BlogArticle tenFunHatsYouMustWearBeforeYouDie = new BlogArticle();
        BlogArticle submarinesAreDangerous = new BlogArticle();

        // Set the author and title of one of the objects
        tenFunHatsYouMustWearBeforeYouDie.setAuthor(" - Kele Allison");
        tenFunHatsYouMustWearBeforeYouDie.setTitle("- Ten Fun Hats You Must Wear Before You Die /");

        // Set the author and the title of the other object
        submarinesAreDangerous.setAuthor(" - Also Kele Allison");
        submarinesAreDangerous.setTitle("- Submarines Are Dangerous /");

        // Called displayBlogArticle, passing it to the result of each object
        // getFormattedString, which returns a string of title and author
        displayBlogArticle(tenFunHatsYouMustWearBeforeYouDie.getFormattedString());
        displayBlogArticle(submarinesAreDangerous.getFormattedString());

    }

    public static void displayBlogArticle(String articleDetails) {
        System.out.println(articleDetails);
    }
}
