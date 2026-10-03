package day_4;

public class FinalDemo {
    
    int x = 100;
    
    void show() {
        System.out.println("The value of x: " + x);
    }

    public static void main(String[] args) {
        
        FinalDemo fd = new FinalDemo();
        fd.x = 200; // Allowed: x is non-final
        fd.show();
        
        Demo d = new Demo();
        d.show(); // Calls overridden method in Demo
    }
}

class Demo extends FinalDemo {
    
    @Override
    void show() {
        System.out.println("Printing the show method");
    }
}