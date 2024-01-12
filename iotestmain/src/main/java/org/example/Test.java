package org.example;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<TechnicalAchievement> list = new ArrayList<>();
        TechnicalAchievement t1 = new TechnicalAchievement(325, "宝马", "是", "有", "快", "待完成", "现金");
        TechnicalAchievement t2 = new TechnicalAchievement(436452, "奔驰", "否", "无", "慢", "S完成", "卡");
        listCRUD.add(list, t1);
        listCRUD.add(list, t2);

        String fileName = "C:\\Users\\data\\";
        System.out.println(fileName);
        org.example.StudentDaoImpl studentDao;
        studentDao=new org.example.StudentDaoImpl();
        System.out.println(studentDao.searchByCondition(12,"","","","","",""));
/*
        // 使用工具类写入数据到文件
        FileIOTool.writeFile(list,fileName);

        // 使用工具类从文件中读取数据
        List<TechnicalAchievement> readData = FileIOTool.readfile(fileName);

        // 打印读取到的数据
        System.out.println("--------------");
        for (TechnicalAchievement readDatum : readData) {
            System.out.println(readDatum);
        }*/


/*
        ObjectIOTool.wirteObject(list, fileName);

        Class<TechnicalAchievement> elementType = TechnicalAchievement.class;
        List<TechnicalAchievement> readData = ObjectIOTool.readObject(fileName, elementType);
        System.out.println("--------------");
        if (readData != null) {
            for (TechnicalAchievement readDatum : readData) {
                System.out.println(readDatum);
            }
        }
*/
/*
        easyExcelTool.writeExcel(list,fileName);

        Class<TechnicalAchievement> elementType = (Class<TechnicalAchievement>) list.get(0).getClass();
        List<TechnicalAchievement> readData =easyExcelTool.readExcel(fileName,elementType);
        System.out.println("--------------");
        for (TechnicalAchievement readDatum : readData) {
            System.out.println(readDatum);
        }*/

    }
}

