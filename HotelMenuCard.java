package com.AngularJava;
import java.util.Scanner;
public class HotelMenuCard{
    public static void main(String[] args) {
        String bill="";
        char inneryesno,outeryesno;
        int innerchoice,quantity,total=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("----- Welcome to Swapnil Restaurant -----");
        do{
            System.out.println(">>>>>Menu<<<<\n" +
                    "1)Starter\n" +
                    "2)Dishes\n" +
                    "3)Cold Drink & Ice-Creams\n" +
                    "4)Generate Bill");
            System.out.print("Enter choice: ");
            int ch=sc.nextInt();
            switch (ch){
                case 1->{
                    do {
                        System.out.println("\n>>> Starter Menu <<<\n" +
                                "1)Masala papad \t\t\t 50 Rs.\n" +
                                "2)Fry Papad    \t\t\t 50 Rs.\n" +
                                "3)Panner Chilli\t\t\t140 Rs.");
                        System.out.println("Enter choice: ");
                        innerchoice=sc.nextInt();
                        switch (innerchoice){
                            case 1->{
                                System.out.print("How many Masala Papad you want: ");
                                quantity=sc.nextInt();
                                total+=50*quantity;
                                bill+="Masala papad \t\t\t 50 Rs."+"\t\t"+quantity+"\n";
                            }
                            case 2->{
                                System.out.print("How many Fry Papad you want: ");
                                quantity=sc.nextInt();
                                total+=50*quantity;
                                bill+="Fry Papad    \t\t\t 50 Rs."+"\t\t"+quantity+"\n";
                            }
                            case 3->{
                                System.out.print("How many Panner Chilli you want: ");
                                quantity=sc.nextInt();
                                total+=140*quantity;
                                bill+="Panner Chilli\t\t\t140 Rs."+"\t\t"+quantity+"\n";
                            }
                        }
                        System.out.println("Sure Sir..Do you have more starter y/n");
                        inneryesno=sc.next().charAt(0);
                    }while (inneryesno=='Y' || inneryesno=='y');

                }
                case 2->{
                    do {
                        System.out.println("\n>>> Dishes Menu <<<\n" +
                                "1)Mix Veg      \t\t\t130 Rs.\n" +
                                "2)Veg Maratha  \t\t\t140 Rs.\n" +
                                "3)Panner Masala\t\t\t150 Rs.\n" +
                                "4)Veg Kolhapuri\t\t\t160 Rs.\n" +
                                "5)Panner Kopta \t\t\t130 Rs.");
                        System.out.println("Enter choice: ");
                        innerchoice=sc.nextInt();
                        switch (innerchoice){
                            case 1->{
                                System.out.print("How many Mix Veg you want: ");
                                quantity=sc.nextInt();
                                total+=130*quantity;
                                bill+="Mix Veg      \t\t\t130 Rs."+"\t\t"+quantity+"\n";
                            }
                            case 2->{
                                System.out.print("How many Veg Maratha you want: ");
                                quantity=sc.nextInt();
                                total+=140*quantity;
                                bill+="Veg Maratha  \t\t\t140 Rs."+"\t\t"+quantity+"\n";
                            }
                            case 3->{
                                System.out.print("How many Panner Masala you want: ");
                                quantity=sc.nextInt();
                                total+=150*quantity;
                                bill+="Panner Masala\t\t\t150 Rs."+"\t\t"+quantity+"\n";
                            }
                            case 4->{
                                System.out.print("How many Veg Kolhapuri you want: ");
                                quantity=sc.nextInt();
                                total+=150*quantity;
                                bill+="Veg Kolhapuri\t\t\t160 Rs."+"\t\t"+quantity+"\n";
                            }
                            case 5->{
                                System.out.print("How many Panner Kopta you want: ");
                                quantity=sc.nextInt();
                                total+=130*quantity;
                                bill+="Panner Kopta \t\t\t130 Rs."+"\t\t"+quantity+"\n";
                            }
                        }
                        System.out.println("Sure Sir..Do you have more dishes y/n");
                        inneryesno=sc.next().charAt(0);
                    }while (inneryesno=='Y' || inneryesno=='y');

                }
                case 3->{
                    do {
                        System.out.println("\n>>> Cold Drink & Ice-Creams Menu <<<\n" +
                                "1)Butter      \t\t\t 10 Rs.\n" +
                                "2)Sprite      \t\t\t 20 Rs.\n" +
                                "3)Chocolate   \t\t\t 10 Rs.");
                        System.out.println("Enter choice: ");
                        innerchoice=sc.nextInt();
                        switch (innerchoice){
                            case 1->{
                                System.out.print("How many Butter ice-cream you want: ");
                                quantity=sc.nextInt();
                                total+=10*quantity;
                                bill+="Butter      \t\t\t 10 Rs."+"\t\t"+quantity+"\n";
                            }
                            case 2->{
                                System.out.print("How many Sprite you want: ");
                                quantity=sc.nextInt();
                                total+=20*quantity;
                                bill+="Sprite      \t\t\t 20 Rs."+"\t\t"+quantity+"\n";
                            }
                            case 3->{
                                System.out.print("How many Chocolate ice-cream you want: ");
                                quantity=sc.nextInt();
                                total+=10*quantity;
                                bill+="Chocolate   \t\t\t 10 Rs."+"\t\t"+quantity+"\n";
                            }
                        }
                        System.out.println("Sure Sir..Do you have more starter y/n");
                        inneryesno=sc.next().charAt(0);
                    }while (inneryesno=='Y' || inneryesno=='y');
                }
                case 4-> System.exit(0);
            }
            System.out.println("Do you have items y/n");
            outeryesno=sc.next().charAt(0);
        }while(outeryesno=='Y' || outeryesno=='y');
        System.out.println("--------------> Your Bill <----------------\n" +
                "-------------------------------------------");
        System.out.println("Item Name \t\t\t     Price\t   Quantity\n" +
                "------------------------------------------\n"+bill);
        System.out.println("------------------------------------------\n" +
                "Total      \t\t\t\t" + total+"Rs.");
        System.out.println("Thank you.....Visit again!!!!!!");
    }
}
