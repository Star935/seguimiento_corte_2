package Parcial.SegundoProblema.Service;

import Parcial.SegundoProblema.Dto.Toys_Dto;
import Parcial.SegundoProblema.Interface.Local_Interface;
import Parcial.SegundoProblema.Service.Toy;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainLocal {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
            String opc = "1";
            Local_Interface watch = new Toy();

            do {
                Scanner d=new Scanner(System.in);
                System.out.println("""
                    ~~~~~ Menu ~~~~~\n
                     1.Add\n
                     2.To list \n
                     3.Edit\n
                     4.Remove\n
                     5.Toys status\n
                     6.Leave\n""");
                opc= d.next();
                switch (opc){
                    case "1":{
                        System.out.println("~~~~~ Adding Toy ~~~~~");
                        System.out.println("Enter the id:");
                        int id= Integer.parseInt(d.next());
                        System.out.println("Enter the name:");
                        String name=d.next();
                        System.out.println("Category:");
                        String category=d.next();
                        System.out.println("Enter the price:");
                        Double price= d.nextDouble();
                        System.out.println("Enter the amount:");
                        int amount= Integer.parseInt(d.next());

                        watch.save(new Toys_Dto(id,name,category,price,amount));
                    }
                    case "2":{
                        System.out.println("~~~~~ List ~~~~~");
                        List<Toys_Dto> Toys = watch.findAll();
                        if (!Toys.isEmpty()){
                            Toys.forEach(System.out::println);
                        }else{
                            System.out.println("No records");
                        }
                    }break;
                    case "3":{
                        System.out.println("~~~~~ Editing Toy ~~~~~");
                        System.out.println("Enter the id:");
                        int idEdit = Integer.parseInt(d.next());

                        Toys_Dto toySave = watch.findById(idEdit);

                        if (toySave != null) {
                            System.out.println("Enter the name:");
                            String newname=d.next();
                            System.out.println("Category:");
                            String newcategory=d.next();
                            System.out.println("Enter the price:");
                            Double newprice= d.nextDouble();
                            System.out.println("Enter the amount:");
                            int newamount= Integer.parseInt(d.next());
                            toySave.setToyName(newname);
                            toySave.setToyCategory(newcategory);
                            toySave.setPrice(newprice);
                            toySave.setAmount(newamount);
                            watch.update(toySave);
                            System.out.println("The data has been updated.");
                        } else {
                            System.out.println("Can't found with the id provided.");
                        }
                    }break;
                    case "4":{
                        System.out.println("~~~~~ Removing Toy ~~~~~");
                        System.out.println("Enter Id number:");
                        int id= Integer.parseInt(d.next());
                        boolean search = watch.findById(id)==null;
                        if (!search){
                            System.out.println("This toy is request to be eliminated: \n" + watch.findById(id));
                            watch.delete(watch.findById(id));
                            System.out.println("The toy was removed");
                        }else {
                            System.out.println("Can't find that id");
                        }
                    }break;
                    case "5":{
                        System.out.println("~~~~~ Number of Toys ~~~~~");
                        int totalToys= watch.findAll().stream().mapToInt(Toys_Dto::getAmount).sum();
                        System.out.println("In the store there are "+ totalToys + " toys in total.");
                    }break;
                    case "6":{
                        opc="6";
                    }break;
                }

            }while (!opc.equals("6"));
        }

}


