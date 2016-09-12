import java.util.*;

public class Words {
 
  Map <String, Integer> theWords;

    public Words(String text) {
        Scanner S = new Scanner(text);
        int numwords = 0;
        while (S.hasNext()) { // first count the words
            numwords++; S.next();
        }
        theWords = new HashMap<String, Integer>();
        S = new Scanner(text);
        for (int i=0; i<numwords; i++) {
            theWords.put(S.next(), 1);
        }
    }
 
  public boolean containsWord( String c ) {
      if (theWords.get(c) != null) return true;
      return false;
  }

  public void intersection( Words other ) {
      List<String> list = new ArrayList<String>();
      for (String key : theWords.keySet()) {
          if (other.containsWord(key)) {
              list.add(key);
          }
      }

      Collections.sort(list);
      for (String item : list) {
          System.out.println(item);
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
