package arraytopic;

import java.util.Scanner;

/*
	int a[][][] = new int[5][2][5];

	a[0][0][0]=subj1
	a[0][0][1]=subj2
	a[0][0][2]=subj3
	a[0][0][3]=total
	a[0][0][4]=avg

*/
public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[][][] = new int[5][2][5];
		
		int total = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				for (int k = 0; k < (a[i][j].length-2); k++) 
				{
					System.out.println("Enter A["+i+"]["+j+"]["+k+"] : " );
					a[i][j][k] = sc.nextInt(); 
					total += a[i][j][k];
				}
				a[i][j][3] = total;
				a[i][j][4] = total/3;
				total = 0;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				for (int k = 0; k <a[i][j].length; k++) 
				{
					System.out.println("A["+i+"]["+j+"]["+k+"] : " + a[i][j][k]);
				}
			}
		}
	}
}
