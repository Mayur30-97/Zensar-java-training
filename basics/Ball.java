package basics;

public class Ball {
    String material;
    String color;
    double price;

    public Ball(String material, String color,double price)
    {
        this.material=material;
        this.color=color;
        this.price=price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball [color=" + color + ", material=" + material + ", price=" + price + "]";
    }

    
}

class Ballmain{
    public static void main(String[] args) {
        Ball b=new Ball("leather", "red",100);
        Ball b1=new Ball("jumper", "yellow", 20);

        System.out.println(b);

        System.out.println(b1);
    }
}
