package com.tohidul.IOpractice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PrintFileTextStat {
    private String inputFilePath;
    private int totalLines = 0;
    private int totalCharacters = 0;
    private int totalWords = 0;

    public PrintFileTextStat(String inputFilePath){
        this.inputFilePath = inputFilePath;
    }

    public void setInputFilePath(String inputFilePath){
        this.inputFilePath = inputFilePath;
    }

    public String getInputFilePath(){
        return inputFilePath;
    }

    public void computeStat(){
        Reader reader = null;
        boolean hasAtLeastOneNonEmptyChar = false;
        try{
            reader = new FileReader(inputFilePath);
            int c;
            char prevCH = 'n';
            while ((c = reader.read()) != -1){
                char ch = (char) c;
                if(ch == '\n'){
                    totalLines++;
                }
                if((ch == ' ' || ch == '\n') && prevCH != ' '){
                    totalWords++;
                }
                if(!hasAtLeastOneNonEmptyChar && (ch != ' ' && ch != '\n')){
                    hasAtLeastOneNonEmptyChar = true;
                }
                prevCH = ch;
                totalCharacters++;
            }
            if(hasAtLeastOneNonEmptyChar){
                totalWords++;
            }
            totalLines++;
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(reader != null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void printStat(){
        System.out.println("Total number of lines: "+ totalLines);
        System.out.println("Total number of characters: "+ totalCharacters);
        System.out.println("Total number of words: "+ totalWords);
    }

    public int getTotalLines(){
        return totalLines;
    }

    public int getTotalCharacters(){
        return totalCharacters;
    }
    public int getTotalWords(){
        return totalWords;
    }
}
