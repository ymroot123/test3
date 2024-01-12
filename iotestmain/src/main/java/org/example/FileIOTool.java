package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIOTool {
    public static <T> void writeFile(List<T> list, String filePath) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            // 遍历数据列表，并逐个写入文件
            for (T item : list) {
                outputStream.writeObject(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> readfile(String filePath) {
        List<T> dataList = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                try {
                    // 尝试读取对象，并将其添加到数据列表中
                    @SuppressWarnings("unchecked")
                    T item = (T) inputStream.readObject();
                    dataList.add(item);
                } catch (EOFException e) {
                    // 文件读取结束时捕获EOFException
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dataList;
    }
}
