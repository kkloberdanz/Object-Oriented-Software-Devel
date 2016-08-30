public class Test {
  public static void main(String[] args) {
    /*
       test case for sum and alternating difference methods of an
       Exercise object (defined in Exercise.java, but no need to 
       import here, so long as both Test and Exercise are in the 
       same directory

       the sum() method doesn't need explanation; 
       the altdiff() method is like sum, but substitutes minus in an alternating
                     way, such as  a - b + c - d + e - f + g - h ... (etc)
    */ 
    Double[] input0 = new Double[] { 5.0, -3.0, 1.0 };
    Double[] input1 = new Double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
    Double[] input2 = new Double[] { 185.896762646, 159.971620716, 843.765307564,
                                     481.329020287, 964.693213702, 340.101780075,
                                     157.433946466, 632.587843541, 606.76431578, 
                                     988.439144038 };
    Exercise One = new Exercise(input0);
    Exercise Two = new Exercise(input1);
    Exercise Three = new Exercise(input2);
    assert One.sum() == 3.0;          // 5 - 3 + 1 is 3
    assert Two.sum() == 21.0;         // 1+2+3+4+5+6 = 6*7/2 = 21
    assert Three.sum() == 5360.982954815001;
    // these are the more difficult ones
    assert One.altdiff() == 9.0;      // 5 - (-3) + 1 is 9
    assert Two.altdiff() == -3.0;     // 1-2+3-4+5-6 is -3 (work it out)
    assert Three.altdiff() == 156.12413750099995; 
    }
  }
