package mycar;

import java.io.Serializable;

public class MyCar implements Serializable {

    public String color;
    public String year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public MyCar(String color, String year) {
        this.color = color;
        this.year = year;
    }

   

}
