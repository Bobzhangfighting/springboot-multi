package com.example.dao; /**
 * Created by zhangtao on 2019/4/18
 */

import com.example.entity.EntityTest;

/**
 *@ClassName DaoTest
 *@Description TODO
 *@Author 0682
 *@Date 2019/4/18 14:17
 *@Version 1.0
 **/
public class DaoTest {
   public String showDao(){
        EntityTest entityTest = new EntityTest();
        return entityTest.showEntity()+"我是dao！";
    }
}
