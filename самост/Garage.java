public class Garage {
    public int space;
    public T[] array;
    public int amount = 0;

    public Garage(int sp){
        space = sp;
    }

    public void addCar (? new){
        amount += 1;
        array.add(new);
    }

    public int getAmount(){
        return amount;
    }

    public int getSpace(){
        return space;
    }

    public int getFreeSpace(){
        return space - amount;
    }
}
