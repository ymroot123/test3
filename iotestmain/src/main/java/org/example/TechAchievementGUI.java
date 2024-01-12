package org.example;

import javax.swing.*;
import java.awt.*;

import java.io.File;

import java.util.ArrayList;
import java.util.List;


public class TechAchievementGUI extends JFrame {

    public static final long serialVersionUID = -1975588556073248766L;

    static List<TechnicalAchievement> list =new ArrayList<>();
    // 创建表格模型和表格

    JTable table=new JTable();

    static {
        TechnicalAchievement t1=new TechnicalAchievement(325, "宝马", "是", "有", "快","待完成", "现金");
        TechnicalAchievement t2 = new TechnicalAchievement(2547, "奔驰", "否", "无", "慢", "完成", "卡");
        TechnicalAchievement t3=new TechnicalAchievement(3578, "五菱宏光","是", "有","快","待完成" ,"现金");
        TechnicalAchievement t4=new TechnicalAchievement(42448, "特斯拉","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t5=new TechnicalAchievement(546, "兰博基尼","是","有","快" ,"待完成","现金");
        TechnicalAchievement t6=new TechnicalAchievement(6436, "丰田","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t7=new TechnicalAchievement(4325, "宝马", "是", "有", "快","待完成", "现金");
        TechnicalAchievement t8 = new TechnicalAchievement(52547, "奔驰", "否", "无", "慢", "完成", "卡");
        TechnicalAchievement t9=new TechnicalAchievement(63578, "五菱宏光","是", "有","快","待完成" ,"现金");
        TechnicalAchievement t10=new TechnicalAchievement(742448, "特斯拉","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t11=new TechnicalAchievement(8546, "兰博基尼","是","有","快" ,"待完成","现金");
        TechnicalAchievement t12=new TechnicalAchievement(96436, "丰田","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t13=new TechnicalAchievement(1325, "宝马", "是", "有", "快","待完成", "现金");
        TechnicalAchievement t14 = new TechnicalAchievement(22547, "奔驰", "否", "无", "慢", "完成", "卡");
        TechnicalAchievement t15=new TechnicalAchievement(33578, "五菱宏光","是", "有","快","待完成" ,"现金");
        TechnicalAchievement t16=new TechnicalAchievement(442448, "特斯拉","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t17=new TechnicalAchievement(5546, "兰博基尼","是","有","快" ,"待完成","现金");
        TechnicalAchievement t18=new TechnicalAchievement(66436, "丰田","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t19=new TechnicalAchievement(7325, "宝马", "是", "有", "快","待完成", "现金");
        TechnicalAchievement t20 = new TechnicalAchievement(82547, "奔驰", "否", "无", "慢", "完成", "卡");
        TechnicalAchievement t21=new TechnicalAchievement(93578, "五菱宏光","是", "有","快","待完成" ,"现金");
        TechnicalAchievement t22=new TechnicalAchievement(142448, "特斯拉","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t23=new TechnicalAchievement(2546, "兰博基尼","是","有","快" ,"待完成","现金");
        TechnicalAchievement t24=new TechnicalAchievement(36436, "丰田","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t25=new TechnicalAchievement(4325, "宝马", "是", "有", "快","待完成", "现金");
        TechnicalAchievement t26 = new TechnicalAchievement(52547, "奔驰", "否", "无", "慢", "完成", "卡");
        TechnicalAchievement t27=new TechnicalAchievement(63578, "五菱宏光","是", "有","快","待完成" ,"现金");
        TechnicalAchievement t28=new TechnicalAchievement(742448, "特斯拉","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t29=new TechnicalAchievement(8546, "兰博基尼","是","有","快" ,"待完成","现金");
        TechnicalAchievement t30=new TechnicalAchievement(96436, "丰田","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t31=new TechnicalAchievement(1325, "宝马", "是", "有", "快","待完成", "现金");
        TechnicalAchievement t32 = new TechnicalAchievement(22547, "奔驰", "否", "无", "慢", "完成", "卡");
        TechnicalAchievement t33=new TechnicalAchievement(33578, "五菱宏光","是", "有","快","待完成" ,"现金");
        TechnicalAchievement t34=new TechnicalAchievement(442448, "特斯拉","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t35=new TechnicalAchievement(5546, "兰博基尼","是","有","快" ,"待完成","现金");
        TechnicalAchievement t36=new TechnicalAchievement(66436, "丰田","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t37=new TechnicalAchievement(7325, "宝马", "是", "有", "快","待完成", "现金");
        TechnicalAchievement t38= new TechnicalAchievement(82547, "奔驰", "否", "无", "慢", "完成", "卡");
        TechnicalAchievement t39=new TechnicalAchievement(13578, "五菱宏光","是", "有","快","待完成" ,"现金");
        TechnicalAchievement t40=new TechnicalAchievement(242448, "特斯拉","否", "无","慢","完成" ,"卡");
        TechnicalAchievement t41=new TechnicalAchievement(3546, "兰博基尼","是","有","快" ,"待完成","现金");
        TechnicalAchievement t42=new TechnicalAchievement(46436, "丰田","否", "无","慢","完成" ,"卡");
        listCRUD.add(list,t1);
        listCRUD.add(list,t2);
        listCRUD.add(list,t3);
        listCRUD.add(list,t4);
        listCRUD.add(list,t5);
        listCRUD.add(list,t6);
        listCRUD.add(list,t8);
        listCRUD.add(list,t9);
        listCRUD.add(list,t10);
        listCRUD.add(list,t11);
        listCRUD.add(list,t12);
        listCRUD.add(list,t13);
        listCRUD.add(list,t14);
        listCRUD.add(list,t15);
        listCRUD.add(list,t16);
        listCRUD.add(list,t17);
        listCRUD.add(list,t18);
        listCRUD.add(list,t19);
        listCRUD.add(list,t20);
        listCRUD.add(list,t21);
        listCRUD.add(list,t22);
        listCRUD.add(list,t23);
        listCRUD.add(list,t24);
        listCRUD.add(list,t25);
        listCRUD.add(list,t26);
        listCRUD.add(list,t27);
        listCRUD.add(list,t28);
        listCRUD.add(list,t29);
        listCRUD.add(list,t30);
        listCRUD.add(list,t31);
        listCRUD.add(list,t32);
        listCRUD.add(list,t33);
        listCRUD.add(list,t34);
        listCRUD.add(list,t35);
        listCRUD.add(list,t36);
        listCRUD.add(list,t37);
        listCRUD.add(list,t38);
        listCRUD.add(list,t39);
        listCRUD.add(list,t40);
        listCRUD.add(list,t41);
        listCRUD.add(list,t42);

    }

    public TechAchievementGUI() {
        setTitle("订单信息管理系统");// 设置窗口标题
        // 创建选项卡面板
        JTabbedPane tabbedPane = new JTabbedPane();
        // 创建两个面板用于放置表格
        JPanel panel1 = createTablePanel1();
        tabbedPane.addTab("订单信息管理系统", panel1);
        // 设置布局
        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.CENTER);

        // 设置窗口属性
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JPanel createTablePanel1() {
        JPanel panel = new JPanel(new BorderLayout());

        ListEntityTableModel model = new ListEntityTableModel(list);
        table.setModel(model);
        // 将表格添加到滚动窗格中
        JScrollPane scrollPane = new JScrollPane(table);
        // 创建添加、删除和更新按钮
        JButton addButton = new JButton("添加");
        JButton deleteButton = new JButton("删除");
        JButton updateButton = new JButton("更新");
        JButton output = new JButton("导出文件");
        JButton input = new JButton("导入文件");

        // 为按钮添加动作监听器
        addButton.addActionListener(e -> {
            // 调用方法处理添加新行的逻辑
            ListAddButton(model,list);
        });

        deleteButton.addActionListener(e -> {
            // 调用方法处理删除选定行的逻辑
            ListDeleteButton(model,list);
        });

        updateButton.addActionListener(e -> {
            // 调用方法处理更新选定行的逻辑
            ListUpdateButton(model,list);
        });


        output.addActionListener(e -> {
            //导出文件
            ListOutput(list);

        });

        input.addActionListener(e -> {
            //导入文件
            ListInput(model,list);
        });

        // 创建按钮面板
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(output);
        buttonPanel.add(input);

        // 将表格和按钮面板添加到主面板中
        panel.add(buttonPanel, BorderLayout.NORTH); // 将按钮面板添加到父容器的北部
        panel.add(scrollPane, BorderLayout.CENTER); // 将滚动面板添加到父容器的中心
        return panel;
    }

    public void ListInput(ListEntityTableModel model,List<TechnicalAchievement> list) {
        JFileChooser fileChooser = new JFileChooser();
        String fileType=null;
        String filePath = null;
        // 设置初始目录
        String initialDirectory ="C:\\Users\\data\\";
        fileChooser.setCurrentDirectory(new File(initialDirectory));

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = convertToJavaSyntax(selectedFile.getAbsolutePath());
            fileType = "."+getFileType(filePath);
        }
        // 返回选择的文件地址和文件类型
        System.out.println("Selected file path: " + filePath);
        System.out.println("File type: " + fileType);

        Inputfile(filePath,fileType,model);

    }

    public void Inputfile(String filePath, String fileType,ListEntityTableModel model) {
        if (fileType != null) {
            switch (fileType) {
                case ".txt" -> {
                    list=FileIOTool.readfile(filePath);
                    // 创建表格模型和表格
                    ListEntityTableModel newModel = new ListEntityTableModel(list);
                    table.setModel(newModel);
                    JOptionPane.showMessageDialog(null, "导入文件成功");
                }
                case ".xlsx" -> {
                    list=easyExcelTool.readExcel(filePath,TechnicalAchievement.class);
                    ListEntityTableModel newModel = new ListEntityTableModel(list);
                    table.setModel(newModel);
                    JOptionPane.showMessageDialog(null, "导出文件成功");
                }
                case ".data" -> {
                    list=ObjectIOTool.readObject(filePath,TechnicalAchievement.class);
                    ListEntityTableModel newModel = new ListEntityTableModel(list);
                    table.setModel(newModel);
                    JOptionPane.showMessageDialog(null, "导出文件成功");
                }
                default -> JOptionPane.showMessageDialog(null, "输入选项错误，请重新输入：");
            }
        }
    }


    // 将文件路径转换为 Java 语法形式
    public String convertToJavaSyntax(String filePath) {
        return filePath.replace("\\", "\\\\");
    }
    //获取类型
    public String getFileType(String filePath) {
        int lastIndex = filePath.lastIndexOf('.');
        if (lastIndex > 0 && lastIndex < filePath.length() - 1) {
            return filePath.substring(lastIndex + 1);
        }
        return "未知类型";
    }

    public void ListOutput(List<TechnicalAchievement> list) {
        JDialog out = new JDialog(this, "选择文件类型和输入文件名", true);
        out.setSize(300, 150);
        out.setLayout(new GridLayout(3, 1));

        JComboBox<String> fileTypeComboBox = new JComboBox<>(new String[]{".txt", ".xlsx", ".data"});
        JTextField fileNameTextField = new JTextField(10);
        JButton createFileButton = new JButton("创建文件");

        createFileButton.addActionListener(e -> {
            create(list, fileTypeComboBox, fileNameTextField);
            out.dispose(); //使用完后关闭
        });

        JPanel fileTypePanel = new JPanel();
        fileTypePanel.add(new JLabel("选择文件类型: "));
        fileTypePanel.add(fileTypeComboBox);

        JPanel fileNamePanel = new JPanel();
        fileNamePanel.add(new JLabel("输入文件名: "));
        fileNamePanel.add(fileNameTextField);

        JPanel createButtonPanel = new JPanel();
        createButtonPanel.add(createFileButton);

        out.add(fileTypePanel);
        out.add(fileNamePanel);
        out.add(createButtonPanel);

        out.setLocationRelativeTo(this);
        out.setVisible(true);

    }

    private static void create(List<TechnicalAchievement> list, JComboBox<String> fileTypeComboBox, JTextField fileNameTextField) {
        String fileType = (String) fileTypeComboBox.getSelectedItem();//获取文件类型
        String fileName = fileNameTextField.getText();//获取文件名
        // 拼接文件类型和文件名
        String fullFileName = "C:\\Users\\data\\"+fileName + fileType;
        if (fileType != null) {
            switch (fileType) {
                case ".txt" -> {
                    FileIOTool.writeFile(list, fullFileName);
                    JOptionPane.showMessageDialog(null, "导出文件" + fullFileName + "成功");
                }
                case ".xlsx" -> {
                    easyExcelTool.writeExcel(list, fullFileName);
                    JOptionPane.showMessageDialog(null, "导出文件" + fullFileName + "成功");
                }
                case ".data" -> {
                    ObjectIOTool.wirteObject(list, fullFileName);
                    JOptionPane.showMessageDialog(null, "导出文件" + fullFileName + "成功");
                }
                default -> JOptionPane.showMessageDialog(null, "输入选项错误，请重新输入：");
            }
        }
    }

    private void ListUpdateButton(ListEntityTableModel model,List<TechnicalAchievement> list) {
        int inputID = Integer.parseInt(JOptionPane.showInputDialog("请输入要修改的订单的ID: "));
        TechnicalAchievement entityToUpdate = model.findEntityByID(inputID);

        if (entityToUpdate != null) {
            JPanel panel = new JPanel(new GridLayout(6, 2));

            // 定义6个标签和文本框
            String[] labels = {"1.订单ID", "2订单类型名", "3.订单是否运营", "4.订单折扣有无", "5.订单运送快慢", "6.订单状态", "7.订单支付方式"};
            String menu=labels[0]+"\n"
                    +labels[1]+"\n"
                    +labels[2]+"\n"
                    +labels[3]+"\n"
                    +labels[4]+"\n"
                    +labels[5]+"\n"
                    +labels[6]+"\n";
            // 显示输入对话框
            String choice = JOptionPane.showInputDialog(null, menu,"请输入需要修改的属性：",JOptionPane.WARNING_MESSAGE);//输入图形界面
            switch (choice) {
                case "1" -> {
                    // 弹出输入对话框，获取用户输入的修改信息
                    int newID;
                    newID = Integer.parseInt(JOptionPane.showInputDialog("请输入新的Id:", null));
                    // 更新实体类对象的属性
                    entityToUpdate.setID(newID);
                }
                case "2" -> {
                    // 弹出输入对话框，获取用户输入的修改信息
                    String newName = JOptionPane.showInputDialog("请输入Name:", null);
                    // 更新实体类对象的属性
                    entityToUpdate.setName(newName);
                }
                case "3" -> {
                    // 弹出输入对话框，获取用户输入的修改信息
                    String newdomain = JOptionPane.showInputDialog("请输入订单是否运营:", null);
                    // 更新实体类对象的属性
                    entityToUpdate.setDomain(newdomain);
                }
                case "4" -> {
                    // 弹出输入对话框，获取用户输入的修改信息
                    String newdescription = JOptionPane.showInputDialog("请输入订单折扣有无:", null);
                    // 更新实体类对象的属性
                    entityToUpdate.setDescription(newdescription);
                }
                case "5" -> {
                    // 弹出输入对话框，获取用户输入的修改信息
                    String newethical = JOptionPane.showInputDialog("请输入订单运送快慢:", null);
                    // 更新实体类对象的属性
                    entityToUpdate.setEthical(newethical);
                }
                case "6" -> {
                    // 弹出输入对话框，获取用户输入的修改信息
                    String newsocialImpact = JOptionPane.showInputDialog("请输入订单状态:", null);
                    // 更新实体类对象的属性
                    entityToUpdate.setSocialImpact(newsocialImpact);
                }
                case "7" -> {
                    // 弹出输入对话框，获取用户输入的修改信息
                    String newrisk = JOptionPane.showInputDialog("请输入订单支付方式:", null);
                    // 更新实体类对象的属性
                    entityToUpdate.setRisk(newrisk);
                }
                default -> JOptionPane.showMessageDialog(null, "输入选项错误，请重新输入：");
            }
            // 刷新表格显示
            model.fireTableDataChanged();
        } else {
            JOptionPane.showMessageDialog(null, "未找到 ID 为 " + inputID + " 的订单");
        }
    }

    private void ListDeleteButton(ListEntityTableModel model,List<TechnicalAchievement> list) {
        int inputID = Integer.parseInt(JOptionPane.showInputDialog("请输入要删除的订单的主键Key: ")); // 获取用户输入的ID

        // 得到要删除的对象的索引
        int indexToRemove = -1;
        for (int i = 0; i < model.getRowCount(); i++) {
            TechnicalAchievement achievement = model.getTechnicalAchievementAt(i);
            if (TechnicalAchievement.Equals(achievement.getID(),inputID)){
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            // 找到要删除的对象
            listCRUD.remove(list,indexToRemove);
            model.removeTechnicalAchievementAt(indexToRemove);
            model.fireTableDataChanged();
            JOptionPane.showMessageDialog(null, "成功删除 ID 为 " + inputID + " 的订单");
        } else {
            JOptionPane.showMessageDialog(null, "未找到 ID 为 " + inputID + " 的订单");
        }
    }

    private void ListAddButton(ListEntityTableModel model,List<TechnicalAchievement> list) {
        TechnicalAchievement newAchievement = new TechnicalAchievement();

        // 通过对话框获取用户输入并设置实体类属性
        newAchievement.setID(Integer.parseInt(JOptionPane.showInputDialog("请输入ID")));  // 通过对话框获取用户输入的ID
        newAchievement.setName(JOptionPane.showInputDialog("请输入订单类型名"));  // 通过对话框获取用户输入的Name
        newAchievement.setDomain(JOptionPane.showInputDialog("请输入是否运营"));  // 通过对话框获取用户输入的Domain
        newAchievement.setDescription(JOptionPane.showInputDialog("请输入订单折扣有无"));  // 通过对话框获取用户输入的Description
        newAchievement.setEthical(JOptionPane.showInputDialog("请输入订单运送快慢"));  // 通过对话框获取用户输入的Ethical
        newAchievement.setSocialImpact(JOptionPane.showInputDialog("请输入订单状态"));  // 通过对话框获取用户输入的Social Impact
        newAchievement.setRisk(JOptionPane.showInputDialog("请输入订单支付方式"));  // 通过对话框获取用户输入的Risk

        // 将新的TechnicalAchievement对象添加到模型中
        listCRUD.add(list,newAchievement);
        model.fireTableDataChanged();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TechAchievementGUI::new);
    }
}
