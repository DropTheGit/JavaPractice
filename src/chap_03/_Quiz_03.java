package chap_03;

// 퀴즈3
// 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오

// 참고
// 주민등록번호는 13자리의 숫자로 구성
// 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫번째 숫자는 성별 정보
// 입력 데이터는 -을 포함한 14자리의 문자열 형태

public class _Quiz_03 {
    public static void main(String[] args) {

        // 작성한 답안
        String socialSecurityNo = "901231-1234567";
        socialSecurityNo = "030708-456780";

        System.out.println(socialSecurityNo.substring(0,8));

        // 해설 답안
        String id = "901231-1234567";
        System.out.println(id.substring(0, 8));
        System.out.println(id.substring(0, id.indexOf("-") + 2)); // 하이픈 위치를 이용한 ver
    }
}
