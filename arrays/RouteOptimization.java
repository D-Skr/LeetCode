package arrays;

import java.util.ArrayList;
import java.util.List;

public class RouteOptimization {
    public static List<List<Integer>> optimizeRoutes(int maxTravelDist, List<List<Integer>> forwardRouteList, List<List<Integer>> returnRouteList) {
        List<List<Integer>> optimalPairs = new ArrayList<>();

        for (int i = 0; i < forwardRouteList.size(); i++) {
            for (int j = 0; j < returnRouteList.size(); j++) {
                int totalDistance = forwardRouteList.get(i).get(1) + returnRouteList.get(j).get(1);
                if (totalDistance <= maxTravelDist) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(forwardRouteList.get(i).get(0));
                    pair.add(returnRouteList.get(j).get(0));
                    optimalPairs.add(pair);
                }
            }
        }

        return optimalPairs;
    }
    
    public static void main(String[] args) {
        
    }
}
