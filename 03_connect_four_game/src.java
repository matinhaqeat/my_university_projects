package connectFour;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("4 IN A ROW GAME:");
		int[][] table = {	{0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0},		
							{0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0}		};		// table[6][7];
		
		
		Scanner input = new Scanner(System.in);
		int p = 1;
		while(!(isItWin(table)!=0 || isItFull(table))) {
			printTable(table);
			takeInput(table, p, input);
			
			
			
			p = (p==1)?2:1;
		}
		int w = isItWin(table);
		switch(w) {
		case 1:
			System.out.println("Player number 1 has won the match!");
			break;
		case 2:
			System.out.println("Player number 2 has won the match!");
			break;
		default:
			System.out.println("NO WIN !!!");
		}
		printTable(table);
	}
	public static boolean isItFull(int[][] table) {
		for(int i=0; i<7;i++)
			if(table[5][i] ==0)
				return false;
		return true;
	}
	public static void printTable(int[][]table) {
		for(int i=table.length-1; i>=0; i--) {
			System.out.print("|");
			for(int j=0; j<table[i].length; j++) {
				System.out.print(valueOf(table[i][j]) + "|");
			}
			System.out.println("");
		}
		System.out.println("|1|2|3|4|5|6|7|");
	}
	public static char valueOf(int x) {
		switch(x) {
		case 1:
			return 'X';
		case 2:
			return 'O';
		default:
			return ' ';
		}
	}
	public static void takeInput(int[][] table, int player, Scanner input) {
		boolean mistake;
		int choise;
		int c=0;
		do {
			mistake = false;
			System.out.println("Player number #" + player + " enter the column u want");
			choise = input.nextInt();
			if(choise>7 || choise<1) {
				mistake = true;
				System.out.println("OUT of range, try again!\n");
				continue;
			}
		
			if(table[5][--choise]!=0) {
				mistake = true;
				System.out.println("The chosen column is FULL, try another column");
			}
		}while(mistake);
		while(table[c][choise]!=0) 
			c++;
		table[c][choise] = player;
		
		
		/*
		int choise = input.nextInt();
		choise--;
		//if input is valid:
		int c=0;
		while(table[c][choise]!=0) 
			c++;
		table[c][choise] = player;
		*/
	}	
	public static int isItWin(int[][] table) {
		for(int r=0; r<6; r++) {
			for(int c=0; c<7; c++) {
				//jump empties:
				if(table[r][c] ==0)
					continue;
				//rigth-left:
				if(c<=3) {
					if(table[r][c]==table[r][c+1] && table[r][c]==table[r][c+2] && table[r][c]==table[r][c+3]) 
						return table[r][c];
				}
				//up-down:
				if(r<=2) {
					if(table[r][c]==table[r+1][c] && table[r][c]==table[r+2][c] && table[r][c]==table[r+3][c]) 
						return table[r][c];
				}
				//positive slope:
				if(c<=3 && r<=2) {
					if(table[r][c]==table[r+1][c+1] && table[r][c]==table[r+2][c+2] && table[r][c]==table[r+3][c+3]) 
						return table[r][c];
				}
				//negative slop:
				if(c>=3 && r<=2) {
					if(table[r][c]==table[r+1][c-1] && table[r][c]==table[r+2][c-2] && table[r][c]==table[r+3][c-3])
						return table[r][c];
				}
				
			}
		}
		return 0;
	}
}
