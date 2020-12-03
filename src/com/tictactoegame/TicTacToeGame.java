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
    
    
    public static void chooseOption()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose small letter 'X' or 'O' : ");
        char value = sc.next().charAt(0);
        if(value == 'x' || value == 'o')
        {
            if(value == 'x')
            {
                System.out.println("X is For Player");
            }
            else if(value == 'o')
            {
                System.out.println("O is For Computer");
            }
        }
        else
        {
            System.out.println("Please Select X or O character Only");
        }
        
    }

    public static void main(String[] args)
    {
        createBoard();
        chooseOption();
    }
}
