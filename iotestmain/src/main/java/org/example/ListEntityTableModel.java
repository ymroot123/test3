package org.example;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ListEntityTableModel extends AbstractTableModel {
    private List<TechnicalAchievement> achievementList;
    private String[] columnNames = {"订单ID","订单类型名","订单是否运营","订单折扣有无","订单快慢","订单状态","订单支付方式"};

    public ListEntityTableModel(List<TechnicalAchievement> achievementList) {
        this.achievementList = achievementList;
    }
    // 添加TechnicalAchievement对象到列表，并通知表格更新
    public void addTechnicalAchievement(TechnicalAchievement technicalAchievement) {
        achievementList.add(technicalAchievement);
        // 通知表格有新的行插入
        fireTableRowsInserted(achievementList.size() - 1, achievementList.size() - 1);
    }
    @Override
    public int getRowCount() {
        return achievementList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        TechnicalAchievement achievement = achievementList.get(row);
        switch (column) {
            case 0:
                return achievement.getID();
            case 1:
                return achievement.getName();
            case 2:
                return achievement.getDomain();
            case 3:
                return achievement.getDescription();
            case 4:
                return achievement.getEthical();
            case 5:
                return achievement.getSocialImpact();
            case 6:
                return achievement.getRisk();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    // 新的方法：通过 ID 查找实体类对象
    public TechnicalAchievement findEntityByID(int id) {
        for (TechnicalAchievement entity : achievementList) {
            if (entity.getID() == id) {
                return entity;
            }
        }
        return null;
    }
    //获得索引
    public TechnicalAchievement getTechnicalAchievementAt(int rowIndex) {
        return achievementList.get(rowIndex);
    }
    //删除该索引行的内容
    public void removeTechnicalAchievementAt(int rowIndex) {
        achievementList.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
