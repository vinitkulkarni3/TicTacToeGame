/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tictactoegame;

import java.util.Scanner;



public class TicTacToeGame 
{
    public static char Board[] = new char[10];
    //UC1
    public static char[] createBoard()
    {
        
        for(int i=0; i<Board.length; i++)
        {
            Board[i] = ' ';
        }
        return Board;
    }
    
    //UC2
    public static String chooseOption()
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
        
        return optionResult;
        
    }
    
    //UC3
    public static void displayBoard()
    {
        for(int i=1; i<4; i++)
        {
            System.out.print(" | "+Board[i]+" | ");
        }
        System.out.println();
        for(int i=4; i<7; i++)
        {
            System.out.print(" | "+Board[i]+" | ");
        }
        System.out.println();
        for(int i=7; i<10; i++)
        {
            System.out.print(" | "+Board[i]+" | ");
        }
    }

    public static void main(String[] args)
    {
        char showBoard[] = createBoard();
        System.out.println("Array Elements are:");
        System.out.println(showBoard);
        
        String optionSelected = chooseOption();
        System.out.println(optionSelected);
        
        displayBoard();
    }
}
