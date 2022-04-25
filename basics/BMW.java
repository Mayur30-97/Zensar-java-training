package basics;

public class BMW {
    
    
        String color;
        double price;
        String EngineType;

        public BMW(String color,double price, String EngineType)
        {
            this.color=color;
            this.price=price;
            this.EngineType=EngineType;
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

        public String getEngineType() {
            return EngineType;
        }

        public void setEngineType(String engineType) {
            EngineType = engineType;
        }

        @Override
        public String toString() {
            return "BMW [EngineType=" + EngineType + ", color=" + color + ", price=" + price + "]";
        }

        

}

class BMWmain
{
    public static void main(String[] args) {
        BMW w=new BMW ("black", 7000000, "electric");
        BMW w1=new BMW("Blue", 5000000, "petrol");

        
        System.out.println(w);
        System.out.println(w1);
    }

    
    
}
