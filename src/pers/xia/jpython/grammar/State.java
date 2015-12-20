package pers.xia.jpython.grammar;

import pers.xia.jpython.object.PyExceptions;

public class State
{
    static int MAXSIZE = 100;
    int narcs;
    Arc[] arcs;
    
    public State(int narcs, Arc[] arcs)
    {
        this.narcs = narcs;
        this.arcs = arcs;
    }

}