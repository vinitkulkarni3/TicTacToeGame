/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame 
{
    public static char board[] = new char[10];
    
    //UC1
    public static char[] createBoard()
    {
        
        for(int i=0; i<board.length; i++)
        {
            board[i] = ' ';
        }
        return board;
    }
    
    //UC2
    public static char chooseOption()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose small letter 'X' or 'O' : ");
        char value = sc.next().charAt(0);
        String optionResult = "";
        
        if(value == 'x' || value == 'o')
        {
            optionResult = (value == 'x') ? "Player" : "Computer";
        }
        else
        {
            System.out.println("Please Select X or O character Only");
        }
        
        return value;   
    }
    
    //UC3
    public static void displayBoard()
    {
        System.out.print(board[1]+"|"+board[2]+"|"+board[3]+"|");
        System.out.println();
        System.out.print(board[4]+"|"+board[5]+"|"+board[6]+"|");
        System.out.println();
        System.out.print(board[7]+"|"+board[8]+"|"+board[9]+"|");
        System.out.println();
    }
    
    //UC4
    public static void isIndexFree()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Indix want to fill :");
        int fillIndex = sc.nextInt();
        
        if(fillIndex >= 1 && fillIndex <= 9)
        {
            if(board[fillIndex] == ' ')
            {
                System.out.println("Index is Empty");
                char optionValue = chooseOption();
                board[fillIndex] = optionValue;
            }
            else
            {
                System.out.println("Not Empty");
            }
        }
        else
        {
            System.out.println("Enter Number between 1 to 9 Only");
        }
        
        displayBoard();
    }

    public static void main(String[] args)
    {
        char showBoard[] = createBoard();
        System.out.println("Array Elements are:");
        System.out.println(showBoard);
        
        char optionSelected = chooseOption();
        System.out.println("Option Selected is -> "+optionSelected);
        
        System.out.println("Displaying the Board");
        displayBoard();
        
        isIndexFree();
    }
}
