package chap_03;

public class _03_Stringcompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); // 대소문자를 구분하므로 다르다
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 화장실 비밀번호 정보라 가정 (같은 메모지의 비밀번호를 참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용을 비교)
        System.out.println(s1 == s2); // true (참조한 곳을 비교)

        s1 = new String("1234"); // 서로 다른 메모지의 비밀번호 (각각 테이블의 메모지에 적힌 비밀번호)
        s2 = new String("1234"); // 서로 다른 메모지의 비밀번호 (저장된 곳이 다르다)
        System.out.println(s1.equals(s2)); // true (내용은 같으므로 true)
        System.out.println(s1 == s2); // false (하나의 메모지가 아니라 서로 다른 메모지에 같은 내용이 적힌 것이므로 근복적으로 같진 않다.)
        // 문자열의 내용을 비교할때는 등호 대신 s.equals를 사용, ==는 본질(?)이 같은지
    }
}
