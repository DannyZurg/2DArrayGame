/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruz_3_2dar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DannyZurg
 */
public class Cruz_3_2Dar {

    public static String movement;
    public static int startx = 13;
    public static int starty = 7;
    public static int gatorx=7;
    public static int gatory=0;
    public static int gatorx2=7;
    public static int gatory2=13;
    public static int Treasurex=5;
    public static int Treasurey=1;
    public static int Treasurex2=5;
    public static int Treasurey2=5;
    public static int Treasurex3=8;
    public static int Treasurey3=2;
    public static int Treasurex4=6;
    public static int Treasurey4=10;
    public static int Treasurex5=13;
    public static int Treasurey5=8;
    public static int Treasurex6=1;
    public static int Treasurey6=12;
    public static int trapx = 8;
    public static int trapy = 7;
    public static int trapx2 = 6;
    public static int trapy2 = 2;
    public static boolean letsplay = true;
    static Random rand = new Random();

    public static void main(String[] args) {
story();
        while (letsplay) {
            board();
            move();
        }
    
    }
    static void board() {
        char[][] board = new char[15][15];
        board[gatorx][gatory]='<';
        board[gatorx2][gatory2]='>';
        board[startx][starty] = '@';
        board[Treasurex][Treasurey]='T';
        board[Treasurex2][Treasurey2]='T';
        board[Treasurex5][Treasurey5]='T';
        board[Treasurex4][Treasurey4]='T';
        board[Treasurex3][Treasurey3]='T';
        board[Treasurex6][Treasurey6]='T';
        board[trapx][trapy]='X';
                board[trapx2][trapy2]='X';

        for (int i = 0; i <= board[0].length - 1; i++) {
            for (int j = 0; j <= board[1].length - 1; j++) {
                if (j < board[1].length - 1) {
                    if (board[i][j] != '@' && board[i][j] != '<'&& board[i][j] != 'T'&& board[i][j] != '>'&& board[i][j] != 'X') {
                        System.out.print(".");
                    } else {
                        System.out.print(board[i][j]);
                    }
                } else if (board[i][j] != '.') {
                    System.out.println(".");
                } else {
                    System.out.println(board[i][j]);
                }
            }
            
            
        }
    }
static void story(){
        System.out.println("You found a cave that has a lot of treasure chests. You found one but it isn't empty."
                + "Look around for one that isn't empty. Good Luck!");
    }
    static void move() {
        System.out.println("To move the '@' symbol:'N'= up 'S'= down 'E'= right 'W'= left 'NE'= updiagonal right'NW=updiagonal left''SW=downdiagonal left''SE'=downdiagonal right ");

        Scanner compass = new Scanner(System.in);
        movement = compass.nextLine().trim().toLowerCase();            // this movement thing is being told that it works for compass
          if (movement.contains("n")) {
            startx--;
            gatory++;
            gatory2--;
        } if (movement.contains("s")) {
            startx++;
            gatory--;
            gatory2++;
        } if (movement.contains("e")) {
            gatorx++;
            starty++;
            gatorx2++;
        } if (movement.contains("w")) {
            gatorx--;
            starty--;
            gatorx2--;
        } if (movement.contains("ne")) {
            startx--;
            starty++;
           /* gatorx++;
            gatory--;
            gatorx2++;
            gatory2--;*/
        } if (movement.contains("sw")) {
            startx++;
            starty--;
        /*    gatorx--;
            gatory++;
            gatorx2--;
            gatory2++;*/
        } if (movement.contains("se")) {
            startx++;
            starty++;
            /*gatorx--;
            gatory--;
            gatorx2--;
            gatory2--;*/
        } if (movement.contains("nw")) {
            startx--;
            starty--;
            /*gatorx++;
            gatory++;
            gatorx2++;
            gatory2++;*/
        }
    
        if(startx==trapx&&starty==trapy){
                letsplay=false;
                System.out.println("You died.(✖╭╮✖)");
                System.out.println("Try Again?");
            }
        if(startx==trapx2&&starty==trapy2){
                letsplay=false;
                System.out.println("You died.(✖╭╮✖)");
                System.out.println("Try Again?");
            }
         if(startx==gatorx&&starty==gatory){
                letsplay=false;
               System.out.println( "\\ \\ / /__  _   _| |    ___  ___  ___ \n"); 
                System.out.println( " \\ V / _ \\| | | | |   / _ \\/ __|/ _ \\\n"); 
                System.out.println( "  | | (_) | |_| | |__| (_) \\__ \\  __/\n" );
                System.out.println( "  |_|\\___/ \\__,_|_____\\___/|___/\\___|\n" );
                System.out.println("Try Again?");
            }
          if(startx==gatorx2&&starty==gatory2){
                letsplay=false;
                System.out.println( "\\ \\ / /__  _   _| |    ___  ___  ___ \n"); 
                System.out.println( " \\ V / _ \\| | | | |   / _ \\/ __|/ _ \\\n"); 
                System.out.println( "  | | (_) | |_| | |__| (_) \\__ \\  __/\n" );
                System.out.println( "  |_|\\___/ \\__,_|_____\\___/|___/\\___|\n" );
                                                               
                System.out.println("Try Again?");
            }
        if(startx==Treasurex&&starty==Treasurey){
                letsplay=true;
                System.out.println("Get the other treasure!");
        }              
        if(startx==Treasurex5&&starty==Treasurey5){
            
                letsplay=true;
                System.out.println("Get the other treasure!");
        }
        if(startx==Treasurex4&&starty==Treasurey4){
                letsplay=true;
                System.out.println("Get the other treasure!");
            }
        if(startx==Treasurex3&&starty==Treasurey3){
                letsplay=true;
                System.out.println("Get the other treasure!");
            }
        if(startx==Treasurex6&&starty==Treasurey6){
                letsplay=true;
                System.out.println("Get the other treasure!");
        if(startx==Treasurex2&&starty==Treasurey2){
            letsplay=false;
                System.out.println("\\ \\ / /__  _   \\ \\      / (_)_ __  \n"); 
                System.out.println( " \\ V / _ \\| | | \\ \\ /\\ / /| | '_ \\ \n"); 
                System.out.println(   "  | | (_) | |_| |\\ V  V / | | | | |\n"); 
                System.out.println( "  |_|\\___/ \\__,_| \\_/\\_/  |_|_| |_|");
            System.out.println("Try Again?");
           
            }
        }
    

    }
}




            

        
        
        
    


    
    
    

 