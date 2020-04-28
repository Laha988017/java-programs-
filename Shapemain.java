class Shape{
    public void print(){
      System.out.println("This is shape");
    }
  }
  
  // Rectangle class is subclass of Shape class
  class Rectangle extends Shape{
    public void print(){
      System.out.println("This is rectangular shape");
    }
  }
  
  // Circle class is subclass of Shape class
  class Circle extends Shape{
    public void print(){
      System.out.println("This is circular shape");
    }
  }
  
  // Square class is subclass of Rectangle class
  class Square extends Rectangle{
    public void print(){
      System.out.println("Square is a rectangle");
    }
  }
  
  // main class
  class Shapemain{
    public static void main(String[] args){
      Shape sq1 = new Square();  // creating object of Square class
      Shape sq2 = new Rectangle(); // creating object of Rectangle class
      Shape sq3 = new Circle(); // creating object of Circle class
      sq1.print();    // Object of Square class calling function of Square class
      sq2.print();    // Object of Square class calling function of Rectangle class
      sq3.print();    // Object of Square class calling function of Circle class
    }
  }
