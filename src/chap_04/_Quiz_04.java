package chap_04;

//주차요금은 시간당 4000 원 (일일 최대 요금은 30000 원)
//경차 또는 장애인 차량은 최종 요금에서 50% 할인

//일반 차량 5시간 추자 시 20000 원
//경차 5시간 주차 시 10000 원
//장애인 차량 10시간 주차 시 15000원

public class _Quiz_04 {
    public static void main(String[] args) {


        // 나의 풀이
//        String type = "장애인 차량";
//        int time = 10;
//        int cost = time * 4000;
//
//        if(type == "일반 차량"){
//            if (cost >= 30000){
//                System.out.println("주차 요금은 30000원 입니다.");
//            } else {
//                System.out.println("주차 요금은 " + cost + "원 입니다.");
//            }
//        }else if(type == "장애인 차량"){
//            if (cost >= 30000){
//                System.out.println("주차 요금은 15000원 입니다.");
//            } else {
//                System.out.println("주차 요금은 " + cost * 0.5 + "원 입니다.");
//            }
//        }else if(type == "경차") {
//            if (cost >= 30000) {
//                System.out.println("주차 요금은 15000원 입니다.");
//            } else {
//                System.out.println("주차 요금은 " + cost * 0.5 + "원 입니다.");
//            }
//        }



        int hour = 10; // 주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 정산 요금 (시간당 4000 원 곱하기)

        // 3000원 초과 시 일일 최대 요금으로 수정
        if (fee >= 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; // 50% 할인 적용
        }
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
