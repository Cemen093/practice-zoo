package org.itstep;

import org.itstep.Zoo.Animal.Animal;
import org.itstep.Zoo.Animal.Cat.Lion.Lion;
import org.itstep.Zoo.Animal.Cat.Panther.Panther;
import org.itstep.Zoo.Animal.Dog.Dingo.Dingo;
import org.itstep.Zoo.Animal.Dog.Wolf.Wolf;
import org.itstep.Zoo.Animal.Snake.Boa.Boa;
import org.itstep.Zoo.Animal.Snake.Python.Python;
import org.itstep.Zoo.Zoo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = getWorkZoo();

        int key;
        do {
        System.out.print("Введити действие которое вы зотите совершить:\n" +
                "1. Вывести состояние зоопарка на экран\n" +
                "2. Вывести запасы корма на экран\n" +
                "3. Дабавить новое животное в зоопарк\n" +
                "4. Убрать животное из зоопарка\n" +
                "5. Добавить корм для животных\n" +
                "6. Перейти в другому дню\n" +
                "7. Выйти из приложения\n" +
                "  >> ");
        key = scanner.nextInt();

        switch (key){
            case 1:
                zoo.show();
                break;
            case 2:
                zoo.feedShow();
                break;
            case 3:
                zoo.addAnimal(addAnimal());
                break;
            case 4:
                zoo.delAnimal(delAnimal(zoo.size()));
                break;
            case 5:
                addFeed(zoo);
                break;
            case 6:
                zoo.nextDay();
                break;
            default:
                break;
        }
        }while (key != 7);

    }


    private static Zoo getWorkZoo(){
        //"Lion, Panther, Dingo, Wolf, Boa, Python\n"
        Zoo zoo = new Zoo();


        zoo.addAnimal(new Lion("Мяу", 7, 82));
        zoo.addTime(0, new Time(3,2,5,2,52,1));
        zoo.addFeed("вискас", 52);
        zoo.addAnimal(new Panther("Хрясь", 9, 120));
        zoo.addTime(1, new Time(5,7,25,21,4,59));
        zoo.addFeed("буйволятина", 2);
        zoo.addAnimal(new Dingo("Гав", 4, 27));
        zoo.addTime(2, new Time(0,1,15,12,20,11));
        zoo.addFeed("кролики", 5);
        zoo.addAnimal(new Wolf("Рыыр", 1, 21));
        zoo.addTime(3, new Time(0,2,5,1,42,31));
        zoo.addFeed("оленина", 24);
        zoo.addAnimal(new Boa("Ссссс", 6, 30));
        zoo.addTime(4, new Time(0,50,0,200,20,200));
        zoo.addFeed("лягушки", 31);
        zoo.addAnimal(new Python("Пит", 5, 28));
        zoo.addTime(5, new Time(0,100,15,300,20,700));
        zoo.addFeed("крысы", 12);
        return zoo;
    }

    private static Animal addAnimal(){
        Scanner scanner = new Scanner(System.in);
        String typeAnimal;
        do{
            System.out.println("Введите тип животного\n" +
                    "Lion, Panther, Dingo, Wolf, Boa, Python\n" +
                    " >>  ");
            typeAnimal = scanner.nextLine();
        }while (!(typeAnimal.equals("Lion") || typeAnimal.equals("Panther") || typeAnimal.equals("Dingo") ||
                typeAnimal.equals("Wolf") || typeAnimal.equals("Boa") || typeAnimal.equals("Python")));
        System.out.println("Введите кличку\n" +
                " >>  ");
        String nickname = scanner.nextLine();
        System.out.println("Введите возраст\n" +
                " >>  ");
        int age = scanner.nextInt();
        System.out.println("Введите вес\n" +
                " >>  ");
        int weight = scanner.nextInt();
        //Ех, надо узнать как по нормальному сделать
        switch (typeAnimal){
            case "Lion":
                return new Lion(nickname, age, weight);
            case "Panther":
                return new Panther(nickname, age, weight);
            case "Dingo":
                return new Dingo(nickname, age, weight);
            case "Wolf":
                return new Wolf(nickname, age, weight);
            case "Boa":
                return new Boa(nickname, age, weight);
            case "Python":
                return new Python(nickname, age, weight);
            default:
                return null;
        }
    }

    private static int delAnimal(int len){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите № вольера из которого вы хотите удалить животное\n" +
                    " >>  ");
            number = scanner.nextInt();
        }while (number > len || number < 1);
        return number - 1;
    }

    private static void addFeed(Zoo zoo){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название еды которую вы хотите добавить\n" +
                " >>  ");
        String tmp = scanner.nextLine();

        System.out.print("Введите количество еды которое вы хотите добавить\n" +
                " >>  ");
        int tmp2 = scanner.nextInt();
        zoo.addFeed(tmp, tmp2);
    }
}
