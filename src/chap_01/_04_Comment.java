package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        System.out.println("(10분 전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        //System.out.println("(5분 전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        System.out.println("지금부터 결혼식을 시작하겠습니다.");

        int size = 120;
        size = size + 10; // 어린이는 발이 빨리 자라기 때문에 사이즈 10만큼 더 큰 신발을 구매
        System.out.println("신발 사이즈" + size + "으로 보여주세요.");


        int a = 10;
        int b = 20;
        System.out.println(a + b);

        // 여러 문장을 주석처리하는 방법은 /* (주석 처리할 내용) */
        // 한 줄 주석 처리하는 단축키 = ctrl + / (해제할 때도 동일한 단축키 사용)
        // 여러 줄 전체 주석처리하는 단축기 = ctrl + shift + / (해제할 때도 동일한 단축키 사용)
        // 주석 단축키 잘 안될 경우 한영키 변환 해보기
    }
}
