import java.util.*;

public class FindIslandsUseCase {
    public int execute(int N, int M, char[][] field){
        //Множество точек, которые были посещены. Set - уникальные значения, быстрое сравнение
        Set<Coordinate> visited = new HashSet<>();
        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++) {
                //Если нашли сушу и координата не была посещена
                if (field[i][j] == '#' && !visited.contains(new Coordinate(i, j))) {
                    Coordinate c = new Coordinate(i, j);
                    //Добавляем в очередь на посещение связанных точек, двунаправленная очередь. Из за частых add/remove быстрее чем List
                    Deque<Coordinate> notRanCoordinates = new ArrayDeque<>();
                    notRanCoordinates.addFirst(c);
                    //Пока список на посещение не пустой, пробегаемся по точкам очереди
                    while(!notRanCoordinates.isEmpty()) {
                        c = notRanCoordinates.getLast();
                        //Удаляем текущую точку из очереди на посещение
                        notRanCoordinates.remove(c);
                        //Добавляем точку в посещенные
                        visited.add(c);
                        //Проверяем соседей, если они есть - добавляются в очередь на посещение
                        //right
                        if (c.getY() != M-1 && field[c.getX()][c.getY() + 1] == '#' && !visited.contains(new Coordinate(c.getX(), c.getY() + 1))) {
                            notRanCoordinates.addLast(new Coordinate(c.getX(), c.getY() + 1));
                        }
                        //up
                        if (c.getX() != 0 && field[c.getX() - 1][c.getY()] == '#' && !visited.contains(new Coordinate(c.getX() - 1, c.getY()))) {
                            notRanCoordinates.addLast(new Coordinate(c.getX() - 1, c.getY()));
                        }
                        //left
                        if (c.getY() != 0 && field[c.getX()][c.getY() - 1] == '#' && !visited.contains(new Coordinate(c.getX(), c.getY() - 1))) {
                            notRanCoordinates.addLast(new Coordinate(c.getX(), c.getY() - 1));
                        }
                        //down
                        if (c.getX() != N-1 && field[c.getX() + 1][c.getY()] == '#' && !visited.contains(new Coordinate(c.getX() + 1, c.getY()))) {
                            notRanCoordinates.addLast(new Coordinate(c.getX() + 1, c.getY()));
                        }
                    }
                    //Как только соседи закончились, остров полностью пройден, идем дальше
                    count++;
                }
            }
        }
     return count;
    }
}
