// \17.OOPs\Getters_And_Setters.java

// Get: to return the value
// Set: to modify the value

public class Getters_And_Setters {
   public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.err.println(p1.getTip());
        //p1.setColor("Yellow");
        p1.setColor("Yellow");;
        System.out.println(p1.getColor());
        
    }
    
}

class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color; //In Java, the this keyword is a reference to the current object of the class.
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}