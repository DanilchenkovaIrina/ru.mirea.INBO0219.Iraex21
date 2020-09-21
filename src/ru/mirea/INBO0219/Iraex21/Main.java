package ru.mirea.INBO0219.Iraex21;

public class Main {

        public static void main(String[] args) {
            Author author1 = new Author("Alex", "alexgamechanel2001@gmail.com", 'm');
            Author author2 = new Author("Ann", "ann@mail.ru", 'f');
            Author author3 = new Author("Mike", "mike228@ya.ru",'m');
            System.out.println(author3);
            author1.out();
            author2.out();
            author3.out();
            System.out.println();
        }
    }
