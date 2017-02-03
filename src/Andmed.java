import java.util.ArrayList;

/**
 * Created by kirstin on 02/02/2017.
 */
public class Andmed {
    ArrayList <String> nimed = new ArrayList<>();
    ArrayList <String> tulemused = new ArrayList<>();
    double positiivneHinne;

     public Andmed (){
         int [] tulemused = new int[70];
     }

     public void lisaandmed (String a, String b){
         nimed.add(a);
         tulemused.add(b);

         for (int i=0; i<tulemused.size(); i++){
             System.out.println(nimed.get(i)+": "+tulemused.get(i));
         }
     }
     public int tulemusteArv(){

         int kokku = tulemused.size();

         return kokku;

     }

     public double kuiPaljuSaiLabi(){
         int count = 0;
         for (int i=0; i<tulemused.size(); i++){
             if(Integer.parseInt(tulemused.get(i))>50){
                 count++;
             }}
         System.out.println(count);
         double tulemus=tulemused.size();
             positiivneHinne=(count/tulemus)*100;
         System.out.println(positiivneHinne);

             return positiivneHinne;
    }

    public String raskusAsteSobivus(){
        double arv = 70;
        if (positiivneHinne>=arv){
            String raskusAste = new String("sobiv");
            return raskusAste;
        }
        else {
            String raskusAste = new String("mittesobiv");
            return raskusAste;
        }
    }
    public String parimTulemus(){
        int max = 0;
        for (int i=0; i<tulemused.size(); i++){
            int tempMax=Integer.parseInt(tulemused.get(i));
            if(tempMax>max){
                max=tempMax;
            }
        }
        String nimi="";
        for (int j=0; j<tulemused.size(); j++){
            if (max==Integer.parseInt(tulemused.get(j))){
                nimi=nimed.get(j);
            }
        }
        String string = nimi+" sai kõrgeimad punktid. Tema punktiskoor oli "+max;
     return string;
    }
}
