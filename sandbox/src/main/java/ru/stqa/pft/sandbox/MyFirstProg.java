package ru.stqa.pft.sandbox;

public class MyFirstProg {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexei");
    hello("Irina");

    Square s = new Square(5);
    System.out.println ("Площадь квадрата со стороной " + s.l + " = " + s.area() );

    Rectangle r = new Rectangle(4,6);
    System.out.println ("Площадь прямоугольника со стороной " + r.a + " и " + r.b + " = "+r.area());

    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,2);
    System.out.println ("Расстояние между точками "+distance(p1,p2));


  }

  public static void hello (String somebody) {
    System.out.println("Hello,"+somebody + "!");

  }
// Функция
  public static double distance (Point p1,Point p2){
    return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
  }

  }