import java.lang.Math.*;
import java.util.*;

class GaussianElimination extends Equations {
  public GaussianElimination(Double[][] matrix) {
    super(matrix); // superclass saves input matrix as equations
    }

    private void print_matrix() {
        System.out.println(super.M);
    }

    private int get_num_cols() { 
        ArrayList row = new ArrayList<Double>(M.get(0));
        return row.size();
    }

    private int get_num_rows() {
        int num_cols = 0;
        for (int tmp : M.keySet()) {
            num_cols++;
        }
        return num_cols;
    }

    private void scaleRow(int rownum, double factor) {
        // get each row from HashMap M
        
        ArrayList row = new ArrayList<Double>(M.get(rownum));
        ArrayList scaled_row = new ArrayList<Double>();

        for (int i = 0; i < row.size(); ++i) {
            scaled_row.add((Double)row.get(i) * factor);
        } 

        M.put(rownum, row); 
    }
  // create more methods here, used by the reduce method
  // below; also use methods in the parent class (look at
  // Equations.java to understand them)
      
  public void reduce() {
    // this should have code to do the Gaussian elimination
    
      //this.scaleRow(1, 2.0);
      this.print_matrix();
      /*
      System.out.println(this.get_num_rows());
      System.out.println(this.get_num_cols());
      */

    }
  }
