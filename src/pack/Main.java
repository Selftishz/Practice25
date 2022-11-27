package pack;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 2: проверка на соответствие abcdefghijklmnopqrstuv18340 \nВведите строку для сравнения. ");
        Pattern patt = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Scanner scan = new Scanner(System.in);
        Matcher matcher = patt.matcher(scan.nextLine());
        Boolean bool = matcher.matches();
        System.out.println(bool);

        System.out.println("Задача 5: идеальный ли пароль \nВведите ваш пароль для сравнения. ");
        Pattern patt2 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        Matcher matcher2 = patt2.matcher(scan.nextLine());
        Boolean bool2 = matcher2.matches();
        System.out.println(bool2);
    }
}