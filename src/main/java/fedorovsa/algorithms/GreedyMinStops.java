package fedorovsa.algorithms;

public class GreedyMinStops {

    /**
     *  The method calculates the minimum number of stops(refill) needed from first to last point.
     * @param stops - array of distances to each gas station from start point (km)
     * @param gasTank - capacity of gas tank (km)
     * @return - minumum stops to reach last point
     */
    public static int minStops(int[] stops, int gasTank) {
        int currentStop = 0;
        int stopsNumber = 0;
        while (currentStop < stops.length - 1) {
            int nextStop = currentStop;
            while (nextStop < stops.length - 1
                    && stops[nextStop + 1] - stops[currentStop] <= gasTank) {
                nextStop++;
            }
                if (currentStop == nextStop) {
                    return -1;
                }
                if (nextStop < stops.length - 1) {
                    stopsNumber++;
                }
                currentStop = nextStop;
        }
        return stopsNumber;
    }

    public static void main(String[] args) {
        int[] stops = {0, 250, 400, 550, 700, 850};
        System.out.println(minStops(stops, 500));
    }
}
