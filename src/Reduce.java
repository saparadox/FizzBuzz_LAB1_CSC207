public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int j = 0;
        while(i!=0){
            if(i%2 == 0){
                i = i/2;
            }
            else{
                i--;
            }
            j++;
        }
        System.out.println("Reduction steps from 100: " + j);
    }
}
