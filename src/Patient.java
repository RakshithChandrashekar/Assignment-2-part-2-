
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
public class Patient {
    ArrayList<vital_signs> pt=new ArrayList<vital_signs>();
    private Iterator<vital_signs> vs;
    public vital_signs new_vital_Sign()
    {
        vital_signs vs=new vital_signs();
        vs.vital_signs();
        history(vs);
        return vs;
    }
    boolean isPatientNormal(vital_signs vs){
        float age=vs.age;
        int respiratoty_rate=vs.respiratoty_rate;
        int heart_rate=vs.heart_rate;
        int blood_pressure=vs.blood_pressure;
        float Kg_weight=vs.Kg_weight;
        float Lb_weight=vs.Lb_weight;
        boolean result;
        if(age==0)
        {
            if((respiratoty_rate>=30 & respiratoty_rate<=50)&(heart_rate>=120 & heart_rate<=160)&(blood_pressure>=50 & blood_pressure<=70)&(Kg_weight>=2 & Kg_weight<=3)&(Lb_weight>=4.5 & Lb_weight<=7))
            {
                result =true;
            }
            else
            {
                result =(false);
            }                        
        }
        else if (age>0 & age<1)
        {
            if((respiratoty_rate>=20 & respiratoty_rate<=30)&(heart_rate>=80 & heart_rate<=140)&(blood_pressure>=70 & blood_pressure<=100)&(Kg_weight>=4 & Kg_weight<=10)&(Lb_weight>=9 & Lb_weight<=22))
            {
                result =(true);
            }
            else
            {
                result =(false);
            }
            
        }
        else if (age>=1 & age<3)
        {
            if((respiratoty_rate>=20 & respiratoty_rate<=30)&(heart_rate>=80 & heart_rate<=130)&(blood_pressure>=80 & blood_pressure<=110)&(Kg_weight>=10 & Kg_weight<=14)&(Lb_weight>=22 & Lb_weight<=31))
            {
                result =(true);
            }
            else
            {
                result =(false);
            }
            
        }
        else if (age>=3 & age<6)
        {
            if((respiratoty_rate>=20 & respiratoty_rate<=30)&(heart_rate>=80 & heart_rate<=120)&(blood_pressure>=80 & blood_pressure<=110)&(Kg_weight>=14 & Kg_weight<=18)&(Lb_weight>=31 & Lb_weight<=40))
            {
                result =(true);
            }
            else
            {
                result =(false);
            }
            
        }
        else if (age>=6 & age<13)
        {
            if((respiratoty_rate>=20 & respiratoty_rate<=30)&(heart_rate>=70 & heart_rate<=110)&(blood_pressure>=80 & blood_pressure<=120)&(Kg_weight>=20 & Kg_weight<=42)&(Lb_weight>=41 & Lb_weight<=92))
            {
                result =(true);
            }
            else
            {
                result =(false);
            }
            
        }
        else
        {
            if((respiratoty_rate>=12 & respiratoty_rate<=20)&(heart_rate>=55 & heart_rate<=105)&(blood_pressure>=50)&(Kg_weight>50)&(Lb_weight>110))
            {
                result =(true);
            }
            else
            {
                result =(false);
            }
            
        } 
        return result;
    }
    
    void history(vital_signs vs){
        int a;
        vital_signs b;        
        pt.add(vs);
        a=pt.size();
        for(int i=0;i<a;i++)
        {
            b=pt.get(i);
        }
    }
    vital_signs last_vitalsign(String name1)
    {       
        int a;
        vital_signs b;
        vital_signs vs = null;
        a=pt.size();
        for(int i=0;i<a;i++)
        {
            b=pt.get(i);
            if(b.name.matches(name1))
            {
              vs=pt.get(a-1);  
            }
        }
        return vs;        
    }
    void details(String name){
        String abc=name;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        int a=pt.size();
        vital_signs b;
        int count=1;
        int count2=0;
        System.out.println(" ");
        System.out.println("name : "+abc);
        for(int i=0;i<a;i++)
        {
            System.out.println(" "); 
            b=pt.get(i);
            if(b.name.matches(abc)){  
            count2++;
            System.out.println("vital sign "+count);
            count++;
            if (b.age>=1){            
            System.out.println("age : "+b.age+ " year");
            }
            else
            {
               int c = (int) (b.age/0.0833334);
               System.out.println("age : "+c+ " months"); 
            }
            System.out.println("respiratory rate : "+b.respiratoty_rate);
            System.out.println("heart rate : "+b.heart_rate);
            System.out.println("blood pressure : "+b.blood_pressure);
            System.out.println("weight in kilograms : "+b.Kg_weight);
            System.out.println("weight in pounds : "+b.Lb_weight);
            System.out.println("weight in pounds : "+formatter.format(b.date));
            System.out.println(" "); 
            }
            
        }
        if(count2==0)
        {
            System.out.println("invalid patient name");
        }
        
    }
}
