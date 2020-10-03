import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
            int count=0;
			String input=sc.nextLine();
            char s[]=new char[100];
            s=input.toCharArray();
            int k=s.length;
            if(k%2!=0)
            {
                System.out.println("false");
            }
            else
            {  
            for(int i=0;i<k;i++)
            {
                if(s[i]=='{')
                {
                    for(int j=i+1;j<k;j++)
                    {
                    if(s[j]=='}')
                    {
                        count++;
                        break;
                    }
                    }
                }
                if(s[i]=='(')
                {
                 for(int j=i+1;j<k;j++)
                  {
                    if(s[j]==')')
                    {
                        count++;
                        break;
                    }
                  }
                }
                if(s[i]=='[')
                {
                    for(int j=i+1;j<k;j++)
                   {
                    if(s[j]==']')
                    {
                        count++;
                        break;
                    }
                   }
                }
            }
            if(count==(k/2))
            System.out.println("true");
            else
            System.out.println("false");
            }
		}
		
	}
}
