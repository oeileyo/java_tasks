package com.company;

import java.util.ArrayList;

public class Order {

    int table_number;
    ArrayList<Dish> order = new ArrayList<>();
    int summ = 0;

    public Order(int table_number){
        this.table_number = table_number;
    }

    public void addPosition(Dish d){
        if (Menu.menu.contains(d)){
            order.add(d);
            System.out.println("Блюдо " + d.getName() + " добавлено в заказ. Стол: " + table_number);
        } else if (Menu.stoplist.contains(d)){
            System.out.println("Блюдо " + d.getName() + " не может быть добавлено в заказ. Оно в стоп листе.");
        } else {
            System.out.println("Блюдо " + d.getName() + " не может быть добавлено в заказ. Такого блюда нет в меню.");
        }
    }

    public void completeOrder(Dish d){
        if (order.contains(d)){ d.changeStatus(); } }

    public void countSumm(){
        summ = 0;
        for (int i = 0; i < order.size(); i++) { summ += this.order.get(i).getPrice(); }
        System.out.println("Сумма заказа:" + summ);
    }

    public void getInfo(){
        String s;
        for (int i = 0; i < order.size(); i++) {
            if (this.order.get(i).status){s = "ВЫПОЛНЕНО";} else {s = "ОЖИДАЕТСЯ";}
            System.out.println((i+1) + ": " + this.order.get(i).getName() + " - " + s);
        }
    }
}
