package Supermarket;
/*1.��ɳ�����Ʒ��ʼ����������Ʒ������Ʒ��ӵ�����
        2.��ʾ�������������Ĳ�����Ҳ������ʾ���˵�
        3.���ݽ��յ��Ĺ���ѡ�ִ�ж�Ӧ�Ĺ���
        ????3.1.�����Ʒ��ѯ
        ????3.2.�������Ʒ?? ?
        ????3.3.ɾ����Ʒ
        ????3.4.�޸���Ʒ
        ????3.5.�˳�ϵͳ,����main����������
        4.ѭ�����ص� ?2. ��ʾ���˵�

        �����ˮ��Ϊ��������Ʒ��Ϣ���з�װ����дFruitItem.java�ļ�*/

import java.util.ArrayList;
import java.util.Scanner;

public class SuperMarket {
    public static void main(String[] args) {
        System.out.println("==========ϵͳ��ʼ===========");
        ArrayList<FruitItem>  al=new ArrayList();
        //������Ʒ��ʼ�����������ݼ���
        method(al);
        while (true){
            //��ӡ�˵�
            mainMeum();
            //����ѡ��
            chooseFun(al);
        }
    }
    //��Ʒ��ʼ��
    public static void method(ArrayList<FruitItem> al) {
        FruitItem item1=new FruitItem();
        item1.ID=001;
        item1.name="â��";
        item1.price=5.0;

        FruitItem item2=new FruitItem();
        item2.ID=002;
        item2.name="ƻ��";
        item2.price=6.0;

        FruitItem item3=new FruitItem();
        item3.ID=003;
        item3.name="�㽶";
        item3.price=7.0;

        al.add(item1);
        al.add(item2);
        al.add(item3);
    }
    //��ӡ�˵�
    public static  void mainMeum(){
        System.out.println("1:��ѯ���� 2����ӻ��� 3��ɾ������ 4���޸Ļ��� 5���˳�");
    }
    public static void chooseFun(ArrayList<FruitItem> al){
        Scanner input=new Scanner(System.in);
        System.out.println("����������ѡ��Ĺ��ܣ�");
        int choose=input.nextInt();
        switch (choose){
            case 1://����ѯ
                showList(al);
                break;
            case 2://��ӿ��
                addList(al);
                break;
                case 3://ɾ����Ʒ
                delList(al);
                break;
                case 4://�޸���Ʒ
                editList(al);
                break;
                   case 5://�˳�ϵͳ
        System.out.println("�˳�ϵͳ");
                return;
                default:
                System.out.println("�Բ���û��������Ĺ��ܣ�������ѡ��");
                break;
        }
    }
//����ѯ
    public static void editList(ArrayList<FruitItem> al) {
        System.out.println("��Ʒ���\t��Ʒ����\t��Ʒ����");
        for (int i = 0; i <al.size() ; i++) {
            FruitItem item=al.get(i);
            System.out.println(item.ID+"\t\t"+item.name+"\t\t"+item.price);
        }
    }
//��ӿ��
    public static void delList(ArrayList<FruitItem> al) {
        FruitItem item=new FruitItem();
        Scanner input=new Scanner(System.in);
        System.out.println("��������Ʒ��ţ�");
        item.ID =input.nextInt();
        System.out.println("��������Ʒ���ƣ�");
        item.name=input.nextLine();
        System.out.println("��������Ʒ�۸�");
        item.price=input.nextDouble();
        al.add(item);
    }
//ɾ����Ʒ
    public static void addList(ArrayList<FruitItem> al) {
        Scanner input=new Scanner(System.in);
        System.out.println("������Ҫɾ������Ʒ��ţ�");
        int num=input.nextInt();
        for (int i = 0; i < al.size(); i++) {
            FruitItem item=al.get(i);
            if (item.ID==num){
                al.remove(item);
                return;
            }
        }
        System.out.println("�Բ���û�������ŵ���Ʒ");
    }
//�޸���Ʒ
    public static void showList(ArrayList<FruitItem> al) {
        Scanner input=new Scanner(System.in);
        System.out.println("������Ҫɾ������Ʒ��ţ�");
        int num=input.nextInt();
        for (int i = 0; i <al.size() ; i++) {
            FruitItem item=al.get(i);
            if (item.ID==num){
                System.out.print("�������µ���ƷID:");
                item.ID = input.nextInt();
                System.out.print("�������µ���Ʒ����:");
                item.name = input.next();
                System.out.print("�������µ���Ʒ����:");
                item.price = input.nextDouble();
                System.out.println("��Ʒ��Ϣ�������!");
                return;
            }
        }
        System.out.println("�Բ���û�������ŵ���Ʒ");
    }
}




