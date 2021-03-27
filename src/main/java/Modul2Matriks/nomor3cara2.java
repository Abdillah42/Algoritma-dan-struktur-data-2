package Modul2Matriks;
public class nomor3cara2 {
    public static void main(String [] args){
    int [][]A ={
        {11,12,13},
        {14,15,16},
    };
    int [][]B ={
        {8,9},
        {10,4},
        {5,6}
    };
    int [][]C= new int [A.length][B[0].length];
    for (int i=0; i<A.length; i++){
        for (int j=0; j<B[0].length; j++){
            for (int k=0; k<A[0].length; k++){
                C[i][j] += A[i][j]*B[k][j];
            }
        }
    }
    for (int[] x: C){
        for (int y: x){
            System.out.print(y+ " ");
            }
        System.out.println();
        }
    }
}
