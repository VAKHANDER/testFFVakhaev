import java.util.Scanner;

public class FindIslandsUseCaseTest {
    private static final char[][] TEST_FIELD = {
        {'#', '~', '#', '~', '#', '~', '#'},
        {'#', '~', '#', '~', '~', '~', '#'},
        {'#', '#', '#', '~', '#', '~', '#'},
        {'#', '~', '#', '~', '#', '~', '~'},
        {'#', '~', '#', '~', '#', '~', '#'}
    };
    private static final int TEST_WIDTH = 7;
    private static final int TEST_HEIGHT = 5;
    private static final int CORRECT_RESULT = 5;

    public static void main(String[] args){
        //Тест на примере из файла
        //Arrange
        FindIslandsUseCase findIslandsUseCase = new FindIslandsUseCase();

        //Act
        int result = findIslandsUseCase.execute(TEST_HEIGHT, TEST_WIDTH, TEST_FIELD);

        //Assert
        if(result == CORRECT_RESULT){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failure");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выхода введите размеры поля: -1 -1");
        String size = "0 0";
        while(!size.equals("-1 -1")) {
            System.out.println("Введите размеры поля через пробел");
            size = scanner.nextLine();
            int N = Integer.parseInt(size.split(" ")[0]);
            int M = Integer.parseInt(size.split(" ")[1]);
            char[][] field = new char[N][M];
            System.out.println("Введите линии поля");
            for (int i = 0; i < N; i++) {
                String line = scanner.nextLine();
                field[i] = line.toCharArray();
            }
            System.out.println(findIslandsUseCase.execute(N, M, field));
        }
    }
}
