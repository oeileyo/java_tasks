public class Mercedes extends Car{
    public int year;
    public boolean l = false;

    public Mercedes(int y, String col, int maxsp, String kpp, int sp, int pr){
        year = y;
        color = col;
        maxspeed = maxsp;
        kpp_type = kpp;
        speed = sp;
        price = pr;
    }

    public int getYear(){
        return year;
    }

    public void light(){
        if (l){
            System.out.println("Вы выключили фары");
        }
        else{
            System.out.println("Вы включили фары");
        }
    }

}
