


public class Main {

    public static void main(String[] args) {
        String strone = "haystack";
        String strtwo = "sta";
        int index = -1;
        int n = strone.length();
        int m = strtwo.length();

        for( int i=0; i<= n-m; i++){
            int j = 0;
            while( j<m && strone.charAt(i+j) == strtwo.charAt(j)){
                j++;
            } 
            if ( j == m ) {
                index = i;
                break;
            }
        }

        System.out.println("The index is: " + index);

    }

}
