package org.example;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ContentRowHeight(20)// 表体行高
@HeadRowHeight(20)// 表头行高
@ColumnWidth(30)// 列宽

public class TechnicalAchievement implements Serializable {

    public static final long serialVersionUID = -5712935414197079541L;
    @ExcelProperty("订单编号ID")
    public int ID;

    @ExcelProperty("订单类型名")
    public String name;

    @ExcelProperty("订单是否运营")
    public String domain;

    @ExcelProperty("订单折扣有无")
    public String description;

    @ExcelProperty("订单运送快慢")
    public String Ethical;

    @ExcelProperty("订单状态")
    public String socialImpact;

    @ExcelProperty("订单支付方式")
    public String Risk;

    static boolean Equals(int i1, int i2){return i1 == i2;}


}
