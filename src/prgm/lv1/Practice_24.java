package prgm.lv1;

/**
 * 2019 카카오 개발자 겨울 인턴십
 * 크레인 인형뽑기 게임
 */
public class Practice_24 {

    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println("==> result: " + solution(board, moves));
    }
}
