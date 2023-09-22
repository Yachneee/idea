package day4_824.Marry;

/**
 * @author Administrator
 */
public class Cab {
    private static final char MAN='男';
    private static final char WOMAN='女';
    private static final int MAN_AGE=22;
    private static final int WOMAN_AGE=20;

    public boolean canMarry(Person p1,Person p2){
        return judgeAgeAndMarried(p1) && judgeAgeAndMarried(p2)
                && (p1.getGender().equals(MAN) && p2.getGender().equals(WOMAN))
                || (p1.getGender().equals(WOMAN) && p2.getGender().equals(MAN));
    }
    private boolean judgeAgeAndMarried(Person p){
        if(!p.getMarried()){
            if(p.getGender().equals(MAN)){
                return p.getAge() >= MAN_AGE;
            }else if(p.getGender().equals(WOMAN)){
                return p.getAge() >= WOMAN_AGE;
            }
        }
        return false;
    }
}
