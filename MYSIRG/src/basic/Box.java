package basic;

class Box1 {
    private int l, b, h;

    // Corrected method definition
    public void setDimension(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    // Getter methods for l, b, and h
    public int getLength() {
        return l;
    }

    public int getBreadth() {
        return b;
    }

    public int getHeight() {
        return h;
    }

    public void sendBox() {
        GiftTaker gf = new GiftTaker();
        gf.acceptGift(this); // Passing the current object (Box1) to acceptGift method
    }
}

class GiftTaker {
    public void acceptGift(Box1 box) {
        // Using getter methods to access private fields
        System.out.println("Gift received with dimensions: Length = " + box.getLength() + 
                           ", Breadth = " + box.getBreadth() + 
                           ", Height = " + box.getHeight());
    }
}

public class Box {
    public static void main(String[] args) { // static member function
        Box1 b1 = new Box1(); // Correctly creating an instance of Box1
        b1.setDimension(12, 10, 5); // Setting dimensions
        b1.sendBox(); // Sending the box
    }
}
