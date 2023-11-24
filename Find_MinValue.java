package methods;

public class Find_MinValue {

    public static void main(String[] args) {
    
        int n = 2539;///9...0
        int min = findMin(n);
    
        System.out.println("Min value ----> " + min);
    }

    private static int findMin(int n) {
        int min = 9; 
        int r;
        while (n > 0) { //2589
            r = n % 10;  //8
            n = n / 10;
            if (r < min) {   
                min = r;   //8>9
            }
        }
        
        return min;
    }
}


