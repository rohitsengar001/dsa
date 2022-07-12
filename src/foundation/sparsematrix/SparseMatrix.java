package foundation.sparsematrix;

public class SparseMatrix {
    public int m; //row size
    //column size
    public int n;
    //referential variable for element of sparse matrix
    int[][] compMat;

    //for creating sparse matrix
    //constructor
    public SparseMatrix(int m, int n,int[][] matrix) {
        int size;
        //initialization properties of sparse matrix
        this.m = m;
        this.n = n;
        //count non-zero element
        size = countNonZeroElement(matrix,this.m,this.n);
        //create array for compact matrix of sparse matrix
        compMat = new int[m][size]; // m:row , size : size of column for compact matrix
        //initialization of compact matrix
        initCompactMatrix(matrix);
    }

    //structure for element of sparse matrix
    public int countNonZeroElement(int[][] arr,int m, int n){
        int size=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0) {
                    size++;
                }
            }
        }
        return size;
    }
    public void initCompactMatrix(int[][] sparseMatrix) {
        int k=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sparseMatrix[i][j] != 0) {
                    //initialize row
                    compMat[0][k]=i;
                    //initialize col
                    compMat[1][k]=j;
                    //initialize non zero element
                    compMat[2][k]=sparseMatrix[i][j];
                    k++;
                }
            }
        }
    }

    public void showElement(){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(compMat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,2,0},
                {4,0,0},
                {0,0,9}
        };
        SparseMatrix sm = new SparseMatrix(3,3,matrix);
        sm.showElement();
    }
}
