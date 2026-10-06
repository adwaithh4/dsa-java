package string;

public class ShortestPath {

    public static int[] getFinalPosition(String path) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {

            char dir = path.charAt(i);

            // South
            if (dir == 'S') {
                y--;
            }

            // North
            else if (dir == 'N') {
                y++;
            }

            // West
            else if (dir == 'W') {
                x--;
            }

            // East
            else if (dir == 'E') {
                x++;
            }
        }

        return new int[]{x, y};
    }

    public static void main(String[] args) {

        String path = "WNEENESENN";

        int[] result = getFinalPosition(path);

        System.out.println("Final position: (" 
                + result[0] + ", " 
                + result[1] + ")");
    }
}