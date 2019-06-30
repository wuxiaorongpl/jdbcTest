package com.neuedu.jdbcTest.pojo;

import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private Scanner input = new Scanner(System.in);

    public static final String url = "jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf8";
    public static final String root = "root";
    public static final String password = "ROOT";
//    权限管理  如果是学生，只能看自己信息并修改
//    如果是老师，查看全部信息
    static {
    try {
        new Driver();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}



    public void login(){
        System.out.println("请登录");
        System.out.println("username");
        String name = input.next();
        System.out.println("password");
        String psw = input.next();

        showMenu();
    }

    public void showMenu(){
        System.out.println("欢迎使用****学生管理系统");
        System.out.println("1 增");
        System.out.println("2 删");
        System.out.println("3 改");
        System.out.println("4 查");
        System.out.println("5 退出");
        System.out.println("输入编号选择功能");
        int key = input.nextInt();
        switch (key){
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                update();
                break;
            case 4:
                select();
                break;
        }

    }
//    什么样的逻辑处理都写在这了
    public void add(){

        int sno = input.nextInt();
        String sname = input.next();
        String spsw = input.next();
        String sage = input.next();
        String ssex = input.next();
        int sheight = input.nextInt();
        int sweight = input.nextInt();
        String sbirthday = input.next();
        try {
            Connection conn = DriverManager.getConnection(url,root,password);
            String sql = "insert into student(sno,sname,spsw,sage,ssex,sheight,sweight,sbirthday) values (?,?,?,?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1,sno);
            pstm.setString(2,sname);
            pstm.setString(3,spsw);
            pstm.setString(4,sage);
            pstm.setString(5,ssex);
            pstm.setInt(6,sheight);
            pstm.setInt(7,sweight);
            pstm.setString(8,sbirthday);
            int result = pstm.executeUpdate();
            System.out.println(result);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(){

        String sname = input.next();
//        String spsw = input.next();
//        String sage = input.next();
//        String ssex = input.next();
//        int sheight = input.nextInt();
//        int sweight = input.nextInt();
//        String sbirthday = input.next();
        try {
            Connection conn = DriverManager.getConnection(url,root,password);
            String sql = "delete from student where sname=? ";
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1,sname);
//            pstm.setString(3,spsw);
//            pstm.setString(4,sage);
//            pstm.setString(5,ssex);
//            pstm.setInt(6,sheight);
//            pstm.setInt(7,sweight);
//            pstm.setString(8,sbirthday);
            int result = pstm.executeUpdate();
            System.out.println(result);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(){
        /*int sno = input.nextInt();*/
        String sname = input.next();

        /*String spsw = input.next();
        String sage = input.next();
        String ssex = input.next();
        int sheight = input.nextInt();
        int sweight = input.nextInt();
        String sbirthday = input.next();*/
        try {
            Connection conn = DriverManager.getConnection(url,root,password);
            String sql = "update student set sname=? where id=1";
            PreparedStatement pstm = conn.prepareStatement(sql);
           /* pstm.setInt(1,sno);*/
            pstm.setString(1,sname);

            /*pstm.setString(3,spsw);
            pstm.setString(4,sage);
            pstm.setString(5,ssex);
            pstm.setInt(6,sheight);
            pstm.setInt(7,sweight);
            pstm.setString(8,sbirthday);*/
            int result = pstm.executeUpdate();
            System.out.println(result);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void select(){

        List<StudentTi> list = new ArrayList<>();

        String name = input.next();
        /*String spsw = input.next();
        String sage = input.next();
        String ssex = input.next();
        int sheight = input.nextInt();
        int sweight = input.nextInt();
        String sbirthday = input.next();*/
        try {
            Connection conn = DriverManager.getConnection(url,root,password);
            String sql = "select * from student where sname=?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            /*pstm.setInt(1,sno);*/
            pstm.setString(1,name);
            /*pstm.setString(3,spsw);
            pstm.setString(4,sage);
            pstm.setString(5,ssex);
            pstm.setInt(6,sheight);
            pstm.setInt(7,sweight);
            pstm.setString(8,sbirthday);*/
            while (rs.next()){

                int id = rs.getInt("id");
                int sno = rs.getInt("sno");
                String sname = rs.getString("sname");
                String spsw = rs.getString("spsw");
                String sage = rs.getString("sage");
                String ssex = rs.getString("ssex");
                int sheight = rs.getInt("sheight");
                int sweight = rs.getInt("swight");
                String sbirthday = rs.getString("sbirthday");
                int sflag = rs.getInt("sflag");

                StudentTi stu = new StudentTi(id,sno,sname,spsw,sage,ssex,sheight,sweight,sbirthday,sflag);
                list.add(stu);
                for (StudentTi s:list
                     )
                    System.out.println(s);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

