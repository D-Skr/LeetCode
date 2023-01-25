package hashmap;

import java.util.*;

/** Here is an example implementation of the "destinations" function in Java: */

public class ThrillingTeleportersGame2 {
    public static Set<Integer> destinations(String[] teleporters, int dieSides, int start, int end) {
    Set<Integer> possibleSquares = new HashSet<>();
    Map<Integer, Integer> teleporterMap = new HashMap<>();
    for (String teleporter : teleporters) {
        String[] parts = teleporter.split(",");
        int from = Integer.parseInt(parts[0]);
        int to = Integer.parseInt(parts[1]);
        teleporterMap.put(from, to);
    }

    for (int i = 1; i <= dieSides; i++) {
        int square = start + i;
        if (square > end) {
            break;
        }
        while (teleporterMap.containsKey(square)) {
            square = teleporterMap.get(square);
        }
        possibleSquares.add(square);
    }
    return possibleSquares;
    }
}


/*
 * This implementation uses a HashMap to store the teleporters, 
 * where the key is the "from" square and the value is the "to" square. 
 * Then, for each roll of the die, the square that the player would land on is calculated, 
 * and if that square is a teleporter, the player's position is updated to 
 * the "to" square of the teleporter. This process is repeated until the player is 
 * no longer on a teleporter square. The possible squares the player can land on are 
 * added to a HashSet and returned.

Note that this implementation has a time complexity of O(die_sides * B) 
as we are iterating through each possible roll and for each roll, 
we are iterating through each square of the board.
 
 */