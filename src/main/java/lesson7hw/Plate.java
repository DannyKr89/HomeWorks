package lesson7hw;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "В миске " + food + " корма!";
    }


    public int getFood() {
        return food;
    }

    public void addFood(int addFood){
        System.out.println("Добавим " + addFood + " корма!");
        food += addFood;
        System.out.println("Теперь в миске " + food + " корма!");
    }

    public void decreaseFood(int catEatFood) {
            food -= catEatFood;
    }
}
