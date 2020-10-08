public abstract class Car {
    public String color;
    public int maxspeed;
    public String kpp_type;
    public int speed;
    public int price;

    public Car(String col, int maxsp, String kpp, int sp, int pr){
        color = col;
        maxspeed = maxsp;
        kpp_type = kpp;
        speed = sp;
        price = pr;
    }

    public void start(){
        if (speed == 0){
            speed = maxspeed/2;
            System.out.println("Машина стартовала. Текущая скорость: " + speed + " км/ч.");
        }
        else {
            System.out.println("Машина уже едет! Скорость: " + speed + " км/ч.");
        }
    }

    public void stop(){
        if (speed != 0){
            speed = 0;
            System.out.println("Машина остановилась. Текущая скорость: " + speed + " км/ч.");
        }
        else {
            System.out.println("Машина уже стоит!");
        }
    }

    public void accelerate(int sp){
        if (speed + sp <= maxspeed){
            speed += sp;
            System.out.println("Ускорение. Текущая скорость: " + speed + " км/ч.");
        }
        else{
            System.out.println("Ускорение невозможно. Будет привышена максимальная скорость машины в " + maxspeed);
        }
    }
}
