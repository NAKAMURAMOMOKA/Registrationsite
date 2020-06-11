
package jp.co.aforce.beans;
import java.io.Serializable;
public class RegisterBean  implements Serializable{

	private String member_no;
	private String name;
	private String age;
	private String birth_year;
	private String birth_month;
	private String birth_day;
	private String msg;


	//ゲッター（会員番号）
	public String getMember_no(String member_no) {

		return member_no;
		}

	// セッター（会員番号）

	public void setMember_no(String member_no) {
		this.member_no=member_no;
	}


	//ゲッター（名前）

	public String getName(String name) {

		return name;
	}

	// セッター（名前）

	public void setName(String name) {
		this.name=name;
	}


	//ゲッター（歳）
	public String getAge(String age) {

		return age;

	}

	// セッター（歳）

		public void setAge(String age) {
			this.age=age;
		}



	//ゲッター（誕生年）
		public String getbirth_year(String birth_year) {

			return birth_year;

		}

	//セッター（誕生年）
		public void setBirth_year(String birth_year) {
			this.birth_year=birth_year;
		}

	//ゲッター（誕生月）
		public String getbirth_month(String birth_month) {

		return birth_month;

		}

	//セッター（誕生月）
		public void setBirth_month(String birth_month) {
			this.birth_month=birth_month;

		}

		//ゲッター（誕生日）
		public String getbirth_day(String birth_day) {

			return birth_day;

		}

		//セッター（誕生日）
		public void setBirth_day(String birth_day) {
			this.birth_day=birth_day;

		}

		public void setMsg(String msg) {




		}
}






