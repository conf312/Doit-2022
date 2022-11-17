package prgm.lv1;

/**
 * 문제 설명
 * 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.
 *
 * 예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다. 다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
 * 두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
 * X, Y는 0으로 시작하지 않습니다.
 * X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.
 * 입출력 예
 * X	Y	result
 * "100"	"2345"	"-1"
 * "100"	"203045"	"0"
 * "100"	"123450"	"10"
 * "12321"	"42531"	"321"
 * "5525"	"1255"	"552"
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * X, Y의 짝꿍은 존재하지 않습니다. 따라서 "-1"을 return합니다.
 * 입출력 예 #2
 *
 * X, Y의 공통된 숫자는 0으로만 구성되어 있기 때문에, 두 수의 짝꿍은 정수 0입니다. 따라서 "0"을 return합니다.
 * 입출력 예 #3
 *
 * X, Y의 짝꿍은 10이므로, "10"을 return합니다.
 * 입출력 예 #4
 *
 * X, Y의 짝꿍은 321입니다. 따라서 "321"을 return합니다.
 * 입출력 예 #5
 *
 * 지문에 설명된 예시와 같습니다.
 */
public class Practice_07 {
    static String solution(String X, String Y) {
        String answer = "";
        StringBuilder str = new StringBuilder();

        for (int i=9; i>=0; i--) {
            String t = String.valueOf(i);
            if (X.contains(t) && Y.contains(t)) {
                int count_x = X.length() - X.replace(t, "").length();
                int count_y = Y.length() - Y.replace(t, "").length();
                int length = Math.min(count_x, count_y);
                for (int j=0; j<length; j++) str.append(t);
            }
        }

        int strLen = str.length();

        if (strLen > 0) {
            answer = str.toString();
            if (answer.replace("0", "").length() == 0) answer = "0";
        } else {
            answer = "-1";
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("==> result: " + solution("100", "2345"));
        //System.out.println("==> result: " + solution("12321", "42531"));
        System.out.println("==> result: " + solution("5525", "1255"));
        System.out.println("==> result: " + solution("100", "203045"));
    }
}