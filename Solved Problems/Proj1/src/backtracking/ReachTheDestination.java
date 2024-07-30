package backtracking;

public class ReachTheDestination {
	public static boolean reachDestination(int sx, int sy, int dx, int dy) {
		// base case
        if (sx > dx || sy > dy)
            return false;
     
        // current point is equal to destination
        if (sx == dx && sy == dy)
            return true;
     
        // check for other 2 possibilities
		if(dx>dy){
        return reachDestination(sx, sy, dx-dy, dy);
		}else{
		return	reachDestination(sx, sy, dx, dy-dx);

	}
	}

	public static void main(String[] args) {
		int source_x = 2, source_y = 10;
        int dest_x = 26, dest_y = 12;
        if (reachDestination(source_x, source_y, dest_x,
                                           dest_y))
            System.out.print("True\n");
        else
            System.out.print("False\n");

	}

}
