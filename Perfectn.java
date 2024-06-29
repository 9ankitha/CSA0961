class Perfectn
{
    public static void main(String[] args)
    {
        int n = 4; 
        int count = 0; 
        int number = 1; 
        System.out.println("The first " + n + " perfect numbers are:");
        while (count < n)
        {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++)
            {
                if (number % i == 0) {
                    sum += i;
            }
        }
           if (sum == number && number != 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}