package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* This algorithm uses nested loops to iterate through all 
 * possible pairs of forward and return routes, 
 * and adds the pair to the optimalPairs list if the total 
 * distance of the pair does not exceed the maximum operating travel distance.
 * Note that this algorithm does not optimize the solution 
 * in terms of minimizing the total operating travel distance. 
 * It will return all pairs of routes that are valid and whose 
 * total distance is equal or less than maxTravelDist.
 * Also, this solution returns a list of pairs of integers 
 * representing the pairs of IDs of forward and 
 * return shipping routes that optimally utilize the given aircraft. 
 * If no route is possible, it will return an empty list.
 */

public class RouteOptimization {
    public static List<List<Integer>> optimizeRoutes(
            int maxTravelDist, 
            List<List<Integer>> forwardRouteList, 
            List<List<Integer>> returnRouteList) {
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
        int maxTravelDist = 10000;
        List<List<Integer>> forwardRouteList = Arrays.asList(Arrays.asList(1, 3000), 
                Arrays.asList(2, 5000), 
                Arrays.asList(3, 7000), 
                Arrays.asList(4, 100001));
        List<List<Integer>> returnRouteList = Arrays.asList(Arrays.asList(1,2000), 
                Arrays.asList(2, 3000), 
                Arrays.asList(3, 4000), 
                Arrays.asList(4, 5000));
        
        System.out.println(optimizeRoutes(maxTravelDist, forwardRouteList, returnRouteList));
    }
}
