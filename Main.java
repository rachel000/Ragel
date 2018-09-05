package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String getname,getsurname;
        String getDay, getmonth, getyear,getGender;

        System.out.println("Please Enter your FirstName:");
        getname=scanner.next();
        System.out.println("Please Enter your LastName:");
        getsurname=scanner.next();
        System.out.println("Please Enter your ID Number:");
        String sa_id = scanner.next();



        getDay = sa_id.substring(4, 6);
        getmonth=sa_id.substring(2, 4);
        getyear=sa_id.substring(0,2);//"90"
        getGender=sa_id.substring(6,10);
        //System.out.println(getyear);
        int Gender=Integer.parseInt(getGender);


        int year= Calendar.getInstance().get(Calendar.YEAR);//getting the current year

        if(getyear.startsWith("9"))//90,80    19+90=1990    080975

        {
            String addYear90= "19"+getyear;//="19" + "90"=1990
            //int addYear90 =19+getyear=19+"90"=19+"90"
            int addyearInt90=Integer.parseInt(addYear90);//this is converting the string to an integer

            int Age19=year-addyearInt90;//calculation to get the age


            System.out.println("substring year "+getyear);
            System.out.println("substring month " + getmonth);
            System.out.println("substring get the day " + getDay);
            System.out.println("The year i was born is "+addYear90);
            System.out.println("Getting the age " + Age19);
            System.out.println("Getting the gender " + getGender);


// female 0 to 4
            if(Gender>=0 && Gender<=4)//female
            {
                System.out.println("You were born on "+getDay+"/"+getmonth+"/"+addyearInt90);
                System.out.println("You are "+Age19+"years old");
                System.out.println("You are a Female");
                GettingFeMaleData(getmonth,getname,getsurname,addYear90,getDay);
            }
            else if(Gender>=5 && Gender<=9)//Male
            {
                System.out.println("You were born on "+getDay+"/"+getmonth+"/"+addyearInt90);
                System.out.println("You are "+Age19+"years old");
                System.out.println("You are a Male");
                GettingMaleData(getmonth,getname,getsurname,addYear90,getDay);
            }
            else
            {
                System.out.println("you prefer not to say ur gender");
            }
        }

        else if (getyear.startsWith("0") || getyear.startsWith("1")) //2000
        {
            String addYear20= "20"+getyear;
            int addyearint20=Integer.parseInt(addYear20);
            int Age20=year-addyearint20;
            if(Gender>=0 && Gender<=4)//female
            {

                System.out.println("You were born on "+getDay+"/"+getmonth+"/"+addyearint20);
                System.out.println("You are "+Age20+"years old");
                System.out.println("You are a Female");
                GettingFeMaleData(getmonth,getname,getsurname,addYear20,getDay);
            }
            else if(Gender>=5 && Gender<=9)//Male
            {
                System.out.println("You were born on "+getDay+"/"+getmonth+"/"+addyearint20);
                System.out.println("You are "+Age20+"years old");
                System.out.println("You are a Male");
                GettingMaleData(getmonth,getname,getsurname,addYear20,getDay);
            }
            else
            {
                System.out.println("you prefer not to say ur gender");
            }
        }

        else{
            System.out.println("you should be dead");//18th century
        }
    }

    public static void GettingFeMaleData(String getmonth,String getname,String getsurname,String addYear,String getDay) {
        if (getmonth.startsWith("01")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "January" + "/" + addYear);
            // System.out.println("I was born in march ");
        } else if (getmonth.startsWith("02")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "February" + "/" + addYear);
        } else if (getmonth.startsWith("03")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "March" + "/" + addYear);
        } else if (getmonth.startsWith("04")) {

            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "April" + "/" + addYear);
        }
        else if (getmonth.startsWith("05")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "May" + "/" + addYear);
        }
        else if (getmonth.startsWith("06")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "june" + "/" + addYear);
        } else if (getmonth.startsWith("07")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "july" + "/" + addYear);
        } else if (getmonth.startsWith("08")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "August" + "/" + addYear);

        }else if (getmonth.startsWith("09")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "September" + "/" + addYear);
        }else if (getmonth.startsWith("10")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "October" + "/" + addYear);
        }else if (getmonth.startsWith("11")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "November" + "/" + addYear);
        }else if (getmonth.startsWith("12")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " she was born on " + getDay + "/" + "December" + "/" + addYear);
        }
        else {
            System.out.println("Month does not Exit for "+ getname+" "+ getsurname);

        }
    }

    public static void GettingMaleData(String getmonth,String getname,String getsurname,String addYear,String getDay) {
        if (getmonth.startsWith("01")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "January" + "/" + addYear);
            // System.out.println("I was born in march ");
        } else if (getmonth.startsWith("02")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "February" + "/" + addYear);
        } else if (getmonth.startsWith("03")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "March" + "/" + addYear);
        } else if (getmonth.startsWith("04")) {

            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "April" + "/" + addYear);
        }
        else if (getmonth.startsWith("05")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "May" + "/" + addYear);
        }
        else if (getmonth.startsWith("06")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "june" + "/" + addYear);
        } else if (getmonth.startsWith("07")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "july" + "/" + addYear);
        } else if (getmonth.startsWith("08")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "August" + "/" + addYear);

        }else if (getmonth.startsWith("09")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "September" + "/" + addYear);
        }else if (getmonth.startsWith("10")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "October" + "/" + addYear);
        }else if (getmonth.startsWith("11")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "November" + "/" + addYear);
        }else if (getmonth.startsWith("12")) {
            System.out.println("This is the record of " + getname + " " + getsurname + " he was born on " + getDay + "/" + "December" + "/" + addYear);
        }
        else {
            System.out.println("Month does not Exit for "+ getname+" "+ getsurname);

        }

    }
}
