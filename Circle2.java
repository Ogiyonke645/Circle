package circle2;
import za.ac.wsu;

public class Circle2 {

    public static void main(String[] args) {
        
         calculateArea area = new calculateArea;
        /* area.setcalculateArea();
        area.getcalculateArea();*/
        
        calculateDiameter diameter = new calculateDiameter;
               /* diameter.setcalculateDiameter();
                diameter.getcalculateDiameter();*/
                
        calculateCircumference circumference = new calculateCircumference;
              /* circumference.setCalculateCircumference();
               circumference.getCalculateCircuference();*/
               
               System.out.print("Enter radius: ");
double radius = Double.parseDouble(sc.nextLine());

// create the Circle object
Circle circle = new Circle(radius);

// format and display output
String message =
"Area: " + circle.getArea() + "\n" +
"Circumference: " + circle.getCircumference() + "\n" +
"Diameter: " + circle.getDiameter() + "\n";
System.out.println(message);

// see if the user wants to continue5
System.out.print("Continue? (y/n): ");
choice = sc.nextLine();
System.out.println();
}
         
    }
    

