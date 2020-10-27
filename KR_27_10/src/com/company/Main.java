package com.company;

//Реализовать операционную систему кафе.
//Система должна позволять создать меню/изменять меню/добавлять блюда в стоп лист (блюда которые присутствуют в меню,
//но отсутствуют сегодня по какой-то причине)/отмечать какие блюда поданы/отображать информацию о заказе по столику/
// закрывать заказ
//Система оформляет заказ по столам, выбивает итоговую сумму заказа
//Система позволяет вбивать блюда как по кухне, так и по бару
//У каждого проданного товара есть характеристики: цена за штуку товара, единица измерения, количество в единице
// измерения, состав

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Dish d1 = new Dish("soup", 250, "gr", 400, "water, mushroom");
        Dish d2 = new Dish("tea", 50, "ml", 500, "water, tea");
        Dish d3 = new Dish("coffee", 150, "ml", 200, "water, coffee");
        Dish d4 = new Dish("c", 1, "ml", 1, "water");


        d1.addToMenu();
        d2.addToMenu();
        d3.addToMenu();

        d2.addToStoplist();

        System.out.println();

        d2.getInfo();

        System.out.println();

        Order o1 = new Order(1);
        o1.addPosition(d1);
        o1.addPosition(d2);
        o1.addPosition(d3);
        o1.addPosition(d4);

        System.out.println();

        o1.countSumm();

        System.out.println();

        d2.rmFromStoplist();
        o1.addPosition(d2);
        o1.countSumm();

        System.out.println();

        o1.getInfo();
        System.out.println();
        o1.completeOrder(d2);
        o1.getInfo();

    }
}
