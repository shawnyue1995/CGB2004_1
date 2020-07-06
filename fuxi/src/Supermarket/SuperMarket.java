package Supermarket;
/*1.完成超市商品初始化。创建商品，将商品添加到集合
        2.显示来到超市能做的操作，也就是显示主菜单
        3.根据接收到的功能选项，执行对应的功能
        ????3.1.库存商品查询
        ????3.2.添加新商品?? ?
        ????3.3.删除商品
        ????3.4.修改商品
        ????3.5.退出系统,结束main方法的运行
        4.循环，回到 ?2. 显示主菜单

        以添加水果为例：对商品信息进行封装，编写FruitItem.java文件*/

import java.util.ArrayList;
import java.util.Scanner;

public class SuperMarket {
    public static void main(String[] args) {
        System.out.println("==========系统开始===========");
        ArrayList<FruitItem>  al=new ArrayList();
        //调用商品初始化方法，传递集合
        method(al);
        while (true){
            //打印菜单
            mainMeum();
            //功能选择
            chooseFun(al);
        }
    }
    //商品初始化
    public static void method(ArrayList<FruitItem> al) {
        FruitItem item1=new FruitItem();
        item1.ID=001;
        item1.name="芒果";
        item1.price=5.0;

        FruitItem item2=new FruitItem();
        item2.ID=002;
        item2.name="苹果";
        item2.price=6.0;

        FruitItem item3=new FruitItem();
        item3.ID=003;
        item3.name="香蕉";
        item3.price=7.0;

        al.add(item1);
        al.add(item2);
        al.add(item3);
    }
    //打印菜单
    public static  void mainMeum(){
        System.out.println("1:查询货物 2：添加货物 3：删除货物 4：修改货物 5：退出");
    }
    public static void chooseFun(ArrayList<FruitItem> al){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您想选择的功能：");
        int choose=input.nextInt();
        switch (choose){
            case 1://库存查询
                showList(al);
                break;
            case 2://添加库存
                addList(al);
                break;
                case 3://删除商品
                delList(al);
                break;
                case 4://修改商品
                editList(al);
                break;
                   case 5://退出系统
        System.out.println("退出系统");
                return;
                default:
                System.out.println("对不起，没有您输入的功能，请重新选择");
                break;
        }
    }
//库存查询
    public static void editList(ArrayList<FruitItem> al) {
        System.out.println("商品编号\t商品名称\t商品单价");
        for (int i = 0; i <al.size() ; i++) {
            FruitItem item=al.get(i);
            System.out.println(item.ID+"\t\t"+item.name+"\t\t"+item.price);
        }
    }
//添加库存
    public static void delList(ArrayList<FruitItem> al) {
        FruitItem item=new FruitItem();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入商品编号：");
        item.ID =input.nextInt();
        System.out.println("请输入商品名称：");
        item.name=input.nextLine();
        System.out.println("请输入商品价格：");
        item.price=input.nextDouble();
        al.add(item);
    }
//删除商品
    public static void addList(ArrayList<FruitItem> al) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要删除的商品编号：");
        int num=input.nextInt();
        for (int i = 0; i < al.size(); i++) {
            FruitItem item=al.get(i);
            if (item.ID==num){
                al.remove(item);
                return;
            }
        }
        System.out.println("对不起，没有这个编号的商品");
    }
//修改商品
    public static void showList(ArrayList<FruitItem> al) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要删除的商品编号：");
        int num=input.nextInt();
        for (int i = 0; i <al.size() ; i++) {
            FruitItem item=al.get(i);
            if (item.ID==num){
                System.out.print("请输入新的商品ID:");
                item.ID = input.nextInt();
                System.out.print("请输入新的商品名称:");
                item.name = input.next();
                System.out.print("请输入新的商品单价:");
                item.price = input.nextDouble();
                System.out.println("商品信息更新完毕!");
                return;
            }
        }
        System.out.println("对不起，没有这个编号的商品");
    }
}




