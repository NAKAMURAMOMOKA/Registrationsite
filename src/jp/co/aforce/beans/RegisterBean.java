
package jp.co.aforce.beans;
import java.io.Serializable;
public class RegisterBean  implements Serializable{

	private int member_no;
	private String name;
	private int age;
	private int birth_year;
	private int birth_month;
	private int birth_day;
	private String msg;

//ゲッター（パスワード）
public String getName() {

	return name;
	}

// セッター（パスワード）

public void setName(String name) {
	this.name=name;
}

//ゲッター（ユーザーネーム）
public String getAge() {

	return age;

}
//セッター（ユーザーネーム）
public void setAge(String age) {
	this.age=age;
}
}







