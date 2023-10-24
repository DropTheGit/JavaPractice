package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
        //Option(Window는 Alt) 누르고 드래그하면 여러줄 드래그 가능

        // 3 x 5 크리의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // B2 에 접근하려면?
        System.out.println(seats[1][1]);

        // C5 에 접근하려면?
        System.out.println(seats[2][4]);

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A3 에 접근하려면?
        System.out.println(seats2[0][2]);

        // A5 에 접근하려면?
        // System.out.println(seats2[0][4]);  에러가 뜬다

        // 3차원 배열 만들기(실무에서는 보통 2차원까지만 사용하며 3차원이상은 굉장히 드물다)

        /*
        String[][][] marray = new String[][][] {
                { {}, {}, {} },
                { {}, {}, {} },
                { {}, {}, {} }
        };
        */

        // String[][][] marray = new String[3][3][3]


    }
}
