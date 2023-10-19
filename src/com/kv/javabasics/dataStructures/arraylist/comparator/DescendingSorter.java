package com.kv.javaCourse.dataStructures.arraylist.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DescendingSorter implements Comparator<Cricketer> {
    //compareTo	returns	-1	if	cricketer1	<	cricketer2
    //	1	if	cricketer1	>	cricketer2
    //	0	if	cricketer1	=	cricketer2
    //Since	we	want	to	sort	in	descending	order,
    //we	should	return	-1	when	runs	are	more
    @Override
    public int compare(Cricketer	cricketer1, Cricketer	cricketer2)	{
        if (cricketer1.runs >	cricketer2.runs)	{
            return -1;
        }
        if (cricketer1.runs <	cricketer2.runs)	{
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Cricketer> cricketers	=	new ArrayList<Cricketer>();
        cricketers.add(new Cricketer("Bradman",	9996));
        cricketers.add(new Cricketer("Sachin",	14000));
        cricketers.add(new Cricketer("Dravid",	12000));
        cricketers.add(new Cricketer("Ponting",	11000));

        System.out.println(cricketers);
        //[Bradman 9996,	Sachin 14000,	Dravid 12000,	Ponting 11000]

        Collections.sort(cricketers, new DescendingSorter());

        System.out.println(cricketers);
        //[Sachin 14000,	Dravid 12000,	Ponting 11000,	Bradman 9996]
    }
}
