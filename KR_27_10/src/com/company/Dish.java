package com.company;

import static com.company.Menu.menu;
import static com.company.Menu.stoplist;

public class Dish {

    String name;
    int price; //цена за единицу
    String ed_i; //единица измерения
    int col_in_ed_i; //количество в единице измерения
    String consistency; //состав
    boolean status = false;

    public Dish (String name, int price, String ed_i, int col_in_ed_i, String consistency) {
        this.name = name;
        this.price = price;
        this.ed_i = ed_i;
        this.col_in_ed_i = col_in_ed_i;
        this.consistency = consistency;
    }

    public int getPrice(){ return price;}
    public String getName(){return name;}
    public String getCol(){return col_in_ed_i + ed_i;}
    public String getConsistency(){return consistency;}

    public void changeStatus(){ if (!status){status = true;} }

    public void getInfo(){ System.out.println("INFO:    Блюдо " + name + ". Размер порции: " + col_in_ed_i + ed_i + ". Состав:" + consistency);}

    public void addToMenu(){
        menu.add(this);
        System.out.println("Блюдо " + name + " добавлено в меню.");
    }

    public void addToStoplist(){
        menu.remove(this);
        stoplist.add(this);
        System.out.println("Блюдо " + name + " добавлено в стоплист.");

    }

    public void rmFromStoplist(){
        stoplist.remove(this);
        menu.add(this);
        System.out.println("Блюдо " + name + " удалено из стоплиста.");

    }


}
