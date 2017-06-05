import java.io.*;

import java.util.*;

public class Factorial_of_n

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

int n=s.nextInt();

int fact=1;

for(int i=n;i>=1;i--)

{

fact=fact*i;


}

System.out.println(fact);

}

}
