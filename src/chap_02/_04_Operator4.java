package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;


        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 true(괜찮은 식당)
        // ||(shift+역슬래쉬)는 하나라도 true면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음);
        // &&는 모두 true이면 true

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 크고, 3은 1보다 크다 (true)
        System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 크고, 3은 1보다 작다 (false)

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나 3은 1보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // 5는 3보다 크거나 3은 1보다 작다 (true)
        System.out.println((5 < 3) || (3 < 1)); // 5는 3보다 작거나 3은 1보다 작다 (false)

        // System.out.println(1 < 3< 5); 불가능한 코드
        // 연속적으로 비교는 불가함 ((1 < 3) && (3 < 5))로 고쳐야 함
        // (1 < 3 && 3 < 5) 이렇게 적어도 무방하지만 보기 편하게 하기 위해 괄호로 정리  ((1 < 3) && (3 < 5))

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true

    }
}
