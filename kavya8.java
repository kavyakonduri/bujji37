/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int count;
        char[] c=st.tocharArray();
        for(int i=0;i<st.length();i++)
          if(c[i] !=" ")
          {
            count++;
            System.out.println(" no of characters"+count);
         }
       }
}
