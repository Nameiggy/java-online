package ru.itsjava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListsss {
    public static void main(String[] args) {




            Book java = new Book("Javas", "Bruce Eckel",1200);
            Book threeComrades = new Book("Three Comrades", "Erih Maria",800);
            Book overTheCatcher = new Book("Over the Catcher in the rye", "Jerome D.",970);
            Book nineteenMinutes = new Book("Nineteen minutes", "Jodie Picault",1400);
            Book aClockworkOrange = new Book("A clockwork orange", "Anthony Burgess",1000);
            Book whiteBeamBlackEar = new Book("White Beam Black Ear", "Gabriel of Troepolsky",400);
            Book helloNobody = new Book("Hello, Nobody", "Burleigh Dougherty",1600);
            Book blueGrass = new Book("Blue Grass", "Anonymous",358);
            Book java4 = new Book("Java", "Bruce Eckel", 1200);
            Book goodToBeQuiet = new Book("It's good to be quiet", "Stephen Chbosky",120);
            Book theStarsAreToBlame = new Book("The stars are to blame", "John Green",2000);
            Book lolita= new Book("Lolita", "Vladimir Nabokov",1900);
            Book java1 = new Book("Java","Bruce Eckel", 1200);
            Book truthOrConsequences = new Book("Truth or consequences", "Annika Thor",1100);
            Book giftsOfTheMagi= new Book("Gifts of the Magi", "O. Henry",700);
            Book goneWithTheWind = new Book("Gone with the Wind", "Margaret Mitchell",900);
            Book janeEyre = new Book("Jane Eyre", "Charlotte Bronte",1300);
            Book walking = new Book("Walking", "Panas Mirny",1540);
            Book java2 = new Book("Java","Bruce Eckel",1200);
            Book theCountOfMonteCristo = new Book("The Count of Monte Cristo", "Alexandre Dumas",1342);
            Book theOutcasts= new Book("The Outcasts", "Victor Hugo",1120);
            Book java3 = new Book("Java", "Bruce Eckel",1200);
            Book janeEyre2 = new Book("Jane Eyre", "Charlotte Bronte",1260);
            Book anOrdinaryStory = new Book("An ordinary story", "Ivan Goncharov",1321);
            Book metro2033 = new Book("Metro 2033", "Glukhovsky Dmitry",1267);

        
        List <Book> booksList = new ArrayList <>(Arrays.asList(java,threeComrades,overTheCatcher,nineteenMinutes,aClockworkOrange,whiteBeamBlackEar,helloNobody,blueGrass,java4,goodToBeQuiet,theStarsAreToBlame,lolita,java1,truthOrConsequences,giftsOfTheMagi,goneWithTheWind,janeEyre,walking,java2,theCountOfMonteCristo,theOutcasts,java3,janeEyre2,anOrdinaryStory,metro2033 ));

        System.out.println("1. Добавить подряд 5 элементов"+'\n');
        booksList.add(java);
        booksList.add(threeComrades);
        booksList.add(overTheCatcher);
        booksList.add(nineteenMinutes);
        booksList.add(aClockworkOrange);
        for (Book elemBook: booksList) {
            System.out.println(elemBook);
        }

        System.out.println();
        System.out.print("1 Добавить шестой элемент в третью позицию"+ '\n');
        System.out.println("b)"+'\n');
        booksList.add(2,whiteBeamBlackEar);
        for (Book elemBook: booksList){
            System.out.println(elemBook);
        }
        System.out.println();
        System.out.println("Седьмой элемент в первую позицию"+'\n');
        booksList.add(0,helloNobody);
        for (Book elemBook: booksList) {
            System.out.println(elemBook);
        }
        System.out.println();
        System.out.println("в) Записать в новый список все элементы предыдущего списка.");
        List<Book> booksOmegaLIst = new ArrayList<>();
        booksOmegaLIst.addAll(booksList);
        System.out.println(booksOmegaLIst);


        System.out.println();
        System.out.println("2.Получить первый элемент (первую книгу в списке)");
        System.out.println("a) booksList.get(0) = " + booksList.get(0));


        System.out.println();
        System.out.println("Получить последний элемент (последнюю книгу в списке)");

        System.out.println("b) booksList.get(24) = " + booksList.get(booksList.size()-1));


        System.out.println();
        System.out.println("3. Задачи на удаление элементов: (Используя методы)");
        System.out.println("a) Удалить элемент по значению (книге)");
        System.out.println("booksList.remove(overTheCatcher) = " + booksList.remove(overTheCatcher));
        System.out.println("b) Удалить элемент по индексу ");
        System.out.println("booksList.remove(2) = " + booksList.remove(2));

        System.out.println();
        System.out.println("4. Проверить наличие элемента");
        System.out.println("booksList.contains(overTheCatcher) = " + booksList.contains(overTheCatcher));

        System.out.println();
        System.out.println("5. Вывод списка:");
        System.out.println("List:");
        for (Book elemBook:booksList){
            System.out.print(elemBook + " " +'\n');
        }

        System.out.println();
        System.out.println("Теперь надо хаотично в список добавить 4 книги с названием Java");
        System.out.println("booksList.add(java1) = " + booksList.add(java1));
        System.out.println("booksList.add(java2) = " + booksList.add(java2));
        System.out.println("booksList.add(java3) = " + booksList.add(java3));
        System.out.println("booksList.add(java4) = " + booksList.add(java4));


        System.out.println();
        System.out.println("Условие на индекс: Индекс делится на 3");
        for (int i = 0; i < booksList.size(); i++) {
             if (i % 3 == 0 ){
                 System.out.print(i + ",");

            }
        }

        System.out.println();
        System.out.println(" Вернуть количество книг, которые равны Java ");

        for (Book elemBook : booksList){
            if (elemBook.getName().equals("Java")){
                System.out.println(elemBook);

            }
        }
        System.out.println();
        System.out.println("7. Пропустить несколько первых элементов");
        List <Book> booksAfterSkip = booksList.subList(3 , booksList.size());
        System.out.println(booksAfterSkip);


        System.out.println();
        System.out.println("а) Пропустить первые 2 книги, которые равные Java ");
        int count = 0;
        for (int i = 2; i <booksList.size() ; i++) {
            if (booksList.get(i).getName().equals("Java") && count <2){
                count++;
                System.out.println(booksList.get(i));
            }



        }
        System.out.println();
        System.out.println("8 Возвращаем первую книгу, длина автора которого делится на 3.");
        Book firstBookWithAuthorLengthDivisibleBy3 = null;
        for (Book elemBook : booksList) {
            if (elemBook.getAuthor().length()%3 ==0){
                firstBookWithAuthorLengthDivisibleBy3 = elemBook;
                System.out.println(firstBookWithAuthorLengthDivisibleBy3);
                break;

            }
        }
        System.out.println();
        System.out.println("9 Возвращаем все элементы удовлетворяющие условию:");
        List<Book> booksWithAuthorLengthDivisibleBye3 = new ArrayList<>();
        for (Book elemBook : booksList){
            if (elemBook.getAuthor().length() % 3 == 0){
                System.out.println(  booksWithAuthorLengthDivisibleBye3.add(elemBook));
            }
        }


        System.out.println();
        System.out.println("10. Создать класс Person.( Поля: имя, возраст и пол isMale )" +
                "Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'");
        Person nikita = new Person("Никита",20,"Man");
        Person niksan = new Person("Никсан",22,"Man");
        Person maksim = new Person("Максим",34,"Man");
        Person samat = new Person("Самат",16,"Man");
        Person egor = new Person("Егор",28,"Man");
        Person nikolay  = new Person("Николай",25,"Man");
        Person nariman = new Person("Нариман",23,"Man");
        Person nazar = new Person("Назар",18,"Man");
        Person vetalik = new Person("Веталик",17,"Man");
        Person keril = new Person("Керил",23,"Man");
        Person boris = new Person("Борис",22,"Man");
        Person vlad = new Person("Влад",20,"Man");
        Person vlodimer = new Person("Влодимер",29,"Man");
        Person sergei = new Person("Сергей",36,"Man");
        Person andrei = new Person("Андрей",35,"Man");
        Person leonid = new Person("Леонид",34,"Man");
        Person pavel = new Person("Павел",18,"Man");
        Person ivan = new Person("Иван",18,"Man");
        Person aleksandr = new Person("Александр",19,"Man");
        Person nikolas = new Person("Николас",17,"Man");
        Person david = new Person("Давид",19,"Man");
        Person roma = new Person("Рома",20,"Man");
        Person evgeniy = new Person("Евгений",23,"Man");
        Person semen = new Person("Семен",25,"Man");
        Person slavik = new Person("Славик",23,"Man");
        List<Person> militaryList = new ArrayList<>(Arrays.asList(nikita,niksan,maksim,samat,egor,nikolay,nariman,nazar,vetalik,keril,boris,vlad,vlodimer,sergei,andrei,leonid,pavel,ivan,aleksandr,nikolas,david,roma,evgeniy,semen,slavik));

        System.out.println();
        for (Person person : militaryList){
            if (person.getAge()< 27&& person.getAge()>18 && person.getName().startsWith("Н")){
                System.out.println(person);
            }
        }
        System.out.println();
        System.out.println("Найти средний возраст всех женщин");

        Person2 nasty = new  Person2("Nasty", 24,"Woman" );
        Person2 katy = new  Person2("Katy", 19,"Woman" );
        Person2 vika = new  Person2("Viktoria", 43,"Woman" );
        Person2 lena = new  Person2("Lena", 14,"Woman" );
        Person2 alena = new  Person2("Alena", 35,"Woman" );
        List<Person2> averageAge = new ArrayList<>(Arrays.asList(nasty,katy,vika,lena,alena));



        int adobeAge = 0;
        int allWoman = averageAge.size();
        for (Person2 p: averageAge){
            adobeAge+=p.getAge();
        }
        double avereAge = (double) adobeAge/allWoman;
        System.out.println(avereAge);





    }

}
