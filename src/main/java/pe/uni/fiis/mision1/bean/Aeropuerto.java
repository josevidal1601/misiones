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
        a.setEntrada("12:30 pm");
        a.setSalida("3:20 pm");


        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\excel\\mision1.xls");
            Sheet hoja1 = wb.createSheet();
            Row fila = hoja1.createRow(1);
            org.apache.poi.ss.usermodel.Cell cell = fila.createCell(1);
            cell.setCellValue("Horario de Entrada");
            fila.createCell(2).setCellValue("Horario de Salida");

                Row fila1 = hoja1.createRow(2);
                fila1.createCell(1).setCellValue(a.getEntrada());
                fila1.createCell(2).setCellValue(a.getSalida());

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
