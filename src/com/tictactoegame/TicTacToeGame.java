/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame 
{
    public static void createBoard()
    {
        char Board[] = new char[10];
        for(int i=0; i<Board.length; i++)
        {
            Board[i] = ' ';
        }
    }
    
    
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

    public static void main(String[] args)
    {
        createBoard();
        
        String optionSelected = chooseOption();
        System.out.println(optionSelected);
    }
}
