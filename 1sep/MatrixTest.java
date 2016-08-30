import java.util.Arrays;
public class MatrixTest {
  public static void main(String[] args) {
    /* test cases for Matrix class methods */
    double[][] matrixA = {{1,2,3,4},{2,4,6,8},{9,10,11,12}};
    double[][] matrixB = {{0.92,-900,44},{1201,18.264,-21.0},{0,0,0}};
    double[][] matrixC = {{1.5E-12,-6.034E2},{41.8,-125E-3}};
    Matrix One = new Matrix(matrixA);
    Matrix Two = new Matrix(matrixB);
    Matrix Three = new Matrix(matrixC);

    /* test whether or not maxRow works properly */
    if (One.maxRow(0) == 2) {
           System.out.println("Passed maxRow test for matrix One"); }
    else { System.out.println("Failed maxRow test for matrix One"); }
    if (Two.maxRow(1) == 1) {
           System.out.println("Passed maxRow test for matrix Two"); }
    else { System.out.println("Failed maxRow test for matrix Two"); }

    /* test whether or not scaleRow works properly */
    One.scaleRow(0,2.0);    // scale row 0 by 2.0
    if (Arrays.equals(One.getRow(0),matrixA[1])) {
           System.out.println("Passed scaleRow test for matrix One"); }
    else { System.out.println("Failed scaleRow test for matrix One"); }
    Two.scaleRow(2,12.608); // scale row 2 by 12.608
    if (Arrays.equals(Two.getRow(2),matrixB[2])) {
           System.out.println("Passed scaleRow test for matrix Two"); }
    else { System.out.println("Failed scaleRow test for matrix Two"); }
    One.scaleRow(0,0.5);  // scale row 0 by 0.5
    if (Arrays.equals(One.getRow(0),matrixA[0])) {
           System.out.println("Passed scaleRow test for matrix Three"); }
    else { System.out.println("Failed scaleRow test for matrix Three"); }

    /* test whether or not swap method works properly */
    One.swap(2,0);  // swap contents of Row 2 with Row 0
    if (Arrays.equals(One.getRow(0),matrixA[2]) && 
        Arrays.equals(One.getRow(2),matrixA[0])) {
           System.out.println("Passed swap test for matrix One"); }
    else { System.out.println("Failed swap test for matrix One"); }
    Two.swap(0,1); Two.swap(1,2); Two.swap(1,0); // fancy swap sequence
    if (Arrays.equals(Two.getRow(0),matrixB[2]) && 
        Arrays.equals(Two.getRow(2),matrixB[0])) {
           System.out.println("Passed swap test for matrix Two"); }
    else { System.out.println("Failed swap test for matrix Two"); }

    }
  }
