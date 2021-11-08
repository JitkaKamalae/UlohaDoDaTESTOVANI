package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.util.function.DoublePredicate;

public class HlavniProgram {

    Turtle zofka;

    public void main(String[] args) {

        zofka = new Turtle();
        //this.nakresliKolecko();
        //this.nakresliTrojuhelnik();
        //this.nakresliCtverec();
        //this.nakresliObdelnik(150, 100);

        //nakresliZmrzlinu();
        //nakresliTrojuhelnik1();
        //nakresliKolecko1();

        //nakresliSnehulaka();
        //nakresliKolecko2();
        //nakresliKolecko3();

        // nakresliVlacek();
        //nakresliKolecko4();
        //nakresliObdelnik1(115, 200);
        //nakresliObdelnik2(115, 250);
       // nakresliKola();
    }
//...................................................................

    /*
    // úkol nakreslit - kolečko, trojúhleník,čtverec a obdelnik
    public void nakresliKolecko() {
        for (int i = 0; i < 360; i++) {
            zofka.turnRight(1.0);
            zofka.move(1.0);
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.penDown();
        zofka.turnRight(90);
    }

    public void nakresliTrojuhelnik() {
        zofka.turnRight(20);
        zofka.move(150);
        zofka.turnRight(140);
        zofka.move(150);
        zofka.turnRight(110);
        zofka.move(100);
        zofka.turnRight(90);
    }

    public void nakresliCtverec() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.penDown();
        zofka.turnRight(90.0);
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.move(100);
    }

    public void nakresliObdelnik(int delkaA, int delkaB) {
        zofka.penUp();
        zofka.move(50);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(delkaA);
        zofka.turnLeft(90);
        zofka.move(delkaB);
        zofka.turnLeft(90);
        zofka.move(delkaA);
        zofka.turnLeft(90);
        zofka.move(delkaB);
        zofka.turnLeft(90);
    }
} */

     //...................................................................................
   /*
    // nakreslit zmrzlinu - kornout a kopecek
    public void nakresliZmrzlinu() {
        zofka.setLocation(500, 450);
    }

    public void nakresliTrojuhelnik1() {
        zofka.turnLeft(20);
        zofka.move(150);
        zofka.turnRight(110);
        zofka.move(100);
        zofka.turnRight(110);
        zofka.move(150);
        zofka.turnRight(140);
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();

    }

    public void nakresliKolecko1() {
        for (int i = 0; i < 360; i++) {
            zofka.turnRight(1.0);
            zofka.move(1.0);
        }
    }
}
 */
//..........................................................................

     /*
    //úloha nakreslit sněhuláka
    public void nakresliSnehulaka() {
        zofka.setLocation(550, 400);
    }
     public void nakresliKolecko2() {
        for (int i = 0; i < 45; i++) {
            zofka.move(20);
            zofka.turnLeft(10);
        }
      zofka.setLocation(430, 270);
    }
       public void nakresliKolecko3() {
        zofka.turnRight(180);
        for (int i = 0; i < 54; i++) {
            zofka.move(15);
            zofka.turnLeft(10);
        }
        zofka.setLocation(440, 100);
        for (int i = 0; i < 36; i++) {
            zofka.move(10.0);
            zofka.turnRight(10.0);
        }
        zofka.setLocation(560, 210);
        for (int i = 0; i < 36; i++) {
            zofka.move(5);
            zofka.turnRight(10);
        }
        zofka.setLocation(320, 210);
        for (int i = 0; i < 36; i++) {
            zofka.move(5);
            zofka.turnRight(10);
        }
    }
}
  */
//......................................................................

    /*
    //úloha nakresli vlacek
     public void nakresliVlacek(){
        zofka.setLocation(700,350);
    }
    public void nakresliKolecko4() {
        for (int i = 0; i < 36; i++) {
            zofka.move(10);
            zofka.turnLeft(10);
        }
    }
    public void nakresliObdelnik1(int delkaA, int delkaB ) {
            zofka.penUp();
            zofka.move(0);
            zofka.turnLeft(90);
            zofka.penDown();
            zofka.move(delkaA);
            zofka.turnRight(90);
            zofka.move(delkaB);
            zofka.turnRight(90);
            zofka.move(delkaA);
            zofka.turnRight(90);
            zofka.move(delkaB);
            zofka.turnRight(90);
            zofka.penUp();
            zofka.move(115);
            zofka.penDown();
        }
        public void nakresliObdelnik2(int delkaA, int delkaB) {
            zofka.move(250);
            zofka.turnRight(90);
            //zofka.penDown();
            zofka.move(delkaA);
            zofka.turnRight(90);
            zofka.move(delkaB);
            zofka.turnRight(90);
            zofka.move(delkaA);
            zofka.turnRight(90);
            zofka.move(delkaB);
            zofka.turnLeft(90);
             }
             public void nakresliKola() {
                 zofka.setLocation(530, 375);
                 for (int i = 0; i < 36; i++) {
                     zofka.move(5);
                     zofka.turnRight(10);
                 }
                 zofka.setLocation(420,375);
                 for (int i = 0; i < 36; i++) {
                     zofka.move(5);
                     zofka.turnRight(10);
             }
             zofka.setLocation(335,325); {
                     zofka.turnRight(0);
                     zofka.move(75);
                     zofka.turnRight(90);
                     zofka.move(150);
                     zofka.turnRight(135);
                     zofka.move(210);
                     zofka.turnRight(0);
                     }
            }
    }
     */
    //.............................................................................
