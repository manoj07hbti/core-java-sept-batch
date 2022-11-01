package class_and_object;

public class CollegePara {
    String clgName;
    int rollNum;
    String principle;

    public CollegePara(String clgName, int rollNum, String principle) {
        this.clgName = clgName;
        this.rollNum = rollNum;
        this.principle = principle;
    }

    public static void main(String[] args) {

        CollegePara college=new CollegePara("MPS", 1,"mukesh");
        System.out.println("clg name="+college.clgName+ ", roll number="+college.rollNum +", principle="+college.principle);

        CollegePara college2=new CollegePara("DBRAU", 2,"ramesh");
        System.out.println("clg name="+college2.clgName+ ", roll number="+college2.rollNum +", principle="+college2.principle);

    }
}
