package chap_01;

public class _03_variables {
    public static void main(String[] args) {
        String name = "박상혁";
        int hour = 15;


        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";

        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println(name + "님의 학점은" + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;   //정밀한 숫자를 이용할 때는 double 이용, 간단한 숫자는 float도 가능(float은 소수점 8자리에서 반올림해버림)
        System.out.println(d);
        System.out.println(f);

        //int i = 1000000000000; //int(정수형) -21억부터 +21억까지만 가능함
        long l = 100000000000L;
        l = 1_000_000_000_000L; //언더바로 보기 편하게 작성 가능
        System.out.println(l);

        //int(-21억~+21억), long(int를 벗어나는 정수, 끝에 L을 붙여 long으로 인식) = 정수
        //float(간단한 실수, 범위를 벗어난 숫자도 끝에 f/F를 붙이면 float으로 인식 가능), double(깊은 실수) = 실수
        //char = 하나의 문자
        //String = 여러 문자열
        //boolean = 참 / 거짓
    }
}
