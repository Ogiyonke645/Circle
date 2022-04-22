package za.ac.wsu;

public class Circle{
        float radius;
        int x;
        int y;
        float calculateArea;
        float calculateCircumference;
        float calculateDiameter;
    public static void main(String[] args) {
        /*float radius;
        int x;
        int y;
        float calculateArea;
        float calculateCircumference;
        float calculateDiameter;*/
    }    
    public void setRadius(float r){
    
        radius = r;
      
    }
    public void setX(){
    
    }
    public void setY(){
    }
      public void setCalculateArea(float area){

        calculateArea = area;
}

      public void setCalculateCircumference(float circumference){

        calculateCircumference = circumference;
}

      public void  setCalculateDiameter(float diameter){

        calculateDiameter = diameter;
}
      public float getRadius(){
      return radius;
      }
      public int getX(){ 
      return x;
      }
      public int getY(){
      return y;
      }

public float getAreaOfTheCircle(){
return  radius * radius;
}
public float getCircumference(){
return radius * 2;
}
public float getDiameter(){
return radius * 2;
}   

        }
