
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    private int[][] data;

    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] data)
    {
        // initialise instance variables
         this.data = data; 
    }

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum()
    { 
       int[] sumRow = new int[data.length];
        for (int i = 0; i < data.length; i++)
          {
             int sum=0;
             for (int j=0; j<data[i].length; j++)
             { 
                 sum += data[i][j];
             }
             sumRow[i]=sum;
            }
        return sumRow;
    }
    
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    { 
        double[] avgRow = new double[data.length];
        int[] sums = rowSum();
        
        for (int i = 0; i<data.length; i++)
            avgRow[i] = (sums[i]*1.0)/data[i].length;
        
        return avgRow;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        int[] sumRow = new int[data.length];
        for (int i = 0; i < data.length; i++)
          {
             int sum=0;
             for (int j=0; j<data[i].length; j++)
             { 
                 sum += data[j][i];
             }
             sumRow[i]=sum;
            }
        return sumRow;
    }
    
     /**
     * Find the average of all the values in each column
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        return null;
    }
    
}
