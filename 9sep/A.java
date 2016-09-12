public class A {
  String title;
  double  weight;  
  public A(String description, double weight) {
    title = description;
    this.weight = weight;
    }
  public String toString() {
    String R = String.format("Title: %s\nWeight: %f\n",title,weight);
    return R;
    }
  public void addWeight(double amount) {
    weight += amount;
    }      
  }

class B extends A {
    double height;

    B(String description, double weight, double height) {
        super(description, weight); 
        this.height = height;
    }

    boolean isTaller(B other) {
        return (this.height > other.height); 
    }

    void addHeight(double ammount) {
        this.height += ammount;
    }

    public String toString() {
        String R = String.format("Title: %s\nWeight: %f\nHeight: %f\n",title,weight, height);
        return R;
    }

}

class C extends A {
    double width;

    C(String description, double weight, double width) {
        super(description, weight);
        this.width = width;
    }

    boolean isWider(C other) { 
        return (this.width > other.width);
    }

    void addWidth(double width) {
        this.width += width;
    }

    public String toString() {
        String R = String.format("Title: %s\nWeight: %f\nWidth: %f\n",title,weight, width);
        return R;
    } 
}

class D extends C {
    String color;

    D(String description, double weight, double width, String color) {
        super(description, weight, width);
        this.color = color;
    }

    void changeColor(String color) {
        this.color = color;
    }

    public String toString() {
        String R = String.format("Title: %s\nWeight: %f\nWidth: %f\nColor: %s\n",title,weight, width, color);
        return R;
    }

}
