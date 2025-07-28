package EnumDirection;

public class EnumDirection {

    public static void main(String[] args) {
        Direction dir = Direction.NORTH;
        System.out.println("Left of " + dir + " is " + dir.left());   // WEST
        System.out.println("Right of " + dir + " is " + dir.right()); // EAST
    }

    public static void printDirectionMessage(Direction direction) {
     switch (direction) {
        case NORTH:
            System.out.println("North");
            break;
        case SOUTH:
            System.out.println("South");
            break;
        case EAST:
            System.out.println("East");
            break;
        case WEST:
            System.out.println("West");
            break;
     }
    }

    public enum Direction {
        NORTH, EAST, SOUTH, WEST;
        public Direction left() {
            switch (this) {
                case NORTH: return WEST;
                case WEST:  return SOUTH; 
                case SOUTH: return EAST;
                case EAST:  return NORTH;
                default:    return null;
            }
        }

        public Direction right() {
            switch (this) {
                case NORTH: return EAST;
                case EAST:  return SOUTH;
                case SOUTH: return WEST;
                case WEST:  return NORTH;
                default:    return null;
            }
        }
    }
}
