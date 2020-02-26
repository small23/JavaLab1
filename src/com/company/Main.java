package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Processor> procList = new ArrayList<>();

        String [] names = new String[]{"Intel","AMD","ARM"}; //Массив имен, он же определяет используемый класс
        for (int i=0; i<20; i++)
        {
            int rnd=(int)Math.round(Math.random()*3);
            switch (rnd){
                case 0:
                    int name1=(int)Math.round(Math.random()*99)*100+1000;
                    Intel proc1=new Intel(names[rnd]+" Core "+ name1,Math.round(Math.random()*10)*10000,
                            (int)Math.round(Math.random()*4), (int)Math.round(Math.random()*5),(int)Math.round(Math.random()*5*100),
                            14, 18,4,"x86-64",
                            "SSE, MMX, AVX,AVX2",true ); //Генерирование обьекта через конструктор
                    procList.add(proc1);
                    break;
                case 1:
                    int name2=(int)Math.round(Math.random()*99)*100+1000;
                    AMD proc2=new AMD(names[rnd]+" Ryzen "+ name2,Math.round(Math.random()*10)*10000,
                            (int)Math.round(Math.random()*4), (int)Math.round(Math.random()*5),(int)Math.round(Math.random()*10*100),
                            7, (int)Math.round(Math.random()*18),(int)Math.round(Math.random()*4),"x86-64",
                            "SSE, MMX, AVX,AVX2",true ,false);
                    procList.add(proc2);
                    break;
                case 2:
                    int name3=(int)Math.round(Math.random()*99)*100;
                    ARM proc3=new ARM(names[rnd]+" "+ name3,Math.round(Math.random()*10)*10000,
                            (int)Math.round(Math.random()*4), (int)Math.round(Math.random()*5),1000,7,
                            (int)Math.round(Math.random()*14),(int)Math.round(Math.random()*4),"ARM v8a",
                            true);
                    procList.add(proc3);
                    break;
                default:
                        break;
            }
        }
       for (int i=0; i<procList.size(); i++){
           System.out.println("******************");
           procList.get(i).showInfo(); //Вывод информации об объекте
        }
    }
}
