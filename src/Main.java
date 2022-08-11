public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
            System.out.println();
        for (int y = 10; y > 0; y = y - 1) {
            System.out.print(y + " ");
        }
            System.out.println();
        for (int friday = 1; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
            int b = 2022;
            int d = b + 100;
            for (int c = b - 200; c <= d; c = c + 1)
                if (c % 79 == 0) {
                System.out.println(c);
            }

    }
}