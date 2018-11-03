package com.Kurs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Alternatywne {
    public static void main(String[] args) throws IOException {
        List<String > newList =Files.lines(Paths.get("c:\\a.txt"))
                .map(line->{
                    String[] splitArray = line.split(";");
                    return new Employee(splitArray[0],splitArray[1],splitArray[2],Long.parseLong(splitArray[3]));
                })
                .sorted((e1,e2)->(int)(e1.id-e2.id))
                .map(employee -> employee.name+","+employee.surname+","+employee.position+","+employee.id)
                .collect(Collectors.toList());
        Files.write(Paths.get("result.txt"),newList);
    }
}
