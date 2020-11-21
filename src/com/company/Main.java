package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List list = null;
        int action;

        mark: while (true) {
            System.out.println("Введите номер действия, которое необходимо выполнить");
            System.out.println("1 - Создать список");
            System.out.println("2 - Добавить в список, который создавался последний, новый элемент");
            System.out.println("3 - Извлечь из списка элемент с ключом k");
            System.out.println("4 - Завершить работу");
            System.out.println("");

            action = scanner.nextInt();
            System.out.println("");

            switch (action) {
                case 1:
                    list = new List();
                    System.out.println("Список создан");
                    System.out.println("");
                    Thread.sleep(1000);
                    break;

                case 2:
                    if (list == null) {
                        System.out.println("Сначала необходимо создать список");
                    } else {
                        System.out.print("Введите сначала ключ, а затем значение нового элемента: ");
                        if (list.add(scanner.next(), scanner.next())) {
                            System.out.println("Элемент добавлен");
                        } else {
                            System.out.println("Вводимый ключ уже существует");
                        }
                    }

                    Thread.sleep(1000);
                    System.out.println("");
                    break;

                case 3:
                    if (list == null) {
                        System.out.println("Сначала необходимо создать список");
                    } else {
                        System.out.print("Введите ключ: ");
                        Object value = list.get(scanner.next());

                        if (value == null) {
                            System.out.println("Такого элемента не существует");
                        } else {
                            System.out.println("Искомый элемент: " + value);
                        }
                    }

                    Thread.sleep(1000);
                    System.out.println("");
                    break;

                case 4:
                    break mark;

                default:
                    System.out.println("Вы ввели неправильный номер действия. Введите число от 1 до 4");
                    System.out.println("");
                    Thread.sleep(1000);
                    break;
            }
        }
    }
}