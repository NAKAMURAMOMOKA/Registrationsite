package jp.co.aforce.servlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.RegisterBean;
import jp.co.aforce.models.RegisterModel;

//親クラスに HttpServlet を指定する
@SuppressWarnings("serial") // これがないと waring がでる
public class RegisterSurvlet extends HttpServlet {

	//GET
 @Override
 public void doGet(HttpServletRequest request, HttpServletResponse response)
     throws IOException, ServletException {
	 System.out.println("get repuest");


	 //会員情報新規登録ボタンを押すと、登録ページへ飛ぶ
     RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/add.jsp");
     rDispatcher.forward(request, response);
 }

    //POST
 @Override
public void doPost(HttpServletRequest request, HttpServletResponse response)
     throws IOException, ServletException {
	 System.out.println("post request");
	// 文字のエンコードを UTF-8 とする。これがないと文字化け。
     request.setCharacterEncoding("UTF-8");

     ResultSet rs = null;

     // ユーザによって入力された情報を取り出す
     String member_no = request.getParameter("member_no");
     String name  = request.getParameter("name");
     String age = request.getParameter("age");
     String birth_year =request.getParameter("birth_year");
     String birth_month =request.getParameter("birth_month");
     String birth_day =request.getParameter("birth_day");


     // 取り出した情報を registerBean に格納する
     RegisterBean registerBean = new RegisterBean();

     registerBean.setMember_no(member_no);
     registerBean.setName(name);
     registerBean.setAge(age);
     registerBean.setBirth_year(birth_year);
     registerBean.setBirth_month(birth_month);
     registerBean.setBirth_day(birth_day);

     registerBean.getMember_no(member_no);
     registerBean.getName(name);
     registerBean.getAge(age);
     registerBean.getbirth_year(birth_year);
     registerBean.getbirth_month(birth_month);
     registerBean.getbirth_day(birth_day);



    //インスタンス化
     RegisterModel registerModel = new RegisterModel();


    //入力チェック処理 <未記入の際>
     String Msg ="";
     Object registerBeen = null;
	if (name == null || name.length()==0 || age==null|| age.length()==0
    		 ||birth_year ==""||birth_year.length()==0 ||birth_month==""||
    		 birth_month.length()==0 ||birth_day==""||birth_day.length()==0) {

    	 registerBean.setMsg("入力されていない項目があります");
    	 request.setAttribute("registerBeen",registerBeen);


     //入力チェック処理 <成功の際>
     } else {


    	 if ((name != null || name.length()!=0)&& (age != null|| age.length()!=0)
        	&&(birth_year !=""||birth_year.length()!=0)&&(birth_month==""||
        		 birth_month.length()!=0)&&(birth_day ==""||birth_day.length()!=0)) {
         registerBean.setMsg("登録に成功しました");
         request.setAttribute("registerBeen",registerBeen);


         System.out.println(name);
         System.out.println(age);
         System.out.println(birth_year);
         System.out.println(birth_month);
         System.out.println(birth_day);

         registerModel.loginCheck(name, age, birth_year, birth_month, birth_day);


      //ログインが失敗したときの処理
     } else {
     // エラーメッセージを設定
      registerBean.setMsg("登録に失敗しました");
      request.setAttribute("registerBean", registerBean);



     String forward_jsp = "/views/add.jsp";
	 RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
     rDispatcher.forward(request, response);
    }
     }}}



































