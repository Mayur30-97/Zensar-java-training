package basics;

public class Interfaceimpl implements InterfaceEx {
    @Override
    public void hello(){
        System.out.println("Hello");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }

    @Override
    public void dance() {
        System.out.println("Dancing");
    }

    public static void main(String[] args) {
        new Interfaceimpl().hello();
        new Interfaceimpl().talk();
        new Interfaceimpl().dance();
    }
}
