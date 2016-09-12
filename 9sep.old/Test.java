class Test {
  public static void main(String[] args) {
    // create instances in the hierarchy of A, B, C, and D
    A plain = new A("Water",5.25);
    B sample0 = new B("Ice",100.0,2.5);    // Ice that is 2.5 units tall
    C sample1 = new C("Slurry",720.6,45);      // Slurry that is 45 wide
    C sample2 = new C("Old Slurry",50.15,30.9);  // Slurry that is 30 wide
    D sample3 = new D("Unknown",13.3,41.1,"blue");  
    // try some methods and responses
    System.out.println("sample0 is\n" + sample0);
    System.out.println("\nIs sample1 wider than sample2: " + sample1.isWider(sample2)); 
    System.out.println("\nIs sample0 taller than itself: " + sample0.isTaller(sample0)); 
    System.out.println("\nsample3 is\n" + sample3);
    sample3.changeColor("white");
    sample3.addWidth(1000.0);
    sample3.addWeight(100.0);
    System.out.println("\nsample3 now is\n" + sample3);
    }
  }   
