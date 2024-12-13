package assigment1_1;

public class LAb {
    public static void main(String[] args) {
        int he=5,wi=10;
        for(int i=0;i<he;i++){
            for(int j=0;j<wi;j++){
                if((i==0 || i==he-1) || (j==0 || j==wi-1)){
                    System.out.print('Q');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}
