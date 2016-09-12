import java.util.Arrays;


public class Matrix  {
// Matrix will need additional members for instance variable and constructor

    double[][] matrix; 

    Matrix(double[][] mat) { 
        matrix = new double[mat.length][];
        for (int i = 0; i < mat.length; ++i) {
            matrix[i] = new double[mat[i].length];
            matrix[i] = mat[i].clone();
        }
        //print_matrix();
    }
    
    public double[] getRow(int rownum) {
    // return the specified row of current matrix 
        return matrix[rownum];
    }

    public void print_matrix() { 
        System.out.println("------------------------");
        for (int i = 0; i < matrix.length; ++i) {
            System.out.println(Arrays.toString(matrix[i])); 
            if (i != matrix.length - 1) {
                System.out.println("");
            }
        }
        System.out.println("------------------------\n");
    }

    public void swap(int rowA, int rowB) {
    // change current matrix by swapping rows rowA and rowB

        // Testing
        //System.out.println("Before swap");
        //print_matrix();

        double[] tmp_arr;

        tmp_arr = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = tmp_arr;

        // Testing
        //System.out.println("After swap");
        //print_matrix();
    }

    public int maxRow(int column_num) {
    // looking only at column column_num in matrix,
    // return index of which row has largest value
    // a[col][row]
        double max_num = -Double.MAX_VALUE;
        int index_at_max_num = -1;

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if ((j == column_num) && (max_num < matrix[i][j])) { 
                    max_num = matrix[i][j];
                    index_at_max_num = i;
                }
            }
        } 
        //System.out.println("Max: " + max_num + ", i: " + index_at_max_num);
        return index_at_max_num;
    }

    public void scaleRow(int rownum, double factor) {
    // multiply all elements of current matrix in row rownum by factor
    // a[col][row]
        
        for (int i = 0; i < matrix[rownum].length; ++i) {
            matrix[rownum][i] *= factor;
        }
        /*
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (i == rownum) {
                    matrix[i][j] *= factor;
                }
            }
        } 
        */
        //print_matrix();

        return;
    }
}
