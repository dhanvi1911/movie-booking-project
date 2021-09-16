import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Project_Movie implements ActionListener
{ 
   int n,c,ans,t=0; String d;
   Scanner ik = new Scanner(System.in);
   Scanner sc=new Scanner(System.in);
   Frame f1;
   Label c1,c2,c3,c4,c5,l1,l2,l3,l4,l5;
   TextField t1,t2,t3,t4,t5;
   Button b1,b2;
  public void Day()
  {System.out.println(" Kindly enter the day you wish to watch the Movie");
      System.out.println(" Sunday \t Monday \t Tuesday \t Wednesday \t Thursday \t Friday \t Saturday");
     d= ik.nextLine();
   
    }
   public void Show()
   {
          System.out.println (" WELCOME");
      System.out.println(" Please select your location:");
      System.out.println("  1. Mumbai: South & Central \n  2. Navi Mumbai  \n  3. Thane \n  ");
      int n=sc.nextInt();
      switch(n)
      { case 1:
          System.out.println(" Please select the theatre:");
          System.out.println("\n 1. Metro Inox Cinemas: Marine Lines \n 2. Inox: R City Mall Ghatkopar \n 3. Fun Cinemas: K Star mall Chembur \n 4. Movietime: Cubic Mall Chembur \n 5. PVR Cinemas: Kurla");
          int a= sc.nextInt();
          switch(a)
          { case 1:
            display();
            System.out.println(" 1. 11:15am \t 2. 5:30pm \t 3. 9:20pm ");
            int A=sc.nextInt();
            switch(A)
            { case 1:
                Project_Movie ob=new Project_Movie();
                break;
              case 2:
                Project_Movie ob1=new Project_Movie();
                break;
              case 3:
                Project_Movie ob2=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
            break;
            case 2:  
                display();
                System.out.println(" 1. 09:30am \t 2. 2:40pm \t 3. 6:30pm ");
             A=sc.nextInt();
            switch(A)
            { case 1:
                Project_Movie ob1=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob3=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice"); 
                System.exit(0);
                break;
             }
                break;
            case 3:
                 display();
                System.out.println(" 1. 12:25pm \t 2. 4:00pm \t 3. 10:30pm ");
             A=sc.nextInt();
            switch(A)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob1=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
                break;
            case 4:
                display();
                System.out.println(" 1. 10:20am \t 2. 3:45pm \t 3. 7:40pm ");
            A=sc.nextInt();
            switch(A)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob1=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
                break;
            case 5:
                display();
                System.out.println(" 1. 08:45am \t 2. 4:15pm \t 3. 7:45pm ");
            A=sc.nextInt();
            switch(A)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob1=new Project_Movie();
                break;
              default:
                System.out.println("Invalid choice");
                 System.exit(0);
                break;
             }
                break;
            default:
                System.out.println(" Sorry we are not showing in that theatre");
                 System.exit(0);
                break;
          }
          break;
      case 2:
          System.out.println(" Please select the theatre:");
          System.out.println("\n 1. Inox: Raghuleela Mall Vashi \n 2. Inox: Glomax Mall Kharghar \n 3. Carnival: Little World Mall Kharghar \n 4. Balaji Movieplex: Kopar khairane \n 5. Inox Multiplex: Vashi \n");
          int k= sc.nextInt();
          switch(k)
          { case 1:
            display();
            System.out.println(" 1. 12:00pm \t 2. 4:15pm \t 3. 9:45pm ");
            int B=sc.nextInt();
            switch(B)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob1=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
            break;
            case 2:  
                display();
                System.out.println(" 1. 11:00am \t 2. 3:30pm \t 3. 7:40pm ");
            B=sc.nextInt();
            switch(B)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob1=new Project_Movie();
                break;
              default:
                System.out.println("Invalid choice");
                 System.exit(0);
                break;
             }
                break;
            case 3:
                display();
                System.out.println(" 1. 9:25am \t 2. 2:40pm \t 3. 7:15pm ");
            B=sc.nextInt();
            switch(B)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob1=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
                break;
            case 4:
                display();
                System.out.println(" 1. 10:05am \t 2. 1:15pm \t 3. 5:50pm ");
            B=sc.nextInt();
            switch(B)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob1=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
                break;
            case 5:
                display();
                System.out.println(" 1. 9:45am \t 2. 4:55pm \t 3. 7:50pm ");
            B=sc.nextInt();
            switch(B)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob1=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
                break;
            default:
                System.out.println(" Sorry we are not showing in that theatre");
                 System.exit(0);
                break;
          }
          break;
      case 3:
          System.out.println(" Please select the theatre:");
          System.out.println("\n 1. Inox: Korum Mall \n 2. Cinepolis: Viviana Mall \n 3. Carnival Cinemas: R Mall \n 4. Cinemax: Eternity Mall \n 5. PVR Cinmeas: Nirmal Lifestyle Mall \n");
          int j= sc.nextInt();
          switch(j)
          { case 1:
                    display();
                    System.out.println(" 1. 12:15pm \t 2. 3:45pm \t 3. 8:20pm ");
            int C=sc.nextInt();
            switch(C)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob1=new Project_Movie();
                break;
              case 3:
                Project_Movie ob2=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
            break;
            case 2:  
                display();
                System.out.println(" 1. 10:15am \t 2. 3:45pm \t 3. 10:10pm ");
                C=sc.nextInt();
            switch(C)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob1=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
                break;
            case 3:
                display();
                System.out.println(" 1. 09:45am \t 2. 3:20pm \t 3. 7:10pm ");
                C=sc.nextInt();
            switch(C)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob1=new Project_Movie();
                break;
              case 3:
                Project_Movie ob2=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
                break;
            case 4:
                display();
                System.out.println(" 1. 12:00pm \t 2. 4:10pm \t 3. 6:30pm ");
                C=sc.nextInt();
            switch(C)
            { case 1:
                Project_Movie ob3=new Project_Movie();
                break;
              case 2:
                Project_Movie ob1=new Project_Movie();
                break;
              case 3:
                Project_Movie ob2=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
                break;
            case 5:
                display();
                System.out.println(" 1. 10:50am \t 2. 4:15pm \t 3. 8:40pm ");
                C=sc.nextInt();
            switch(C)
            { case 1:
                Project_Movie ob1=new Project_Movie();
                break;
              case 2:
                Project_Movie ob2=new Project_Movie();
                break;
              case 3:
                Project_Movie ob3=new Project_Movie();
                break;
              default:
                System.out.println("Invalid Choice");
                 System.exit(0);
                break;
             }
                break;
            default:
                System.out.println(" Sorry we are not showing in that theatre");
                 System.exit(0);
                break;
          }
          break;
     default:
         System.out.println(" Invalid Choice");
         System.exit(0);
         break;
    }
}
 public void Categories()
   {
     System.out.println("The Catagories we offer are:");
     System.out.println("1.Premium- ₹175");
     System.out.println("2.Gold- ₹240");
     System.out.println("3.Recliner- ₹450");
     c=ik.nextInt();  
     System.out.println("Enter The Number of Tickets You Wish To Buy: ");
     n=ik.nextInt();
     System.out.println("Do you wish to ");
     System.out.println("1.Place an order for any of our combos?");
     System.out.println("2.Proceed to Bill");
     ans= ik.nextInt();
     switch(ans)
     {
       case 1:
        f1= new Frame("Combos");
        c1= new Label ("1.Medium Popcorn + Coke(S) : Rs.125");
        l1= new Label ("Quantity:");
        t1=new TextField(3);
        c2= new Label ("2.Samosa(2pcs) + Chesse Grilled Sandwich + Coke(M) : Rs.220");
        l2= new Label ("Quantity");
        t2= new TextField(3);
        c3= new Label ("3.Cheesy Fries + Medium Popcorn + Coke(L) : Rs.225");
        l3=new Label ("Quantity");
        t3= new TextField(3);
        c4= new Label ("4.Popcorn Bucket + Nachos + Coke(L) : Rs.350");
        l4=new Label ("Quantity");
        t4= new TextField(3);
        c5= new Label ("5.Large Popcorn + Chicken Burger + Chicken Nuggets + Coke(L) : Rs.375");
        l5=new Label ("Quantity");
        t5= new TextField(3);
        b1= new Button("Confirm");
        b2= new Button("Exit");
        f1.setLayout(new FlowLayout());
        f1.add(c1);
        f1.add(l1);
        f1.add(t1);
        f1.add(c2);
        f1.add(l2);
        f1.add(t2);
        f1.add(c3);
        f1.add(l3);
        f1.add(t3);
        f1.add(c4);
        f1.add(l4);
        f1.add(t4);
        f1.add(c5);
        f1.add(l5);
        f1.add(t5);
        f1.add(b1);
        f1.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f1.setSize(600,300);
        f1.setVisible(true);
        break;
        case 2:
       if(c==1)
       {
          System.out.println("Your Final Bill Amount due is ₹"+n*175);
          System.out.println("Your seats have been reserved for "+d+".  \nKindly show the Bill in the Box Office to Proceed with the Payment. ");
          System.out.println("Thank You for choosing us!");
       }
       if(c==2)
       {
            System.out.println("Your Final Bill Amount due is ₹"+n*240);
            System.out.println("Your seats have been reserved for "+d+". \nKindly show the Bill in the Box Office to Proceed with the Payment. ");
            System.out.println("Thank You for choosing us!");
         }
        if(c==3)
        {
            System.out.println("Your Final Bill Amount due is ₹"+n*450);
            System.out.println("Your seats have been reserved for "+d+". \nKindly show the Bill in the Box Office to Proceed with the Payment. ");
            System.out.println("Thank You for choosing us!");
        }
        break;
        default: System.out.println("Invalid Choice");
        break;
    
    }
     }
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==b1)
          { 
            f1.setVisible(false);  
            String n1= t1.getText();
            int val1= Integer.parseInt(n1);
            String n2= t2.getText();
            int val2= Integer.parseInt(n2);
            String n3= t3.getText();
            int val3= Integer.parseInt(n3);
            String n4= t4.getText();
            int val4= Integer.parseInt(n4);
            String n5= t5.getText();
            int val5= Integer.parseInt(n5);
           if(c==1)
            {
             t= ((175*n)+(125*val1)+(220*val2)+(225*val3)+(350*val4)+(375*val5));
             System.out.println("Your Total Bill amount due is ₹"+t);
             System.out.println("Your seats have been reserved for "+d+" & Your Order has been placed. \nKindly show the Bill in the Box Office to Collect your Refreshments & proceed with the Payment. ");
            System.out.println("Thank You for choosing us!");
            }
           else if(c==2)
           {
             t= ((240*n)+(125*val1)+(220*val2)+(225*val3)+(350*val4)+(375*val5));
            System.out.println("Your Total Bill amount due is ₹"+t);
            System.out.println("Your seats have been reserved for "+d+" & Your Order has been placed. \nKindly show the Bill in the Box Office to Collect your Refreshments & proceed with the Payment. ");
            System.out.println("Thank You for choosing us!");
           }
           else if(c==3)
           {
             t= ((450*n)+(125*val1)+(220*val2)+(225*val3)+(350*val4)+(375*val5));
            System.out.println("Your Total Bill amount due is ₹"+t);
             System.out.println("Your seats have been reserved for "+d+" & Your Order has been placed. \nKindly show the Bill in the Box Office to Collect your Refreshments & proceed with the Payment. ");
            System.out.println("Thank You for choosing us!");
           }
        }
        if(e.getSource()==b2)
           {
            
             if(c==1)
            {
          System.out.println("Your Final Bill Amount due is ₹"+n*175);
          System.out.println("Your seats have been reserved for "+d+".\nKindly show the Bill in the Box Office to Proceed with the Payment. ");
          System.out.println("Thank You for choosing us!");
        }
         if(c==2)
        {
            System.out.println("Your Final Bill Amount due is ₹"+n*240);
            System.out.println("Your seats have been reserved for "+d+"\nKindly show the Bill in the Box Office to Proceed with the Payment. ");
            System.out.println("Thank You for choosing us!");
         }
        if(c==3)
        {
            System.out.println("Your Fianl Bill Amount due is ₹"+n*450);
            System.out.println("Your seats have been reserved for "+d+"\nKindly show the Bill in the Box Office to Proceed with the Payment. ");
            System.out.println("Thank You for choosing us!");
        }
        System.exit(0);
       }
     }
     void display()
  { Scanner sc=new Scanner(System.in);
    System.out.println("Please select the movie you would like to watch:");
    System.out.println(" 1. 3 Idiots \n 2. Chicchore \n 3. URI: The Surgical Strike \n 4. Andhadhun \n 5. Zindagi Na Milegi Dobaara \n");
    int i= sc.nextInt();
      switch(i)
     { 
         case 1:
      System.out.println(" 3 Idiots");
      System.out.println(" Description: The film is about 3 guys studying in a technological institute, their experiences, their lives in general."
                          + "\n The flick gives an insight on what not to do at IIT, just as the tagline says.");
      System.out.println(" Duration: 2h 50m ");
      System.out.println(" Rating: 9.3/10");
      System.out.println(" Cast: Aamir Khan  Sharman Joshi   R.Madhavan   Boman Irani   Kareena Kapoor");
        Day();
      System.out.println(" Available Show timings: ");
      break;
      case 2:
          System.out.println(" Chicchore");
          System.out.println(" Description: Chhichhore takes you on an exuberant and hilarious journey through college life where you meet a bunch of interesting 'losers'. "
                             + " \n They as a group go through a seamless transition from past to present and end up at a reunion they could never have thought of.");
          System.out.println(" Duration: 2h 23m ");
          System.out.println(" Rating: 8.8/10");
          System.out.println(" Cast: Sushant Singh Rajput  Varun Sharma  Naveen Polishetty  Shraddha Kapoor  Tushar Pandey  Tahir Bhasin  Saharsh Kumar  Prateik Babbar");
          Day();
          System.out.println(" Available Show timings:");
          break;
      case 3:
          System.out.println(" URI: The Surgical Strike ");
          System.out.println(" Description: URI chronicles the events of the surgical strike conducted by the suspected militants in Pakistan occupied Kashmir."
                              +" It tells the story of the 11 tumultuous events over which the operation was carried out.");
          System.out.println(" Duration: 2h 18m ");
          System.out.println(" Rating: 9.0/10");
          System.out.println(" Cast: Vicky Kaushal  Yami Gautam  Kirti Kulhari  Paresh Rawal");
           Day();
          System.out.println(" Available Show timings:");
          break;
      case 4:
          System.out.println(" Andhadhun ");
          System.out.println(" Description: A series of mysterious events take place in the life of a blind pianist."
                               + "Now he must report a crime that he never actually witnessed. ");
          System.out.println(" Duration: 2h 30m ");
          System.out.println(" Rating: 9.0/10");
          System.out.println(" Cast: Ayushmaan Khurrana  Radhika Apte  Tabu ");
           Day();
          System.out.println(" Available Show timings:");
          break;
      case 5:
          System.out.println(" Zindagi na Milegi Dobaara ");
          System.out.println(" Description: Before getting married, Kabir goes on a bachelor trip to Spain with his best friends Arjun and Imraan."
                             + "\n On their trip, the boys learn new things about themselves and gain a new perspective on love, life and relationships.");
          System.out.println(" Duration: 2h 35m ");                   
          System.out.println(" Rating: 8.6/10");
          System.out.println(" Cast: Hrithik Roshan  Farhan Akhtar  Abhay Deol  Katrina Kaif  Kalki Koechlin  Naseruddin Shah ");
          Day();
          System.out.println(" Available Show timings:");
          break;
          default:
          System.out.println("Invalid Choice");
           System.exit(0);
    }
}
void main()
{
    Project_Movie o= new Project_Movie();
    o.Show();
    o.Categories();
}
}

         

         

