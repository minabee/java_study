public class Home_230506 {

    public static void main(String[] args) {

        //// for문

        // 문제 1. for문을 이용해서 1부터 10까지의 합을 구하시오. 정답은 55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        // System.out.println(sum);

        // 이중 for문으로 구구단 출력하기
        for (int i = 2; i <= 9; i++) {
            // 이중 for문 : for문 안에 for문이 존재함
            for (int j = 1; j <= 9; j++) {
                // System.out.println(i * j);
            }
            // System.out.println("====================");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                // System.out.print("*");
            }
            // System.out.println("");
        }

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                // System.out.print("*");
            }
            // System.out.println("");
        }

        // 1 ~ 20 소수를 구하시오.
        int cnt = 0;
        for (int i = 2; i < 20; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    ++cnt;
                }
            }
            if (cnt == 1) {
                // System.out.println(i + "는 소수입니다.");
            }
            cnt = 0;
        }

        //// 배열
        int[] array = { 1, 10, 4, 8, 6 };
        System.out.println("0번째에 있는 값은? " + array[0]);
        System.out.println("2번째에 있는 값은? " + array[2]);

        int count = 0;
        for (int i = 0; i < array.length; i++) { // 배열 길이만큼 for문을 돌리겠다.
            if (array[i] % 2 == 0) {
                ++count;
                System.out.println(array[i] + "는 짝수입니다.");
            }
        }
        System.out.println("짝수는 총 " + count + "입니다.");

        int[] array2 = { 10, 4, 1 };
        // ***temp변수(임시 변수)를 이용해서 배열 위치를 바꿔보기. (실무에서 많이 쓰임)
        int temp = 0;
        temp = array2[1];
        array2[1] = array2[0];
        array2[0] = temp;

        int[] array3 = { 4, 30, 7 };
        int max = 0; // 최댓값 구하기

        // for문을 이용해서 array3에 있는 최댓값을 구하시오. (청보처리기사 실기ver)

        for (int i = 0; i < array3.length; i++) {
            if (max < array3[i]) {
                max = array3[i];
            }
        }
        System.out.println("최댓값은 " + max + "입니다.");

        // 최소값 구하기
        int min = 0;
        min = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (min > array3[i]) {
                min = array3[i];
            }
        }
        System.err.println("최솟값은 " + min + "입니다.");

    }

}
