
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class vital_signs {
    String name;
    float age;
    int respiratoty_rate;
    int heart_rate;
    int blood_pressure;
    float Kg_weight;
    float Lb_weight;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    void vital_signs()
    {
        Scanner x = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("enter the name");
        name=x.next();
        System.out.println("enter 1 to input the age of the patients in months\nenter 2 to input the age of the patients in years");
        int a= x.nextInt();
        if(a==1)
        {
            System.out.println("enter the age of the patient in months : ");
            age =x.nextFloat();
            if (age>0)
            {
                age=(float) (age*0.0833334);
            }
            
        }
        else{
            System.out.println("enter the age of the patient in years : ");
            age =x.nextFloat();            
        }
        System.out.println("enter the respiratory rate : ");
        respiratoty_rate =x.nextInt();
        System.out.println("enter the heart rate : ");
        heart_rate =x.nextInt();        
        System.out.println("enter blood pressure : ");
        blood_pressure =x.nextInt();
        System.out.println("enter the weight in kelogram");
        Kg_weight= x.nextInt();
        System.out.println("enter the weight pounds");
        Lb_weight= x.nextInt();
        System.out.println("time and date : "+formatter.format(date)); 
        System.out.println(" "); 
    }
    public static void main(String[] args)
    {
        int value=100;
        Patient p1= new Patient();
        while(value!=0)
        {
            System.out.println("Enter 1 to insert the vital sign of a patient");
            System.out.println("enter 2 to check is patient is normal");
            System.out.println("enter 3 to check the history of patients vital sign");
            System.out.println("enter 0 to exit");
            Scanner x = new Scanner(System.in);
            value=x.nextInt();
            
            switch (value) {
                case 1:
                    vital_signs vs=new vital_signs();
                    vs.vital_signs();
                    p1.history(vs);
                break;
                case 2:
                    System.out.println(" ");
                    System.out.println("enter the name of the patient");
                    String name1=x.next();
                    vital_signs vm;
                    vm=p1.last_vitalsign(name1);
                    if(vm==null)
                    {
                        System.out.println("is patient normal : false(invalid patient name)");
                        System.out.println(" ");
                    }
                    else{
                    Patient p =new Patient();
                    boolean result=p.isPatientNormal(vm);                    
                    System.out.println("is patient normal : "+result);
                    System.out.println(" ");
                    }
                break;
                case 3:
                    System.out.println(" ");
                    System.out.println("enter the name of the patient");
                    String name=x.next();
                    p1.details(name);
                break;
                
            }
            
        }
        
    }
    
}
