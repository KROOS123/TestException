package enumeration;

 interface Info{
      void show();
}
public class EnumSeason {
    public static void main(String[] args) {
        //values()
        Season1[] seasons= Season1.values();
        for(int i=0;i<seasons.length;i++) {
            System.out.println(seasons[i]);
        }
        //valueOf(String name)；要求传入的形参name是枚举类对象的名字，否则报参数异常
            String str1="Spring";
            Season1 season2=Season1.valueOf(str1);
            System.out.println(season2);
            season2.show();
            Season1 season3= Season1.valueOf("Summer");
            System.out.println(season3);
            season3.show();
        }
    }


//枚举类
enum Season1 {
    Spring ("spring","warm"){
        public void show(){
            System.out.println("this is a warm season");
        }

    },
    Summer ("summer","hot"){
        public void show(){
            System.out.println("these are  hot days");
        }
    },

    Autumn ("autumn","cool"),
    Winter ("winter","cold");

    //1.提供类 的属性，声明为private final

    private final String seasonName;
    private final String seasoDesc;
//2.声明为final的属性，在构造器中初始化

    private Season1(String seasonName, String seasoDesc) {
        this.seasoDesc = seasoDesc;
        this.seasonName = seasonName;
    }
//3.通过公共的方法来调用属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasoDesc() {
        return seasoDesc;
    }
public void show(){
    System.out.println("这是一个季节");
}
    //4.创建枚举类的对象



    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasoDesc='" + seasoDesc + '\'' +
                '}';
    }
}