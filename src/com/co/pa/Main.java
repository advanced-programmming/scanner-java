package com.co.pa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int zRow  = scanner.nextInt();
        int zColumn = scanner.nextInt();
        int newRow = row * zRow;
        int newColumn = column * zColumn;
        String [] matrix = new String[row];
        List<String> result2 = new ArrayList<>();

        for(int i = 0; i < row; i++) {
            matrix[i] = scanner.next();
            String temporal = matrix[i];
            if(column != newColumn) {
                String value = getColumn(temporal, zColumn);
                result2.add(value);
            } else {
                if (row != newRow){
                    for(int x = 0; x < zRow; x++){
                        result2.add(temporal);
                    }
                }
            }
        }

        for(String index : result2){
            System.out.println(index + "\n");
        }
    }

    public static String getColumn(String temporal, int newColumn){
        String value =  "";
        for(int j = 0; j < temporal.length(); j++){
            for(int index = 0;  index < newColumn; index++) {
                value += temporal.charAt(j);
            }
        }

        return value;
    }

}
