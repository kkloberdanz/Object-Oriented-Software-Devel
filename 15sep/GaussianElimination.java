import java.lang.Math.*;
import java.util.*;

class GaussianElimination extends Equations {

    public GaussianElimination(Double[][] matrix) { 
        super(matrix); // superclass saves input matrix as equations
    }

    private void swap_rows(int a_index, int b_index) {
        if (a_index != b_index) {
            ArrayList<Double> row_a = new ArrayList<Double>(M.get(a_index));
            ArrayList<Double> row_b = new ArrayList<Double>(M.get(b_index));

            M.put(b_index, row_a);
            M.put(a_index, row_b);
        }
    }

    private boolean about_equals(double a, double b) {
        if ((a - b) < 0.01) {
            return true;
        }
        return false;
    }

    private void print_matrix() {
        for (int i = 0; i < get_num_rows(); ++i) {
            System.out.println(M.get(i));
        }
        System.out.println();
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

    private void subtract_row_by_arraylist(int row_num, ArrayList l) {
        ArrayList<Double> row_to_subtract = new ArrayList<Double>(M.get(row_num));
        for (int i = 0; i < get_num_rows(); ++i) {
        }
    }

    int get_index_greatest_row(int col_num) {
        // Returns the index of the row with the greatest value at
        // the given column

        int greatest_row_num = 0;
        double greatest_item = get_element_at(0, 0);
        double candidate;
        for (int row_num = 0; row_num < get_num_rows(); ++row_num) { 
            candidate = get_element_at(row_num, col_num);
            if (candidate > greatest_item) {
                greatest_item = candidate;
                greatest_row_num = row_num;
            }
        }
        return greatest_row_num;
    }

    private void scaleRow(int rownum, double factor) {
        ArrayList<Double> row = new ArrayList<Double>(M.get(rownum));
        ArrayList<Double> scaled_row = new ArrayList<Double>();

        for (int i = 0; i < row.size(); ++i) {
            scaled_row.add(row.get(i) * factor);
        } 
        //System.out.println(row + " * " + factor + " = " + scaled_row);
        M.put(rownum, scaled_row); 
    }

    private ArrayList<Double> get_scaled_copy(row_num, double factor) { 
        ArrayList<Double> row = new ArrayList<Double>(M.get(rownum));
        ArrayList<Double> scaled_row = new ArrayList<Double>();

        for (int i = 0; i < row.size(); ++i) {
            scaled_row.add(row.get(i) * factor);
        } 
        //System.out.println(row + " * " + factor + " = " + scaled_row);
        return scaled_row;
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
        //System.out.println(row_a + " - " + row_b + " = " + row_c + "\n");

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

        System.out.println("Original Matrix");
        print_matrix();

        double numerator, denominator;


    Outer:
        for (int col_num = 0; 
                 col_num < get_num_cols() - 1; ++col_num) {

            swap_rows(0, get_index_greatest_row(col_num));

            //for (int row_index = last_row_index; 
                     //row_index > 0; --row_index) { 

            denominator = get_element_at(col_num, 0);

            for (int row_num = 1; row_num < get_num_rows(); ++row_num) {

                numerator = get_element_at(row_num, col_num);
                System.out.println("num = " + numerator);
                System.out.println("den = " + denominator);

                scale_factor = numerator / denominator;

                scaleRow(row_num, scale_factor);
                System.out.println("Scaled by: " + scale_factor);
                print_matrix();

                subtract_row(row_num, 0); 
                System.out.println("Subtracted rows: " + row_num + ", 0");



                /*
                numerator   = get_element_at(row_index - 1, col_index);
                denominator = get_element_at(row_index, col_index);

                scale_factor = numerator / denominator;

                System.out.println("Scale factor: " + scale_factor);
                scaleRow( row_index, scale_factor);
                print_matrix();

                if (rows_scaled == get_num_rows()) {
                    break Outer;
                }

                rows_scaled++; 
                subtract_row(row_index, row_index - 1); 

                System.out.println(get_index_greatest_row(col_index));
                print_matrix();
                */

            } // for 


        } // for

    } // reduce()

} // class GaussianElimination
