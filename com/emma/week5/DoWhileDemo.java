package com.emma.week5;

public class DoWhileDemo {

    public static void main(String[] args) {
        // ���ڵ�һ��ѭ�� while�����ж���ִ��
        int i = 10;
        while (i < 10) {// ������
            System.out.println("����һ:" + i);// �����
            i++;
        }
        // �����ʲô������ӡ,����i��ֵΪ10

        // do-while����ִ��,���ж�
        i = 10;
        do {// ��ִ��һ��
            System.out.println("���Ӷ�:" + i);
            i++;
        } while (i < 10);// ������

        // while ���ж������Ƿ������������ִ�У������j++ ����ʹ��j�жϣ�Ȼ���1 �������1�Σ�ֵΪ1
        int j = 0;
        while (j++ < 1) {// j=0 <1 ����ִ�У�Ȼ��j+1 = 1 ��� 1
            System.out.println("��������" + j);
        }
        // do-while ��ִ��һ�Σ����ж������Ƿ���������������ִ�У�ֱ���������������������2��
        j = 0;
        do { // j = 0, ���0
            System.out.println("�����ģ�" + j);
        } while (j++ < 1);// j=0<1 ����������ִ�У�j=j+1�����1��Ȼ��j=1<1���������˳�

        // forѭ������ִ�����̣�
        int count = 0;
        for (System.out.println("��ʼ�����A"); count < 2; System.out.println("ѭ��������C")) {
            System.out.println("ѭ�������B");
            count++;
        }

        // for(;;) �൱����ѭ�� �ȼ��� while(true)
        
    }

}
