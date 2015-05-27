import java.util.Scanner;

public  class PermutationWithExchange
{
    public static void main(String[] arg)
    {
    	Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int count = Integer.parseInt(input.nextLine());

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++)
        {
            numbers[i] = i + 1;
        }
        System.out.println();
        System.out.println("Permutations:");
        Permutation(0, numbers);
        System.out.println();
        input.close();
    }

    static void Permutation(int begin, int[] numbersArray)
    {
        int oldValue;

        if (begin < numbersArray.length)
        {
            for (int i = begin; i < numbersArray.length; i++)
            {
                oldValue = numbersArray[i];
                for (int j = i; j > begin; j--)
                { 
                    numbersArray[j] = numbersArray[j - 1];
                }
                numbersArray[begin] = oldValue;

                Permutation(begin + 1, numbersArray);

                for (int j = begin; j < i; j++)
                {
                    numbersArray[j] = numbersArray[j + 1];
                }
                numbersArray[i] = oldValue;
            }
        }
        else
        {
            PrintPermutation(numbersArray);
        }
    }

    static void PrintPermutation(int[] numbersArray)
    {
        System.out.print("{ ");
        for (int i = 0; i < numbersArray.length; i++)
        {
        	System.out.print(numbersArray[i] + " ");
        }
        System.out.print("} ");
    }
}
