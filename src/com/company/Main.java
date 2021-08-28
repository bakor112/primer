package com.company;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.lang.Thread.*;

public class Main extends Test1 {

    public static void main(String[] args) throws InterruptedException {

        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
        Date date = calendar.getTime();
        Test1 r = new Test1();//uiygtyi
        r.hui();///
    }
}
