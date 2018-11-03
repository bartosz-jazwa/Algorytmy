package com.Kurs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        System.out.println(isPrime(97));

//        Map<String,List<String>> bazaPrac = takeData();
//        System.out.println(bazaPrac);

        /*List<Employee> fileList = openFile("c:\\a.txt");
        fileList.forEach(employee -> System.out.println(employee.name+
                " "+employee.surname+
                " "+employee.position +
                " "+employee.id));*/

        //SearchAlgorithm searchAlgorithm = new LinearSearch();
        //BinarySearchRec binarySearch = new BinarySearchRec();
        //Integer[] tab = {1,3,6,7,9,12};
        //binarySearch.printLast(2,tab);
        //System.out.println(binarySearch.search(9,tab));

        //Fibbonnaci fibbonnaci = new Fibbonnaci();
        //System.out.println(fibbonnaci.fibonacci(10));
        Osoba osoba = new Osoba("Adam", "Nowak", 18);
        Osoba[] osoby = {new Osoba("Jan","Kowalski",19),new Osoba("Adam", "Nowak", 18),new Osoba("John","Smith",20)};
        SearchAlgorithm<Osoba> linearSearch = new LinearSearch<>();
        System.out.println(linearSearch.search(new Osoba("Adam", "Nowak", 18),osoby));

    }


    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }else if (n<=3){
            return true;
        }else if (n%2==0 || n%3==0){
            return false;
        }
        int i = 5;
        while (i*i<=n){
            if (n%i==0||n%(i+2)==0){
                return false;
            }
            i=i+6;
        }
        return true;
    }

    public static Map<String,List<String>> takeData(){
        Scanner scanner = new Scanner(System.in);
        Map<String,List<String>> dataBase = new HashMap<String, List<String>>();
        List<String> pracownicy = new ArrayList<String>();
        String wejscie;
        do {
            wejscie  =scanner.nextLine();
            String[] wejscia = wejscie.split(" ");
            if (!wejscie.equals("list")){
                if (dataBase.containsKey(wejscia[1])){
                    pracownicy  = dataBase.get(wejscia[1]);
                    pracownicy.add(wejscia[0]);
                    dataBase.put(wejscia[1],pracownicy);
                }else {
                    pracownicy = new ArrayList<String>();
                    pracownicy.add(wejscia[0]);
                    dataBase.put(wejscia[1],pracownicy);
                }
            }

        }while (!wejscie.equals("list"));
        return dataBase;
    }

    public static List<Employee> openFile(String filePath) {
        Scanner scanner=null;
        int fileLength = 0;
        File file = new File(filePath);
        fileLength=(int)file.length();
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Employee> bazaPrac = new ArrayList<>();

        while (scanner.hasNextLine()){
            String[] pracArray = scanner.nextLine().split(";");
            Employee employee = new Employee(pracArray[0],pracArray[1],pracArray[2],Long.parseLong(pracArray[3]));
            bazaPrac.add(employee);
        }

        String resultPath = "result.txt";
        List<String > empList = bazaPrac.stream()
                .map(employee -> employee.name+","+employee.surname+","+employee.position+","+employee.id)
                .collect(Collectors.toList());
        try {
            Files.write(Paths.get(resultPath),empList, StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return bazaPrac.stream()
                .sorted((e1,e2)->(int)(e1.id-e2.id))
                .collect(Collectors.toList());

    }
}
