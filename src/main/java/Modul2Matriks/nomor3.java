package Modul2Matriks;
public class nomor3 {
    public static void main(String [] args){
    int [][]A ={
        {11,12,13},
        {14,15,16},
    };
    int [][]B ={
        {1,2},
        {3,4},
        {5,6}
    };
    int barisA = A.length ;
    int kolomA = A[0].length ;
    int barisB = B.length ;
    int kolomB = B[0].length ;
    
    int [][]C = new int [barisA][kolomB];
        for(int i=0; i<barisA; i++){
            for(int j=0; j<kolomB; j++){
                for(int k=0; k<kolomA; k++){
                C[i][j] = C[i][j] + (A[i][j]*B[j][i]);
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
    


    


               
    



    
    

