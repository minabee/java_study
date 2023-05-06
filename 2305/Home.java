public class Home {

    public static void main(String[] args) {

        int sum = 0; // 전역변수

        for (int x = 0; x < 10; x++) {
            int y = x; // 지역변수 (y는 for문 안에서만 사용할 수 있는 지역 변수)
            sum = sum + x;
            sum += x; // 실무에서는 해당 방법 사용

        }

        // System.out.println("y의 값은 ?" + sum);

        /*
         * for문 순서
         * 1. int x = 0; x에 0을 대입
         * 2. x < 10; x와 10을 비교
         * 3. {} 중괄호 안에 있는 코드 실행
         * 4. ++ x를 1씩 증감
         */

        for (int x = 1; x < 7; x++) {
            // if를 이용해서 2,4,6 짝수 구하기
            if (x % 2 == 0) {
                // System.out.println(x + "는 짝수입니다.");
            } else {
                // System.out.println(x + "는 홀수입니다.");
            }

            // 홀수 구하기
            if (x % 2 != 0) {
                // System.out.println(x + "는 홀수입니다.");
            }
        }

        // 구구단 2단을 만드시오
        for (int x = 1; x <= 9; x++) {
            // int gugudan = 2;
            // System.out.println(gugudan * x);

        }

        /*
         * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
         * 처음 세균의 마리수 n 변수
         * 경과한 시간 t 변수
         * 주어질 때 t시간 후 세균의 수를 출력하시오.
         * 세균 수 2, 경과한 시간 10이라고 가정하면 총 2048마리의 세균이 증식
         * for문을 이용해서 풀 것
         */

        // 세균 수 2 => n, 경과한 시간 10 => t
        // int t = 10;
        // int n = 2;
        // for (int i = 1; i <= t; i++) {
        // n = n * 2;
        // System.out.println(t + "시간 후 세균 수 : " + n);
        // }

        /*
         * 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자는 몇 판일까?
         */
        int slice = 8; // 7조각
        int n = 23; // 사람 수
        int p = 0; // 피자 몇 판

        int x = n % slice;
        p = n / slice;
        if (x > 0) {
            ++p;
        }
        System.out.println("피자 최소 몇 판? : " + p);
    }
}
