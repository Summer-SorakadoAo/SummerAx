package com.yr;

/**
 * @创建人：Lishunsheng
 * @创建时间：2020/5/720:30
 * @描述：
 */
public class Pockets {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Pockets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void sp(){
        Pockets pockets = new Pockets();
        pockets.setId(66);
        pockets.setName("SummerPockets");
        System.out.println(pockets.getName()+""+pockets.getId());
    }

    public static void main(String[] args) {
        Pockets pockets = new Pockets();
        pockets.sp();
    }
}
