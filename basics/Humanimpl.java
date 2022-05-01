package basics;

public class Humanimpl implements HumanInterfaceEx, InterfaceEx {
    
    
    public static void main(String[] args) {
       new Humanimpl().walk();
       new Humanimpl().singing();
       new Humanimpl().driving();
       new Humanimpl().hello();
       new Humanimpl().talk();
       new Humanimpl().dance();
    }

    @Override
    public void walk() {
        System.out.println("walking");
    }

    @Override
    public void singing() {
        System.out.println("singing a Song");
        
    }

    @Override
    public void driving() {
        System.out.println("Driving the car");
        
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void talk() {
        System.out.println("Taking with each other");
        
    }

    @Override
    public void dance() {
        System.out.println("Dancing very well");    
    }
}
