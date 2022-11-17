package khushi_gautam.collection.Hash_Map;
import khushi_gautam.collection.model.College;
import java.util.ArrayList;
import java.util.HashMap;

public class College_HashMap {
    public HashMap<Integer, ArrayList<College>>  createCollegeInfo(){
        //todo SYNTAX: HashMap (datatype_key,datatype_value) varName = new HashMap();
        HashMap<Integer, ArrayList<College>> CollegeInfo=new HashMap<>();
        ArrayList<College> DsCollege=new ArrayList<>();
        ArrayList<College> SvCollege=new ArrayList<>();
        ArrayList<College> TRCollege=new ArrayList<>();
        ArrayList<College> AECollege=new ArrayList<>();

        College c1= new College("Ds College",1000,900,90.00);
        College c2= new College("Sv College",700,500,71.42);
        College c3= new College("TR College",800,500,62.50);
        College c4= new College("AE College",900,750,83.33);

        DsCollege.add(c1);
        SvCollege.add(c2);
        TRCollege.add(c3);
        AECollege.add(c4);

        CollegeInfo.put(1,DsCollege);
        CollegeInfo.put(2,SvCollege);
        CollegeInfo.put(3,TRCollege);
        CollegeInfo.put(4,AECollege);

        return CollegeInfo;
    }

    public static void main(String[] args) {
        College_HashMap obj= new College_HashMap();
        HashMap<Integer, ArrayList<College>>CollegeInfo =obj.createCollegeInfo();

        //todo Display result of all college of UP
        System.out.println("Result of all college of UP ");
        for (Integer var: CollegeInfo.keySet()) {
            if (var == 1) {
                System.out.println("1");
            } else if (var == 2) {
                System.out.println("2");
            } else if (var == 3) {
                System.out.println("3");
            } else if (var == 4) {
                System.out.println("4");
            }
            ArrayList<College> Clg = CollegeInfo.get(var);
            for (College c: Clg){
                System.out.println("College: "+c.getCollegeName()+", Total Student: "+c.getTotalStudents()+
                        ", Pass Student: "+c.getPassStudents()+", Ratio: "+c.getRatio());
            }
        }
        //todo Display College data which is part of UP state
        System.out.println("***********************************************************************");
        System.out.println("  ");
        System.out.println("College data which is part of UP state");
        for (Integer var: CollegeInfo.keySet()){
            if (var.equals(1)||var.equals(4)||var.equals(3)){
                ArrayList<College> Clg= CollegeInfo.get(var);
                for (College c:Clg){
                    System.out.println("College: "+c.getCollegeName()+", Total Student: "+c.getTotalStudents()+
                            ", Pass Student: "+c.getPassStudents()+", Ratio: "+c.getRatio());
                }
            }
        }
        //todo Display result of college who is having 80% passing ratio
        System.out.println("*****************************************************************************");
        System.out.println("  ");
        System.out.println("Result of college who is having 80% passing ratio");
        for (Integer var: CollegeInfo.keySet()){
            ArrayList<College> Clg= CollegeInfo.get(var);
            for (int i=0;i<Clg.size();i++){
                if (Clg.get(i).getRatio()>=80){
                    System.out.println("College: "+Clg.get(i).getCollegeName()+", Total Student: " +Clg.get(i).getTotalStudents()
                            + ", Pass Student: "+Clg.get(i).getPassStudents()+", Ratio: "+Clg.get(i).getRatio());
                }
            }
        }
    }
}
