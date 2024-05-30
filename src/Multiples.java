
public class Multiples {
    public static void main(String[] args) {
        int i = 1000;
        int j = 0;
        while (i >= 3){
            i--;
            if(i % 3 == 0){
                j++;
            }
            if(i % 5 == 0){
                j++;
            }
        }
        System.out.println("Multiples: " + j);
    }
}
