import java.util.Arrays;


public class Matrix  {
// Matrix will need additional members for instance variable and constructor

    double[][] matrix;

    Matrix(double[][] mat) {

        /*
        int max_sub_mat = 0;
        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat[i].length; ++j) { 
                if (max_sub_mat < mat[i].length) {
                    max_sub_mat = mat[i].length;
                }
            }
        }
        matrix = new double[mat.length][max_sub_mat];
        */
        matrix = mat;
        print_matrix();
    }
    
    public double[] getRow(int rownum) {
    // return the specified row of current matrix 
        return matrix[rownum];
    }

    public void print_matrix() { 
        System.out.println("------------------------");
        for (int i = 0; i < matrix.length; ++i) {
            System.out.println(Arrays.toString(matrix[i]));
            /*
            for (int j = 0; j < matrix[i].length; ++j) { 
                System.out.print(matrix[i][j]);
            }
            */
            System.out.println("");
        }
        System.out.println("------------------------");
    }

    public void swap(int rowA, int rowB) {
    // change current matrix by swapping rows rowA and rowB
        //print_matrix();
        double[] tmp_arr;
        /*
        int len_A = matrix[rowA].length;
        int len_B = matrix[rowB].length;

        int max_len = (len_A > len_B) ? len_A : len_B;

        double[] tmp_arr = new double[max_len]; 
        */

        tmp_arr = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = tmp_arr;
        //print_matrix();
    }

    public int maxRow(int column_num) {
    // looking only at column column_num in matrix,
    // return index of which row has largest value
    // a[col][row]
        double max_num = -1.0;
        int index_at_max_num = -1;

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if ((j == column_num) && (max_num < matrix[i][j])) { 
                    max_num = matrix[i][j];
                    index_at_max_num = j;
                }
            }
        } 


        /*
        for (int i = 0; j < mat[column_num][i].length; ++i) { 
            if (mat[column_num][i] > max_num) {
                max_num = mat[column_num][i];
            }
        }
        */

        return index_at_max_num;
    }

    public void scaleRow(int rownum, double factor) {
    // multiply all elements of current matrix in row rownum by factor
    // a[col][row]
        
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (i == rownum) {
                    matrix[i][j] *= factor;
                }
            }
        } 

        return;
    }
}
