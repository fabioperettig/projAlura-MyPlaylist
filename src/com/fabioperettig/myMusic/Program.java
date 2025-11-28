package com.fabioperettig.myMusic;
import com.fabioperettig.myMusic.Models.Music;
import com.fabioperettig.myMusic.Models.Podcast;
import com.fabioperettig.myMusic.Main.Audio;

public class Program {

    public static void main(String[] args) {

        Music m1 = new Music("Alex Band", "Only One", "Pop", 3.25);
        Podcast pd1 = new Podcast("Escriba Café", "Mary Celest", "Mystery", 20.5);

        /*
        for (int i=0; i<240; i++){m1.play();}
        for (int i=0; i<189; i++){m1.like();}

        System.out.printf("Played: %d | Liked: %d%n",
                m1.getNumPlays(), m1.getNumLike());

        m1.averageRate();

        test t = new test();

        int a = test.somaClass(10,20);
        int b = test.somaStatic(5,3);
        int c = t.somaObj(5,10);
        int d = t.somaObjAtrib(5);

        System.out.printf("%nClass: %d | Static Value: %d| Object:%d | REAL Object:%d%n",a,b,c,d);*/

        test t1 = new test();
        test t2 = new test();

        int value = 2;


        System.out.printf("%nAtributo t1: %d | Atributo t2: %d | Atributo t3: %d", t1.atributo,t2.atributo, new test().atributo);
        System.out.printf("%nResult t1: %d | Result t2: %d | Result t3: %d%n", t1.somaObjAtrib(value),t2.somaObjAtrib(value), new test().somaObjAtrib(value));
        for (int i=0; i<3; i++){t1.somaObjAtrib(value);}
        for (int i=0; i<4; i++){t2.somaObjAtrib(value);}

        System.out.printf("%nAtributo t1: %d | Atributo t2: %d | Atributo t3: %d", t1.atributo,t2.atributo, new test().atributo);
        System.out.printf("%nResult t1: %d | Result t2: %d | Result t3: %d%n", t1.somaObjAtrib(value),t2.somaObjAtrib(value), new test().somaObjAtrib(value));
    }

}
