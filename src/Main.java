import java.util.Scanner;
import java.lang.Math;

/**************************************************************
 * XP EXERCICE
 * @author Melissa Kouadio
 * @link https://github.com/DiamondArt/
 **************************************************************/
public class Main {
    public static void main(String[] args) {
        Scanner userOuput = new Scanner(System.in);
        System.out.println("Hello please enter three triangle angle separate by comma , EX: 2,8,9");
        String ouputs = userOuput.nextLine();
        Exo1.getTriangle(ouputs);


        //Scanner userHoraire = new Scanner(System.in);
        //System.out.println("Give the time difference between their home and where they are going");
        //int horaire = userHoraire.nextInt();
        //Exo2.TimeDifference(horaire);
        Scanner words = new Scanner(System.in);
        System.out.println("Hello, typing a world");
        String word = words.nextLine();
        System.out.println(Exo4.getScore(word.toUpperCase()));
    }
}


class Exo1 {
    /**
     * This method is used to ask a user to enter the three angles of a triangle
     * show the usage of various javadoc Tags.
     * @param userOuput
     */
    public static<userOuput> void getTriangle(String userOuput) {

         String[] arr =  userOuput.split(",",0);
         int sum = 0;

         for (int in = 0; in < arr.length; in++ ) {
             sum += Integer.parseInt(arr[in]);
             System.out.println("#"+(in+1)+" = "+arr[in]);
         }
         isTriangle(sum);

     }

    /**
     * This method is used to verify if value enter is equal of angle triangle sum
     * @param angleValue
     */
     public static <angleValue>void isTriangle(int angleValue){
         if(angleValue == 180)
         {
             System.out.println("nice this a triangle");
         } else {
             System.out.println("sorry it's not a triangle! trying again");
         }

     }

}
class Exo2 {
    public static<horaire> void TimeDifference(int horaire) {

        int _24h = horaire + 24;
        int _12h = horaire + 12;

        if(horaire > 0) {

        }
            //System.out.println("#"+(in+1)+" = "+arr[in]);
        }
}

/**
 * Java program that implements the design described by the UML Class diagram
 * (see course for more)
 */
class Circle {
     private  double radius = 1.0;
     private String color = "red";
     public Circle() {}

     public Circle(double _radius) {
         this.radius = _radius;
     }
      public Circle(double _radius, String _color) {
          this.radius = _radius;
          this.color = _color;
      }
      public double getRadius() {  // Getter for radius
          return radius;
      }

      public String getColor() {  // Getter for color
          return color;
      }
      public void setRadius(double newRadius) {  // Setter for radius
          this.radius = newRadius;
      }

      public void setColor(String newColor) {  // Setter for color
          this.color = newColor;
      }

    public String toString() { //method getString
         return "";
    }

    public double getArea() { //method getArea
         double area = Math.PI * this.radius * this.radius;
         return area;
    }

 }

/**
 * Write a Java program that implements the class Scrabble.
 */
 class Exo4{
     public  static String getScore(String word) {

         String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         int score = 0;
         for(int index = 0; index <word.length();index++) {
             score += alphabet.indexOf((word.charAt(index)));
         }
         String message ="you score is "+score;
         return  message;
     }

 }