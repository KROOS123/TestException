package enumeration;

public class TetsSeason {
}

//枚举类
class Season {
    //1.提供类 的属性，声明为private final

    private final String seasonName;
    private final String seasoDesc;
//2.声明为final的属性，在构造器中初始化

    private Season(String seasonName, String seasoDesc) {
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

    //4.创建枚举类的对象

    public static final Season Spring = new Season("spring", "warm");
    public static final Season Summer = new Season("summer", "hot");
    public static final Season Autumn = new Season("autumn", "cool");
    public static final Season Winter = new Season("winter", "cold");


    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasoDesc='" + seasoDesc + '\'' +
                '}';
    }
}