package chap_01;

/*(실행 결과)
상암08번 버스
약 3분 후 도착
남은 거리 1.5km*/
public class _Quiz_01 {
    public static void main(String[] args) {
        String busNo = "상암08";
        int timeLeft = 3;
        double distance = 1.5;

        System.out.println(busNo + "번 버스");
        System.out.println("약 " + timeLeft + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
