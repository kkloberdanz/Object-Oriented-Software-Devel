import java.util.*;

public class Words {
 
  String[] theWords;

  public Words(String text) {
    Scanner S = new Scanner(text);
    int numwords = 0;
    while (S.hasNext()) { // first count the words
      numwords++; S.next();
      }
    theWords = new String[numwords];
    S = new Scanner(text);
    for (int i=0; i<numwords; i++) {
      theWords[i] = S.next();
      }
    }
 
  public boolean containsWord( String c ) {
    for (int i=0; i<theWords.length; i++) {
      if (theWords[i].equals(c)) return true;
      }
    return false;
    }

  public void intersection( Words other ) {
    // print words common to this and other "theWords"
    for (int i=0; i<theWords.length; i++) {
      if (other.containsWord(theWords[i])) {
         System.out.println(theWords[i]);
         }
      }
    }
   
  public static void main(String [] args) {
    String textA = "the company is known for its overnight shipping service, but " +
                   "also for pioneering a system that could track packages and " +
                   "provide real-time updates on package location to help in finding lost packages";
    String textB = "is the world's largest package delivery company and a provide of the " +
                   "supply chain management solutions known for brown delivery trucks and uniforms";
    Words A = new Words(textA);
    Words B = new Words(textB);
    A.intersection(B);
    }
 }
