package arrays;

public class twoD_array {
    public static void main(String[] args) {
       
        int [][] numbers= {
            {0,1,2},
            {3,4,5},
            {6,7,8},
            {9,10,11},
        };
        System.out.print(numbers[0][2]+"\n");
        System.out.print(numbers[1][2]+"\n");
        System.out.print(numbers[2][1]+"\n");
        System.out.print(numbers[3][1]+"\n");


        int[][] matrix = new int[3][2];
        matrix[0][0]= 1;
        matrix[0][1]= 2;
        matrix[1][0]= 3;
        matrix[1][1]= 4;  
        matrix[2][0]= 5;  
        matrix[2][1]= 6;  
        
        for(int i=0;i<3;i++){
            for(int j =0;j<2;j++){
                System.out.print(matrix[i][j]+"\n");
            }
            System.out.print("yogi"+"\n");
        }
    }
}
