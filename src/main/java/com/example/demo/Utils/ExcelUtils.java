package com.example.demo.Utils;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ExcelUtils {

    public static void main(String[] args) throws IOException {
        //获取系统文档
//        POIFSFileSystem poifsFileSystem = new POIFSFileSystem(new File("D:\\test3.xls"));
//        //创建工作薄对象
//        HSSFWorkbook workbook = new HSSFWorkbook(poifsFileSystem);
//        //创建工作表对象
//        HSSFSheet sheet = workbook.getSheet("sheet1");
//        //得到Excel表格
//        HSSFRow row = sheet.getRow(0);
//        //得到Excel工作表指定行的单元格
//        HSSFCell cell = row.getCell(0);
//        System.out.println(cell);
        //创建工作薄对象
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建工作表对象
        HSSFSheet sheet = workbook.createSheet();
        //得到Excel工作表指定行的单元格
        HSSFRow row = sheet.createRow(0);
        //设置值
        row.createCell(0).setCellValue("阿黄");
        File file = new File("D:\\test2.xls");
        //输出到file
        workbook.write(file);
    }
}
