import java.lang.Math.*;
import java.util.*;

class GaussianElimination extends Equations {
    public GaussianElimination(Double[][] matrix) {

    super(matrix); // superclass saves input matrix as equations
    }

    private void print_matrix() {
        for (int i = 0; i <= get_num_rows(); ++i) {
            System.out.println(M.get(i));
        }
    }

    private int get_num_cols() { 
        ArrayList<Double> row = new ArrayList<Double>(M.get(0));
        return row.size();
    }

    private int get_num_rows() {
        int num_rows = 0;
        for (int tmp : M.keySet()) {
            num_rows++;
        }
        return num_rows;
    }

    private double get_element_at(int row_num, int col_num) {
        ArrayList<Double> row = new ArrayList<Double>(M.get(row_num));
        return (double)row.get(col_num);
    }

    private void scaleRow(int rownum, double factor) {
        ArrayList<Double> row = new ArrayList<Double>(M.get(rownum));
        ArrayList<Double> scaled_row = new ArrayList<Double>();

        for (int i = 0; i < row.size(); ++i) {
            scaled_row.add(row.get(i) * factor);
        } 
        System.out.println(row + " * " + factor + " = " + scaled_row);
        M.put(rownum, scaled_row); 
    }

    private void subtract_row(int row_a_index, int row_b_index) {
        // row_a - row_b
        // subtract row_b from row_a
        
        ArrayList<Double> row_a = new ArrayList<Double>(M.get(row_a_index));
        ArrayList<Double> row_b = new ArrayList<Double>(M.get(row_b_index));
        ArrayList<Double> row_c = new ArrayList<Double>();

        for (int i = 0; i < row_a.size(); ++i) {
            row_c.add((double)row_a.get(i) - (double)row_b.get(i));
        }
        System.out.println(row_a + " - " + row_b + " = " + row_c + "\n");

        M.put(row_a_index, row_c);
    }
  // create more methods here, used by the reduce method
  // below; also use methods in the parent class (look at
  // Equations.java to understand them)
      
  public void reduce() {
    // this should have code to do the Gaussian elimination 


      int last_row_index = this.get_num_rows() - 1;

      double scale_factor;
      int rows_scaled = 0;

Outer:
      for (int col_index = 0; col_index < get_num_cols() - 1; ++col_index) {
          for (int row_index = last_row_index; row_index > 0; --row_index) { 


                scale_factor = get_element_at(row_index - 1, col_index) / 
                               get_element_at(row_index, col_index); 

                System.out.println("Scale Factor: " + scale_factor);
                //System.out.println("Scale factor: " + scale_factor);
                scaleRow( row_index, scale_factor);

                if (rows_scaled == get_num_rows()) {
                    break Outer;
                }

                rows_scaled++; 
                subtract_row(row_index, row_index - 1);


                print_matrix();
            } // for 
        } 
    }
}
