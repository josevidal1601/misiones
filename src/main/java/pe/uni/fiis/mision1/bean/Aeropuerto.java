package pe.uni.fiis.mision1.bean;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Created by JOSE on 31/05/2015.
 */
public class Aeropuerto {
    private String entrada;
    private String salida;

    public static void main(String[] args) throws FileNotFoundException {
        Workbook wb = new HSSFWorkbook();
        Aeropuerto a= new Aeropuerto();
        a.setEntrada("12:30");
        a.setSalida("21:20");


        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\excel\\mision1.xls");
            Sheet hoja1 = wb.createSheet();
            Row fila1 = hoja1.createRow(1);
            org.apache.poi.ss.usermodel.Cell cell = fila1.createCell(2);
            cell.setCellValue("Horarios");

            Row fila2 = hoja1.createRow(2);
            fila2.createCell(2).setCellValue("Salida");
            fila2.createCell(3).setCellValue("Entrada");

                Row fila3 = hoja1.createRow(3);
                fila3.createCell(1).setCellValue("Vuelo1");
                fila3.createCell(2).setCellValue(a.getEntrada());
                fila3.createCell(3).setCellValue(a.getSalida());

                Row fila4 = hoja1.createRow(4);
                fila4.createCell(1).setCellValue("Vuelo2");
                fila4.createCell(2).setCellValue("04:43");
                fila4.createCell(3).setCellValue("12:41");

                Row fila5 = hoja1.createRow(5);
                fila5.createCell(1).setCellValue("Vuelo3");
                fila5.createCell(2).setCellValue("06:47");
                fila5.createCell(3).setCellValue("15:05");

                Row fila6 = hoja1.createRow(6);
                fila6.createCell(1).setCellValue("Vuelo4");
                fila6.createCell(2).setCellValue("10:17");
                fila6.createCell(3).setCellValue("22:29");

                Row fila7 = hoja1.createRow(7);
                fila7.createCell(1).setCellValue("Vuelo5");
                fila7.createCell(2).setCellValue("16:30");
                fila7.createCell(3).setCellValue("22:15");

                Row fila8 = hoja1.createRow(8);
                fila8.createCell(1).setCellValue("Vuelo6");
                fila8.createCell(2).setCellValue("14:05");
                fila8.createCell(3).setCellValue("22:29");

                Row fila9 = hoja1.createRow(9);
                fila9.createCell(1).setCellValue("Vuelo9");
                fila9.createCell(2).setCellValue("08:55");
                fila9.createCell(3).setCellValue("15:00");

            wb.write(fileOut);
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
}
