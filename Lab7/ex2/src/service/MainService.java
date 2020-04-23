package service;

import model.Book;

import java.io.*;

public class MainService {
    private String filePath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\Lab Pao\\Lab7\\ex2\\src\\repository\\ReportData.csv";

    public void writeDataToReport(Book book){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true))){
            bufferedWriter.append(book.getName());
            bufferedWriter.append(",");
            bufferedWriter.append(book.getAuthor());
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void initReportHeader() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))){
            bufferedWriter.append("NAME");
            bufferedWriter.append(",");
            bufferedWriter.append("AUTHOR");
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readDataFromCsv() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String record;
            while((record = bufferedReader.readLine()) != null) {
                String [] recordData = record.split(",");
                System.out.println(recordData[0] + " " + recordData[1]);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
