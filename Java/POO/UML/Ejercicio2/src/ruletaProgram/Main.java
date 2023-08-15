/*

 */
package ruletaProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ruletaProgram.entities.Game;
import ruletaProgram.entities.Gun;
import ruletaProgram.entities.Player;

/**
 *
 * @author Krausser
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        Gun revolver = new Gun();
        ArrayList<Player> players = new ArrayList<>();
        
        
        
        System.out.println("Ingrese la cantidad de jugadores: ");
        int num = read.nextInt();
        
        if (num < 1 || num > 6) {
            num = 6;
        }
        
        
        //Creación de los jugadores
        for (int i = 0; i < num; i++) {
            players.add(new Player(i+1));
        }
        
        for(Player pl : players){
            System.out.println(pl.getName());
        }
        
        revolver.fullGun();
        System.out.println(revolver.toString());
        
        Game game = new Game();
        game.fullGame(players, revolver);
        game.round();
    }
    
}
