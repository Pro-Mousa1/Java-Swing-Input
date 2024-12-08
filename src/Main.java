import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String one = JOptionPane.showInputDialog("Enter first integer");
        int a = Integer.parseInt(one);
        String two = JOptionPane.showInputDialog("Enter second integer");
        int b = Integer.parseInt(two);
        String three = JOptionPane.showInputDialog("Enter third integer");
        int c = Integer.parseInt(three);

        float average;
        int sum;

        average = (float)(a+b+c)/3;
        System.out.println("The average is"+average);
        sum=a+b+c;
        System.out.println("The sum is"+sum);

        var x = 0;
        do{
            if (x%3==0 && x%5==0) {
                System.out.println(x);
            }
            x++;
        }while (x<=100);

    }
}