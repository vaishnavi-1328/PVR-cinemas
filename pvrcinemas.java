import java.util.Scanner;
import java.io.*;
public class pvrcinemas
{
    public static void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);        
        pvrcinemas obj=new pvrcinemas();        
        String changetic;
        System.out.println("                         ==========================================               ");
        System.out.println("                                   WELCOME TO  pVr  CINEMAS                        ");
        System.out.println("                            ===================================                    ");
        System.out.println();
        System.out.println("about us:");
        System.out.println("        PVR Is The Largest And The Most Premium Film And Retail Entertainment Company In India."); 
        System.out.println("Since Its Inception In 1997, The Brand Has Redefined The Way Entertainment Is Consumed In India. It Currently" );
        System.out.println("       Operates A Cinema Circuit Comprising Of 477 Screens In 107 Properties In 44 Cities Pan India.");
        try
        {
            Thread.sleep(14000);
        } catch (InterruptedException ex) {}
        do
        {     
            System.out.println();
            System.out.println();
            System.out.println("                              choose whether online or direct");
            System.out.println("                      for online type 'online' and for direct type 'direct'");            
            int f=0;
            do
            {
                String main=sc.next();
                if(main.equalsIgnoreCase("online")==true)
                obj.online();
                else if(main.equalsIgnoreCase("direct")==true)
                obj.direct();
                else
                {
                    System.out.println("wrong choice");
                    System.out.println("choose again");
                    f=1;
                }
            }while(f==1);                
            System.out.println(                     "do you want to go back to the home page to make a change in the ticket?");
            System.out.println(                     "               if yes......type'yes' or ...........type'no'");
            changetic=sc.next();
            if(changetic.equalsIgnoreCase("yes")==true)
            System.out.println('\f');
        }while(changetic.equalsIgnoreCase("yes")==true);
        int check=0;
        do{
            System.out.println("enter your mobile phone number");
            long number=sc.nextLong();
            int s=0;            
            while(number!=0)
            {
                number=number/10;
                s=s+1;
                check=0;
            }
            if(s<10||s>10)
            {
                System.out.println("number not valid");
                check=2;
            }
        }while(check==2);
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                 your ticket is booked");
        System.out.println("                                 wait for your message");
        System.out.println("                             hope you have a enjoyable time");
        
        try
               {
                   Thread.sleep(3400);
                } catch (InterruptedException ex) {}
        System.out.println('\f');
        System.out.println("                        *******************************************************************");
        System.out.println("                       *           *********   *                *   ********             *");
        System.out.println("                      *           *        *   *              *    *      *             *");
        System.out.println("                     *           *         *   *            *     *      *             *");
        System.out.println("                    *           *        *     *          *      *      *             *");
        System.out.println("                   *           *********       *        *       ********             *");
        System.out.println("                  *           *                *      *        **                   *"); 
        System.out.println("                 *           *                 *    *         *  *                 *"); 
        System.out.println("                *           *                  *  *          *   *                *");                
        System.out.println("               *           *                    *           *     *              *");  
        System.out.println("              *******************************************************************");                      
        System.out.println("                 **************************************************************");
        System.out.println();
        System.out.println();
        System.out.println("                                        PLEASE VISIT AGAIN");
        System.out.println("                                            THANKYOU");               
   }

    String language ="",name,location=" ",classh;
    int ppl=0;
    double amt=0;    
    String time=" ";
    String c="",d;
    int flag=1;    
    boolean g1,g2,g3;  
    int y,i,j;
    public void online()throws IOException//online function begins here
    { 
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        Scanner sc=new Scanner(System.in);                
        System.out.println("                                       hello!!");
        System.out.println("              if u are a existing pvr member type 1 or to create a pvr account type 2");
        pvrcinemas obj1=new pvrcinemas();
        int ckaccount,b=0;
        do
        {
            ckaccount=sc.nextInt();
            if(ckaccount==1)
            {
                obj1.proceed();//proceed function is called if user is a member
            }
            else if(ckaccount==2)
            {
                obj1.account();//account function is called if user is not a member
            } 
            else
            {
                System.out.println("wrong choice");
                System.out.println("choose again");
                b=1;
            }
        }while(b==1);            
        System.out.println();
        System.out.println();               
        String Hindimoviesname[]={"katti batti","katti batti","welcome back","welcome back","welcome back","time out","time out","tamasha"};
        String locationh[]={"mantri mall","orion mall","pheonix mall","orion mall","jayanagar","forum mall","pheonix mall","m.s.r.regalia"};
        String timeh[]={"11.30am","10.15am","5.10pm","6.00pm","8.30am","5.30pm","9.00am","8.30pm"};
        int nornalticeth[]={120,150,100,120,100,150,120,120};
            
        String Englishmoviesname[]={"goal","everest","everest","maze runner","the martian","the martian","the intern","the intern","maze runner","spectre","legend"};
        String locatione[]={"forum mall","pheonix mall","orion mall","market city","s.s.spirit","msr regalia","mantri mall","orion mall","orion mall","koramangala","garuda mall"};
        String timee[]={"10.00am","8.00am","11.10pm","7.10pm","9.30am","2.30pm","5.10pm","7.30pm","12.00pm","8.30pm","9.00pm"};
        int nornalticete[]={200,250,210,270,290,210,250,250,290,300,250};                  

        String regionalmoviesname[]={"puli","puli","maya","aatagara","tamistra","shivam","shivam","dishyam","papanasam"};
        String locationr[]={"forum mall","pheonix mall","orion mall","market city","s.s.spirit","msr regalia","mantri mall","orion mall","orion mall"} ;           
        String timer[]={"11.00am","8.45pm","9.10pm","8.00pm","9.30pm","3.00pm","4.30pm","5.25pm","7.30pm"};
        int nornalticetr[]={200,250,210,270,290,210,250,250,290};        
       
        do
        {
            System.out.println("                choose the language");
            System.out.println("                1)  Hindi");
            System.out.println("                2)  English");
            System.out.println("                3)  Regional (be careful in coping the spellings properly)");
            language=br.readLine();
            g1=language.equalsIgnoreCase("hindi")||language.equalsIgnoreCase("1");
            g2=language.equalsIgnoreCase("english")||language.equalsIgnoreCase("2");
            g3=language.equalsIgnoreCase("regional")||language.equalsIgnoreCase("3");
            System.out.println();
             System.out.println();
              System.out.println();            
            System.out.println();
            if(g1==true)//to display the hindi movies provided
            {
                System.out.println("                                        CHOOSE AMONG THE FOLLOWING:");
              String Hindimovies[][]= 
              {{"        |  name:        |","location:    |","time:    |"," prime:|","   silver: |","  gold: |"},
               {"        | katti batti   |","mantri mall  |","11.30am  |","  120  |","    320    |","  720   |"},
               {"        | katti batti   |","orion mall   |","10.15am  |","  150  |","    350    |","  750   |"},
               {"        | welcome back  |","pheonix mall |","5.10pm   |","  100  |","    300    |","  700   |"},
               {"        | welcome back  |","orion mall   |","6.00pm   |","  120  |","    320    |","  720   |"},
               {"        | welcome back  |","jayanagar    |","8.30am   |","  100  |","    300    |","  700   |"},
               {"        | time out      |","forum mall   |","5.30pm   |","  150  |","    350    |","  750   |"},
               {"        | time out      |","pheonix mall |","9.00am   |","  120  |","    320    |","  720   |"},
               {"        | tamasha       |","m.s.r.regalia|","8.30 pm  |","  120  |","    320    |","  720   |"}};
            for( i=0;i<=8;i++)
            {
                for( j=0;j<=5;j++)
                {
                   System.out.print(Hindimovies[i][j]+" ");
                }
                System.out.println();
            }
            flag=2;
           }
           

           else if(g2==true)//to display the english movies provided
           {
               System.out.println("                                        CHOOSE AMONG THE FOLLOWING:");
               String Englishmovies[][]=
               {{ "    |name:       | ","location:    |","time:    |"," prime: |","silver:|","   gold :|"},
                { "    |goal        | ","forum mall   |","10.00am  |","  200   |","  300  |","    600  |"},
                { "    |everest     | ","pheonix mall |","8.00am   |","  250   |","  350  |","    750  |"},
                { "    |everest     | ","orion mall   |","11.10pm  |","  210   |","  310  |","    710  |"},
                { "    |maze runner | ","market city  |","7.10pm   |","  270   |","  370  |","    770  |"},
                { "    |the martian | ","s.s.spirit   |","9.30am   |","  290   |","  390  |","    790  |"},
                { "    |the martian | ","msr regalia  |","2.30pm   |","  210   |","  310  |","    710  |"},
                { "    |the intern  | ","mantri mall  |","5.10pm   |","  250   |","  350  |","    750  |"},
                { "    |the intern  | ","orion mall   |","7.30pm   |","  250   |","  350  |","    750  |"},
                { "    |maze runner | ","orion mall   |","12.00pm  |","  290   |","  390  |","    790  |"},
                { "    |spectre     | ","koramangala  |","8.30pm   |","  300   |","  400  |","    800  |"},
                { "    |legend      | ","garuda mall  |","9.00pm   |","  250   |","  350  |","    750  |"}};
            
            for( i=0;i<=11;i++)
            {
                for( j=0;j<=5;j++)
                {
                    System.out.print(Englishmovies[i][j]+" ");
                }
                System.out.println();
            }
            flag=2;
           }
        
           
           
           else  if(g3==true)//to display the regional movies provided
            {
                System.out.println("                                        CHOOSE AMONG THE FOLLOWING:");
                String regionalmovies[][]=
               {{ "  |name:       |","location:    |","time:    |"," prime: |","silver:  | ","   gold: |"},
                { "  |puli        |","forum mall   |","11.00am  |","  200   |","  300    |","     600  |"},
                { "  |puli        |","pheonix mall |","8.45pm   |","  250   |","  350    |","     750  |"},
                { "  |maya        |","orion mall   |","9.10pm   |","  210   |","  310    |","     710  |"},
                { "  |tani oruvan |","market city  |","8.00pm   |","  270   |","  370    |","     770  |"},
                { "  |tamistra    |","s.s.spirit   |","9.30pm   |","  290   |","  390    |","     790  |"},
                { "  |shivam      |","msr regalia  |","3.00pm   |","  210   |","  310    |","     710  |"},
                { "  |shivam      |","mantri mall  |","4.30pm   |","  250   |","  350    |","     750  |"},
                { "  |drishyam    |","orion mall   |","5.25pm   |","  250   |","  350    |","     750  |"},
                { "  |papanasam   |","orion mall   |","7.30pm   |","  290   |","  390    |","     790  |"}};
            for( i=0;i<=9;i++)
            {
                for( j=0;j<=5;j++)
                {
                    System.out.print(regionalmovies[i][j]+" ");
                }
                System.out.println();
            }
            flag=2;          
           }
          else//to allow the user to make another choice if he makes a wrong choice
           {
               System.out.println(" you have made a wrong choice");
               try
               {
               Thread.sleep(1000);
              } catch (InterruptedException ex) {}
               flag=1;
           }
           System.out.println();
           System.out.println();             
           if(flag==2)//to allow the user make another choice to select the language
           {
               System.out.println("press 'yes' to choose the language again or to 'no' to continue");
               d=sc.next();
               if(d.equalsIgnoreCase("yes"))
               flag=1;
               else
               flag=2;
            }
        }while(flag==1);
        System.out.println();
        System.out.println();                               
        System.out.println();
        System.out.println("enter name of movie");
        name=br.readLine();
        System.out.println("enter location");
        location=br.readLine();
        System.out.println("enter class     (type 'prime','silver' or 'gold')");
        classh=br.readLine();
        System.out.println("enter no. of ppl");
        ppl=Integer.parseInt(br.readLine());
        if(language.equalsIgnoreCase("hindi"))//to calculate the amount for hindi movies
        {
            for( y=0;y<9;y++)
            {
                if(Hindimoviesname[y].equalsIgnoreCase(name)&&locationh[y].equalsIgnoreCase(location))
                {
                    time=timeh[y];
                    if(classh.equalsIgnoreCase("prime")==true)
                    {
                         c="prime";
                        amt=nornalticeth[y]*ppl;
                    }
                    else if(classh.equalsIgnoreCase("silver")==true)
                    {
                         c="silver";
                        amt=(nornalticeth[y]+200)*ppl;
                    }
                    else
                    {
                         c="gold";
                        amt=((nornalticeth[y]+600)*ppl);
                    }
                    break;
                }                
            }
        }
        else if(language.equalsIgnoreCase("english"))//to calculate  the amount for english movies
        {
            for( y=0;y<10;y++)
            {
                if(Englishmoviesname[y].equalsIgnoreCase(name)&&locatione[y].equalsIgnoreCase(location))
                {
                    time=timee[y];
                    if(classh.equalsIgnoreCase("prime")==true)
                    {
                         c="prime";
                        amt=nornalticete[y]*ppl;
                    }

                    else if(classh.equalsIgnoreCase("silver")==true)
                    {
                        c="silver";
                        amt=(nornalticete[y]+200)*ppl;
                    }
                    else
                    {
                         c="gold";
                        amt=((nornalticete[y]+600)*ppl);
                    }
                    break;
                }                
            }
        }
        else if(language.equalsIgnoreCase("regional"))//to calculate  the amount for regional movies
        {
            for( y=0;y<12;y++)
            {
                if(regionalmoviesname[y].equalsIgnoreCase(name)&&locationr[y].equalsIgnoreCase(location))
                {
                    time=timer[y];
                    if(classh.equalsIgnoreCase("prime")==true)
                    {
                         c="prime";
                        amt=nornalticetr[y]*ppl;
                    }

                    else if(classh.equalsIgnoreCase("silver")==true)
                    {
                         c="silver";
                        amt=(nornalticetr[y]+200)*ppl;
                    }
                    else
                    {
                         c="gold";
                        amt=((nornalticetr[y]+600)*ppl);
                    }
                    break;
                }                
            }
        }

        System.out.println();
        System.out.println();            
        System.out.println( "                            NOW ITS TIME FOR SOME GAMING !!!" );
        System.out.println( "                  GET SOME DISCOUNTS BY TYPING ANY SINGLE DIGIT NUMBER");
        int x=sc.nextInt();
        double discount=0;        
        switch(x)//to clalculate the discount
        {
            case(1):
            discount=(10/100)*amt;
            amt=amt-discount;
            System.out.println("congrats !!! you have got 10% discount");
            break;
            case(2):
            discount=35/100*amt;
            amt=amt-discount;
            System.out.println("congrats !!! you have got 35% discount");
            break;
            case(3):
            discount=40/100*amt;
            amt=amt-discount;
            System.out.println("congrats !!! you have got 40% discount");
            break;
            case(4):
            discount=20/100*amt;
            amt=amt-discount;
            System.out.println("congrats !!! you have got 20% discount");
            break;
            case(5):
            discount=25/100*amt;
            amt=amt-discount;
            System.out.println("congrats !!! you have got 25% discount");
            break;
            case(6):
            discount=30/100*amt;
            amt=amt-discount;
            System.out.println("congrats !!! you have got 30% discount");
            break;
            case(7):
            discount=50/100*amt;
            amt=amt-discount;
            System.out.println("congrats !!! you have got 50% discount");
            break;
            case(8):
            discount=5/100*amt;
            amt=amt-discount;
            System.out.println("congrats !!! you have got 5% discount");
            break;
            case(9):
            discount=15/100*amt;
            amt=amt-discount;
            System.out.println("congrats !!! you have got 15% discount");
            break;
            default:
            System.out.println("sorry wrong choice");
        }
        int k=54;
        amt=amt+25;
        amt=amt+amt*0.09;
        System.out.println();
        System.out.println();
        System.out.println("name                    :"+name);
        System.out.println("location                :"+location);
        System.out.println("time                    :"+time);
        System.out.println("class                   :"+c);
        System.out.println("online payment charges  :25");
        System.out.println("no.of ppl               :"+ppl);         
        System.out.println("tax                     :9%");
        System.out.println("total amt               :"+amt);
        System.out.print("seat no.                :");
        for(int i=1;i<=ppl;i++)
        System.out.print(k+++",");
        System.out.println();
        System.out.println();
        System.out.println();
    }
    String usname,password,emailid;
    long accountno;
    public void proceed()throws IOException//proceed function begins here
    {
        Scanner sc=new Scanner(System.in);
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("enter your NAME");
        usname=br.readLine();
        System.out.println("enter your ACCOUNT.NO");        
        accountno=sc.nextLong();
        System.out.println("enter the PASSWORD of your pvr account ");
        password=br.readLine();
        System.out.println("enter your EMAIL-ID");
        emailid=br.readLine();
        System.out.println();       
        System.out.println("                                           hi.......");
        System.out.println();
    }       
    public void account()throws IOException//account function begins here
    {
        System.out.println("                           welcome to pvr cinemas online booking programme");
        Scanner sc=new Scanner(System.in);
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        try
               {
                   Thread.sleep(1900);
                } catch (InterruptedException ex) {}
        System.out.println("enter your NAME");
        usname=sc.next();       
        System.out.println("enter your bank ACCOUNT.NO");
        accountno=sc.nextLong();
        System.out.println("enter your EMAIL-ID");
        emailid=br.readLine();
        System.out.println("enter yor PASSWORD for your new account");
        password =br.readLine();
        System.out.println("                                your accont is created");
        System.out.println("                          thankyou for being a part of the pvr");
        try
        {
           Thread.sleep(1000);
        } catch (InterruptedException ex) {}
    } 
    public void  direct()throws IOException//direct function begins here
    { 
        Scanner sc=new Scanner(System.in);
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println();
        System.out.println();                               
        String Hindimoviesname[]={"katti batti","katti batti","welcome back","welcome back","welcome back","time out","time out"};
        String locationh[]={"mantri mall","orion mall","pheonix mall","orion mall","jayanagar","forum mall","pheonix mall"};
        String timeh[]={"11.30am","10.15am","5.10m","6.00pm","8.30am","5.30pm","9.00am"};
        int nornalticeth[]={120,150,100,120,100,150,120};
            
        String Englishmoviesname[]={"goal","everest","everest","maze runner","the martian","the martian","the intern","the intern","maze runner"};
        String locatione[]={"forum mall","pheonix mall","orion mall","market city","s.s.spirit","msr regalia","mantri mall","orion mall","orion mall"};
        String timee[]={"10.00am","8.00am","11.10pm","7.10pm","9.30am","2.30pm","5.10pm,7.30pm,12pm"};
        int nornalticete[]={200,250,210,270,290,210,250,250,290};                  

        String regionalmoviesname[]={"puli","puli","maya","aatagara","tamistra","shivam","shivam","dishyam","papanasam"};
        String locationr[]={"forum mall","pheonix mall","orion mall","market city","s.s.spirit","msr regalia","mantri mall","orion mall","orion mall"} ;           
        String timer[]={"11.00am","8.45pm","9.10pm","8.00pm","9.30pm","3.00pm","4.30pm","10.30pm","7.30pm"};
        int nornalticetr[]={200,250,210,270,290,210,250,250,290};         
        do
        {
            System.out.println("                choose the language");
            System.out.println("                1)  Hindi");
            System.out.println("                2)  English");
            System.out.println("                3)  Regional (be careful in coping the spellings properly)");
            language=sc.nextLine();
            g1=language.equalsIgnoreCase("hindi");
            g2=language.equalsIgnoreCase("english");
            g3=language.equalsIgnoreCase("regional");
            
            
            System.out.println();
            System.out.println();
            System.out.println();           
            System.out.println();
            if(g1==true)//to display hindi movies
            {
               System.out.println("                                        CHOOSE AMONG THE FOLLOWING:");
              String Hindimovies[][]= 
              {{"        |  name:        |","location:    |","time:    |"," prime:|","   silver: |","  gold: |"},
               {"        | katti batti   |","mantri mall  |","11.30am  |","  120  |","    320    |","  720   |"},
               {"        | katti batti   |","orion mall   |","10.15am  |","  150  |","    350    |","  750   |"},
               {"        | welcome back  |","pheonix mall |","5.10pm   |","  100  |","    300    |","  700   |"},
               {"        | welcome back  |","orion mall   |","6.00pm   |","  120  |","    320    |","  720   |"},
               {"        | welcome back  |","jayanagar    |","8.30am   |","  100  |","    300    |","  700   |"},
               {"        | time out      |","forum mall   |","5.30pm   |","  150  |","    350    |","  750   |"},
               {"        | time out      |","pheonix mall |","9.00am   |","  120  |","    320    |","  720   |"}};
            for(int i=0;i<=7;i++)
            {
                for(int j=0;j<=5;j++)
                {
                   System.out.print(Hindimovies[i][j]+" ");
                }
                System.out.println();
            }
            flag=2;
            }
           

           else if(g2==true)//to display english movies
           {
                System.out.println("                                        CHOOSE AMONG THE FOLLOWING:");
               String Englishmovies[][]=
               {{ "    |name:       | ","location:    |","time:    |"," prime: |","silver:|","   gold :|"},
                { "    |goal        | ","forum mall   |","10.00am  |","  200   |","  300  |","    600  |"},
                { "    |everest     | ","pheonix mall |","8.00am   |","  250   |","  350  |","    750  |"},
                { "    |everest     | ","orion mall   |","11.10pm  |","  210   |","  310  |","    710  |"},
                { "    |maze runner | ","market city  |","7.10pm   |","  270   |","  370  |","    770  |"},
                { "    |the martian | ","s.s.spirit   |","9.30am   |","  290   |","  390  |","    790  |"},
                { "    |the martian | ","msr regalia  |","2.30pm   |","  210   |","  310  |","    710  |"},
                { "    |the intern  | ","mantri mall  |","5.10pm   |","  250   |","  350  |","    750  |"},
                { "    |the intern  | ","orion mall   |","7.30pm   |","  250   |","  350  |","    750  |"},
                { "    |maze runner | ","orion mall   |","12.00pm  |","  290   |","  390  |","    790  |"}};
            for( i=0;i<=9;i++)
            {
                for( j=0;j<=5;j++)
                {
                    System.out.print(Englishmovies[i][j]+" ");
                }
                System.out.println();
            }
            flag=2;
           }
           
           
           else  if(g3==true)//to display regional movies
            {
                System.out.println("                                        CHOOSE AMONG THE FOLLOWING:");
                String regionalmovies[][]=
               {{ "  |name:       |","location:    |","time:    |"," prime: |","silver:  | ","   gold: |"},
                { "  |puli        |","forum mall   |","11.00am  |","  200   |","  300    |","     600  |"},
                { "  |puli        |","pheonix mall |","8.45pm   |","  250   |","  350    |","     750  |"},
                { "  |maya        |","orion mall   |","9.10pm   |","  210   |","  310    |","     710  |"},
                { "  |tani oruvan |","market city  |","8.00pm   |","  270   |","  370    |","     770  |"},
                { "  |tamistra    |","s.s.spirit   |","9.30pm   |","  290   |","  390    |","     790  |"},
                { "  |shivam      |","msr regalia  |","3.00pm   |","  210   |","  310    |","     710  |"},
                { "  |shivam      |","mantri mall  |","4.30pm   |","  250   |","  350    |","     750  |"},
                { "  |drishyam    |","orion mall   |","5.25pm   |","  250   |","  350    |","     750  |"},
                { "  |papanasam   |","orion mall   |","7.30pm   |","  290   |","  390    |","     790  |"}};
            for( i=0;i<10;i++)
            {
                for(j=0;j<=5;j++)
                {
                    System.out.print(regionalmovies[i][j]+" ");
                }
                System.out.println();
            }
            flag=2;
           }
           else//to allow the user make another choice if he makes a wrong choice
           {
               System.out.println(" you have made a wrong choice");
               try
               {
                Thread.sleep(1000);
                 } catch (InterruptedException ex) {}
               flag=1;
           }
           System.out.println();
           System.out.println();   
           if(flag==2)//to allow the user make another choice if he wants to choose language again
           {
               System.out.println(" press 'yes' to choose the language again or to 'no' to continue");
               d=sc.next();
               if(d.equalsIgnoreCase("yes"))
               flag=1;
               else
               flag=2;
            }
        }while(flag==1); 
        System.out.println();
        System.out.println("enter name of movie");
        name=br.readLine();
        System.out.println("enter location");
        location=br.readLine();
        System.out.println("enter class     (type 'prime','silver' or 'gold')");
        classh=br.readLine();
        System.out.println("enter no. of ppl");
        ppl=Integer.parseInt(br.readLine());       
        if(language.equalsIgnoreCase("hindi"))//to calculate  the amount for hindi movies
        {
            for(y=0;y<9;y++)
            {
                if(Hindimoviesname[y].equalsIgnoreCase(name)&&locationh[y].equalsIgnoreCase(location))
                {
                    time=timeh[y];
                    if(classh.equalsIgnoreCase("prime")==true)
                    {
                         c="prime";
                        amt=nornalticeth[y]*ppl;
                    }
                    else if(classh.equalsIgnoreCase("silver")==true)
                    {
                         c="silver";
                        amt=(nornalticeth[y]+200)*ppl;
                    }
                    else
                    {
                         c="gold";
                        amt=((nornalticeth[y]+600)*ppl);
                    }
                    break;
                }                
            }
        }
        else if(language.equalsIgnoreCase("english"))//to calculate  the amount for english movies
        {
            for(y=0;y<7;y++)
            {
                if(Englishmoviesname[y].equalsIgnoreCase(name)&&locatione[y].equalsIgnoreCase(location))
                {
                    time=timee[y];
                    if(classh.equalsIgnoreCase("prime")==true)
                    {
                         c="prime";
                        amt=nornalticete[y]*ppl;
                    }

                    else if(classh.equalsIgnoreCase("silver")==true)
                    {
                        c="silver";
                        amt=(nornalticete[y]+200)*ppl;
                    }
                    else
                    {
                         c="gold";
                        amt=((nornalticete[y]+600)*ppl);
                    }
                    break;
                }                
            }
        }
        else//to calculate  the amount for regional movies
        {
            for( y=0;y<9;y++)
            {
                if(regionalmoviesname[y].equalsIgnoreCase(name)&&locationr[y].equalsIgnoreCase(location))
                {
                    time=timer[y];
                    if(classh.equalsIgnoreCase("prime")==true)
                    {
                         c="prime";
                        amt=nornalticetr[y]*ppl;
                    }

                    else if(classh.equalsIgnoreCase("silver")==true)
                    {
                         c="silver";
                        amt=(nornalticetr[y]+200)*ppl;
                    }
                    else
                    {
                         c="gold";
                        amt=((nornalticetr[y]+600)*ppl);
                    }
                    break;
                }                
            }
        }
        int i,k=64;
        amt=amt+amt*0.09;
        System.out.println();
        System.out.println();
        System.out.println("name       :"+name);
        System.out.println("location   :"+location);
        System.out.println("time       :"+time);
        System.out.println("class      :"+c);
        System.out.println("no.of ppl  :"+ppl);         
        System.out.println("tax        :9%");
        System.out.println("total amt  :"+amt);
        System.out.print("seat no.   :");
        for(i=1;i<=ppl;i++)
        System.out.print(k+++",");
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
    
    
    
            
        
    
            