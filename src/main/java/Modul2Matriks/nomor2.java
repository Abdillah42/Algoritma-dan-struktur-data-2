/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2Matriks;

/**
 *
 * @author LENOVO
 */
public class nomor2 {
    public static void main(String [] args){
    int [][]A ={
        {11,12},
        {14,15},
        {17,18}
    };
    int [][]B ={
        {1,2},
        {3,4},
        {5,6}
    };
    int [][]C = new int [A.length][A[0].length];
    if ((A.length == B.length) && (A[0].length == B[0].length)) {
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                C[i][j] = A[i][j] - B[i][j];
                 System.out.print (C[i][j] + " ");}
                System.out.println();}
    }
    }   
}     
        
   

