package guibing;

import java.util.Arrays;

public class MergetSort {
    public static void main(String[] args) {
        int arr[]={8,4,5,7,1,3,6,2};
        int temp[]=new int[arr.length];//�鲢������Ҫһ������Ŀռ�
        mergeSort(arr,0,arr.length-1,temp);

        System.out.println("�鲢�����:"+ Arrays.toString(arr));
        }
        //��+�ϵķ���
        public static void mergeSort(int[] arr ,int left,int right, int[] temp){
            if (left<right){
                int mid=(left+right)/2;//�м������
                //����ݹ���зֽ�
                mergeSort(arr,left,mid,temp);
                //���ҵݹ���зֽ�
                mergeSort(arr, mid+1, right, temp);
                //���ϲ�
                merge(arr,left,mid,right,temp);

            }
        }

        //�ϲ��ķ���
    /*
        arr�����ԭʼ����
        left����������еĳ�ʼ����
        right�ұ�����
        mid�м�����
        temp��ת������
     */
    public static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i =left;//��ʼ��i,����������еĳ�ʼ����
        int j=mid+1;//��ʼ��j,�ұ��������еĳ�ʼ����
        int t=0;//ָ��temp����ĵ�ǰ����

        //�Ȱ���������(����)�����ݰ��չ�����䵽temp����
        //ֱ���������ߵ�����������һ�ߴ������Ϊֹ
        while(i<=mid && j<=right){//����
            //�����ߵ��������еĵ�ǰԪ��,С�ڵ����ұߵ��������еĵ�ǰԪ��
            //������ߵĵ�ǰԪ��,������temp����
            if (arr[i]<=arr[j]){
                temp[t]=arr[i];
                t +=1;
                i +=1;
            }else{//��֮,���ұ��������еĵ�ǰԪ��,��䵽temp����
                temp[t]=arr[j];
                t +=1;
                j +=1;
            }
        }

        //����ʣ�����ݵ�һ�ߵ���������ȫ����䵽temp
        while (i<=mid){//��ߵ��������л���ʣ���Ԫ��,��ȫ����䵽temp
            temp[t]=arr[i];
            t +=1;
            i +=1;
        }
        while (j<=right){//�ұߵ��������л���ʣ���Ԫ��,��ȫ����䵽temp
            temp[t]=arr[j];
            t +=1;
            j +=1;
        }
        //��temp�����Ԫ�ؿ�����array
        //ע��,������ÿ�ζ���������
        t=0;
        int tempLeft=left ;
        while (tempLeft<=right){
            //��һ�κϲ�ʱ,templeft=0,right=1//templeft =2,right=3//templeft=0,right=3
            //���һ��templeft=0,right=7
            arr[tempLeft]=temp[t];
            t +=1;
            tempLeft +=1;
        }

    }
}
