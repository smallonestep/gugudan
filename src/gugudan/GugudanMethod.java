package gugudan;

public class GugudanMethod {
	
	//메소드를 사용하여 반복되는 부분을 줄여보자
	//배열에 결과를 입력하는 메소드
	public static int[] cal(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	//배열에 입력된 결과를 출력하는 메소드
	public static void out(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
