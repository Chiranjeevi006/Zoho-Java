public class Seven {
    String SwitchCase(int percent){
        switch(percent/10){
            case 10:
            case 9:
            case 8:
                if(percent>=85){
                    return "Grade A";

                }else{
                    return "Grade B";

                }

            case 7:
                return "Grade B";
            case 6:
            case 5:
                return "Grade C";

            default:
                return "Fail";
        }
    }String ifloop(int percent){
        int n=percent;
        if(n>=85&&n<=100){
            return "Grade A";
        }else if(n>=70){
            return "Grade B";
        }else if(n>=50){
            return "Grade C";
        }else{
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Seven grade1=new Seven();
        Seven grade2=new Seven();
        System.out.println(grade1.SwitchCase(82));
        System.out.println(grade2.ifloop(55));
    }

}
