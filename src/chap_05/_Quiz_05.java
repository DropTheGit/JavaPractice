package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오

        // 조건
        // 신발 사이즈는 250 부터 295까지 5 단위로 증가
        // 신발 사이즈 수는 총 10가지

        // 실행결과
//        사이즈 250 (재고 있음)
//        사이즈 255 (재고 있음)
//        사이즈 260 (재고 있음)
//        ...
//        사이즈 290 (재고 있음)
//        사이즈 295 (재고 있음)

        // 제출한 해설
        /*
        int[] size = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (i * 5);
        }

        for (int i = 0; i < size.length; i++) {
            System.out.print(size[i] + " ");
        }

        for (int i = 0; i < size.length; i++) {
            System.out.println("사이즈 " + size[i] + " (재고 있음)");
        }
        */

        // 나도코딩의 해설
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
