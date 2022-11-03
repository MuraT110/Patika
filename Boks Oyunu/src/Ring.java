public class Ring {
    Fighter f1;
    Fighter f2;
    int minweight;
    int maxwight;

    public Ring(Fighter f1,Fighter f2,int minweight,int maxwight){
        this.f1=f1;
        this.f2=f2;
        this.minweight=minweight;
        this.maxwight=maxwight;
    }
    public void Run(){
        if (checkWeight()){
            while (f1.health>0&&f2.health>0){
                System.out.println("----------yeni raunt-----------");
                int chance=Math.round((float)Math.random());
                System.out.println("Chance:"+chance);
                if (chance==0){
                    f1.health=f2.hit(f1);
                    if (isWin())
                        break;
                    f2.health=f1.hit(f2);
                    if (isWin())
                        break;
                }
                printScore();
            }
        }else {
            System.out.println("sporcuların ağırlıkları uyuşmuyor");
        }
    }
    public boolean checkWeight(){
        return ((f1.weight>=minweight&&f1.weight<=maxwight)&&(f2.weight>=minweight&&f2.weight<=maxwight));
    }
    public boolean isWin(){
        if (f1.health==0){
            System.out.println("Maçı kazanan:"+f2.name);
            return true;
        } else if (f2.health==0) {
            System.out.println("Maçı kazanan:"+f2.name);
            return true;
        }
        return false;
    }
    public void printScore(){
        System.out.println(f1.name+"Kalan can \t"+f1.health);
        System.out.println(f2.name+"Kalan can \t"+f2.health);

    }
}
