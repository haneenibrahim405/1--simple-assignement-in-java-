package yatzagazig;

public class Tshirt {
    String color;
    String sizeTitle;
    String manufacturer;
    String model;
    public void saveTshirt(String color, String sizeTitle, String manufacturer, String model)
    {
        this.color = color;
        this.sizeTitle = sizeTitle;
        this.manufacturer = manufacturer;
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSizeTitle() {
        return sizeTitle;
    }
    public void setSizeTitle(String sizeTitle) {
        this.sizeTitle = sizeTitle;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void showTshirt()
    {
        String TshirtData ="Color :"+ this.color +"\n"+ "Size :"+this.sizeTitle+
                "\n"+"Manufacturer :"+this.manufacturer +"\n"+ "Model :"+this.model;
        System.out.println(TshirtData);
    }

}
