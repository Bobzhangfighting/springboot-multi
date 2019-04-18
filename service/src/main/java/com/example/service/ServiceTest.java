package com.example.service; /**
 * Created by zhangtao on 2019/4/18
 */

import com.example.dao.DaoTest;

/**
 *@ClassName ServiceTest
 *@Description TODO
 *@Author 0682
 *@Date 2019/4/18 14:20
 *@Version 1.0
 **/
public class ServiceTest {
   public String showService(){
        DaoTest daoTest = new DaoTest();
        return daoTest.showDao()+"我是service！";
    }
}
