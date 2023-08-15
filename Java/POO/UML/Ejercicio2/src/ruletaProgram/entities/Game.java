/*
 */
package ruletaProgram.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krausser
 */
public class Game {

    private List<Player> players = new ArrayList<>();
    private Gun revolver = new Gun();

    public void fullGame(ArrayList<Player> players, Gun revolver) {
        this.players = players;
        this.revolver = revolver;
    }

    public void round() {
        int aux = 0;
        boolean check;
        Player player;

        for (int i = 1; i <= 8; i++) {
            
            if (aux <= (players.size() - 1)) {
                player = players.get(aux);
                check = player.shoot(revolver);

                if (check) {
                    System.out.println(player.getName() + " mojado...");
                    System.out.println("Fin del juego");
                    break;
                } else {
                    aux++;
                }
            } else {
                aux = 0;
            }
        }
    }
}
