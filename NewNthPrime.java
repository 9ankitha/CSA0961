import java.util.Scanner;
public class NewNthPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            boolean flag = false;
            int n = in.nextInt();
            int[] prime = new int[n];
            prime[0] = 2;
            int i = 3,j=1;

            while(j<n){
                for(int y=0;y<prime.length;y++){
                    if(prime[y]==0){
                        break;
                    }
                    else if (i%prime[y]==0){
                       flag = true;
                       break;
                    }
                }
                if(!flag){
                   prime[j++]=i;
                }
                flag =false;
                i+=2;
            }
            System.out.println(prime[n-1]);
        }
    }
}