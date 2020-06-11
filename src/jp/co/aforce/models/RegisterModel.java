package jp.co.aforce.models;

import java.sql.ResultSet;

import jp.co.aforce.util.DBUtil;

public class RegisterModel {

    /**
     * 入力されたデータがDBに上に存在するかどうかを調べる。
     *
     *
     * @return 成功=true, 失敗=false
     */
    public boolean loginCheck(String name, String age, String birth_year,String birth_month,String birth_day) {
        // 実行結果を格納する変数
        ResultSet rs = null;

        try {
            // DBに接続するための手続
            DBUtil.makeConnection();
            DBUtil.makeStatement();

            // SQLを実行
           String SQL = "INSERT INTO `members` VALUES"
        		        +"(DATE_FORMAT(NOW(), 'A%y%m%d%H%i%s'),"
        		        + " '"+name+"','"+age+"','"+birth_year+"','"+birth_month+"','"+birth_day+"') ";

            rs = DBUtil.execute(SQL);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection();
        }
        return rs != null;
    }
}