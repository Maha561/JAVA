
import java.awt.*;
class Simple extends Frame{
    // creating a button - create inside a constructor
    Simple(){
        Button btn1 = new Button("click me");
        Button btn2 = new Button("thank you ");
        add(btn1);
        add(btn2);
        // set layout - style
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
    }

    public static void main(String[] args) {
        new Simple();
    }

}

