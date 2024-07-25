import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("1. To find the area and circumference of the circle:");
            System.out.println("2. To find if the number is prime or not:");
            System.out.println("3. To Exit:");
            System.out.print("Enter your choice: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter the radius: ");
                    int radius = sc.nextInt();
                    Circle c = new Circle(radius);
                    c.display();
                    break;
                case 2:
                    System.out.print("Enter the number: ");
                    int num = sc.nextInt();
                    PrimeOrNot p = new PrimeOrNot(num);
                    p.display();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
            }
        } while (n != 3);
    }
}

class Circle{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public void display() {
        System.out.println("Area of the circle: " + Math.PI * radius * radius);
        System.out.println("Circumference of the circle: " +  2 * Math.PI * radius);
    }
}

class PrimeOrNot{
    private int num,i,m=0,flag=0;;

    public PrimeOrNot(int num) {
        this.num = num;
    }
    public void display() {
        m=num/2;
        for(i=2;i<=m;i++)
        {
            if(num%i==0)
            {
                System.out.println("Number is not prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Number is prime");
    }
}




