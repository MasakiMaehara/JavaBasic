package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		// 目的地までの距離
		final int distance1 = 300;
		final int distance2 = 400;
		final int distance3 = 500;

		int num1 = 0;//進んだ距離//
		int num2 = 0;
		int num3 = 0;

		Car car1 = new Car();
		car1.color="Red";
		car1.gasoline=50;
		int n=1;
		while(true) {
			int i=car1.run();//runメソッドの戻り値を取得//
			n++;
			if(num1<distance1) {
				num1+=i;
			}else if(num1>=distance1) {
				System.out.println("目的地までに"+n+"時間かかりました。残りのガソリンは"+car1.gasoline+"リットルです。");
				break;
			}
			if(car1.gasoline<=0){
				System.out.println("目的地に到達できませんでした。");
				break;
			}
		}

		Car car2 = new Car();
		car2.color="Blue";
		car2.gasoline=100;
		int m =1;
		while(true) {
			int i=car2.run();//runメソッドの戻り値を取得//
			m++;
			if(num2<distance2) {
				num2+=i;
			}else if(num2>=distance2) {
				System.out.println("目的地までに"+n+"時間かかりました。残りのガソリンは"+car2.gasoline+"リットルです。");
				break;
			}
			if(car2.gasoline<=0){
				System.out.println("目的地に到達できませんでした。");
				break;
			}
		}


		Car car3 = new Car();
		car3.color="black";
		car3.gasoline=200;
		int l =1;
		while(true) {
			int i=car3.run();//runメソッドの戻り値を取得//
			l++;
			if(num3<distance3) {
				num3+=i;
			}else if(num3>=distance3) {
				System.out.println("目的地までに"+n+"時間かかりました。残りのガソリンは"+car3.gasoline+"リットルです。");
				break;
			}
			if(car3.gasoline<=0){
				System.out.println("目的地に到達できませんでした。");
				break;
			}
		}




	}
}
