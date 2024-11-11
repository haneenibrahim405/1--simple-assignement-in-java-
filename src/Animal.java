import java.sql.SQLOutput;

public class Animal {
    String title;
    String color;
    double weight;
    int legs;
    int earsnum;
    int eyesnum;
    String sound;

    public Animal() {
        this.title = "";
        this.color = "";
        this.weight = 0;
        this.legs = 0;
        this.earsnum = 0;
        this.eyesnum = 0;
        this.sound = "";
    }

    public Animal(String title, String color, double weight, int legs, int earsnum, int eyesnum) {
        this.title = title;
        this.color = color;
        this.weight = weight;
        this.legs = legs;
        this.earsnum = earsnum;
        this.eyesnum = eyesnum;
        this.sound = "";
    }

    public Animal(String title, String color, double weight) {
        this.title = title;
        this.color = color;
        this.weight = weight;
    }

    public Animal(String title, String color) {
        this.title = title;
        this.color = color;
    }

    public void setData(String title, String color, double weight, int legs, int earsnum, int eyesnum) {
        this.title = title;
        this.color = color;
        this.weight = weight;
        this.legs = legs;
        this.earsnum = earsnum;
        this.eyesnum = eyesnum;
        this.sound = "";
    }

    public void setData(String title, String color, double weight) {
        this.title = title;
        this.color = color;
        this.weight = weight;

    }

    public int getEyesnum() {
        return eyesnum;
    }

    public int getEarsnum() {
        return earsnum;
    }

    public int getLegs() {
        return legs;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getTitle() {
        return title;
    }

    public String getSound() {
        return sound;
    }

    public void print() {
    String message = "title :"+this.title +"\n"
            + "color :" + this.color +"\n"
            + "weight :" + this.weight + "\n"
            + "legs :" + this.legs + "\n"
            + "earsnum :" + this.earsnum + "\n"
            + "eyesnum :" + this.eyesnum + "\n"
            + "sound :" + this.sound;
        System.out.println(message);

    }
}
