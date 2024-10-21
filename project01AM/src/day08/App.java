package day08;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        // File file = new File(args[0]);
        // if (args.length < 0) {
        //     System.out.println("Usage: java -cp classes day08/App <filepath>");
        // }
        // if (!file.exists()){
        //     file.mkdir();
        // }

        //Sorting using Lambda expression
        // List<Product> products = new ArrayList<>();
        
        // LocalDate dateCreated = LocalDate.of(2024, 10, 21);
        // Date date = Date.from(dateCreated.atStartOfDay(ZoneId.systemDefault()).toInstant());
        
        // products.add(new Product(1L, "Mouse", "For click UI on screen", "Computer", 99.0f, date));
        // products.add(new Product(2L, "Keyboard", "Device that allows alpha numeric inputs", "Computer", 235.5f, date));
        // products.add(new Product(3L, "15.6 inch monitor", "Extended display panel", "Computer", 157.5f, date));
        // products.add(new Product(4L, "Huawei Pura 70 Ultra", "Huawei phone", "Mobile", 900.0f, date));
        // products.add(new Product(5L, "Huawei Mate 50 Pro", "Huawei Phone", "Mobile", 1200.0f, date));
        // products.add(new Product(6L, "iPhone 16 Pro", "iPhone", "Mobile", 2000.0f, date));
        // products.add(new Product(7L, "iPhone 14 Pro", "iPhone", "Mobile", 1800.0f, date));

        // List<Product> filteredProducts = new ArrayList<>();
        // filteredProducts = products.stream().filter(p -> p.getProdCatogery().equals("Mobile") && (p.getPrice() > 1500.0f)).collect(Collectors.toList());
        // filteredProducts.forEach(System.out::println);

        //writing to a file
        // try {
        // FileWriter fw = new FileWriter(file, false);
        // BufferedWriter bw = new BufferedWriter(fw);

        //     Iterator<Product> interator = filteredProducts.iterator();
        //     while (interator.hasNext()) {
        //         bw.write(interator.next().toString());
        //         bw.newLine();
        //     }
        //     bw.flush();
        //     bw.close();
        //     fw.close();
        
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        //Sorting using Comparator exercise
        // Comparator<Product> comparator = Comparator.comparing(p -> p.getProdName());       
        // products.sort(comparator);
        // products.forEach(System.out::println);

        // products.sort(comparator.reversed());
        // products.forEach(System.out::println);

        //Sorting arrays exercise
        // String[] names = {"Bernard", "Zachary", "Alpha", "Theophillis", "Sammy", "Christopher"};
        
        // Arrays.sort(names);
        // System.out.println("Ascending order: ");
        // for (String n : names) {
        //     System.out.println(n);
        // }

        // Arrays.sort(names, Collections.reverseOrder());
        // System.out.println("Descending order: ");
        // for (String na : names) {
        //     System.out.println(na);
        // }

        //Permutation exercise
        String toPermut = "ABCD";
        char[] toPermutArr = toPermut.toCharArray();
        int noOfPermuts= 1;
        for (int a = toPermutArr.length; a > 0 ; a--) {
            noOfPermuts *= a;
        }

        Set<String> permutations = new HashSet<>();
        // Console cons = System.console();
        // String permutation = cons.readLine("Please input 4 unique letters: ");
        String permutation = "";

    
        for (int i = 0; i < toPermutArr.length; i++) {
            //permutation += toPermutArr[i];
            for (int j = 0; j < toPermutArr.length; j++) {
                if (j == i) {continue;}
                //permutation+= toPermutArr[j];
                for (int x = 0; x < toPermutArr.length; x++) {
                    if (x == i || x == j) {continue;}
                    //permutation += toPermutArr[x];
                    for (int y = 0; y < toPermutArr.length; y++){
                        if (y != x && y != i && y != j) {
                            permutation = String.valueOf(toPermutArr[i]);
                            permutation += String.valueOf(toPermutArr[j]);
                            permutation += String.valueOf(toPermutArr[x]);
                            permutation += String.valueOf(toPermutArr[y]);
                            permutations.add(permutation);
                        }

                    }
                }
            }
        }
        
        for (String s: permutations) {
            System.out.println(s);
        }
        System.out.println(permutations.size());
    }
    
}
