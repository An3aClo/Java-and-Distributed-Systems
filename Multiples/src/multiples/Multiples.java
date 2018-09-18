package multiples;

public class Multiples {

    int rows = countRows();
    
    int[][]matrix = new int[rows][9];
    
    public int countRows() {
        int count = 0;
        for (int i = 14; i < 1000; i++) {
            if (!(i%3 == 0 && i%4==0)) {
                count++;
            }
        }
        return count/9 + 1;
    }
    
    public void enterNums(){
        int num = 14;
        int row = 0;
        while (row<rows) {
            int col = 0;
            while (col < 9 && num < 1000) {
                while ((num%3 == 0 && num%4==0)) {                    
                    num++;
                } 
                matrix[row][col] = num++;
                col++;
            }
            row++;
        }
    }
    
    public void showNums() {
        enterNums();
        int row = 0;
        while (row<rows) {
            int col = 0;
            while (col<9 && matrix[row][col] != 0) {
                System.out.print(matrix[row][col] + " ");
                col++;
            }
            System.out.println("");
            row++;
        }
    }
    
    public static void main(String[] args) {
        new Multiples().showNums();
        
       /* Scanner sc = new Scanner(System.in);
        String str = "geeksforgeeks";
        getOccuringChar(str);*/
    }
    
}
