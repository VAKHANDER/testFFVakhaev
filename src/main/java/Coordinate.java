public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Coordinate coordinate = (Coordinate) obj;
        return x == coordinate.x && y == coordinate.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }
}
