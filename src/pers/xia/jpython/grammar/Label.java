package pers.xia.jpython.grammar;

import pers.xia.jpython.tokenizer.TokState;

public class Label
{
    //DFAName dfaName;  //DFA的名字
    public DFA nextDfa;        //下一个DFA
    
    public TokState tokState;
    public String str;
    
    public boolean isTerminal;
    
    public Label(DFA nextDfa)
    {
        //this.dfaName = dfaName;
        this.nextDfa = nextDfa;
        this.isTerminal = false;
    }

    public Label(TokState tokState, String str)
    {
        this.tokState = tokState;
        this.str = str;
        this.isTerminal = true;
    }
}
