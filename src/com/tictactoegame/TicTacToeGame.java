/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tictactoegame;

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

    public static void main(String[] args)
    {
        createBoard();
    }
}
