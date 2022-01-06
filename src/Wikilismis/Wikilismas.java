package Wikilismis;

public class Wikilismas {


        public static void main(String[] args)
        {
            int i, j, k;
            for(i=1; i<=5; i++)
            {
                for(j=1; j<=5; j++)
                {
                    if(i == j)
                        System.out.print(j);
                    else
                        System.out.print(" ");
                }
                for(k=4; k>=1; k--)
                {
                    if(i == k)
                        System.out.print(k);
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
 /*   Output
1       1
        2     2
        3   3
        4 4
        5


  */

