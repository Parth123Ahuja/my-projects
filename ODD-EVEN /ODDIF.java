import java.io.*;
class ODDIF
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader xyz= new InputStreamReader(System.in);
        BufferedReader ob= new BufferedReader(xyz);
        int a,b,d,e,i,w=0,r,cr=0,score=0,j,score1=0,w1=0;
        double c;
        System.out.println("Hiiiii WELCOME TO THE GAME OF ODD IF");
         for(j=0;j<=15;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("Enter what you would like to choose : 1 for ODD, 2 for IF");
        a=Integer.parseInt(ob.readLine());
        System.out.println("Enter your no. that you would like to show in TOSS");
        b=Integer.parseInt(ob.readLine());
        c=Math.random()*10;
        System.out.println("Computers no. for toss = "+(int)c);
        d=(int)c+b;
        if(a==1&&d%2==1||a==2&&d%2==0)
        {
            System.out.println("CONGRATULATIONS YOU HAVE WON THE TOSS");
            System.out.println("Enter what you would like todo : 1 if you want batting first , 2 if you want balling first");
            e=Integer.parseInt(ob.readLine());
        }
        else
        {
            System.out.println("SORRY U HAVE LOST THE TOSS ");
            for(j=0;j<=10;j++)
           {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
            System.out.println("THE COMPUTER WOULD LIKE TO BALL FIRST");
            for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
            System.out.println("GET PREPARED FOR BATTING");
             for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
            e=1;
        }
        System.out.println("BY THE TIME THE COMPUTER GETS READY FOR THE UPCOMING MATCH , HERE ARE THE RULES FOR THE GAME");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("PLEASE GO THROUGH THE RULES ");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("YOU HAVE 10 WICKETS IN YOUR HAND WHATEVER YOU DO BATTING OR BALLING FIRST");
        for(j=0;j<=10;j++)
        {
        for(i=0;i<=1000000000;i++)
        {
        }
       }
        System.out.println("IF YOU ARE BATTING FIRST THEN MAKE AS MUCH RUNS U CAN TILL YOU GET OUT OF 10 WICKETS");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("REMEMBER U CAN ENTER NOS. BETWEEN 0 AND 6 ONLY");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("EACH TIME U ENTER A NO. THEN THERE WILL BE A COMPUTERS REPLY WITH A NO. ");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("IF THE NO. U HAVE ENTERED MATCHES THE NO. RESPONDED BY THE COMPUTER THEN YOU WILL BE DECLARED OUT , i.e. U WILL BE AT A LOSS OF A WICKET");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("SAME WILL HAPPEN WHEN U R BALLING ");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("U WILL ENTER A NO. FIRST THEN THERE WILL BE A COMPUTERS REPLY , IF THE NO. MATCHES THE NO. U HAVE ENTERED THEN THE COMPUTER WILL BE AT A LOSS OF A WICKET");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("TRY TO TAKE THE WICKETS AS QUICKLY AS POSSIBLE");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("WHOEVER ACHIEVES THE TARGET WITH ATLEAST A WICKET IN ITS HAND WILL BE DECLARED THE WINNER OF THE MATCH");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("OK......... FINALLY THE RULES ARE OVER , THE PC IS READY FOR THE GAME ");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        System.out.println("THANK U FOR THE PATIENCE , THE MATCH WILL START WITHIN FEW SECONDS");
         for(j=0;j<=10;j++)
            {
           for(i=0;i<=1000000000;i++)
           {
           }
           }
        switch(e)
        {
            case 1: System.out.println("\t\t\t\t\t\t\t\t\tBATTING STARTS");
                    while(w!=10)
                    {
                        System.out.println("\t\t\t\t\t\t\t\t\tENTER YOUR NO.BETWEEN 1 & 6");
                        r=Integer.parseInt(ob.readLine());
                        if(r>-1&&r<7)
                        {
                            cr=(int)(Math.random()*(6-0+1))+0;
                            System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTERS NO. = "+cr);
                            if(cr==r)
                            {
                                System.out.println("\t\t\t\t\t\t\t\t\tYOU ARE OUT");
                                w++;
                                System.out.println("\t\t\t\t\t\t\t\t\tYOUR SCORE =" +score+"/"+w);
                            }
                            else
                            {
                                 score=score+r;
                                 System.out.println("\t\t\t\t\t\t\t\t\tYOUR SCORE = "+score+"/"+w);
                                }
                            }
                        else 
                            {
                              System.out.println("\t\t\t\t\t\t\t\t\tSORRY U HAVE ENTERED WRONG INPUT THEREFORE YOU LOOSE A WICKET ");
                               if(w>=0)
                                 w=w+1;
                              System.out.println("\t\t\t\t\t\t\t\t\tYOUR SCORE = "+score+"/"+w);
                        }
                        }
                    System.out.println("TOTAL RUN YOU SCORED = "+score);
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("TARGET FOR THE COMPUTER = "+(score+1));
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("OK NOW THE BATTING OF COMPUTER STARTS ");
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("TRY TO ALL OUT IT BEFORE THE TARGET");
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("WAIT FOR SOME SECONDS THE PC IS GETTING READY FOR THE MATCH");
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("OK ........ ALL SET THE COMPUTER IS READY");
                    System.out.println("\t\t\t\t\t\t\t\t\tBALLING STARTS");
                    while(w1!=10&&score1<=score)
                    {
                        System.out.println("\t\t\t\t\t\t\t\t\tENTER YOUR NO.BETWEEN 1 & 6");
                        r=Integer.parseInt(ob.readLine());
                        if(r>-1&&r<7)
                        {
                            cr=(int)(Math.random()*(6-0+1))+0;
                            System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTERS NO. = "+cr);
                            if(cr==r)
                            {
                                System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTER IS OUT");
                                w1++;
                                System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTER SCORE =" +score1+"/"+w1);
                            }
                            else
                            {
                                 score1=score1+cr;
                                 System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTER SCORE = "+score1+"/"+w1);
                                }
                            }
                        else 
                            {
                              System.out.println("\t\t\t\t\t\t\t\t\tSORRY U HAVE ENTERED WRONG INPUT THEREFORE THE COMPUTER GAINS A WICKET BACK");
                               if(w1>0)
                                 w1=w1-1;
                              System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTER SCORE = "+score1+"/"+w1);
                        }
                    }
                    System.out.println("\t\t\t\t\t\t\t\t\tTOTAL RUN YOU SCORED = "+score);
                      for(j=0;j<=10;j++)
                    {
                    for(i=0;i<=1000000000;i++)
                   {
                   }
                   }
                    System.out.println("\t\t\t\t\t\t\t\t\tTOTAL RUN SCORED BY THE COMPUTER = "+score1);
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    if(score>score1)
                    System.out.println("\t\t\t\t\t\t\t\t\tCONGRATULATIONS YOU WON THE MATCH");
                    else
                    System.out.println("\t\t\t\t\t\t\t\t\tSORRY YOU LOST THE MATCH . BETTER TRY NEXT TIME");
                     break;
            case 2:System.out.println("\t\t\t\t\t\t\t\t\tBALLING STARTS");
                    while(w1!=10)
                    {
                        System.out.println("\t\t\t\t\t\t\t\t\tENTER YOUR NO.BETWEEN 1 & 6");
                        r=Integer.parseInt(ob.readLine());
                        if(r>-1&&r<7)
                        {
                            cr=(int)(Math.random()*(6-0+1))+0;
                            System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTERS NO. = "+cr);
                            if(cr==r)
                            {
                                System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTER IS OUT");
                                w1++;
                                System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTER SCORE =" +score1+"/"+w1);
                            }
                            else
                            {
                                 score1=score1+cr;
                                 System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTER SCORE = "+score1+"/"+w1);
                                }
                            }
                        else 
                            {
                              System.out.println("\t\t\t\t\t\t\t\t\tSORRY U HAVE ENTERED WRONG INPUT THEREFORE THE COMPUTER GAINS A WICKET BACK");
                               if(w1>0)
                                 w1=w1-1;
                              System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTER SCORE = "+score1+"/"+w1);
                        }
                    }
                    System.out.println("TOTAL RUN SCORED BY COMPUTER = "+score1);
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("TARGET FOR YOU = "+(score+1));
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("OK NOW THE BATTING OF YOU STARTS ");
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("TRY TO ACHIEVE IT BEFORE THE WICKETS FALL OFF");
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("WAIT FOR SOME SECONDS THE PC IS GETTING READY FOR THE MATCH");
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("OK ........ ALL SET THE COMPUTER IS READY");
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("\t\t\t\t\t\t\t\t\tBATTING STARTS");
                    while(w!=10&&score<=score1)
                    {
                        System.out.println("\t\t\t\t\t\t\t\t\tENTER YOUR NO.BETWEEN 1 & 6");
                        r=Integer.parseInt(ob.readLine());
                        if(r>-1&&r<7)
                        {
                            cr=(int)(Math.random()*(6-0+1))+0;
                            System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTERS NO. = "+cr);
                            if(cr==r)
                            {
                                System.out.println("\t\t\t\t\t\t\t\t\tYOU ARE OUT");
                                w++;
                                System.out.println("\t\t\t\t\t\t\t\t\tYOUR SCORE =" +score+"/"+w);
                            }
                            else
                            {
                                 score=score+r;
                                 System.out.println("\t\t\t\t\t\t\t\t\tYOUR SCORE = "+score+"/"+w);
                                }
                            }
                        else 
                            {
                              System.out.println("\t\t\t\t\t\t\t\t\tSORRY U HAVE ENTERED WRONG INPUT THEREFORE YOU LOOSE A WICKET ");
                               if(w>=0)
                                 w=w+1;
                              System.out.println("\t\t\t\t\t\t\t\t\tYOUR SCORE = "+score+"/"+w);
                        }
                        }
                    System.out.println("TOTAL RUN YOU SCORED = "+score);
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    System.out.println("TOTAL RUN SCORED BY THE COMPUTER = "+score1);
                    for(i=0;i<=10;i++)
                     {
                      for(j=0;j<=100000000;j++)
                      {
                       }
                     }
                    if(score>score1)
                    System.out.println("CONGRATULATIONS YOU WON THE MATCH");
                    else
                    System.out.println("SORRY YOU LOST THE MATCH . BETTER TRY NEXT TIME");
                    break;
       }
}
}